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
import javax.net.ssl.SSLParameters;

public class Class6961 extends Class6960
{
    private static String[] field27238;
    private final SSLParameters field27239;
    
    public Class6961(final SSLContext sslContext, final SSLParameters sslParameters) {
        this(sslContext, Executors.newSingleThreadScheduledExecutor(), sslParameters);
    }
    
    public Class6961(final SSLContext sslContext, final ExecutorService executorService, final SSLParameters field27239) {
        super(sslContext, executorService);
        if (field27239 != null) {
            this.field27239 = field27239;
            return;
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public ByteChannel method21375(final SocketChannel socketChannel, final SelectionKey selectionKey) throws IOException {
        final SSLEngine sslEngine = this.field27236.createSSLEngine();
        sslEngine.setUseClientMode(false);
        sslEngine.setSSLParameters(this.field27239);
        return new Class1755(socketChannel, sslEngine, this.field27237, selectionKey);
    }
}
