// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4546 extends Class4535<Class5138>
{
    public Class4546(final Function<Dynamic<?>, ? extends Class5138> function) {
        super(function);
    }
    
    public boolean method13557(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5138 class1854) {
        if (class1851.getFluidState(class1853).isTagged(Class7324.field28319)) {
            int n = 0;
            for (int n2 = random.nextInt(class1854.field22120 - 2) + 2, i = class1853.getX() - n2; i <= class1853.getX() + n2; ++i) {
                for (int j = class1853.getZ() - n2; j <= class1853.getZ() + n2; ++j) {
                    final int n3 = i - class1853.getX();
                    final int n4 = j - class1853.getZ();
                    if (n3 * n3 + n4 * n4 <= n2 * n2) {
                        for (int k = class1853.getY() - class1854.field22121; k <= class1853.getY() + class1854.field22121; ++k) {
                            final BlockPos class1855 = new BlockPos(i, k, j);
                            final BlockState method6701 = class1851.getBlockState(class1855);
                            final Iterator<BlockState> iterator = class1854.field22122.iterator();
                            while (iterator.hasNext()) {
                                if (iterator.next().getBlock() != method6701.getBlock()) {
                                    continue;
                                }
                                class1851.setBlockState(class1855, class1854.field22119, 2);
                                ++n;
                                break;
                            }
                        }
                    }
                }
            }
            return n > 0;
        }
        return false;
    }
}
