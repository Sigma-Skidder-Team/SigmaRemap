// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class Class3909 extends Class3910 implements Class3872
{
    private static String[] field17715;
    
    public Class3909(final Properties class9288) {
        super(class9288);
    }
    
    @Override
    public boolean method11945(final IBlockReader class1855, final BlockPos class1856, final BlockState class1857, final boolean b) {
        return class1855.getBlockState(class1856.method1137()).method21706();
    }
    
    @Override
    public boolean method11946(final World class1847, final Random random, final BlockPos class1848, final BlockState class1849) {
        return true;
    }
    
    @Override
    public void method11947(final Class1849 class1849, final Random random, final BlockPos class1850, final BlockState class1851) {
        final BlockPos method1137 = class1850.method1137();
        final BlockState method1138 = Blocks.field29241.getDefaultState();
        int i = 0;
    Label_0096_Outer:
        while (i < 128) {
            BlockPos method1139 = method1137;
            int j = 0;
            while (true) {
                while (j < i / 16) {
                    method1139 = method1139.add(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1);
                    if (class1849.getBlockState(method1139.method1139()).method21696() == this) {
                        if (!class1849.getBlockState(method1139).method21762(class1849, method1139)) {
                            ++j;
                            continue Label_0096_Outer;
                        }
                    }
                    ++i;
                    continue Label_0096_Outer;
                }
                final BlockState method1140 = class1849.getBlockState(method1139);
                if (method1140.getBlock() == method1138.getBlock()) {
                    if (random.nextInt(10) == 0) {
                        ((Class3872)method1138.getBlock()).method11947(class1849, random, method1139, method1140);
                    }
                }
                if (!method1140.method21706()) {
                    continue;
                }
                BlockState method1141;
                if (random.nextInt(8) != 0) {
                    method1141 = method1138;
                }
                else {
                    final List<Class8530<?, ?>> method1142 = class1849.method6959(method1139).method9855();
                    if (method1142.isEmpty()) {
                        continue;
                    }
                    final Class8530<?, ?> field22060 = ((Class5114)method1142.get(0).field35805).field22060;
                    method1141 = ((Class4572)field22060.field35804).method13583(random, method1139, field22060.field35805);
                }
                if (!method1141.method21752(class1849, method1139)) {
                    continue;
                }
                class1849.setBlockState(method1139, method1141, 3);
                continue;
            }
        }
    }
}
