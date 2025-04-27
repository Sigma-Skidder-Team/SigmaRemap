// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3915 extends Block implements Class3867
{
    private static String[] field17728;
    public static final Class7112 field17729;
    public static final VoxelShape field17730;
    
    public Class3915(final Properties class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3915.field17729, 0));
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3915.field17730;
    }
    
    @Nullable
    @Override
    public BlockState method11846(final Class7074 class7074) {
        final IFluidState method6702 = class7074.method21654().getFluidState(class7074.method21639());
        return (method6702.isTagged(Class7324.field28319) && method6702.getLevel() == 8) ? this.method12020(class7074.method21654()) : null;
    }
    
    public BlockState method12020(final Class1851 class1851) {
        return ((StateHolder<O, BlockState>)this.getDefaultState()).with((IProperty<Comparable>)Class3915.field17729, class1851.method6790().nextInt(25));
    }
    
    @Override
    public IFluidState method11864(final BlockState class7096) {
        return Class7558.field29976.method22177(false);
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (class7096.method21752(class7097, class7098)) {
            final BlockPos method1137 = class7098.method1137();
            if (class7097.getBlockState(method1137).method21696() == Blocks.field29173) {
                if (class7096.get(Class3915.field17729) < 25) {
                    if (random.nextDouble() < 0.14) {
                        class7097.method6692(method1137, class7096.method21768((IProperty<Comparable>)Class3915.field17729));
                    }
                }
            }
        }
        else {
            class7097.method7149(class7098, true);
        }
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        final BlockPos method1139 = class7098.method1139();
        final BlockState method1140 = class7097.getBlockState(method1139);
        final Block method1141 = method1140.getBlock();
        if (method1141 != Blocks.MAGMA_BLOCK) {
            if (method1141 != this) {
                if (method1141 != Blocks.KELP_PLANT) {
                    return method1140.isSolidSide(class7097, method1139, Direction.UP);
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (!class7096.method21752(class7099, class7100)) {
            if (class7097 == Direction.DOWN) {
                return Blocks.AIR.getDefaultState();
            }
            class7099.method6833().method21345(class7100, this, 1);
        }
        if (class7097 == Direction.UP && class7098.getBlock() == this) {
            return Blocks.KELP_PLANT.getDefaultState();
        }
        class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3915.field17729);
    }
    
    @Override
    public boolean method11920(final IBlockReader class1855, final BlockPos class1856, final BlockState class1857, final Fluid class1858) {
        return false;
    }
    
    @Override
    public boolean method11921(final Class1851 class1851, final BlockPos class1852, final BlockState class1853, final IFluidState class1854) {
        return false;
    }
    
    static {
        field17729 = Class8970.field37775;
        field17730 = Block.method11778(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
    }
}
