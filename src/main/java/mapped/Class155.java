// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;

public class Class155 implements Class122
{
    private static String[] field454;
    private final Class122 field455;
    
    private Class155(final Class122 field455) {
        this.field455 = field455;
    }
    
    @Override
    public final boolean test(final Class7529 class7529) {
        return !this.field455.test(class7529);
    }
    
    @Override
    public Set<Class7915<?>> method635() {
        return this.field455.method635();
    }
    
    @Override
    public void method636(final Class7790 class7790) {
        super.method636(class7790);
        this.field455.method636(class7790);
    }
    
    public static Class8775 method742(final Class8775 class8775) {
        return () -> class155;
    }
}
