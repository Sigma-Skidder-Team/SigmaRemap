// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class Class157 implements Class122
{
    private static String[] field458;
    private final Class6257 field459;
    private final float[] field460;
    
    private Class157(final Class6257 field459, final float[] field460) {
        this.field459 = field459;
        this.field460 = field460;
    }
    
    @Override
    public Set<Class7915<?>> method635() {
        return (Set<Class7915<?>>)ImmutableSet.of((Object)Class6683.field26370);
    }
    
    @Override
    public boolean test(final Class7529 class7529) {
        final ItemStack class7530 = class7529.method23579(Class6683.field26370);
        return class7529.method23586().nextFloat() < this.field460[Math.min((class7530 == null) ? 0 : Class8742.method30195(this.field459, class7530), this.field460.length - 1)];
    }
    
    public static Class8775 method746(final Class6257 class6257, final float... array) {
        return () -> new Class157(class6257, array);
    }
}
