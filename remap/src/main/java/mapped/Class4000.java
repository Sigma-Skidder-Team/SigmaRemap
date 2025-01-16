// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;

public abstract class Class4000 extends Block
{
    public static final VoxelShape field18031;
    public static final VoxelShape field18032;
    public static final AxisAlignedBB field18033;
    
    public Class4000(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return (this.method12166(class7096) <= 0) ? Class4000.field18032 : Class4000.field18031;
    }
    
    @Override
    public int method11826(final Class1852 class1852) {
        return 20;
    }
    
    @Override
    public boolean method11854() {
        return true;
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return (class7097 == Direction.DOWN && !class7096.method21752(class7099, class7100)) ? Class7521.field29147.getDefaultState() : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        final BlockPos method1139 = class7098.method1139();
        return Block.method11812(class7097, method1139) || Block.method11813(class7097, method1139, Direction.UP);
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        final int method12166 = this.method12166(class7096);
        if (method12166 > 0) {
            this.method12161(class7097, class7098, class7096, method12166);
        }
    }
    
    @Override
    public void method11850(final BlockState class7096, final World class7097, final BlockPos class7098, final Entity class7099) {
        if (!class7097.isRemote) {
            final int method12166 = this.method12166(class7096);
            if (method12166 == 0) {
                this.method12161(class7097, class7098, class7096, method12166);
            }
        }
    }
    
    public void method12161(final World class1847, final BlockPos class1848, final BlockState class1849, final int n) {
        final int method12165 = this.method12165(class1847, class1848);
        final boolean b = n > 0;
        final boolean b2 = method12165 > 0;
        if (n != method12165) {
            final BlockState method12166 = this.method12167(class1849, method12165);
            class1847.setBlockState(class1848, method12166, 2);
            this.method12164(class1847, class1848);
            class1847.markBlockRangeForRenderUpdate(class1848, class1849, method12166);
        }
        if (!b2 && b) {
            this.method12163(class1847, class1848);
        }
        else if (b2) {
            if (!b) {
                this.method12162(class1847, class1848);
            }
        }
        if (b2) {
            class1847.method6833().method21345(new BlockPos(class1848), this, this.method11826(class1847));
        }
    }
    
    public abstract void method12162(final Class1851 p0, final BlockPos p1);
    
    public abstract void method12163(final Class1851 p0, final BlockPos p1);
    
    @Override
    public void method11829(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        if (!b) {
            if (class7096.getBlock() != class7099.getBlock()) {
                if (this.method12166(class7096) > 0) {
                    this.method12164(class7097, class7098);
                }
                super.method11829(class7096, class7097, class7098, class7099, b);
            }
        }
    }
    
    public void method12164(final World class1847, final BlockPos class1848) {
        class1847.method6696(class1848, this);
        class1847.method6696(class1848.method1139(), this);
    }
    
    @Override
    public int method11848(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Direction class7099) {
        return this.method12166(class7096);
    }
    
    @Override
    public int method11851(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Direction class7099) {
        return (class7099 != Direction.UP) ? 0 : this.method12166(class7096);
    }
    
    @Override
    public boolean method11849(final BlockState class7096) {
        return true;
    }
    
    @Override
    public PushReaction method11858(final BlockState class7096) {
        return PushReaction.DESTROY;
    }
    
    public abstract int method12165(final World p0, final BlockPos p1);
    
    public abstract int method12166(final BlockState p0);
    
    public abstract BlockState method12167(final BlockState p0, final int p1);
    
    static {
        field18031 = Block.method11778(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
        field18032 = Block.method11778(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
        field18033 = new AxisAlignedBB(0.125, 0.0, 0.125, 0.875, 0.25, 0.875);
    }
}
