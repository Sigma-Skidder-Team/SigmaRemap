// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Method;
import java.util.function.LongSupplier;

public final class Class7381 implements LongSupplier
{
    private boolean field28435;
    public final /* synthetic */ Method field28436;
    public final /* synthetic */ Object field28437;
    
    public Class7381(final Method field28436, final Object field28437) {
        this.field28436 = field28436;
        this.field28437 = field28437;
        this.field28435 = false;
    }
    
    @Override
    public long getAsLong() {
        if (this.field28435) {
            return -1L;
        }
        try {
            return (long)this.field28436.invoke(this.field28437, new Object[0]);
        }
        catch (final Throwable t) {
            Class8571.method28848("" + t.getClass().getName() + ": " + t.getMessage());
            this.field28435 = true;
            return -1L;
        }
    }
}
