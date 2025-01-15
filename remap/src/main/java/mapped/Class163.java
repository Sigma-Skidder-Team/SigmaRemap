// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

import java.util.function.Predicate;

public class Class163 implements Predicate<LivingEntity>
{
    private static String[] field473;
    public final /* synthetic */ Class803 field474;
    
    public Class163(final Class803 field474) {
        this.field474 = field474;
    }
    
    @Override
    public boolean test(final LivingEntity class511) {
        if (!(class511 instanceof Class803)) {
            if (!(class511 instanceof Class818)) {
                if (!(class511 instanceof Class792)) {
                    if (!(class511 instanceof Class763)) {
                        if (!(class511 instanceof Class794)) {
                            return (!(class511 instanceof Class512) || (!class511.isSpectator() && !((Class512)class511).method2889())) && !Class803.method4687(this.field474, class511.method1865()) && !class511.method2783() && !class511.method1812();
                        }
                        return !((Class794)class511).method4480();
                    }
                }
            }
            return true;
        }
        return false;
    }
}
