// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class920 extends Thread
{
    private static String[] field4896;
    public final /* synthetic */ Class395 field4897;
    
    public Class920(final Class395 field4897, final String name) {
        this.field4897 = field4897;
        super(name);
        this.setDaemon(true);
        this.setUncaughtExceptionHandler((UncaughtExceptionHandler)new Class8239(Class395.method1613()));
        this.start();
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                while (true) {
                    Thread.sleep(2147483647L);
                }
            }
            catch (final InterruptedException ex) {
                continue;
            }
            break;
        }
    }
}
