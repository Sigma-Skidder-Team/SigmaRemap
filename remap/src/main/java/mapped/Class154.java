// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class Class154 implements Class122
{
    private static String[] field451;
    private final Block field452;
    private final Class9357 field453;
    
    private Class154(final Block field452, final Class9357 field453) {
        this.field452 = field452;
        this.field453 = field453;
    }
    
    @Override
    public Set<Class7915<?>> method635() {
        return (Set<Class7915<?>>)ImmutableSet.of((Object)Class6683.field26368);
    }
    
    @Override
    public boolean test(final Class7529 class7529) {
        final BlockState class7530 = class7529.method23579(Class6683.field26368);
        if (class7530 != null) {
            if (this.field452 == class7530.getBlock()) {
                return this.field453.method34689(class7530);
            }
        }
        return false;
    }
    
    public static Class8774 method739(final Block class3833) {
        return new Class8774(class3833);
    }
}
