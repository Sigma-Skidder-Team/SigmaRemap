// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.chunk.IChunkLightProvider;
import org.apache.commons.lang3.mutable.MutableInt;
import java.util.Arrays;
import javax.annotation.Nullable;

public abstract class Class1890<M extends Class7501<M>, S extends Class1897<M>> extends Class1891 implements Class1888
{
    private static final Direction[] field10274;
    public final IChunkLightProvider field10275;
    public final Class237 field10276;
    public final S field10277;
    private boolean field10278;
    public final Mutable field10279;
    private final long[] field10280;
    private final IBlockReader[] field10281;
    
    public Class1890(final IChunkLightProvider field10275, final Class237 field10276, final S field10277) {
        super(16, 256, 8192);
        this.field10279 = new Mutable();
        this.field10280 = new long[2];
        this.field10281 = new IBlockReader[2];
        this.field10275 = field10275;
        this.field10276 = field10276;
        this.field10277 = field10277;
        this.method7296();
    }
    
    @Override
    public void method7294(final long n) {
        this.field10277.method7364();
        if (this.field10277.method7347(Class353.method1111(n))) {
            super.method7294(n);
        }
    }
    
    @Nullable
    private IBlockReader method7295(final int n, final int n2) {
        final long method25423 = ChunkPos.method25423(n, n2);
        for (int i = 0; i < 2; ++i) {
            if (method25423 == this.field10280[i]) {
                return this.field10281[i];
            }
        }
        final IBlockReader method25424 = this.field10275.getChunkForLight(n, n2);
        for (int j = 1; j > 0; --j) {
            this.field10280[j] = this.field10280[j - 1];
            this.field10281[j] = this.field10281[j - 1];
        }
        this.field10280[0] = method25423;
        return this.field10281[0] = method25424;
    }
    
    private void method7296() {
        Arrays.fill(this.field10280, ChunkPos.field32289);
        Arrays.fill(this.field10281, null);
    }
    
    public BlockState method7297(final long n, final MutableInt mutableInt) {
        if (n == Long.MAX_VALUE) {
            if (mutableInt != null) {
                mutableInt.setValue(0);
            }
            return Blocks.AIR.getDefaultState();
        }
        final IBlockReader method7295 = this.method7295(Class353.method1095(BlockPos.unpackX(n)), Class353.method1095(BlockPos.unpackZ(n)));
        if (method7295 != null) {
            this.field10279.method1288(n);
            final BlockState method7296 = method7295.getBlockState(this.field10279);
            final boolean b = method7296.isSolid() && method7296.method21703();
            if (mutableInt != null) {
                mutableInt.setValue(method7296.getOpacity(this.field10275.method7414(), this.field10279));
            }
            return b ? method7296 : Blocks.AIR.getDefaultState();
        }
        if (mutableInt != null) {
            mutableInt.setValue(16);
        }
        return Blocks.field29172.getDefaultState();
    }
    
    public VoxelShape method7298(final BlockState class7096, final long n, final Direction class7097) {
        return class7096.isSolid() ? class7096.getFaceOcclusionShape(this.field10275.method7414(), this.field10279.method1288(n), class7097) : VoxelShapes.empty();
    }
    
    public static int method7299(final IBlockReader class1855, final BlockState class1856, final BlockPos class1857, final BlockState class1858, final BlockPos class1859, final Direction class1860, final int n) {
        final boolean b = class1856.isSolid() && class1856.method21703();
        final boolean b2 = class1858.isSolid() && class1858.method21703();
        if (!b && !b2) {
            return n;
        }
        return VoxelShapes.method24504(b ? class1856.getRenderShape(class1855, class1857) : VoxelShapes.empty(), b2 ? class1858.getRenderShape(class1855, class1859) : VoxelShapes.empty(), class1860) ? 16 : n;
    }
    
    @Override
    public boolean method7300(final long n) {
        return n == Long.MAX_VALUE;
    }
    
    @Override
    public int method7301(final long n, final long n2, final int n3) {
        return 0;
    }
    
    @Override
    public int method7302(final long n) {
        return (n != Long.MAX_VALUE) ? (15 - this.field10277.method7352(n)) : 0;
    }
    
    public int method7303(final Class7281 class7281, final long n) {
        return 15 - class7281.method22322(Class353.method1096(BlockPos.unpackX(n)), Class353.method1096(BlockPos.unpackY(n)), Class353.method1096(BlockPos.unpackZ(n)));
    }
    
    @Override
    public void method7304(final long n, final int n2) {
        this.field10277.method7353(n, Math.min(15, 15 - n2));
    }
    
    @Override
    public int method7305(final long n, final long n2, final int n3) {
        return 0;
    }
    
    public boolean method7306() {
        if (!this.method7323()) {
            if (!this.field10277.method7323()) {
                return this.field10277.method7356();
            }
        }
        return true;
    }
    
    public int method7307(int n, final boolean b, final boolean b2) {
        if (!this.field10278) {
            if (this.field10277.method7323()) {
                n = this.field10277.method7324(n);
                if (n == 0) {
                    return n;
                }
            }
            this.field10277.method7357(this, b, b2);
        }
        this.field10278 = true;
        if (this.method7323()) {
            n = this.method7324(n);
            this.method7296();
            if (n == 0) {
                return n;
            }
        }
        this.field10278 = false;
        this.field10277.method7365();
        return n;
    }
    
    public void method7308(final long n, final Class7281 class7281) {
        this.field10277.method7362(n, class7281);
    }
    
    @Nullable
    @Override
    public Class7281 method7292(final Class353 class353) {
        return this.field10277.method7350(class353.method1117());
    }
    
    @Override
    public int method7293(final BlockPos class354) {
        return this.field10277.method7351(class354.toLong());
    }
    
    public String method7309(final long n) {
        return "" + this.field10277.method7302(n);
    }
    
    public void method7310(final BlockPos class354) {
        final long method1132 = class354.toLong();
        this.method7294(method1132);
        final Direction[] field10274 = Class1890.field10274;
        for (int length = field10274.length, i = 0; i < length; ++i) {
            this.method7294(BlockPos.offset(method1132, field10274[i]));
        }
    }
    
    public void method7311(final BlockPos class354, final int n) {
    }
    
    @Override
    public void method7254(final Class353 class353, final boolean b) {
        this.field10277.method7363(class353.method1117(), b);
    }
    
    public void method7312(final ChunkPos class7859, final boolean b) {
        this.field10277.method7360(Class353.method1112(Class353.method1116(class7859.field32290, 0, class7859.field32291)), b);
    }
    
    public void method7313(final ChunkPos class7859, final boolean b) {
        this.field10277.method7361(Class353.method1112(Class353.method1116(class7859.field32290, 0, class7859.field32291)), b);
    }
    
    static {
        field10274 = Direction.values();
    }
}
