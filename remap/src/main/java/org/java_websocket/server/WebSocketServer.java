// 
// Decompiled by Procyon v0.6.0
// 

package org.java_websocket.server;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.java_websocket.*;
import org.java_websocket.drafts.Draft;
import org.java_websocket.exceptions.WebsocketNotConnectedException;
import org.java_websocket.exceptions.WrappedIOException;
import org.java_websocket.framing.CloseFrame;
import org.java_websocket.framing.Framedata;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.handshake.Handshakedata;

import java.util.*;
import java.nio.channels.SelectableChannel;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.net.InetSocketAddress;

public abstract class WebSocketServer extends AbstractWebSocket implements Runnable {
    private static final int AVAILABLE_PROCESSORS = Runtime.getRuntime().availableProcessors();
    private final Logger log = LoggerFactory.getLogger(WebSocketServer.class);

    private final Collection<WebSocket> connections;
    private final InetSocketAddress address;
    private ServerSocketChannel server;
    private Selector selector;
    private final List<Draft> drafts;
    private Thread selectorthread;
    private final AtomicBoolean isclosed = new AtomicBoolean(false);
    protected List<WebSocketWorker> decoders;
    private final List<WebSocketImpl> iqueue;
    private final BlockingQueue<ByteBuffer> buffers;
    private int queueinvokes = 0;
    private final AtomicInteger queuesize = new AtomicInteger(0);

    private int maxPendingConnections = -1;

    private WebSocketServerFactory wsf = new DefaultWebSocketServerFactory();

    public WebSocketServer() {
        this(new InetSocketAddress(WebSocketImpl.DEFAULT_PORT), AVAILABLE_PROCESSORS, null);
    }

    public WebSocketServer(InetSocketAddress address) {
        this(address, AVAILABLE_PROCESSORS, null);
    }

    public WebSocketServer(InetSocketAddress address, int decodercount) {
        this(address, decodercount, null);
    }

    public WebSocketServer(InetSocketAddress address, List<Draft> drafts) {
        this(address, AVAILABLE_PROCESSORS, drafts);
    }

    public WebSocketServer(InetSocketAddress address, int decodercount, List<Draft> drafts) {
        this(address, decodercount, drafts, new HashSet<WebSocket>());
    }

    public WebSocketServer(InetSocketAddress address, int decodercount, List<Draft> drafts,
                           Collection<WebSocket> connectionscontainer) {
        if (address == null || decodercount < 1 || connectionscontainer == null) {
            throw new IllegalArgumentException(
                    "address and connectionscontainer must not be null and you need at least 1 decoder");
        }

        if (drafts == null) {
            this.drafts = Collections.emptyList();
        } else {
            this.drafts = drafts;
        }

        this.address = address;
        this.connections = connectionscontainer;
        setTcpNoDelay(false);
        setReuseAddr(false);
        iqueue = new LinkedList<>();

        decoders = new ArrayList<>(decodercount);
        buffers = new LinkedBlockingQueue<>();
        for (int i = 0; i < decodercount; i++) {
            WebSocketWorker ex = new WebSocketWorker();
            decoders.add(ex);
        }
    }

    public void start() {
        if (selectorthread != null) {
            throw new IllegalStateException(getClass().getName() + " can only be started once.");
        }
        Thread t = new Thread(this);
        t.start();
    }

    public void stop(final int timeout, String closeMessage) throws InterruptedException {
        if (!isclosed.compareAndSet(false,
                true)) { // this also makes sure that no further connections will be added to this.connections
            return;
        }

        List<WebSocket> socketsToClose;

        // copy the connections in a list (prevent callback deadlocks)
        synchronized (connections) {
            socketsToClose = new ArrayList<>(connections);
        }

        for (WebSocket ws : socketsToClose) {
            ws.close(CloseFrame.GOING_AWAY, closeMessage);
        }

        wsf.close();

        synchronized (this) {
            if (selectorthread != null && selector != null) {
                selector.wakeup();
                selectorthread.join(timeout);
            }
        }
    }

    public void stop(int timeout) throws InterruptedException {
        stop(timeout, "");
    }

    public void stop() throws InterruptedException {
        stop(0);
    }

    @Override
    public Collection<WebSocket> getConnections() {
        synchronized (connections) {
            return Collections.unmodifiableCollection(new ArrayList<>(connections));
        }
    }

    public InetSocketAddress getAddress() {
        return this.address;
    }

