// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import java.util.HashMap;
import java.nio.channels.SelectableChannel;
import java.net.ServerSocket;
import java.net.SocketAddress;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.List;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.net.InetSocketAddress;
import java.util.Collection;

public abstract class Class963 extends Class960 implements Runnable
{
    private static final int field5110;
    private final Collection<Class957> field5111;
    private final InetSocketAddress field5112;
    private ServerSocketChannel field5113;
    private Selector field5114;
    private List<Class9122> field5115;
    private Thread field5116;
    private final AtomicBoolean field5117;
    public List<Class899> field5118;
    private List<Class958> field5119;
    private BlockingQueue<ByteBuffer> field5120;
    private int field5121;
    private final AtomicInteger field5122;
    private Class6959 field5123;
    
    public Class963() {
        this(new InetSocketAddress(80), Class963.field5110, null);
    }
    
    public Class963(final InetSocketAddress inetSocketAddress) {
        this(inetSocketAddress, Class963.field5110, null);
    }
    
    public Class963(final InetSocketAddress inetSocketAddress, final int n) {
        this(inetSocketAddress, n, null);
    }
    
    public Class963(final InetSocketAddress inetSocketAddress, final List<Class9122> list) {
        this(inetSocketAddress, Class963.field5110, list);
    }
    
    public Class963(final InetSocketAddress inetSocketAddress, final int n, final List<Class9122> list) {
        this(inetSocketAddress, n, list, new HashSet<Class957>());
    }
    
    public Class963(final InetSocketAddress field5112, final int initialCapacity, final List<Class9122> field5113, final Collection<Class957> field5114) {
        this.field5117 = new AtomicBoolean(false);
        this.field5121 = 0;
        this.field5122 = new AtomicInteger(0);
        this.field5123 = new Class6958();
        if (field5112 != null) {
            if (initialCapacity >= 1) {
                if (field5114 != null) {
                    if (field5113 != null) {
                        this.field5115 = field5113;
                    }
                    else {
                        this.field5115 = Collections.emptyList();
                    }
                    this.field5112 = field5112;
                    this.field5111 = field5114;
                    this.method5544(false);
                    this.method5546(false);
                    this.field5119 = new LinkedList<Class958>();
                    this.field5118 = new ArrayList<Class899>(initialCapacity);
                    this.field5120 = new LinkedBlockingQueue<ByteBuffer>();
                    for (int i = 0; i < initialCapacity; ++i) {
                        this.field5118.add(new Class899(this));
                    }
                    return;
                }
            }
        }
        throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
    }
    
    public void method5554() {
        if (this.field5116 == null) {
            new Thread(this).start();
            return;
        }
        throw new IllegalStateException(this.getClass().getName() + " can only be started once.");
    }
    
