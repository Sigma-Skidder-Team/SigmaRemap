// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;

import java.util.function.Function;

public class Class4559 extends Class4535<Class5124>
{
    public Class4559(final Function<Dynamic<?>, ? extends Class5124> function) {
        super(function);
    }
    
    public boolean method13571(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5124 class1854) {
        int n = 0;
        for (int i = 0; i < class1854.field22074; ++i) {
            final int n2 = random.nextInt(8) - random.nextInt(8);
            final int n3 = random.nextInt(8) - random.nextInt(8);
            final BlockPos class1855 = new BlockPos(class1853.getX() + n2, class1851.method6699(HeightmapType.field11524, class1853.getX() + n2, class1853.getZ() + n3), class1853.getZ() + n3);
            if (class1851.getBlockState(class1855).getBlock() == Class7521.field29173) {
                final boolean b = random.nextDouble() < class1854.field22075;
                final BlockState class1856 = b ? Class7521.field29245.getDefaultState() : Class7521.field29244.getDefaultState();
                if (class1856.method21752(class1851, class1855)) {
                    if (!b) {
                        class1851.setBlockState(class1855, class1856, 2);
                    }
                    else {
                        final BlockState class1857 = ((StateHolder<O, BlockState>)class1856).with(Class3868.field17508, Class182.field564);
                        final BlockPos method1137 = class1855.method1137();
                        if (class1851.getBlockState(method1137).getBlock() == Class7521.field29173) {
                            class1851.setBlockState(class1855, class1856, 2);
                            class1851.setBlockState(method1137, class1857, 2);
                        }
                    }
                    ++n;
                }
            }
        }
        return n > 0;
    }
}
