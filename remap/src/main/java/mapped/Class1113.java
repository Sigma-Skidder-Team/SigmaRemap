// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.logging.Level;
import java.util.concurrent.ExecutorService;

public final class Class1113 implements Runnable
{
    public final Runnable field5999;
    
    public Class1113(final Runnable field5999) {
        this.field5999 = field5999;
    }
    
    @Override
    public void run() {
        try {
            this.field5999.run();
            synchronized (Class934.class) {
                Class934.method5440();
                if (Class934.method5441() == 0) {
                    Class934.method5442().shutdown();
                    Class934.method5443(null);
                    Class934.method5437(null);
                }
            }
        }
        catch (final Throwable thrown) {
            Class934.method5439().log(Level.SEVERE, "Task threw exception", thrown);
            throw thrown;
        }
        finally {
            synchronized (Class934.class) {
                Class934.method5440();
                if (Class934.method5441() == 0) {
                    Class934.method5442().shutdown();
                    Class934.method5443(null);
                    Class934.method5437(null);
                }
            }
        }
    }
}
