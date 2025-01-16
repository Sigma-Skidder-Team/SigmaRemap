// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;

public class Class5462 extends Class5419<LivingEntity>
{
    private static String[] field22720;
    
    public Class5462() {
        super((Map)ImmutableMap.of());
    }
    
    @Override
    public boolean method16538(final Class1849 class1849, final LivingEntity class1850) {
        return class1849.rand.nextInt(20) == 0;
    }
    
    @Override
    public void method16539(final Class1849 class1849, final LivingEntity class1850, final long n) {
        final Class365<?> method2618 = class1850.method2618();
        final Class8792 method2619 = class1849.method6927(new BlockPos(class1850));
        if (method2619 != null) {
            if (method2619.method30620() && !method2619.method30619()) {
                method2618.method1206(Class7635.field30233);
                method2618.method1204(Class7635.field30233);
            }
            else {
                method2618.method1206(Class7635.field30234);
                method2618.method1204(Class7635.field30234);
            }
        }
    }
}