    public void method5555(final int n) throws InterruptedException {
        if (!this.field5117.compareAndSet(false, true)) {
            return;
        }
        final ArrayList list;
        synchronized (this.field5111) {
            list = new ArrayList((Collection<? extends E>)this.field5111);
        }
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ((Class957)iterator.next()).method5494(1001);
        }
        this.field5123.method21374();
        synchronized (this) {
            if (this.field5116 != null && this.field5114 != null) {
                this.field5114.wakeup();
                this.field5116.join(n);
            }
        }
    }
    
    public void method5556() throws IOException, InterruptedException {
        this.method5555(0);
    }
    
    @Override
    public Collection<Class957> method5462() {
        return Collections.unmodifiableCollection((Collection<? extends Class957>)new ArrayList<Class957>(this.field5111));
    }
    
    public InetSocketAddress method5557() {
        return this.field5112;
    }
    
    public int method5558() {
        int n = this.method5557().getPort();
        if (n == 0) {
            if (this.field5113 != null) {
                n = this.field5113.socket().getLocalPort();
            }
        }
        return n;
    }
    
    public List<Class9122> method5559() {
        return Collections.unmodifiableList((List<? extends Class9122>)this.field5115);
    }
    
    @Override
    public void run() {
        if (!this.method5565()) {
            return;
        }
        if (!this.method5564()) {
            return;
        }
        try {
            int n = 5;
            int n2 = 0;
            while (!this.field5116.isInterrupted() && n != 0) {
                SelectionKey selectionKey = null;
                Class957 class957 = null;
                try {
                    if (this.field5117.get()) {
                        n2 = 5;
                    }
                    if (this.field5114.select(n2) == 0 && this.field5117.get()) {
                        --n;
                    }
                    final Iterator<SelectionKey> iterator = this.field5114.selectedKeys().iterator();
                    while (iterator.hasNext()) {
                        selectionKey = iterator.next();
                        class957 = null;
                        if (!selectionKey.isValid()) {
                            continue;
                        }
                        if (selectionKey.isAcceptable()) {
                            this.method5561(selectionKey, iterator);
                        }
                        else {
                            if (selectionKey.isReadable() && !this.method5562(selectionKey, iterator)) {
                                continue;
                            }
                            if (!selectionKey.isWritable()) {
                                continue;
                            }
                            this.method5563(selectionKey);
                        }
                    }
                    this.method5560();
                }
                catch (final CancelledKeyException ex) {}
                catch (final ClosedByInterruptException ex2) {}
                catch (final IOException ex3) {
                    if (selectionKey != null) {
                        selectionKey.cancel();
                    }
                    this.method5573(selectionKey, class957, ex3);
                }
                catch (final InterruptedException ex4) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        catch (final RuntimeException ex5) {
            this.method5574(null, ex5);
        }
        finally {
            this.method5566();
        }
    }
    
    private void method5560() throws InterruptedException, IOException {
        while (!this.field5119.isEmpty()) {
            final Class958 class958 = this.field5119.remove(0);
            final Class1754 class959 = (Class1754)class958.method5532();
            final ByteBuffer method5571 = this.method5571();
            try {
                if (Class8100.method26620(method5571, class958, class959)) {
                    this.field5119.add(class958);
                }
                if (method5571.hasRemaining()) {
                    class958.field5081.put(method5571);
                    this.method5570(class958);
                }
                else {
                    this.method5572(method5571);
                }
            }
            catch (final IOException ex) {
                this.method5572(method5571);
                throw ex;
            }
        }
    }
    
    private void method5561(final SelectionKey selectionKey, final Iterator<SelectionKey> iterator) throws IOException, InterruptedException {
        if (!this.method5581(selectionKey)) {
            selectionKey.cancel();
            return;
        }
        final SocketChannel accept = this.field5113.accept();
        if (accept == null) {
            return;
        }
        accept.configureBlocking(false);
        final Socket socket = accept.socket();
        socket.setTcpNoDelay(this.method5543());
        socket.setKeepAlive(true);
        final Class958 method21372 = this.field5123.method21372(this, this.field5115);
        method21372.method5527(accept.register(this.field5114, 1, method21372));
        try {
            method21372.method5533(this.field5123.method21375(accept, method21372.method5528()));
            iterator.remove();
            this.method5567(method21372);
        }
        catch (final IOException ex) {
            if (method21372.method5528() != null) {
                method21372.method5528().cancel();
            }
            this.method5573(method21372.method5528(), null, ex);
        }
    }
    
    private boolean method5562(final SelectionKey selectionKey, final Iterator<SelectionKey> iterator) throws InterruptedException, IOException {
        final Class958 class958 = (Class958)selectionKey.attachment();
        final ByteBuffer method5571 = this.method5571();
        if (class958.method5532() == null) {
            selectionKey.cancel();
            this.method5573(selectionKey, class958, new IOException());
            return false;
        }
        try {
            if (Class8100.method26619(method5571, class958, class958.method5532())) {
                if (method5571.hasRemaining()) {
                    class958.field5081.put(method5571);
                    this.method5570(class958);
                    iterator.remove();
                    if (class958.method5532() instanceof Class1754 && ((Class1754)class958.method5532()).method6209()) {
                        this.field5119.add(class958);
                    }
                }
                else {
                    this.method5572(method5571);
                }
            }
            else {
                this.method5572(method5571);
            }
        }
        catch (final IOException ex) {
            this.method5572(method5571);
            throw ex;
        }
        return true;
    }
    
    private void method5563(final SelectionKey selectionKey) throws IOException {
        final Class958 class958 = (Class958)selectionKey.attachment();
        if (Class8100.method26621(class958, class958.method5532())) {
            if (selectionKey.isValid()) {
                selectionKey.interestOps(1);
            }
        }
    }
    
    private boolean method5564() {
        this.field5116.setName("WebSocketSelector-" + this.field5116.getId());
        try {
            (this.field5113 = ServerSocketChannel.open()).configureBlocking(false);
            final ServerSocket socket = this.field5113.socket();
            socket.setReceiveBufferSize(16384);
            socket.setReuseAddress(this.method5545());
            socket.bind(this.field5112);
            this.field5114 = Selector.open();
            this.field5113.register(this.field5114, this.field5113.validOps());
            this.method5539();
            final Iterator<Class899> iterator = this.field5118.iterator();
            while (iterator.hasNext()) {
                iterator.next().start();
            }
            this.method5587();
        }
        catch (final IOException ex) {
            this.method5574(null, ex);
            return false;
        }
        return true;
    }
    
    private boolean method5565() {
        synchronized (this) {
            if (this.field5116 != null) {
                throw new IllegalStateException(this.getClass().getName() + " can only be started once.");
            }
            this.field5116 = Thread.currentThread();
            if (this.field5117.get()) {
                return false;
            }
        }
        return true;
    }
    
    private void method5566() {
        this.method5538();
        if (this.field5118 != null) {
            final Iterator<Class899> iterator = this.field5118.iterator();
            while (iterator.hasNext()) {
                iterator.next().interrupt();
            }
        }
        if (this.field5114 != null) {
            try {
                this.field5114.close();
            }
            catch (final IOException ex) {
                System.err.println("IOException during selector.close");
                this.method5586(null, ex);
            }
        }
        if (this.field5113 != null) {
            try {
                this.field5113.close();
            }
            catch (final IOException ex2) {
                System.err.println("IOException during server.close");
                this.method5586(null, ex2);
            }
        }
    }
    
    public void method5567(final Class957 class957) throws InterruptedException {
        if (this.field5122.get() < 2 * this.field5118.size() + 1) {
            this.field5122.incrementAndGet();
            this.field5120.put(this.method5569());
        }
    }
    
    public void method5568(final Class957 class957) throws InterruptedException {
    }
    
    public ByteBuffer method5569() {
        return ByteBuffer.allocate(16384);
    }
    
    public void method5570(final Class958 class958) throws InterruptedException {
        if (class958.method5534() == null) {
            class958.method5535(this.field5118.get(this.field5121 % this.field5118.size()));
            ++this.field5121;
        }
        class958.method5534().method5403(class958);
    }
    
    private ByteBuffer method5571() throws InterruptedException {
        return this.field5120.take();
    }
    
    private void method5572(final ByteBuffer byteBuffer) throws InterruptedException {
        if (this.field5120.size() <= this.field5122.intValue()) {
            this.field5120.put(byteBuffer);
        }
    }
    
    private void method5573(final SelectionKey selectionKey, final Class957 class957, final IOException ex) {
        if (class957 != null) {
            class957.method5496(1006, ex.getMessage());
        }
        else if (selectionKey != null) {
            final SelectableChannel channel = selectionKey.channel();
            if (channel != null && channel.isOpen()) {
                try {
                    channel.close();
                }
                catch (final IOException ex2) {}
            }
        }
    }
    
    private void method5574(final Class957 class957, final Exception ex) {
        System.err.println("Shutdown due to fatal error");
        this.method5586(class957, ex);
        if (this.field5118 != null) {
            final Iterator<Class899> iterator = this.field5118.iterator();
            while (iterator.hasNext()) {
                iterator.next().interrupt();
            }
        }
        if (this.field5116 != null) {
            this.field5116.interrupt();
        }
        try {
            this.method5556();
        }
        catch (final IOException ex2) {
            System.err.println("Error during shutdown");
            this.method5586(null, ex2);
        }
        catch (final InterruptedException ex3) {
            Thread.currentThread().interrupt();
            System.err.println("Interrupt during stop");
            this.method5586(null, ex3);
        }
    }
    
    @Override
    public final void method5467(final Class957 class957, final String s) {
        this.method5585(class957, s);
    }
    
    @Override
    public final void method5468(final Class957 class957, final ByteBuffer byteBuffer) {
        this.method5588(class957, byteBuffer);
    }
    
    @Override
    public final void method5469(final Class957 class957, final Class6090 class958) {
        if (this.method5576(class957)) {
            this.method5583(class957, (Class6083)class958);
        }
    }
    
    @Override
    public final void method5470(final Class957 class957, final int n, final String s, final boolean b) {
        this.field5114.wakeup();
        try {
            if (this.method5575(class957)) {
                this.method5584(class957, n, s, b);
            }
        }
        finally {
            try {
                this.method5568(class957);
            }
            catch (final InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    public boolean method5575(final Class957 class957) {
        boolean remove = false;
        synchronized (this.field5111) {
            if (this.field5111.contains(class957)) {
                remove = this.field5111.remove(class957);
            }
        }
        if (this.field5117.get() && this.field5111.isEmpty()) {
            this.field5116.interrupt();
        }
        return remove;
    }
    
    public boolean method5576(final Class957 class957) {
        if (!this.field5117.get()) {
            synchronized (this.field5111) {
                return this.field5111.add(class957);
            }
        }
        class957.method5494(1001);
        return true;
    }
    
    @Override
    public final void method5471(final Class957 class957, final Exception ex) {
        this.method5586(class957, ex);
    }
    
    @Override
    public final void method5472(final Class957 class957) {
        final Class958 class958 = (Class958)class957;
        try {
            class958.method5528().interestOps(5);
        }
        catch (final CancelledKeyException ex) {
            class958.field5080.clear();
        }
        this.field5114.wakeup();
    }
    
    @Override
    public void method5473(final Class957 class957, final int n, final String s) {
        this.method5577(class957, n, s);
    }
    
    @Override
    public void method5474(final Class957 class957, final int n, final String s, final boolean b) {
        this.method5578(class957, n, s, b);
    }
    
    public void method5577(final Class957 class957, final int n, final String s) {
    }
    
    public void method5578(final Class957 class957, final int n, final String s, final boolean b) {
    }
    
    public final void method5579(final Class6959 field5123) {
        if (this.field5123 != null) {
            this.field5123.method21374();
        }
        this.field5123 = field5123;
    }
    
    public final Class6963 method5580() {
        return this.field5123;
    }
    
    public boolean method5581(final SelectionKey selectionKey) {
        return true;
    }
    
    private Socket method5582(final Class957 class957) {
        return ((SocketChannel)((Class958)class957).method5528().channel()).socket();
    }
    
    @Override
    public InetSocketAddress method5478(final Class957 class957) {
        return (InetSocketAddress)this.method5582(class957).getLocalSocketAddress();
    }
    
    @Override
    public InetSocketAddress method5479(final Class957 class957) {
        return (InetSocketAddress)this.method5582(class957).getRemoteSocketAddress();
    }
    
    public abstract void method5583(final Class957 p0, final Class6083 p1);
    
    public abstract void method5584(final Class957 p0, final int p1, final String p2, final boolean p3);
    
    public abstract void method5585(final Class957 p0, final String p1);
    
    public abstract void method5586(final Class957 p0, final Exception p1);
    
    public abstract void method5587();
    
    public void method5588(final Class957 class957, final ByteBuffer byteBuffer) {
    }
    
    public void method5589(final String s) {
        this.method5594(s, this.field5111);
    }
    
    public void method5590(final byte[] array) {
        this.method5592(array, this.field5111);
    }
    
    public void method5591(final ByteBuffer byteBuffer) {
        this.method5593(byteBuffer, this.field5111);
    }
    
    public void method5592(final byte[] array, final Collection<Class957> collection) {
        if (array != null && collection != null) {
            this.method5593(ByteBuffer.wrap(array), collection);
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public void method5593(final ByteBuffer byteBuffer, final Collection<Class957> collection) {
        if (byteBuffer != null && collection != null) {
            this.method5595(byteBuffer, collection);
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public void method5594(final String s, final Collection<Class957> collection) {
        if (s != null && collection != null) {
            this.method5595(s, collection);
            return;
        }
        throw new IllegalArgumentException();
    }
    
    private void method5595(final Object o, final Collection<Class957> collection) {
        String s = null;
        if (o instanceof String) {
            s = (String)o;
        }
        ByteBuffer byteBuffer = null;
        if (o instanceof ByteBuffer) {
            byteBuffer = (ByteBuffer)o;
        }
        if (s == null && byteBuffer == null) {
            return;
        }
        final HashMap<Class9122, List<Class2776>> hashMap = (HashMap<Class9122, List<Class2776>>)new HashMap<Object, Collection<Class2776>>();
        for (final Class957 class957 : collection) {
            if (class957 != null) {
                final Class9122 method5445 = class957.method5445();
                this.method5596(method5445, hashMap, s, byteBuffer);
                try {
                    class957.method5499(hashMap.get(method5445));
                }
                catch (final Class2369 class958) {}
            }
        }
    }
    
    private void method5596(final Class9122 class9122, final Map<Class9122, List<Class2776>> map, final String s, final ByteBuffer byteBuffer) {
        if (!map.containsKey(class9122)) {
            List<Class2776> list = null;
            if (s != null) {
                list = class9122.method33043(s, false);
            }
            if (byteBuffer != null) {
                list = class9122.method33042(byteBuffer, false);
            }
            if (list != null) {
                map.put(class9122, list);
            }
        }
    }
    
    static {
        field5110 = Runtime.getRuntime().availableProcessors();
    }
}
