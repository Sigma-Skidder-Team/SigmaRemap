package net.minecraft.block;

import java.util.Random;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class CoralFinBlock extends CoralFanBlock
{
    private final Block deadBlock;

    protected CoralFinBlock(Block p_i2403_1_, Block.Properties p_i2403_2_)
    {
        super(p_i2403_2_);
        this.deadBlock = p_i2403_1_;
    }

    public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving)
    {
        this.updateIfDry(state, worldIn, pos);
    }

    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand)
    {
        if (!isInWater(state, worldIn, pos))
        {
            worldIn.setBlockState(pos, this.deadBlock.getDefaultState().with(WATERLOGGED, Boolean.valueOf(false)), 2);
        }
    }

    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        if (facing == Direction.DOWN && !stateIn.isValidPosition(worldIn, currentPos))
        {
            return Blocks.AIR.getDefaultState();
        }
        else
        {
            this.updateIfDry(stateIn, worldIn, currentPos);

            if (stateIn.get(WATERLOGGED))
            {
                worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
            }

            return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
        }
    }
}
