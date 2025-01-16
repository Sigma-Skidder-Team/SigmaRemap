// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3886 extends Class3874
{
    private static String[] field17547;
    public static final VoxelShape field17548;
    
    public Class3886(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public void method11850(final BlockState class7096, final World class7097, final BlockPos class7098, final Entity class7099) {
        super.method11850(class7096, class7097, class7098, class7099);
        if (class7097 instanceof Class1849) {
            if (class7099 instanceof Class423) {
                class7097.method6691(new BlockPos(class7098), true, class7099);
            }
        }
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3886.field17548;
    }
    
    @Override
    public boolean method11943(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return class7097.getFluidState(class7098).getFluid() == Class7558.field29976 || class7096.getMaterial() == Material.ICE;
    }
    
    static {
        field17548 = Block.method11778(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);
    }
}
