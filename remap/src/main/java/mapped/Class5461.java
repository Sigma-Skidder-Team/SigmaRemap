// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import com.google.common.collect.ImmutableList;
import java.util.Optional;
import java.util.Objects;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;

public class Class5461 extends Class5419<LivingEntity>
{
    private static String[] field22718;
    private long field22719;
    
    public Class5461() {
        super((Map)ImmutableMap.of(Class8233.field33800, Class1952.field10628, (Object)Class8233.field33825, (Object)Class1952.field10630));
    }
    
    @Override
    public boolean method16538(final Class1849 class1849, final LivingEntity class1850) {
        if (class1850.isPassenger()) {
            return false;
        }
        final Class365<?> method2618 = class1850.method2618();
        final Class363 class1851 = method2618.method1198(Class8233.field33800).get();
        if (!Objects.equals(class1849.method6789().getType(), class1851.method1169())) {
            return false;
        }
        final Optional<Class366> method2619 = method2618.method1198(Class8233.field33825);
        if (method2619.isPresent() && class1849.method6754() - method2619.get().method1238() < 100L) {
            return false;
        }
        final BlockState method2620 = class1849.getBlockState(class1851.method1170());
        if (class1851.method1170().withinDistance(class1850.method1934(), 2.0)) {
            if (method2620.getBlock().method11785(Class7188.field27910)) {
                return !method2620.get(Class3900.field17600);
            }
        }
        return false;
    }
    
    @Override
    public boolean method16549(final Class1849 class1849, final LivingEntity class1850, final long n) {
        final Optional<Class363> method1198 = class1850.method2618().method1198(Class8233.field33800);
        if (method1198.isPresent()) {
            final BlockPos method1199 = method1198.get().method1170();
            if (class1850.method2618().method1209(Class7635.field30230)) {
                if (class1850.getPosY() > method1199.getY() + 0.4) {
                    return method1199.withinDistance(class1850.method1934(), 1.14);
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public void method16539(final Class1849 class1849, final LivingEntity class1850, final long n) {
        if (n > this.field22719) {
            class1850.method2618().method1198(Class8233.field33815).ifPresent(p2 -> Class5425.method16574(class1851, (List<BlockPos>)ImmutableList.of(), 0, class1852, class1852.method2618()));
            class1850.method2784(class1850.method2618().method1198(Class8233.field33800).get().method1170());
        }
    }
    
    @Override
    public boolean method16550(final long n) {
        return false;
    }
    
    @Override
    public void method16548(final Class1849 class1849, final LivingEntity class1850, final long n) {
        if (class1850.method2783()) {
            class1850.method2787();
            this.field22719 = n + 40L;
        }
    }
}
