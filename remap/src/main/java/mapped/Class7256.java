// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class Class7256 extends Fluid
{
    private static String[] field28131;
    
    @Override
    public Item method22149() {
        return Items.AIR;
    }
    
    @Override
    public boolean canDisplace(final IFluidState IFluidState, final IBlockReader class7100, final BlockPos class7101, final Fluid class7102, final Direction class7103) {
        return true;
    }
    
    @Override
    public Vec3d getFlow(final IBlockReader class1855, final BlockPos class1856, final IFluidState class1857) {
        return Vec3d.ZERO;
    }
    
    @Override
    public int method22156(final Class1852 class1852) {
        return 0;
    }
    
    @Override
    public boolean isEmpty() {
        return true;
    }
    
    @Override
    public float getExplosionResistance() {
        return 0.0f;
    }
    
    @Override
    public float getActualHeight(final IFluidState IFluidState, final IBlockReader class7100, final BlockPos class7101) {
        return 0.0f;
    }
    
    @Override
    public float getHeight(final IFluidState IFluidState) {
        return 0.0f;
    }
    
    @Override
    public BlockState getBlockState(final IFluidState IFluidState) {
        return Class7521.field29147.getDefaultState();
    }
    
    @Override
    public boolean isSource(final IFluidState IFluidState) {
        return false;
    }
    
    @Override
    public int getLevel(final IFluidState IFluidState) {
        return 0;
    }
    
    @Override
    public VoxelShape method22167(final IFluidState IFluidState, final IBlockReader class7100, final BlockPos class7101) {
        return VoxelShapes.empty();
    }
}
