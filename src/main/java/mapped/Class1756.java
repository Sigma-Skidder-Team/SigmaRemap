// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.util.concurrent.ExecutorService;
import java.nio.ByteBuffer;
import javax.net.ssl.SSLEngine;
import java.nio.channels.SocketChannel;
import java.nio.channels.ByteChannel;

public class Class1756 implements Class1754, ByteChannel
{
    private final SocketChannel field9766;
    private final SSLEngine field9767;
    private ByteBuffer field9768;
    private ByteBuffer field9769;
    private ByteBuffer field9770;
    private ByteBuffer field9771;
    private ExecutorService field9772;
    
    public Class1756(final SocketChannel field9766, final SSLEngine field9767, final ExecutorService field9768, final SelectionKey selectionKey) throws IOException {
        if (field9766 == null || field9767 == null || this.field9772 == field9768) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.field9766 = field9766;
        this.field9767 = field9767;
        this.field9772 = field9768;
        this.field9769 = ByteBuffer.allocate(this.field9767.getSession().getPacketBufferSize());
        this.field9771 = ByteBuffer.allocate(this.field9767.getSession().getPacketBufferSize());
        this.field9767.beginHandshake();
        if (this.method6227()) {
            if (selectionKey != null) {
                selectionKey.interestOps(selectionKey.interestOps() | 0x4);
            }
        }
        else {
            try {
                this.field9766.close();
            }
            catch (final IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public synchronized int read(final ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.field9770.hasRemaining()) {
            this.field9770.flip();
            return Class8833.method30846(this.field9770, byteBuffer);
        }
        this.field9771.compact();
        final int read = this.field9766.read(this.field9771);
        if (read > 0 || this.field9771.hasRemaining()) {
            this.field9771.flip();
            if (this.field9771.hasRemaining()) {
                this.field9770.compact();
                SSLEngineResult unwrap;
                try {
                    unwrap = this.field9767.unwrap(this.field9771, this.field9770);
                }
                catch (final SSLException ex) {
                    ex.printStackTrace();
                    throw ex;
                }
                switch (Class7760.field31705[unwrap.getStatus().ordinal()]) {
                    case 1: {
                        this.field9770.flip();
                        return Class8833.method30846(this.field9770, byteBuffer);
                    }
                    case 2: {
                        this.field9770.flip();
                        return Class8833.method30846(this.field9770, byteBuffer);
                    }
                    case 3: {
                        this.field9770 = this.method6229(this.field9770);
                        return this.read(byteBuffer);
                    }
                    case 4: {
                        this.method6232();
                        byteBuffer.clear();
                        return -1;
                    }
                    default: {
                        throw new IllegalStateException("Invalid SSL status: " + unwrap.getStatus());
                    }
                }
            }
        }
        else if (read < 0) {
            this.method6233();
        }
        Class8833.method30846(this.field9770, byteBuffer);
        return read;
    }
    
    @Override
    public synchronized int write(final ByteBuffer src) throws IOException {
        int n = 0;
        while (src.hasRemaining()) {
            this.field9769.clear();
            final SSLEngineResult wrap = this.field9767.wrap(src, this.field9769);
            switch (Class7760.field31705[wrap.getStatus().ordinal()]) {
                case 1: {
                    this.field9769.flip();
                    while (this.field9769.hasRemaining()) {
                        n += this.field9766.write(this.field9769);
                    }
                    continue;
                }
                case 3: {
                    this.field9769 = this.method6228(this.field9769);
                    continue;
                }
                case 2: {
                    throw new SSLException("Buffer underflow occured after a wrap. I don't think we should ever get here.");
                }
                case 4: {
                    this.method6232();
                    return 0;
                }
                default: {
                    throw new IllegalStateException("Invalid SSL status: " + wrap.getStatus());
                }
            }
        }
        return n;
    }
    
    private boolean method6227() throws IOException {
        final int applicationBufferSize = this.field9767.getSession().getApplicationBufferSize();
        this.field9768 = ByteBuffer.allocate(applicationBufferSize);
        this.field9770 = ByteBuffer.allocate(applicationBufferSize);
        this.field9769.clear();
        this.field9771.clear();
        SSLEngineResult.HandshakeStatus obj = this.field9767.getHandshakeStatus();
        boolean b = false;
        while (!b) {
            switch (Class7760.field31706[obj.ordinal()]) {
                case 1: {
                    b = !this.field9771.hasRemaining();
                    if (b) {
                        return true;
                    }
                    this.field9766.write(this.field9771);
                    continue;
                }
                case 2: {
                    if (this.field9766.read(this.field9771) < 0) {
                        if (this.field9767.isInboundDone() && this.field9767.isOutboundDone()) {
                            return false;
                        }
                        try {
                            this.field9767.closeInbound();
                        }
                        catch (final SSLException ex) {}
                        this.field9767.closeOutbound();
                        obj = this.field9767.getHandshakeStatus();
                        continue;
                    }
                    else {
                        this.field9771.flip();
                        SSLEngineResult unwrap;
                        try {
                            unwrap = this.field9767.unwrap(this.field9771, this.field9770);
                            this.field9771.compact();
                            obj = unwrap.getHandshakeStatus();
                        }
                        catch (final SSLException ex2) {
                            this.field9767.closeOutbound();
                            obj = this.field9767.getHandshakeStatus();
                            continue;
                        }
                        switch (Class7760.field31705[unwrap.getStatus().ordinal()]) {
                            case 1: {
                                continue;
                            }
                            case 3: {
                                this.field9770 = this.method6229(this.field9770);
                                continue;
                            }
                            case 2: {
                                this.field9771 = this.method6231(this.field9771);
                                continue;
                            }
                            case 4: {
                                if (this.field9767.isOutboundDone()) {
                                    return false;
                                }
                                this.field9767.closeOutbound();
                                obj = this.field9767.getHandshakeStatus();
                                continue;
                            }
                            default: {
                                throw new IllegalStateException("Invalid SSL status: " + unwrap.getStatus());
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    this.field9769.clear();
                    SSLEngineResult wrap;
                    try {
                        wrap = this.field9767.wrap(this.field9768, this.field9769);
                        obj = wrap.getHandshakeStatus();
                    }
                    catch (final SSLException ex3) {
                        this.field9767.closeOutbound();
                        obj = this.field9767.getHandshakeStatus();
                        continue;
                    }
                    switch (Class7760.field31705[wrap.getStatus().ordinal()]) {
                        case 1: {
                            this.field9769.flip();
                            while (this.field9769.hasRemaining()) {
                                this.field9766.write(this.field9769);
                            }
                            continue;
                        }
                        case 3: {
                            this.field9769 = this.method6228(this.field9769);
                            continue;
                        }
                        case 2: {
                            throw new SSLException("Buffer underflow occured after a wrap. I don't think we should ever get here.");
                        }
                        case 4: {
                            try {
                                this.field9769.flip();
                                while (this.field9769.hasRemaining()) {
                                    this.field9766.write(this.field9769);
                                }
                                this.field9771.clear();
                            }
                            catch (final Exception ex4) {
                                obj = this.field9767.getHandshakeStatus();
                            }
                            continue;
                        }
                        default: {
                            throw new IllegalStateException("Invalid SSL status: " + wrap.getStatus());
                        }
                    }
                    break;
                }
                case 4: {
                    Runnable delegatedTask;
                    while ((delegatedTask = this.field9767.getDelegatedTask()) != null) {
                        this.field9772.execute(delegatedTask);
                    }
                    obj = this.field9767.getHandshakeStatus();
                    continue;
                }
                case 5: {
                    continue;
                }
                default: {
                    throw new IllegalStateException("Invalid SSL status: " + obj);
                }
            }
        }
        return true;
    }
    
    private ByteBuffer method6228(final ByteBuffer byteBuffer) {
        return this.method6230(byteBuffer, this.field9767.getSession().getPacketBufferSize());
    }
    
    private ByteBuffer method6229(final ByteBuffer byteBuffer) {
        return this.method6230(byteBuffer, this.field9767.getSession().getApplicationBufferSize());
    }
    
    private ByteBuffer method6230(ByteBuffer byteBuffer, final int capacity) {
        if (capacity <= byteBuffer.capacity()) {
            byteBuffer = ByteBuffer.allocate(byteBuffer.capacity() * 2);
        }
        else {
            byteBuffer = ByteBuffer.allocate(capacity);
        }
        return byteBuffer;
    }
    
    private ByteBuffer method6231(final ByteBuffer src) {
        if (this.field9767.getSession().getPacketBufferSize() >= src.limit()) {
            final ByteBuffer method6228 = this.method6228(src);
            src.flip();
            method6228.put(src);
            return method6228;
        }
        return src;
    }
    
    private void method6232() throws IOException {
        this.field9767.closeOutbound();
        try {
            this.method6227();
        }
        catch (final IOException ex) {}
        this.field9766.close();
    }
    
    private void method6233() throws IOException {
        try {
            this.field9767.closeInbound();
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
        this.method6232();
    }
    
    @Override
    public boolean method6207() {
        return false;
    }
    
    @Override
    public void method6208() throws IOException {
    }
    
    @Override
    public boolean method6209() {
        return this.field9771.hasRemaining() || this.field9770.hasRemaining();
    }
    
    @Override
    public int method6210(final ByteBuffer byteBuffer) throws IOException {
        return this.read(byteBuffer);
    }
    
    @Override
    public boolean method6211() {
        return this.field9766.isBlocking();
    }
    
    @Override
    public boolean isOpen() {
        return this.field9766.isOpen();
    }
    
    @Override
    public void close() throws IOException {
        this.method6232();
    }
}
