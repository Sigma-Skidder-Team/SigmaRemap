// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.MathHelper;

import java.util.function.Function;

public class Class4595 extends Class4593<Class5128>
{
    public Class4595(final Function<Dynamic<?>, ? extends Class5128> function) {
        super(function);
    }
    
    public boolean method13641(final Class1875 class1875, final Random random, final BlockPos class1876, final Set<BlockPos> set, final Set<BlockPos> set2, final MutableBoundingBox class1877, final Class5128 class1878) {
        final int method13634 = this.method13634(random, class1878);
        if (this.method13637(class1875, class1876, method13634)) {
            this.method13643(class1875, random, class1876.method1138(method13634), 2, set2, class1877, class1878);
            for (int i = class1876.getY() + method13634 - 2 - random.nextInt(4); i > class1876.getY() + method13634 / 2; i -= 2 + random.nextInt(4)) {
                final float n = random.nextFloat() * 6.2831855f;
                int n2 = class1876.getX() + (int)(0.5f + MathHelper.cos(n) * 4.0f);
                int n3 = class1876.getZ() + (int)(0.5f + MathHelper.sin(n) * 4.0f);
                for (int j = 0; j < 5; ++j) {
                    n2 = class1876.getX() + (int)(1.5f + MathHelper.cos(n) * j);
                    n3 = class1876.getZ() + (int)(1.5f + MathHelper.sin(n) * j);
                    this.method13618(class1875, random, new BlockPos(n2, i - 3 + j / 2, n3), set, class1877, class1878);
                }
                final int n4 = 1 + random.nextInt(2);
                for (int n5 = i, k = i - n4; k <= n5; ++k) {
                    this.method13639(class1875, random, new BlockPos(n2, k, n3), 1 - (k - n5), set2, class1877, class1878);
                }
            }
            this.method13640(class1875, random, class1876, method13634, set, class1877, class1878);
            return true;
        }
        return false;
    }
    
    private void method13643(final Class1875 class1875, final Random random, final BlockPos class1876, final int n, final Set<BlockPos> set, final MutableBoundingBox class1877, final Class5127 class1878) {
        for (int i = -2; i <= 0; ++i) {
            this.method13638(class1875, random, class1876.method1138(i), n + 1 - i, set, class1877, class1878);
        }
    }
}
