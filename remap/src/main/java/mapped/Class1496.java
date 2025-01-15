// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1496 implements Runnable
{
    private static String[] field8319;
    public final /* synthetic */ Class8015 field8320;
    
    public Class1496(final Class8015 field8320) {
        this.field8320 = field8320;
    }
    
    @Override
    public void run() {
        while (true) {
            final long method26269 = this.field8320.method26269(System.nanoTime());
            if (method26269 == -1L) {
                break;
            }
            if (method26269 <= 0L) {
                continue;
            }
            final long timeoutMillis = method26269 / 1000000L;
            final long n = method26269 - timeoutMillis * 1000000L;
            synchronized (this.field8320) {
                try {
                    this.field8320.wait(timeoutMillis, (int)n);
                }
                catch (final InterruptedException ex) {}
            }
        }
    }
}
