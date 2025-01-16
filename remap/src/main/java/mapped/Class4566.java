// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;

import java.util.function.Function;

public class Class4566 extends Class4535<Class5122>
{
    public Class4566(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    public boolean method13535(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5122 class1854) {
        if (class1853.getY() > class1851.method6743() - 1) {
            return false;
        }
        if (class1851.getBlockState(class1853).getBlock() != Blocks.field29173 && class1851.getBlockState(class1853.method1139()).getBlock() != Blocks.field29173) {
            return false;
        }
        int n = 0;
        for (final Direction class1855 : Direction.values()) {
            if (class1855 != Direction.DOWN && class1851.getBlockState(class1853.method1149(class1855)).getBlock() == Blocks.field29548) {
                n = 1;
                break;
            }
        }
        if (n != 0) {
            class1851.setBlockState(class1853, Blocks.BLUE_ICE.getDefaultState(), 2);
            for (int j = 0; j < 200; ++j) {
                final int n2 = random.nextInt(5) - random.nextInt(6);
                int n3 = 3;
                if (n2 < 2) {
                    n3 += n2 / 2;
                }
                if (n3 >= 1) {
                    final BlockPos method1134 = class1853.add(random.nextInt(n3) - random.nextInt(n3), n2, random.nextInt(n3) - random.nextInt(n3));
                    final BlockState method1135 = class1851.getBlockState(method1134);
                    final Block method1136 = method1135.getBlock();
                    if (method1135.getMaterial() != Material.AIR) {
                        if (method1136 != Blocks.field29173) {
                            if (method1136 != Blocks.field29548) {
                                if (method1136 != Blocks.field29330) {
                                    continue;
                                }
                            }
                        }
                    }
                    final Direction[] values2 = Direction.values();
                    for (int length2 = values2.length, k = 0; k < length2; ++k) {
                        if (class1851.getBlockState(method1134.method1149(values2[k])).getBlock() == Blocks.BLUE_ICE) {
                            class1851.setBlockState(method1134, Blocks.BLUE_ICE.getDefaultState(), 2);
                            break;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
