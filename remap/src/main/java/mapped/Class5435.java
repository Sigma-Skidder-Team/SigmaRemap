// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;

public class Class5435 extends Class5419<LivingEntity>
{
    private static String[] field22637;
    
    public Class5435() {
        super((Map)ImmutableMap.of((Object)Class8233.field33802, (Object)Class1952.field10628));
    }
    
    @Override
    public boolean method16538(final Class1849 class1849, final LivingEntity class1850) {
        return class1849.rand.nextFloat() > 0.95f;
    }
    
    @Override
    public void method16539(final Class1849 class1849, final LivingEntity class1850, final long n) {
        final BlockPos method1170 = class1850.method2618().method1198(Class8233.field33802).get().method1170();
        if (method1170.withinDistance(new BlockPos(class1850), 3.0)) {
            final BlockState method1171 = class1849.getBlockState(method1170);
            if (method1171.getBlock() == Class7521.field29816) {
                ((Class3958)method1171.getBlock()).method12076(class1849, method1170, null);
            }
        }
    }
}
