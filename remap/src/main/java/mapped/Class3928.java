// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class Class3928 extends Class3922
{
    private static String[] field17794;
    public static final VoxelShape field17795;
    
    public Class3928(final Properties class9288) {
        super(class9288);
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3928.field17795;
    }
    
    static {
        field17795 = Block.method11778(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);
    }
}