    public int getPort() {
        int port = getAddress().getPort();
        if (port == 0 && server != null) {
            port = server.socket().getLocalPort();
        }
        return port;
    }

    public List<Draft> getDraft() {
        return Collections.unmodifiableList(drafts);
    }

    public void setMaxPendingConnections(int numberOfConnections) {
        maxPendingConnections = numberOfConnections;
    }

    public int getMaxPendingConnections() {
        return maxPendingConnections;
    }

    @Override
    public void run() {
        if (!doEnsureSingleThread()) {
            return;
        }
        if (!doSetupSelectorAndServerThread()) {
            return;
        }
        try {
            int shutdownCount = 5;
            int selectTimeout = 0;
            while (!selectorthread.isInterrupted() && shutdownCount != 0) {
                SelectionKey key = null;
                try {
                    if (isclosed.get()) {
                        selectTimeout = 5;
                    }
                    int keyCount = selector.select(selectTimeout);
                    if (keyCount == 0 && isclosed.get()) {
                        shutdownCount--;
                    }
                    Set<SelectionKey> keys = selector.selectedKeys();
                    Iterator<SelectionKey> i = keys.iterator();

                    while (i.hasNext()) {
                        key = i.next();

                        if (!key.isValid()) {
                            continue;
                        }

                        if (key.isAcceptable()) {
                            doAccept(key, i);
                            continue;
                        }

                        if (key.isReadable() && !doRead(key, i)) {
                            continue;
                        }

                        if (key.isWritable()) {
                            doWrite(key);
                        }
                    }
                    doAdditionalRead();
                } catch (CancelledKeyException e) {
                    // an other thread may cancel the key
                } catch (ClosedByInterruptException e) {
                    return; // do the same stuff as when InterruptedException is thrown
                } catch (WrappedIOException ex) {
                    handleIOException(key, ex.getConnection(), ex.getIOException());
                } catch (IOException ex) {
                    handleIOException(key, null, ex);
                } catch (InterruptedException e) {
                    // FIXME controlled shutdown (e.g. take care of buffermanagement)
                    Thread.currentThread().interrupt();
                }
            }
        } catch (RuntimeException e) {
            // should hopefully never occur
            handleFatal(null, e);
        } finally {
            doServerShutdown();
        }
    }

    private void doAdditionalRead() throws InterruptedException, IOException {
        WebSocketImpl conn;
        while (!iqueue.isEmpty()) {
            conn = iqueue.remove(0);
            WrappedByteChannel c = ((WrappedByteChannel) conn.getChannel());
            ByteBuffer buf = takeBuffer();
            try {
                if (SocketChannelIOHelper.readMore(buf, conn, c)) {
                    iqueue.add(conn);
                }
                if (buf.hasRemaining()) {
                    conn.inQueue.put(buf);
                    queue(conn);
                } else {
                    pushBuffer(buf);
                }
            } catch (IOException e) {
                pushBuffer(buf);
                throw e;
            }
        }
    }

    private void doAccept(SelectionKey key, Iterator<SelectionKey> i)
            throws IOException, InterruptedException {
        if (!onConnect(key)) {
            key.cancel();
            return;
        }

        SocketChannel channel = server.accept();
        if (channel == null) {
            return;
        }
        channel.configureBlocking(false);
        Socket socket = channel.socket();
        socket.setTcpNoDelay(isTcpNoDelay());
        socket.setKeepAlive(true);
        WebSocketImpl w = wsf.createWebSocket(this, drafts);
        w.setSelectionKey(channel.register(selector, SelectionKey.OP_READ, w));
        try {
            w.setChannel(wsf.wrapChannel(channel, w.getSelectionKey()));
            i.remove();
            allocateBuffers(w);
        } catch (IOException ex) {
            if (w.getSelectionKey() != null) {
                w.getSelectionKey().cancel();
            }

            handleIOException(w.getSelectionKey(), null, ex);
        }
    }

    private boolean doRead(SelectionKey key, Iterator<SelectionKey> i)
            throws InterruptedException, WrappedIOException {
        WebSocketImpl conn = (WebSocketImpl) key.attachment();
        ByteBuffer buf = takeBuffer();
        if (conn.getChannel() == null) {
            key.cancel();

            handleIOException(key, conn, new IOException());
            return false;
        }
        try {
            if (SocketChannelIOHelper.read(buf, conn, conn.getChannel())) {
                if (buf.hasRemaining()) {
                    conn.inQueue.put(buf);
                    queue(conn);
                    i.remove();
                    if (conn.getChannel() instanceof WrappedByteChannel && ((WrappedByteChannel) conn
                            .getChannel()).isNeedRead()) {
                        iqueue.add(conn);
                    }
                } else {
                    pushBuffer(buf);
                }
            } else {
                pushBuffer(buf);
            }
        } catch (IOException e) {
            pushBuffer(buf);
            throw new WrappedIOException(conn, e);
        }
        return true;
    }

