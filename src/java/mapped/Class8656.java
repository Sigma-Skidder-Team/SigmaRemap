// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Supplier;

public class Class8656<T>
{
    private static String[] field36331;
    private Supplier<T> field36332;
    private T field36333;
    
    public Class8656(final Supplier<T> field36332) {
        this.field36332 = field36332;
    }
    
    public T method29528() {
        final Supplier<T> field36332 = this.field36332;
        if (field36332 != null) {
            this.field36333 = field36332.get();
            this.field36332 = null;
        }
        return this.field36333;
    }
}
