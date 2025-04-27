// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.util.concurrent.RateLimiter;
import java.util.concurrent.atomic.AtomicReference;
import java.time.Duration;

public class Class8098
{
    private static String[] field33331;
    public final Duration field33332;
    private final float field33333;
    public final AtomicReference<Class7061> field33334;
    
    public Class8098(final Duration field33332) {
        this.field33332 = field33332;
        this.field33334 = new AtomicReference<Class7061>();
        this.field33333 = 1.0f / (field33332.toMillis() / 1000.0f);
    }
    
    public void method26600(final String s) {
        if (this.field33334.updateAndGet(class7062 -> {
            Class7061 class7063 = null;
            return class7063;
        }).field27474.tryAcquire(1)) {
            NarratorChatListener.field32404.method25555(Class285.field1573, new StringTextComponent(s));
        }
    }
}
