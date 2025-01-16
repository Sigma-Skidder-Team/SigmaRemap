// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class Class3922 extends Block implements Class3856
{
    private static String[] field17781;
    public static final Class7113 field17782;
    private static final VoxelShape field17783;
    
    public Class3922(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3922.field17782, true));
    }
    
    public void method12037(final BlockState class7096, final Class1851 class7097, final BlockPos class7098) {
        if (!method12038(class7096, class7097, class7098)) {
            class7097.method6833().method21345(class7098, this, 60 + class7097.method6790().nextInt(40));
        }
    }
    
    public static boolean method12038(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        if (!class7096.get((IProperty<Boolean>)Class3922.field17782)) {
            final Direction[] values = Direction.values();
            for (int length = values.length, i = 0; i < length; ++i) {
                if (class7097.getFluidState(class7098.method1149(values[i])).isTagged(Class7324.field28319)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Nullable
    @Override
    public BlockState method11846(final Class7074 class7074) {
        final IFluidState method6702 = class7074.method21654().getFluidState(class7074.method21639());
        return (BlockState)((StateHolder<Object, Object>)this.getDefaultState()).with((IProperty<Comparable>)Class3922.field17782, method6702.isTagged(Class7324.field28319) && method6702.getLevel() == 8);
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3922.field17783;
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.get((IProperty<Boolean>)Class3922.field17782)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        return (class7097 == Direction.DOWN && !this.method11843(class7096, class7099, class7100)) ? Blocks.AIR.getDefaultState() : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        final BlockPos method1139 = class7098.method1139();
        return class7097.getBlockState(method1139).isSolidSide(class7097, method1139, Direction.UP);
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3922.field17782);
    }
    
    @Override
    public IFluidState method11864(final BlockState class7096) {
        return class7096.get((IProperty<Boolean>)Class3922.field17782) ? Class7558.field29976.method22177(false) : super.method11864(class7096);
    }
    
    static {
        field17782 = Class8970.field37747;
        field17783 = Block.method11778(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
    }
}
