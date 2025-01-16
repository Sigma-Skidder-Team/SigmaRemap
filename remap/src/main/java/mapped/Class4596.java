// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;

import java.util.function.Function;

public class Class4596 extends Class4592<Class5127>
{
    public Class4596(final Function<Dynamic<?>, ? extends Class5127> function) {
        super(function);
    }
    
    @Override
    public boolean method13624(final Class1875 class1875, final Random random, BlockPos class1876, final Set<BlockPos> set, final Set<BlockPos> set2, final MutableBoundingBox class1877, final Class5127 class1878) {
        class1876 = class1875.method6958(HeightmapType.field11526, class1876).method1139();
        if (Class4592.method13614(class1875, class1876)) {
            class1876 = class1876.method1137();
            this.method13618(class1875, random, class1876, set, class1877, class1878);
            for (int i = 0; i <= 2; ++i) {
                for (int n = 2 - i, j = -n; j <= n; ++j) {
                    for (int k = -n; k <= n; ++k) {
                        if (Math.abs(j) == n) {
                            if (Math.abs(k) == n) {
                                if (random.nextInt(2) == 0) {
                                    continue;
                                }
                            }
                        }
                        this.method13619(class1875, random, new BlockPos(j + class1876.getX(), i + class1876.getY(), k + class1876.getZ()), set2, class1877, class1878);
                    }
                }
            }
        }
        return true;
    }
}
