// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class Class5823 extends Class5827
{
    @Override
    public boolean method17514(final Class1851 class1851, final Class6346<?> class1852, final BlockPos class1853, final BlockState class1854, final Random random) {
        for (int i = 0; i >= -1; --i) {
            for (int j = 0; j >= -1; --j) {
                if (method17517(class1854, class1851, class1853, i, j)) {
                    return this.method17516(class1851, class1852, class1853, class1854, random, i, j);
                }
            }
        }
        return super.method17514(class1851, class1852, class1853, class1854, random);
    }
    
    @Nullable
    public abstract Class8530<Class5128, ?> method17515(final Random p0);
    
    public boolean method17516(final Class1851 class1851, final Class6346<?> class1852, final BlockPos class1853, final BlockState class1854, final Random random, final int n, final int n2) {
        final Class8530<Class5128, ?> method17515 = this.method17515(random);
        if (method17515 == null) {
            return false;
        }
        final BlockState method17516 = Blocks.AIR.getDefaultState();
        class1851.setBlockState(class1853.add(n, 0, n2), method17516, 4);
        class1851.setBlockState(class1853.add(n + 1, 0, n2), method17516, 4);
        class1851.setBlockState(class1853.add(n, 0, n2 + 1), method17516, 4);
        class1851.setBlockState(class1853.add(n + 1, 0, n2 + 1), method17516, 4);
        if (!method17515.method28613(class1851, class1852, random, class1853.add(n, 0, n2))) {
            class1851.setBlockState(class1853.add(n, 0, n2), class1854, 4);
            class1851.setBlockState(class1853.add(n + 1, 0, n2), class1854, 4);
            class1851.setBlockState(class1853.add(n, 0, n2 + 1), class1854, 4);
            class1851.setBlockState(class1853.add(n + 1, 0, n2 + 1), class1854, 4);
            return false;
        }
        return true;
    }
    
    public static boolean method17517(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final int n, final int n2) {
        final Block method21696 = class7096.getBlock();
        if (method21696 == class7097.getBlockState(class7098.add(n, 0, n2)).getBlock()) {
            if (method21696 == class7097.getBlockState(class7098.add(n + 1, 0, n2)).getBlock()) {
                if (method21696 == class7097.getBlockState(class7098.add(n, 0, n2 + 1)).getBlock()) {
                    return method21696 == class7097.getBlockState(class7098.add(n + 1, 0, n2 + 1)).getBlock();
                }
            }
        }
        return false;
    }
}
