// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.logging.Level;

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
            synchronized (EventThread.class) {
                EventThread.method5440();
                if (EventThread.method5441() == 0) {
                    EventThread.method5442().shutdown();
                    EventThread.method5443(null);
                    EventThread.method5437(null);
                }
            }
        }
        catch (final Throwable thrown) {
            EventThread.method5439().log(Level.SEVERE, "Task threw exception", thrown);
            throw thrown;
        }
        finally {
            synchronized (EventThread.class) {
                EventThread.method5440();
                if (EventThread.method5441() == 0) {
                    EventThread.method5442().shutdown();
                    EventThread.method5443(null);
                    EventThread.method5437(null);
                }
            }
        }
    }
}
