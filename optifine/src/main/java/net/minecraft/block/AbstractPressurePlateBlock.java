package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public abstract class AbstractPressurePlateBlock extends Block
{
    protected static final VoxelShape PRESSED_AABB = Block.makeCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 0.5D, 15.0D);
    protected static final VoxelShape UNPRESSED_AABB = Block.makeCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 1.0D, 15.0D);
    protected static final AxisAlignedBB PRESSURE_AABB = new AxisAlignedBB(0.125D, 0.0D, 0.125D, 0.875D, 0.25D, 0.875D);

    protected AbstractPressurePlateBlock(Block.Properties p_i1590_1_)
    {
        super(p_i1590_1_);
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        return this.getRedstoneStrength(state) > 0 ? PRESSED_AABB : UNPRESSED_AABB;
    }

    public int tickRate(IWorldReader worldIn)
    {
        return 20;
    }

    public boolean canSpawnInBlock()
    {
        return true;
    }

    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        return facing == Direction.DOWN && !stateIn.isValidPosition(worldIn, currentPos) ? Blocks.AIR.getDefaultState() : super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos)
    {
        BlockPos blockpos = pos.down();
        return hasSolidSideOnTop(worldIn, blockpos) || hasEnoughSolidSide(worldIn, blockpos, Direction.UP);
    }

    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand)
    {
        int i = this.getRedstoneStrength(state);

        if (i > 0)
        {
            this.updateState(worldIn, pos, state, i);
        }
    }

    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn)
    {
        if (!worldIn.isRemote)
        {
            int i = this.getRedstoneStrength(state);

            if (i == 0)
            {
                this.updateState(worldIn, pos, state, i);
            }
        }
    }

    protected void updateState(World worldIn, BlockPos pos, BlockState state, int oldRedstoneStrength)
    {
        int i = this.computeRedstoneStrength(worldIn, pos);
        boolean flag = oldRedstoneStrength > 0;
        boolean flag1 = i > 0;

        if (oldRedstoneStrength != i)
        {
            BlockState blockstate = this.setRedstoneStrength(state, i);
            worldIn.setBlockState(pos, blockstate, 2);
            this.updateNeighbors(worldIn, pos);
            worldIn.markBlockRangeForRenderUpdate(pos, state, blockstate);
        }

        if (!flag1 && flag)
        {
            this.playClickOffSound(worldIn, pos);
        }
        else if (flag1 && !flag)
        {
            this.playClickOnSound(worldIn, pos);
        }

        if (flag1)
        {
            worldIn.getPendingBlockTicks().scheduleTick(new BlockPos(pos), this, this.tickRate(worldIn));
        }
    }

    protected abstract void playClickOnSound(IWorld worldIn, BlockPos pos);

    protected abstract void playClickOffSound(IWorld worldIn, BlockPos pos);

    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving)
    {
        if (!isMoving && state.getBlock() != newState.getBlock())
        {
            if (this.getRedstoneStrength(state) > 0)
            {
                this.updateNeighbors(worldIn, pos);
            }

            super.onReplaced(state, worldIn, pos, newState, isMoving);
        }
    }

    protected void updateNeighbors(World worldIn, BlockPos pos)
    {
        worldIn.notifyNeighborsOfStateChange(pos, this);
        worldIn.notifyNeighborsOfStateChange(pos.down(), this);
    }

    public int getWeakPower(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side)
    {
        return this.getRedstoneStrength(blockState);
    }

    public int getStrongPower(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side)
    {
        return side == Direction.UP ? this.getRedstoneStrength(blockState) : 0;
    }

    public boolean canProvidePower(BlockState state)
    {
        return true;
    }

    public PushReaction getPushReaction(BlockState state)
    {
        return PushReaction.DESTROY;
    }

    protected abstract int computeRedstoneStrength(World worldIn, BlockPos pos);

    protected abstract int getRedstoneStrength(BlockState state);

    protected abstract BlockState setRedstoneStrength(BlockState state, int strength);
}
