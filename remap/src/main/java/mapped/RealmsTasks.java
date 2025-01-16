// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RealmsTasks
{
    public static final Logger field_225184_a;
    
    private static void method29098(final int n) {
        try {
            Thread.sleep(n * 1000);
        }
        catch (final InterruptedException ex) {
            RealmsTasks.field_225184_a.error("", (Throwable)ex);
        }
    }

    public static /* synthetic */ void func_225182_b(int n) {
        RealmsTasks.method29098(n);
    }

    public static /* synthetic */ Logger getLogger() {
        return field_225184_a;
    }
    
    static {
        field_225184_a = LogManager.getLogger();
    }
}
