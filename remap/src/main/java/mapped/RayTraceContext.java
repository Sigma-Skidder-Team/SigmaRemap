// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import java.util.function.Predicate;

public class RayTraceContext
{
    private final Vec3d startVec;
    private final Vec3d endVec;
    private final BlockMode blockMode;
    private final FluidMode fluidMode;
    private final ISelectionContext context;
    
    public RayTraceContext(final Vec3d startVec, final Vec3d endVec, final BlockMode blockMode, final FluidMode fluidMode, final Entity p_i1860_5_) {
        this.startVec = startVec;
        this.endVec = endVec;
        this.blockMode = blockMode;
        this.fluidMode = fluidMode;
        this.context = ISelectionContext.forEntity(p_i1860_5_);
    }
    
    public Vec3d func_222250_a() {
        return this.endVec;
    }
    
    public Vec3d func_222253_b() {
        return this.startVec;
    }
    
    public VoxelShape getBlockShape(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return this.blockMode.get(class7096, class7097, class7098, this.context);
    }
    
    public VoxelShape getFluidShape(final IFluidState IFluidState, final IBlockReader class7100, final BlockPos class7101) {
        return this.fluidMode.test(IFluidState) ? IFluidState.getShape(class7100, class7101) : VoxelShapes.empty();
    }

    public enum FluidMode
    {
        NONE(p_222247_0_ -> false),
        SOURCE_ONLY(IFluidState::isSource),
        ANY(p_222246_0_ -> !p_222246_0_.isEmpty());

        private final Predicate<IFluidState> fluidTest;

        FluidMode(final Predicate<IFluidState> test) {
            this.fluidTest = test;
        }

        public boolean test(final IFluidState state) {
            return this.fluidTest.test(state);
        }
    }

    public enum BlockMode implements IVoxelProvider
    {
        COLLIDER(BlockState::getCollisionShape),
        OUTLINE(BlockState::getShape);

        private final IVoxelProvider provider;

        BlockMode(final IVoxelProvider provider) {
            this.provider = provider;
        }

        public VoxelShape get(BlockState p_get_1_, IBlockReader p_get_2_, BlockPos p_get_3_, ISelectionContext p_get_4_)
        {
            return this.provider.get(p_get_1_, p_get_2_, p_get_3_, p_get_4_);
        }
    }

    public interface IVoxelProvider
    {
        VoxelShape get(BlockState p_get_1_, IBlockReader p_get_2_, BlockPos p_get_3_, ISelectionContext p_get_4_);
    }
}
