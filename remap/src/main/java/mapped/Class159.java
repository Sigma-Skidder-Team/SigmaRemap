// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.Entity;

import java.util.Set;

public class Class159 implements Class122
{
    private static String[] field464;
    private final float field465;
    private final float field466;
    
    private Class159(final float field465, final float field466) {
        this.field465 = field465;
        this.field466 = field466;
    }
    
    @Override
    public Set<Class7915<?>> method635() {
        return (Set<Class7915<?>>)ImmutableSet.of((Object)Class6683.field26365);
    }
    
    @Override
    public boolean test(final Class7529 class7529) {
        final Entity class7530 = class7529.method23579(Class6683.field26365);
        int method30214 = 0;
        if (class7530 instanceof Class511) {
            method30214 = Class8742.method30214((Class511)class7530);
        }
        return class7529.method23586().nextFloat() < this.field465 + method30214 * this.field466;
    }
    
    public static Class8775 method754(final float n, final float n2) {
        return () -> new Class159(n, n2);
    }
}