    private void doWrite(final SelectionKey key) throws WrappedIOException {
        WebSocketImpl conn = (WebSocketImpl) key.attachment();
        try {
            if (SocketChannelIOHelper.batch(conn, conn.getChannel()) && key.isValid()) {
                key.interestOps(SelectionKey.OP_READ);
            }
        } catch (IOException e) {
            throw new WrappedIOException(conn, e);
        }
    }

    private boolean doSetupSelectorAndServerThread() {
        selectorthread.setName("WebSocketSelector-" + selectorthread.getId());
        try {
            if (server == null) {
                server = ServerSocketChannel.open();
                // If 'server' is not null, that means WebSocketServer was created from existing channel.
            }
            server.configureBlocking(false);
            ServerSocket socket = server.socket();
            int receiveBufferSize = getReceiveBufferSize();
            if (receiveBufferSize > 0) {
                socket.setReceiveBufferSize(receiveBufferSize);
            }
            socket.setReuseAddress(isReuseAddr());
            // Socket may be already bound, if an existing channel was passed to constructor.
            // In this case we cannot modify backlog size from pure Java code, so leave it as is.
            if (!socket.isBound()) {
                socket.bind(address, getMaxPendingConnections());
            }
            selector = Selector.open();
            server.register(selector, server.validOps());
            startConnectionLostTimer();
            for (WebSocketWorker ex : decoders) {
                ex.start();
            }
            onStart();
        } catch (IOException ex) {
            handleFatal(null, ex);
            return false;
        }
        return true;
    }

    private boolean doEnsureSingleThread() {
        synchronized (this) {
            if (selectorthread != null) {
                throw new IllegalStateException(getClass().getName() + " can only be started once.");
            }
            selectorthread = Thread.currentThread();
            if (isclosed.get()) {
                return false;
            }
        }
        return true;
    }

    private void doServerShutdown() {
        stopConnectionLostTimer();
        if (decoders != null) {
            for (WebSocketWorker w : decoders) {
                w.interrupt();
            }
        }
        if (selector != null) {
            try {
                selector.close();
            } catch (IOException e) {
                log.error("IOException during selector.close", e);
                onError(null, e);
            }
        }
        if (server != null) {
            try {
                server.close();
            } catch (IOException e) {
                log.error("IOException during server.close", e);
                onError(null, e);
            }
        }
    }

    protected void allocateBuffers(WebSocket c) throws InterruptedException {
        if (queuesize.get() >= 2 * decoders.size() + 1) {
            return;
        }
        queuesize.incrementAndGet();
        buffers.put(createBuffer());
    }

    protected void releaseBuffers(WebSocket c) throws InterruptedException {
        // queuesize.decrementAndGet();
        // takeBuffer();
    }

    public ByteBuffer createBuffer() {
        return ByteBuffer.allocate(16384);
    }

    protected void queue(WebSocketImpl ws) throws InterruptedException {
        if (ws.getWorkerThread() == null) {
            ws.setWorkerThread(decoders.get(queueinvokes % decoders.size()));
            queueinvokes++;
        }
        ws.getWorkerThread().put(ws);
    }

    private ByteBuffer takeBuffer() throws InterruptedException {
        return this.buffers.take();
    }

    private void pushBuffer(final ByteBuffer byteBuffer) throws InterruptedException {
        if (this.buffers.size() <= this.queuesize.intValue()) {
            this.buffers.put(byteBuffer);
        }
    }

    private void handleIOException(SelectionKey key, WebSocket conn, IOException ex) {
        // onWebsocketError( conn, ex );// conn may be null here
        if (key != null) {
            key.cancel();
        }
        if (conn != null) {
            conn.closeConnection(CloseFrame.ABNORMAL_CLOSE, ex.getMessage());
        } else if (key != null) {
            SelectableChannel channel = key.channel();
            if (channel != null && channel
                    .isOpen()) { // this could be the case if the IOException ex is a SSLException
                try {
                    channel.close();
                } catch (IOException e) {
                    // there is nothing that must be done here
                }
                log.trace("Connection closed because of exception " + ex.getMessage());
            }
        }
    }

