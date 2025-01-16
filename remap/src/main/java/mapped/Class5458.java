// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;

import java.util.function.Predicate;

public class Class5458 extends Class5419<LivingEntity>
{
    private static String[] field22701;
    private final Class8233<Class363> field22702;
    private final Predicate<Class8912> field22703;
    
    public Class5458(final Class8912 class8912, final Class8233<Class363> field22702) {
        super((Map)ImmutableMap.of((Object)field22702, (Object)Class1952.field10628));
        this.field22703 = class8912.method31396();
        this.field22702 = field22702;
    }
    
    @Override
    public boolean method16538(final Class1849 class1849, final LivingEntity class1850) {
        final Class363 class1851 = class1850.method2618().method1198(this.field22702).get();
        return Objects.equals(class1849.method6789().getType(), class1851.method1169()) && class1851.method1170().withinDistance(class1850.method1934(), 5.0);
    }
    
    @Override
    public void method16539(final Class1849 class1849, final LivingEntity class1850, final long n) {
        final Class365<?> method2618 = class1850.method2618();
        final Class363 class1851 = method2618.method1198(this.field22702).get();
        final BlockPos method2619 = class1851.method1170();
        final Class1849 method2620 = class1849.getServer().method1481(class1851.method1169());
        if (!this.method16677(method2620, method2619)) {
            if (this.method16676(method2620, method2619, class1850)) {
                method2618.method1195(this.field22702);
                class1849.method6921().method7208(method2619);
                Class9324.method34534(class1849, method2619);
            }
        }
        else {
            method2618.method1195(this.field22702);
        }
    }
    
    private boolean method16676(final Class1849 class1849, final BlockPos class1850, final LivingEntity class1851) {
        final BlockState method6701 = class1849.getBlockState(class1850);
        if (method6701.getBlock().method11785(Class7188.field27910)) {
            if (method6701.get((IProperty<Boolean>)Class3900.field17600)) {
                if (!class1851.method2783()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean method16677(final Class1849 class1849, final BlockPos class1850) {
        return !class1849.method6921().method7209(class1850, this.field22703);
    }
}
