// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.Entity;

import java.util.Set;

public class Class138 extends Class126
{
    private static String[] field413;
    private final Class5772 field414;
    private final int field415;
    
    private Class138(final Class122[] array, final Class5772 field414, final int field415) {
        super(array);
        this.field414 = field414;
        this.field415 = field415;
    }
    
    @Override
    public Set<Class7915<?>> method635() {
        return (Set<Class7915<?>>)ImmutableSet.of((Object)Class6683.field26365);
    }
    
    private boolean method680() {
        return this.field415 > 0;
    }
    
    @Override
    public ItemStack method639(final ItemStack class8321, final Class7529 class8322) {
        final Entity class8323 = class8322.method23579(Class6683.field26365);
        if (class8323 instanceof Class511) {
            final int method30214 = Class8742.method30214((Class511)class8323);
            if (method30214 == 0) {
                return class8321;
            }
            class8321.method27692(Math.round(method30214 * this.field414.method17169(class8322.method23586())));
            if (this.method680()) {
                if (class8321.method27690() > this.field415) {
                    class8321.method27691(this.field415);
                }
            }
        }
        return class8321;
    }
    
    public static Class4952 method681(final Class5772 class5772) {
        return new Class4952(class5772);
    }
}
