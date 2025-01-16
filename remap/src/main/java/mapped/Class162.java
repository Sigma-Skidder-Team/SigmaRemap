// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import java.util.Set;

public class Class162 implements Class122
{
    private static String[] field471;
    private final Class9089 field472;
    
    private Class162(final Class9089 field472) {
        this.field472 = field472;
    }
    
    @Override
    public Set<Class7915<?>> method635() {
        return (Set<Class7915<?>>)ImmutableSet.of((Object)Class6683.field26367, (Object)Class6683.field26364);
    }
    
    @Override
    public boolean test(final Class7529 class7529) {
        final DamageSource class7530 = class7529.method23579(Class6683.field26364);
        final BlockPos class7531 = class7529.method23579(Class6683.field26367);
        if (class7531 != null) {
            if (class7530 != null) {
                if (this.field472.method32837(class7529.method23588(), new Vec3d(class7531), class7530)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static Class8775 method763(final Class8135 class8135) {
        return () -> new Class162(class8135.method26815());
    }
}
