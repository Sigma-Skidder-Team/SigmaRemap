// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.java_websocket.client.WebSocketClient;

import java.nio.ByteBuffer;
import java.io.IOException;

public class Class1103 implements Runnable
{
    private final WebSocketClient field5959;
    public final /* synthetic */ WebSocketClient field5960;
    
    public Class1103(final WebSocketClient field5960, final WebSocketClient field5961) {
        this.field5960 = field5960;
        this.field5959 = field5961;
    }
    
    @Override
    public void run() {
        Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
        try {
            this.method5607();
        }
        catch (final IOException ex) {
            WebSocketClient.method5504(this.field5960, ex);
        }
        finally {
            this.method5608();
            WebSocketClient.method5505(this.field5960, null);
        }
    }
    
    private void method5607() throws IOException {
        try {
            while (!Thread.interrupted()) {
                final ByteBuffer byteBuffer = WebSocketClient.method5506(this.field5960).field5080.take();
                WebSocketClient.method5507(this.field5960).write(byteBuffer.array(), 0, byteBuffer.limit());
                WebSocketClient.method5507(this.field5960).flush();
            }
            return;
        }
        catch (final InterruptedException ex) {
            for (final ByteBuffer byteBuffer2 : WebSocketClient.method5506(this.field5960).field5080) {
                WebSocketClient.method5507(this.field5960).write(byteBuffer2.array(), 0, byteBuffer2.limit());
                WebSocketClient.method5507(this.field5960).flush();
            }
        }
        Thread.currentThread().interrupt();
    }
    
    private void method5608() {
        try {
            if (WebSocketClient.method5508(this.field5960) != null) {
                WebSocketClient.method5508(this.field5960).close();
            }
        }
        catch (final IOException ex) {
            this.field5960.onWebsocketError(this.field5959, ex);
        }
    }
}
