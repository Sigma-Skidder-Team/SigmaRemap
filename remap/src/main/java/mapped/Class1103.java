// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.nio.ByteBuffer;
import java.io.IOException;

public class Class1103 implements Runnable
{
    private final Class956 field5959;
    public final /* synthetic */ Class956 field5960;
    
    public Class1103(final Class956 field5960, final Class956 field5961) {
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
            Class956.method5504(this.field5960, ex);
        }
        finally {
            this.method5608();
            Class956.method5505(this.field5960, null);
        }
    }
    
    private void method5607() throws IOException {
        try {
            while (!Thread.interrupted()) {
                final ByteBuffer byteBuffer = Class956.method5506(this.field5960).field5080.take();
                Class956.method5507(this.field5960).write(byteBuffer.array(), 0, byteBuffer.limit());
                Class956.method5507(this.field5960).flush();
            }
            return;
        }
        catch (final InterruptedException ex) {
            for (final ByteBuffer byteBuffer2 : Class956.method5506(this.field5960).field5080) {
                Class956.method5507(this.field5960).write(byteBuffer2.array(), 0, byteBuffer2.limit());
                Class956.method5507(this.field5960).flush();
            }
        }
        Thread.currentThread().interrupt();
    }
    
    private void method5608() {
        try {
            if (Class956.method5508(this.field5960) != null) {
                Class956.method5508(this.field5960).close();
            }
        }
        catch (final IOException ex) {
            this.field5960.method5471(this.field5959, ex);
        }
    }
}
