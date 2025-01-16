// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class Class3924 extends Class3922
{
    private static String[] field17787;
    private static final VoxelShape field17788;
    
    public Class3924(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3924.field17788;
    }
    
    static {
        field17788 = Block.method11778(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
    }
}
