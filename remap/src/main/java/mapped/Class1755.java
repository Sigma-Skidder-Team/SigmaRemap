// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SelectableChannel;
import java.io.EOFException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLException;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.io.IOException;
import java.util.ArrayList;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLEngine;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.Future;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

public class Class1755 implements ByteChannel, Class1754
{
    public static ByteBuffer field9753;
    public ExecutorService field9754;
    public List<Future<?>> field9755;
    public ByteBuffer field9756;
    public ByteBuffer field9757;
    public ByteBuffer field9758;
    public SocketChannel field9759;
    public SelectionKey field9760;
    public SSLEngine field9761;
    public SSLEngineResult field9762;
    public SSLEngineResult field9763;
    public int field9764;
    public static final /* synthetic */ boolean field9765;
    
    public Class1755(final SocketChannel field9759, final SSLEngine field9760, final ExecutorService field9761, final SelectionKey field9762) throws IOException {
        this.field9764 = 0;
        if (field9759 != null) {
            if (field9760 != null) {
                if (field9761 != null) {
                    this.field9759 = field9759;
                    this.field9761 = field9760;
                    this.field9754 = field9761;
                    final SSLEngineResult sslEngineResult = new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, field9760.getHandshakeStatus(), 0, 0);
                    this.field9763 = sslEngineResult;
                    this.field9762 = sslEngineResult;
                    this.field9755 = new ArrayList<Future<?>>(3);
                    if (field9762 != null) {
                        field9762.interestOps(field9762.interestOps() | 0x4);
                        this.field9760 = field9762;
                    }
                    this.method6217(field9760.getSession());
                    this.field9759.write(this.method6214(Class1755.field9753));
                    this.method6213();
                    return;
                }
            }
        }
        throw new IllegalArgumentException("parameter must not be null");
    }
    
    private void method6212(final Future<?> future) {
        try {
            while (true) {
                try {
                    future.get();
                }
                catch (final InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    continue;
                }
                break;
            }
        }
        catch (final ExecutionException cause) {
            throw new RuntimeException(cause);
        }
    }
    
    private synchronized void method6213() throws IOException {
        if (this.field9761.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            return;
        }
        if (!this.field9755.isEmpty()) {
            final Iterator<Future<?>> iterator = this.field9755.iterator();
            while (iterator.hasNext()) {
                final Future future = iterator.next();
                if (!future.isDone()) {
                    if (this.method6211()) {
                        this.method6212(future);
                    }
                    return;
                }
                iterator.remove();
            }
        }
        if (this.field9761.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
            if (!this.method6211() || this.field9762.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) {
                this.field9758.compact();
                if (this.field9759.read(this.field9758) == -1) {
                    throw new IOException("connection closed unexpectedly by peer");
                }
                this.field9758.flip();
            }
            this.field9756.compact();
            this.method6215();
            if (this.field9762.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                this.method6217(this.field9761.getSession());
                return;
            }
        }
        this.method6216();
        if (this.field9755.isEmpty() || this.field9761.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
            this.field9759.write(this.method6214(Class1755.field9753));
            if (this.field9763.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                this.method6217(this.field9761.getSession());
                return;
            }
        }
        if (!Class1755.field9765 && this.field9761.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            throw new AssertionError();
        }
        this.field9764 = 1;
    }
    
    private synchronized ByteBuffer method6214(final ByteBuffer src) throws SSLException {
        this.field9757.compact();
        this.field9763 = this.field9761.wrap(src, this.field9757);
        this.field9757.flip();
        return this.field9757;
    }
    
    private synchronized ByteBuffer method6215() throws SSLException {
        if (this.field9762.getStatus() == SSLEngineResult.Status.CLOSED && this.field9761.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            try {
                this.close();
            }
            catch (final IOException ex) {}
        }
        int remaining;
        do {
            remaining = this.field9756.remaining();
            this.field9762 = this.field9761.unwrap(this.field9758, this.field9756);
        } while (this.field9762.getStatus() == SSLEngineResult.Status.OK && (remaining != this.field9756.remaining() || this.field9761.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_UNWRAP));
        this.field9756.flip();
        return this.field9756;
    }
    
    public void method6216() {
        Runnable delegatedTask;
        while ((delegatedTask = this.field9761.getDelegatedTask()) != null) {
            this.field9755.add(this.field9754.submit(delegatedTask));
        }
    }
    
    public void method6217(final SSLSession sslSession) {
        final int packetBufferSize = sslSession.getPacketBufferSize();
        final int max = Math.max(sslSession.getApplicationBufferSize(), packetBufferSize);
        if (this.field9756 != null) {
            if (this.field9756.capacity() != max) {
                this.field9756 = ByteBuffer.allocate(max);
            }
            if (this.field9757.capacity() != packetBufferSize) {
                this.field9757 = ByteBuffer.allocate(packetBufferSize);
            }
            if (this.field9758.capacity() != packetBufferSize) {
                this.field9758 = ByteBuffer.allocate(packetBufferSize);
            }
        }
        else {
            this.field9756 = ByteBuffer.allocate(max);
            this.field9757 = ByteBuffer.allocate(packetBufferSize);
            this.field9758 = ByteBuffer.allocate(packetBufferSize);
        }
        this.field9756.rewind();
        this.field9756.flip();
        this.field9758.rewind();
        this.field9758.flip();
        this.field9757.rewind();
        this.field9757.flip();
        ++this.field9764;
    }
    
    @Override
    public int write(final ByteBuffer byteBuffer) throws IOException {
        if (!this.method6220()) {
            this.method6213();
            return 0;
        }
        final int write = this.field9759.write(this.method6214(byteBuffer));
        if (this.field9763.getStatus() != SSLEngineResult.Status.CLOSED) {
            return write;
        }
        throw new EOFException("Connection is closed");
    }
    
    @Override
    public int read(final ByteBuffer byteBuffer) throws IOException {
        while (byteBuffer.hasRemaining()) {
            if (!this.method6220()) {
                if (!this.method6211()) {
                    this.method6213();
                    if (!this.method6220()) {
                        return 0;
                    }
                }
                else {
                    while (!this.method6220()) {
                        this.method6213();
                    }
                }
            }
            final int method6218 = this.method6218(byteBuffer);
            if (method6218 != 0) {
                return method6218;
            }
            if (!Class1755.field9765 && this.field9756.position() != 0) {
                throw new AssertionError();
            }
            this.field9756.clear();
            if (this.field9758.hasRemaining()) {
                this.field9758.compact();
            }
            else {
                this.field9758.clear();
            }
            if (this.method6211() || this.field9762.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) {
                if (this.field9759.read(this.field9758) == -1) {
                    return -1;
                }
            }
            this.field9758.flip();
            this.method6215();
            final int method6219 = this.method6226(this.field9756, byteBuffer);
            if (method6219 == 0 && this.method6211()) {
                continue;
            }
            return method6219;
        }
        return 0;
    }
    
    private int method6218(final ByteBuffer byteBuffer) throws SSLException {
        if (!this.field9756.hasRemaining()) {
            if (!this.field9756.hasRemaining()) {
                this.field9756.clear();
            }
            if (this.field9758.hasRemaining()) {
                this.method6215();
                final int method6226 = this.method6226(this.field9756, byteBuffer);
                if (this.field9762.getStatus() == SSLEngineResult.Status.CLOSED) {
                    return -1;
                }
                if (method6226 > 0) {
                    return method6226;
                }
            }
            return 0;
        }
        return this.method6226(this.field9756, byteBuffer);
    }
    
    public boolean method6219() {
        return this.field9759.isConnected();
    }
    
    @Override
    public void close() throws IOException {
        this.field9761.closeOutbound();
        this.field9761.getSession().invalidate();
        if (this.field9759.isOpen()) {
            this.field9759.write(this.method6214(Class1755.field9753));
        }
        this.field9759.close();
    }
    
    private boolean method6220() {
        final SSLEngineResult.HandshakeStatus handshakeStatus = this.field9761.getHandshakeStatus();
        return handshakeStatus == SSLEngineResult.HandshakeStatus.FINISHED || handshakeStatus == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
    }
    
    public SelectableChannel method6221(final boolean block) throws IOException {
        return this.field9759.configureBlocking(block);
    }
    
    public boolean method6222(final SocketAddress socketAddress) throws IOException {
        return this.field9759.connect(socketAddress);
    }
    
    public boolean method6223() throws IOException {
        return this.field9759.finishConnect();
    }
    
    public Socket method6224() {
        return this.field9759.socket();
    }
    
    public boolean method6225() {
        return this.field9761.isInboundDone();
    }
    
    @Override
    public boolean isOpen() {
        return this.field9759.isOpen();
    }
    
    @Override
    public boolean method6207() {
        return this.field9757.hasRemaining() || !this.method6220();
    }
    
    @Override
    public void method6208() throws IOException {
        this.write(this.field9757);
    }
    
    @Override
    public boolean method6209() {
        if (!this.field9756.hasRemaining()) {
            if (this.field9758.hasRemaining()) {
                if (this.field9762.getStatus() != SSLEngineResult.Status.BUFFER_UNDERFLOW) {
                    if (this.field9762.getStatus() != SSLEngineResult.Status.CLOSED) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int method6210(final ByteBuffer byteBuffer) throws SSLException {
        return this.method6218(byteBuffer);
    }
    
    private int method6226(final ByteBuffer src, final ByteBuffer byteBuffer) {
        final int remaining = src.remaining();
        final int remaining2 = byteBuffer.remaining();
        if (remaining <= remaining2) {
            byteBuffer.put(src);
            return remaining;
        }
        final int min = Math.min(remaining, remaining2);
        for (int i = 0; i < min; ++i) {
            byteBuffer.put(src.get());
        }
        return min;
    }
    
    @Override
    public boolean method6211() {
        return this.field9759.isBlocking();
    }
    
    static {
        field9765 = !Class1755.class.desiredAssertionStatus();
        Class1755.field9753 = ByteBuffer.allocate(0);
    }
}
