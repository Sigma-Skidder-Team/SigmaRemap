// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Class899 extends Thread
{
    private BlockingQueue<Class958> field4846;
    public static final /* synthetic */ boolean field4847;
    public final /* synthetic */ Class963 field4848;
    
    public Class899(final Class963 field4848) {
        this.field4848 = field4848;
        this.field4846 = new LinkedBlockingQueue<Class958>();
        this.setName("WebSocketWorker-" + this.getId());
        this.setUncaughtExceptionHandler((UncaughtExceptionHandler)new Class8238(this, field4848));
    }
    
    public void method5403(final Class958 class958) throws InterruptedException {
        this.field4846.put(class958);
    }
    
    @Override
    public void run() {
        Class958 class958 = null;
        try {
            while (true) {
                class958 = this.field4846.take();
                final ByteBuffer byteBuffer = class958.field5081.poll();
                if (!Class899.field4847 && byteBuffer == null) {
                    break;
                }
                this.method5404(class958, byteBuffer);
                class958 = null;
            }
            throw new AssertionError();
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        catch (final RuntimeException ex2) {
            Class963.method5597(this.field4848, class958, ex2);
        }
    }
    
    private void method5404(final Class958 class958, final ByteBuffer byteBuffer) throws InterruptedException {
        try {
            class958.method5509(byteBuffer);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
        finally {
            Class963.method5598(this.field4848, byteBuffer);
        }
    }
    
    static {
        field4847 = !Class963.class.desiredAssertionStatus();
    }
}