    private void handleFatal(WebSocket conn, Exception e) {
        log.error("Shutdown due to fatal error", e);
        onError(conn, e);

        String causeMessage = e.getCause() != null ? " caused by " + e.getCause().getClass().getName() : "";
        String errorMessage = "Got error on server side: " + e.getClass().getName() + causeMessage;
        try {
            stop();
        } catch (InterruptedException e1) {
            Thread.currentThread().interrupt();
            log.error("Interrupt during stop", e);
            onError(null, e1);
        }

        //Shutting down WebSocketWorkers, see #222
        if (decoders != null) {
            for (WebSocketWorker w : decoders) {
                w.interrupt();
            }
        }
        if (selectorthread != null) {
            selectorthread.interrupt();
        }
    }

    @Override
    public final void onWebsocketMessage(final WebSocket webSocket, final String s) {
        this.onMessage(webSocket, s);
    }

    @Override
    public final void onWebsocketMessage(final WebSocket webSocket, final ByteBuffer byteBuffer) {
        this.onMessage(webSocket, byteBuffer);
    }

    @Override
    public final void onWebsocketOpen(final WebSocket webSocket, final Handshakedata data) {
        if (this.addConnection(webSocket)) {
            this.onOpen(webSocket, (ClientHandshake) data);
        }
    }

