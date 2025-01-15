// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.io.IOException;
import javax.net.ssl.SSLEngine;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.SSLContext;

public class Class6960 implements Class6959
{
    public SSLContext field27236;
    public ExecutorService field27237;
    
    public Class6960(final SSLContext sslContext) {
        this(sslContext, Executors.newSingleThreadScheduledExecutor());
    }
    
    public Class6960(final SSLContext field27236, final ExecutorService field27237) {
        if (field27236 != null && field27237 != null) {
            this.field27236 = field27236;
            this.field27237 = field27237;
            return;
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public ByteChannel method21375(final SocketChannel socketChannel, final SelectionKey selectionKey) throws IOException {
        final SSLEngine sslEngine = this.field27236.createSSLEngine();
        final ArrayList list = new ArrayList(Arrays.asList(sslEngine.getEnabledCipherSuites()));
        list.remove("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        sslEngine.setEnabledCipherSuites((String[])list.toArray((Object[])new String[list.size()]));
        sslEngine.setUseClientMode(false);
        return new Class1755(socketChannel, sslEngine, this.field27237, selectionKey);
    }
    
    @Override
    public Class958 method21371(final Class961 class961, final Class9122 class962) {
        return new Class958(class961, class962);
    }
    
    @Override
    public Class958 method21372(final Class961 class961, final List<Class9122> list) {
        return new Class958(class961, list);
    }
    
    @Override
    public void method21374() {
        this.field27237.shutdown();
    }
}
