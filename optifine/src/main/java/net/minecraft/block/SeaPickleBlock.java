package net.minecraft.block;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class SeaPickleBlock extends BushBlock implements IGrowable, IWaterLoggable
{
    public static final IntegerProperty PICKLES = BlockStateProperties.PICKLES_1_4;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final VoxelShape ONE_SHAPE = Block.makeCuboidShape(6.0D, 0.0D, 6.0D, 10.0D, 6.0D, 10.0D);
    protected static final VoxelShape TWO_SHAPE = Block.makeCuboidShape(3.0D, 0.0D, 3.0D, 13.0D, 6.0D, 13.0D);
    protected static final VoxelShape THREE_SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 6.0D, 14.0D);
    protected static final VoxelShape FOUR_SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 7.0D, 14.0D);

    protected SeaPickleBlock(Block.Properties p_i2555_1_)
    {
        super(p_i2555_1_);
        this.setDefaultState(this.stateContainer.getBaseState().with(PICKLES, Integer.valueOf(1)).with(WATERLOGGED, Boolean.valueOf(true)));
    }

    public int getLightValue(BlockState state)
    {
        return this.isInBadEnvironment(state) ? 0 : super.getLightValue(state) + 3 * state.get(PICKLES);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        BlockState blockstate = context.getWorld().getBlockState(context.getPos());

        if (blockstate.getBlock() == this)
        {
            return blockstate.with(PICKLES, Integer.valueOf(Math.min(4, blockstate.get(PICKLES) + 1)));
        }
        else
        {
            IFluidState ifluidstate = context.getWorld().getFluidState(context.getPos());
            boolean flag = ifluidstate.isTagged(FluidTags.WATER) && ifluidstate.getLevel() == 8;
            return super.getStateForPlacement(context).with(WATERLOGGED, Boolean.valueOf(flag));
        }
    }

    private boolean isInBadEnvironment(BlockState p_204901_1_)
    {
        return !p_204901_1_.get(WATERLOGGED);
    }

    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        return !state.getCollisionShape(worldIn, pos).project(Direction.UP).isEmpty();
    }

    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos)
    {
        BlockPos blockpos = pos.down();
        return this.isValidGround(worldIn.getBlockState(blockpos), worldIn, blockpos);
    }

    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        if (!stateIn.isValidPosition(worldIn, currentPos))
        {
            return Blocks.AIR.getDefaultState();
        }
        else
        {
            if (stateIn.get(WATERLOGGED))
            {
                worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
            }

            return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
        }
    }

    public boolean isReplaceable(BlockState state, BlockItemUseContext useContext)
    {
        return useContext.getItem().getItem() == this.asItem() && state.get(PICKLES) < 4 ? true : super.isReplaceable(state, useContext);
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        switch (state.get(PICKLES))
        {
            case 1:
            default:
                return ONE_SHAPE;

            case 2:
                return TWO_SHAPE;

            case 3:
                return THREE_SHAPE;

            case 4:
                return FOUR_SHAPE;
        }
    }

    public IFluidState getFluidState(BlockState state)
    {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(PICKLES, WATERLOGGED);
    }

    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient)
    {
        return true;
    }

    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state)
    {
        return true;
    }

    public void grow(ServerWorld p_225535_1_, Random p_225535_2_, BlockPos p_225535_3_, BlockState p_225535_4_)
    {
        if (!this.isInBadEnvironment(p_225535_4_) && p_225535_1_.getBlockState(p_225535_3_.down()).isIn(BlockTags.CORAL_BLOCKS))
        {
            int i = 5;
            int j = 1;
            int k = 2;
            int l = 0;
            int i1 = p_225535_3_.getX() - 2;
            int j1 = 0;

            for (int k1 = 0; k1 < 5; ++k1)
            {
                for (int l1 = 0; l1 < j; ++l1)
                {
                    int i2 = 2 + p_225535_3_.getY() - 1;

                    for (int j2 = i2 - 2; j2 < i2; ++j2)
                    {
                        BlockPos blockpos = new BlockPos(i1 + k1, j2, p_225535_3_.getZ() - j1 + l1);

                        if (blockpos != p_225535_3_ && p_225535_2_.nextInt(6) == 0 && p_225535_1_.getBlockState(blockpos).getBlock() == Blocks.WATER)
                        {
                            BlockState blockstate = p_225535_1_.getBlockState(blockpos.down());

                            if (blockstate.isIn(BlockTags.CORAL_BLOCKS))
                            {
                                p_225535_1_.setBlockState(blockpos, Blocks.SEA_PICKLE.getDefaultState().with(PICKLES, Integer.valueOf(p_225535_2_.nextInt(4) + 1)), 3);
                            }
                        }
                    }
                }

                if (l < 2)
                {
                    j += 2;
                    ++j1;
                }
                else
                {
                    j -= 2;
                    --j1;
                }

                ++l;
            }

            p_225535_1_.setBlockState(p_225535_3_, p_225535_4_.with(PICKLES, Integer.valueOf(4)), 2);
        }
    }
}
