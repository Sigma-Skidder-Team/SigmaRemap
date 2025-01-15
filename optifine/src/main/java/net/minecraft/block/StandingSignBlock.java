package net.minecraft.block;

import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

public class StandingSignBlock extends AbstractSignBlock
{
    public static final IntegerProperty ROTATION = BlockStateProperties.ROTATION_0_15;

    public StandingSignBlock(Block.Properties p_i1362_1_, WoodType p_i1362_2_)
    {
        super(p_i1362_1_, p_i1362_2_);
        this.setDefaultState(this.stateContainer.getBaseState().with(ROTATION, Integer.valueOf(0)).with(WATERLOGGED, Boolean.valueOf(false)));
    }

    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos)
    {
        return worldIn.getBlockState(pos.down()).getMaterial().isSolid();
    }

    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        IFluidState ifluidstate = context.getWorld().getFluidState(context.getPos());
        return this.getDefaultState().with(ROTATION, Integer.valueOf(MathHelper.floor((double)((180.0F + context.getPlacementYaw()) * 16.0F / 360.0F) + 0.5D) & 15)).with(WATERLOGGED, Boolean.valueOf(ifluidstate.getFluid() == Fluids.WATER));
    }

    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        return facing == Direction.DOWN && !this.isValidPosition(stateIn, worldIn, currentPos) ? Blocks.AIR.getDefaultState() : super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    public BlockState rotate(BlockState state, Rotation rot)
    {
        return state.with(ROTATION, Integer.valueOf(rot.rotate(state.get(ROTATION), 16)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn)
    {
        return state.with(ROTATION, Integer.valueOf(mirrorIn.mirrorRotation(state.get(ROTATION), 16)));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(ROTATION, WATERLOGGED);
    }
}
