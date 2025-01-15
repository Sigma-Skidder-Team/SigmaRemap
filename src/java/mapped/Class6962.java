// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import javax.net.ssl.SSLEngine;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;

public class Class6962 extends Class6960
{
    private static String[] field27240;
    private final String[] field27241;
    private final String[] field27242;
    
    public Class6962(final SSLContext sslContext, final String[] array, final String[] array2) {
        this(sslContext, Executors.newSingleThreadScheduledExecutor(), array, array2);
    }
    
    public Class6962(final SSLContext sslContext, final ExecutorService executorService, final String[] field27241, final String[] field27242) {
        super(sslContext, executorService);
        this.field27241 = field27241;
        this.field27242 = field27242;
    }
    
    @Override
    public ByteChannel method21375(final SocketChannel socketChannel, final SelectionKey selectionKey) throws IOException {
        final SSLEngine sslEngine = this.field27236.createSSLEngine();
        if (this.field27241 != null) {
            sslEngine.setEnabledProtocols(this.field27241);
        }
        if (this.field27242 != null) {
            sslEngine.setEnabledCipherSuites(this.field27242);
        }
        sslEngine.setUseClientMode(false);
        return new Class1755(socketChannel, sslEngine, this.field27237, selectionKey);
    }
}
