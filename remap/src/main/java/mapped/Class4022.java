// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import java.util.Random;

public class Class4022 extends Block
{
    private static String[] field18107;
    public static final VoxelShape field18108;
    
    public Class4022(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class4022.field18108;
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return (class7097 == Direction.DOWN && !this.method11843(class7096, class7099, class7100)) ? Class7521.field29147.getDefaultState() : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        return Block.method11813(class7097, class7098.method1139(), Direction.UP);
    }
    
    @Override
    public void method11823(final BlockState class7096, final World class7097, final BlockPos class7098, final Random random) {
        final double n = class7098.getX() + 0.5;
        final double n2 = class7098.getY() + 0.7;
        final double n3 = class7098.getZ() + 0.5;
        class7097.method6709(Class8432.field34639, n, n2, n3, 0.0, 0.0, 0.0);
        class7097.method6709(Class8432.field34623, n, n2, n3, 0.0, 0.0, 0.0);
    }
    
    static {
        field18108 = Block.method11778(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);
    }
}
