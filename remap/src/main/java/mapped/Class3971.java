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

public class Class3971 extends Block
{
    private static String[] field17942;
    public static final VoxelShape field17943;
    
    public Class3971(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public boolean isTransparent(final BlockState class7096) {
        return true;
    }
    
    @Override
    public BlockState method11846(final Class7074 class7074) {
        return this.getDefaultState().method21752(class7074.method21654(), class7074.method21639()) ? super.method11846(class7074) : Block.method11777(this.getDefaultState(), Class7521.field29156.getDefaultState(), class7074.method21654(), class7074.method21639());
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7097 == Direction.UP) {
            if (!class7096.method21752(class7099, class7100)) {
                class7099.method6833().method21345(class7100, this, 1);
            }
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        Class4021.method12212(class7096, class7097, class7098);
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        final BlockState method6701 = class7097.getBlockState(class7098.method1137());
        return !method6701.getMaterial().method26439() || method6701.getBlock() instanceof Class3898;
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3971.field17943;
    }
    
    @Override
    public boolean method11796(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    @Override
    public boolean method11795(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return true;
    }
    
    static {
        field17943 = Class4021.field18106;
    }
}
