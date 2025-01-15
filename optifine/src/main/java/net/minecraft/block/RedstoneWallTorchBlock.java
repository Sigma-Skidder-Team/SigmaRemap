package net.minecraft.block;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.particles.RedstoneParticleData;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public class RedstoneWallTorchBlock extends RedstoneTorchBlock
{
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    public static final BooleanProperty REDSTONE_TORCH_LIT = RedstoneTorchBlock.LIT;

    protected RedstoneWallTorchBlock(Block.Properties p_i3321_1_)
    {
        super(p_i3321_1_);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH).with(REDSTONE_TORCH_LIT, Boolean.valueOf(true)));
    }

    public String getTranslationKey()
    {
        return this.asItem().getTranslationKey();
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        return WallTorchBlock.func_220289_j(state);
    }

    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos)
    {
        return Blocks.WALL_TORCH.isValidPosition(state, worldIn, pos);
    }

    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        return Blocks.WALL_TORCH.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        BlockState blockstate = Blocks.WALL_TORCH.getStateForPlacement(context);
        return blockstate == null ? null : this.getDefaultState().with(FACING, blockstate.get(FACING));
    }

    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
        if (stateIn.get(REDSTONE_TORCH_LIT))
        {
            Direction direction = stateIn.get(FACING).getOpposite();
            double d0 = 0.27D;
            double d1 = (double)pos.getX() + 0.5D + (rand.nextDouble() - 0.5D) * 0.2D + 0.27D * (double)direction.getXOffset();
            double d2 = (double)pos.getY() + 0.7D + (rand.nextDouble() - 0.5D) * 0.2D + 0.22D;
            double d3 = (double)pos.getZ() + 0.5D + (rand.nextDouble() - 0.5D) * 0.2D + 0.27D * (double)direction.getZOffset();
            worldIn.addParticle(RedstoneParticleData.REDSTONE_DUST, d1, d2, d3, 0.0D, 0.0D, 0.0D);
        }
    }

    protected boolean shouldBeOff(World worldIn, BlockPos pos, BlockState state)
    {
        Direction direction = state.get(FACING).getOpposite();
        return worldIn.isSidePowered(pos.offset(direction), direction);
    }

    public int getWeakPower(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side)
    {
        return blockState.get(REDSTONE_TORCH_LIT) && blockState.get(FACING) != side ? 15 : 0;
    }

    public BlockState rotate(BlockState state, Rotation rot)
    {
        return Blocks.WALL_TORCH.rotate(state, rot);
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn)
    {
        return Blocks.WALL_TORCH.mirror(state, mirrorIn);
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, REDSTONE_TORCH_LIT);
    }
}
