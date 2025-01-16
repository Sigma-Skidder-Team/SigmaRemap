// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3877 extends Class3874 implements Class3872, Class3867
{
    private static String[] field17519;
    public static final VoxelShape field17528;
    
    public Class3877(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3877.field17528;
    }
    
    @Override
    public boolean method11943(final BlockState class7096, final Class1855 class7097, final BlockPos class7098) {
        return class7096.isSolidSide(class7097, class7098, Direction.UP) && class7096.getBlock() != Class7521.field29642;
    }
    
    @Nullable
    @Override
    public BlockState method11846(final Class7074 class7074) {
        final IFluidState method6702 = class7074.method21654().method6702(class7074.method21639());
        return (method6702.method21793(Class7324.field28319) && method6702.method21784() == 8) ? super.method11846(class7074) : null;
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        final BlockState method11789 = super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
        if (!method11789.method21706()) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        return method11789;
    }
    
    @Override
    public boolean method11945(final Class1855 class1855, final BlockPos class1856, final BlockState class1857, final boolean b) {
        return true;
    }
    
    @Override
    public boolean method11946(final World class1847, final Random random, final BlockPos class1848, final BlockState class1849) {
        return true;
    }
    
    @Override
    public IFluidState method11864(final BlockState class7096) {
        return Class7558.field29976.method22177(false);
    }
    
    @Override
    public void method11947(final Class1849 class1849, final Random random, final BlockPos class1850, final BlockState class1851) {
        final BlockState method11878 = Class7521.field29245.getDefaultState();
        final BlockState class1852 = ((StateHolder<O, BlockState>)method11878).with(Class3868.field17508, Class182.field564);
        final BlockPos method11879 = class1850.method1137();
        if (class1849.getBlockState(method11879).method21696() == Class7521.field29173) {
            class1849.setBlockState(class1850, method11878, 2);
            class1849.setBlockState(method11879, class1852, 2);
        }
    }
    
    @Override
    public boolean method11920(final Class1855 class1855, final BlockPos class1856, final BlockState class1857, final Fluid class1858) {
        return false;
    }
    
    @Override
    public boolean method11921(final Class1851 class1851, final BlockPos class1852, final BlockState class1853, final IFluidState class1854) {
        return false;
    }
    
    static {
        field17528 = Block.method11778(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
    }
}
