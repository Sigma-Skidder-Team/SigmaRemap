// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class Class3881 extends Class3878
{
    private static String[] field17535;
    private static final VoxelShape[] field17536;
    
    public Class3881(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public Class3832 method11960() {
        return Items.field31517;
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3881.field17536[class7096.get((IProperty<Integer>)this.method11952())];
    }
    
    static {
        field17536 = new VoxelShape[] { Block.method11778(0.0, 0.0, 0.0, 16.0, 2.0, 16.0), Block.method11778(0.0, 0.0, 0.0, 16.0, 3.0, 16.0), Block.method11778(0.0, 0.0, 0.0, 16.0, 4.0, 16.0), Block.method11778(0.0, 0.0, 0.0, 16.0, 5.0, 16.0), Block.method11778(0.0, 0.0, 0.0, 16.0, 6.0, 16.0), Block.method11778(0.0, 0.0, 0.0, 16.0, 7.0, 16.0), Block.method11778(0.0, 0.0, 0.0, 16.0, 8.0, 16.0), Block.method11778(0.0, 0.0, 0.0, 16.0, 9.0, 16.0) };
    }
}
