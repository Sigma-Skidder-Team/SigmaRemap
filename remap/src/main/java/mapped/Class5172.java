// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.util.math.BlockPos;

import java.util.Random;
import java.util.List;
import java.util.Map;

public class Class5172
{
    private static final ResourceLocation field22193;
    private static final ResourceLocation field22194;
    private static final ResourceLocation field22195;
    private static final Map<ResourceLocation, BlockPos> field22196;
    private static final Map<ResourceLocation, BlockPos> field22197;
    
    public static void method16137(final Class1795 class1795, final BlockPos class1796, final Class2052 class1797, final List<Class4473> list, final Random random, final Class5122 class1798) {
        if (random.nextDouble() < 0.5) {
            final int n = random.nextInt(8) + 4;
            list.add(new Class4516(class1795, Class5172.field22195, class1796, class1797, n * 3));
            for (int i = 0; i < n - 1; ++i) {
                list.add(new Class4516(class1795, Class5172.field22194, class1796, class1797, i * 3));
            }
        }
        list.add(new Class4516(class1795, Class5172.field22193, class1796, class1797, 0));
    }
    
    static {
        field22193 = new ResourceLocation("igloo/top");
        field22194 = new ResourceLocation("igloo/middle");
        field22195 = new ResourceLocation("igloo/bottom");
        field22196 = (Map)ImmutableMap.of(Class5172.field22193, new BlockPos(3, 5, 5), Class5172.field22194, new BlockPos(1, 3, 1), (Object)Class5172.field22195, (Object)new BlockPos(3, 6, 7));
        field22197 = (Map)ImmutableMap.of(Class5172.field22193, BlockPos.ZERO, Class5172.field22194, new BlockPos(2, -3, 4), (Object)Class5172.field22195, (Object)new BlockPos(0, -3, -2));
    }
}
