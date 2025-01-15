// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8593
{
    private static final Logger field36097;
    
    private static void method29098(final int n) {
        try {
            Thread.sleep(n * 1000);
        }
        catch (final InterruptedException ex) {
            Class8593.field36097.error("", (Throwable)ex);
        }
    }
    
    static {
        field36097 = LogManager.getLogger();
    }
}
