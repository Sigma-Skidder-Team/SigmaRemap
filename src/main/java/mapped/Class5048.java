// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.logging.log4j.Logger;

public class Class5048 extends Class5046
{
    private static final Logger field21663;
    private final Class5046 field21664;
    private final Class7428 field21665;
    private final ReentrantLock field21666;
    
    public Class5048(final Class5046 field21664, final Class7428 field21665, final ReentrantLock field21666) {
        this.field21664 = field21664;
        this.field21665 = field21665;
        this.field21666 = field21666;
    }
    
    @Override
    public void method15437(final boolean b, final int n) {
        try {
            if (!b) {
                Class7847.method25362(this.field21664);
            }
            else {
                try {
                    Class7847.method25370(this.field21665.field28642, this.field21665.field28643).thenRun(() -> {
                        new Class5049(this.field21664, new Class1343(this.field21664, this.field21665));
                        final Class5049 class5050;
                        class5050.method15466();
                        Class7847.method25362(class5050);
                    }).exceptionally(t2 -> {
                        Class7847.method25371();
                        Class5048.field21663.error((Object)t2);
                        Class7847.method25362(new Class5074("Failed to download resource pack!", this.field21664));
                        return null;
                    });
                }
                catch (final Exception ex) {
                    Class7847.method25371();
                    Class5048.field21663.error((Object)ex);
                    Class7847.method25362(new Class5074("Failed to download resource pack!", this.field21664));
                }
            }
        }
        finally {
            if (this.field21666 != null && this.field21666.isHeldByCurrentThread()) {
                this.field21666.unlock();
            }
        }
    }
    
    static {
        field21663 = LogManager.getLogger();
    }
}
