// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.List;
import java.util.function.Predicate;
import java.util.EnumSet;

public class Class3460<T extends Class776> extends Class3446
{
    private static String[] field16313;
    private final T field16314;
    public final /* synthetic */ Class776 field16315;
    
    public Class3460(final Class776 field16315, final T field16316) {
        this.field16315 = field16315;
        this.field16314 = field16316;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        final Class8792 method4292 = this.field16314.method4292();
        if (this.field16314.method4293()) {
            if (!this.field16314.method4292().method30618()) {
                if (this.field16314.method4308()) {
                    if (!ItemStack.method27643(this.field16314.method2718(Class2215.field13605), Class8792.method30651())) {
                        final Class776 method4293 = method4292.method30652(this.field16314.method4295());
                        if (method4293 == null || !method4293.method1768()) {
                            final List<Entity> method4294 = this.field16314.field2391.method6739((Class<? extends Entity>)Class427.class, this.field16314.method1886().method18495(16.0, 8.0, 16.0), (Predicate<? super Entity>)Class776.method4307());
                            if (!method4294.isEmpty()) {
                                return this.field16314.method4150().method24725((Entity)method4294.get(0), 1.149999976158142);
                            }
                        }
                        return false;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11016() {
        if (this.field16314.method4150().method24714().withinDistance(this.field16314.method1934(), 1.414)) {
            final List<Entity> method6739 = this.field16314.field2391.method6739((Class<? extends Entity>)Class427.class, this.field16314.method1886().method18495(4.0, 4.0, 4.0), (Predicate<? super Entity>)Class776.method4307());
            if (!method6739.isEmpty()) {
                this.field16314.method4165((Class427)method6739.get(0));
            }
        }
    }
}