    @Override
    public final void onWebsocketClose(WebSocket conn, int code, String reason, boolean remote) {
        selector.wakeup();
        try {
            if (removeConnection(conn)) {
                onClose(conn, code, reason, remote);
            }
        } finally {
            try {
                releaseBuffers(conn);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

    }

    public boolean removeConnection(final WebSocket ws) {
        boolean removed = false;
        synchronized (connections) {
            if (this.connections.contains(ws)) {
                removed = this.connections.remove(ws);
            } else {
                //Don't throw an assert error if the ws is not in the list. e.g. when the other endpoint did not send any handshake. see #512
                log.trace(
                        "Removing connection which is not in the connections collection! Possible no handshake received! " + ws);
            }
        }
        if (isclosed.get() && connections.isEmpty()) {
            selectorthread.interrupt();
        }
        return removed;
    }

    public boolean addConnection(final WebSocket ws) {
        if (!isclosed.get()) {
            synchronized (connections) {
                return this.connections.add(ws);
            }
        } else {
            // This case will happen when a new connection gets ready while the server is already stopping.
            ws.close(CloseFrame.GOING_AWAY);
            return true;// for consistency sake we will make sure that both onOpen will be called
        }
    }

    @Override
    public final void onWebsocketError(final WebSocket webSocket, final Exception ex) {
        this.onError(webSocket, ex);
    }

    @Override
    public final void onWriteDemand(final WebSocket w) {
        WebSocketImpl conn = (WebSocketImpl) w;
        try {
            conn.getSelectionKey().interestOps(SelectionKey.OP_READ | SelectionKey.OP_WRITE);
        } catch (CancelledKeyException e) {
            // the thread which cancels key is responsible for possible cleanup
            conn.outQueue.clear();
        }
        selector.wakeup();
    }

    @Override
    public void onWebsocketCloseInitiated(final WebSocket webSocket, final int n, final String s) {
        this.onCloseInitiated(webSocket, n, s);
    }

    @Override
    public void onWebsocketClosing(final WebSocket webSocket, final int n, final String s, final boolean b) {
        this.onClosing(webSocket, n, s, b);
    }

    public void onCloseInitiated(final WebSocket webSocket, final int n, final String s) {
    }

    public void onClosing(final WebSocket webSocket, final int n, final String s, final boolean b) {
    }

    public final void setWebSocketFactory(WebSocketServerFactory wsf) {
        if (this.wsf != null) {
            this.wsf.close();
        }
        this.wsf = wsf;
    }

    public final WebSocketFactory getWebSocketFactory() {
        return this.wsf;
    }

    public boolean onConnect(final SelectionKey selectionKey) {
        return true;
    }

    private Socket getSocket(WebSocket conn) {
        WebSocketImpl impl = (WebSocketImpl) conn;
        return ((SocketChannel) impl.getSelectionKey().channel()).socket();
    }

    @Override
    public InetSocketAddress getLocalSocketAddress(final WebSocket webSocket) {
        return (InetSocketAddress) this.getSocket(webSocket).getLocalSocketAddress();
    }

    @Override
    public InetSocketAddress getRemoteSocketAddress(final WebSocket webSocket) {
        return (InetSocketAddress) this.getSocket(webSocket).getRemoteSocketAddress();
    }

    public abstract void onOpen(final WebSocket p0, final ClientHandshake p1);

    public abstract void onClose(final WebSocket p0, final int p1, final String p2, final boolean p3);

    public abstract void onMessage(final WebSocket p0, final String p1);

    public abstract void onError(final WebSocket p0, final Exception p1);

    public abstract void onStart();

    public void onMessage(final WebSocket webSocket, final ByteBuffer byteBuffer) {
    }

    public void broadcast(final String s) {
        this.broadcast(s, this.connections);
    }

    public void broadcast(final byte[] array) {
        this.broadcast(array, this.connections);
    }

    public void broadcast(final ByteBuffer byteBuffer) {
        this.broadcast(byteBuffer, this.connections);
    }

    public void broadcast(byte[] data, Collection<WebSocket> clients) {
        if (data == null || clients == null) {
            throw new IllegalArgumentException();
        }
        broadcast(ByteBuffer.wrap(data), clients);
    }

    public void broadcast(ByteBuffer data, Collection<WebSocket> clients) {
        if (data == null || clients == null) {
            throw new IllegalArgumentException();
        }
        doBroadcast(data, clients);
    }

    public void broadcast(String text, Collection<WebSocket> clients) {
        if (text == null || clients == null) {
            throw new IllegalArgumentException();
        }
        doBroadcast(text, clients);
    }

    private void doBroadcast(Object data, Collection<WebSocket> clients) {
        String strData = null;
        if (data instanceof String) {
            strData = (String) data;
        }
        ByteBuffer byteData = null;
        if (data instanceof ByteBuffer) {
            byteData = (ByteBuffer) data;
        }
        if (strData == null && byteData == null) {
            return;
        }
        Map<Draft, List<Framedata>> draftFrames = new HashMap<>();
        List<WebSocket> clientCopy;
        synchronized (clients) {
            clientCopy = new ArrayList<>(clients);
        }
        for (WebSocket client : clientCopy) {
            if (client != null) {
                Draft draft = client.getDraft();
                fillFrames(draft, draftFrames, strData, byteData);
                try {
                    client.sendFrame(draftFrames.get(draft));
                } catch (WebsocketNotConnectedException e) {
                    //Ignore this exception in this case
                }
            }
        }
    }

    private void fillFrames(Draft draft, Map<Draft, List<Framedata>> draftFrames, String strData,
                            ByteBuffer byteData) {
        if (!draftFrames.containsKey(draft)) {
            List<Framedata> frames = null;
            if (strData != null) {
                frames = draft.createFrames(strData, false);
            }
            if (byteData != null) {
                frames = draft.createFrames(byteData, false);
            }
            if (frames != null) {
                draftFrames.put(draft, frames);
            }
        }
    }

    public class WebSocketWorker extends Thread {
        private final BlockingQueue<WebSocketImpl> iqueue;

        public WebSocketWorker() {
            iqueue = new LinkedBlockingQueue<>();
            setName("WebSocketWorker-" + getId());
            setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                @Override
                public void uncaughtException(Thread t, Throwable e) {
                    log.error("Uncaught exception in thread {}: {}", t.getName(), e);
                }
            });
        }

        public void put(WebSocketImpl ws) throws InterruptedException {
            iqueue.put(ws);
        }

        @Override
        public void run() {
            WebSocketImpl ws = null;
            try {
                while (true) {
                    ByteBuffer buf;
                    ws = iqueue.take();
                    buf = ws.inQueue.poll();
                    assert (buf != null);
                    doDecode(ws, buf);
                    ws = null;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } catch (VirtualMachineError | ThreadDeath | LinkageError e) {
                log.error("Got fatal error in worker thread {}", getName());
                Exception exception = new Exception(e);
                handleFatal(ws, exception);
            } catch (Throwable e) {
                log.error("Uncaught exception in thread {}: {}", getName(), e);
                if (ws != null) {
                    Exception exception = new Exception(e);
                    onWebsocketError(ws, exception);
                    ws.close();
                }
            }
        }

        private void doDecode(WebSocketImpl ws, ByteBuffer buf) throws InterruptedException {
            try {
                ws.decode(buf);
            } catch (Exception e) {
                log.error("Error while reading from remote connection", e);
            } finally {
                pushBuffer(buf);
            }
        }
    }
}
