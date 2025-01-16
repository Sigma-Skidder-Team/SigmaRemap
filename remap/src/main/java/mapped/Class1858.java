// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.lighting.WorldLightManager;

import javax.annotation.Nullable;

public class Class1858 implements Class1856
{
    private static String[] field10127;
    public final int field10128;
    public final int field10129;
    public final BlockPos field10130;
    public final int field10131;
    public final int field10132;
    public final int field10133;
    public final Chunk[][] field10134;
    public final BlockState[] field10135;
    public final IFluidState[] field10136;
    public final World field10137;
    
    @Nullable
    public static Class1858 method7003(final World class1847, final BlockPos class1848, final BlockPos class1849, final int n) {
        return method7004(class1847, class1848, class1849, n, true);
    }
    
    public static Class1858 method7004(final World class1847, final BlockPos class1848, final BlockPos class1849, final int n, final boolean b) {
        final int n2 = class1848.getX() - n >> 4;
        final int n3 = class1848.getZ() - n >> 4;
        final int n4 = class1849.getX() + n >> 4;
        final int n5 = class1849.getZ() + n >> 4;
        final Chunk[][] array = new Chunk[n4 - n2 + 1][n5 - n3 + 1];
        for (int i = n2; i <= n4; ++i) {
            for (int j = n3; j <= n5; ++j) {
                array[i - n2][j - n3] = class1847.method6686(i, j);
            }
        }
        boolean b2 = true;
        if (!b) {
            b2 = false;
        }
        else {
            for (int k = class1848.getX() >> 4; k <= class1849.getX() >> 4; ++k) {
                for (int l = class1848.getZ() >> 4; l <= class1849.getZ() >> 4; ++l) {
                    if (!array[k - n2][l - n3].method7023(class1848.getY(), class1849.getY())) {
                        b2 = false;
                    }
                }
            }
        }
        if (!b2) {
            return new Class1858(class1847, n2, n3, array, class1848.add(-1, -1, -1), class1849.add(1, 1, 1));
        }
        return null;
    }
    
    public Class1858(final World field10137, final int field10138, final int field10139, final Chunk[][] field10140, final BlockPos field10141, final BlockPos class354) {
        this.field10137 = field10137;
        this.field10128 = field10138;
        this.field10129 = field10139;
        this.field10134 = field10140;
        this.field10130 = field10141;
        this.field10131 = class354.getX() - field10141.getX() + 1;
        this.field10132 = class354.getY() - field10141.getY() + 1;
        this.field10133 = class354.getZ() - field10141.getZ() + 1;
        this.field10135 = null;
        this.field10136 = null;
    }
    
    public final int method7005(final BlockPos class354) {
        return this.method7006(class354.getX(), class354.getY(), class354.getZ());
    }
    
    public int method7006(final int n, final int n2, final int n3) {
        return (n3 - this.field10130.getZ()) * this.field10131 * this.field10132 + (n2 - this.field10130.getY()) * this.field10131 + (n - this.field10130.getX());
    }
    
    @Override
    public BlockState getBlockState(final BlockPos class354) {
        return this.field10134[(class354.getX() >> 4) - this.field10128][(class354.getZ() >> 4) - this.field10129].getBlockState(class354);
    }
    
    @Override
    public IFluidState getFluidState(final BlockPos class354) {
        return this.field10134[(class354.getX() >> 4) - this.field10128][(class354.getZ() >> 4) - this.field10129].getFluidState(class354);
    }
    
    @Override
    public WorldLightManager method6700() {
        return this.field10137.method6700();
    }
    
    @Nullable
    @Override
    public TileEntity getTileEntity(final BlockPos class354) {
        return this.method7000(class354, Class2079.field12020);
    }
    
    @Nullable
    public TileEntity method7000(final BlockPos class354, final Class2079 class355) {
        return this.field10134[(class354.getX() >> 4) - this.field10128][(class354.getZ() >> 4) - this.field10129].method7000(class354, class355);
    }
    
    @Override
    public int method6849(final BlockPos class354, final Class8895 class355) {
        return this.field10137.method6849(class354, class355);
    }
    
    public Class3090 method7007(final BlockPos class354) {
        return this.field10137.method6959(class354);
    }
}
