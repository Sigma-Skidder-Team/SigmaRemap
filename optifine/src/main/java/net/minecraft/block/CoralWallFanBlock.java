package net.minecraft.block;

import java.util.Random;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class CoralWallFanBlock extends DeadCoralWallFanBlock
{
    private final Block deadBlock;

    protected CoralWallFanBlock(Block worldIn, Block.Properties x)
    {
        super(x);
        this.deadBlock = worldIn;
    }

    public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving)
    {
        this.updateIfDry(state, worldIn, pos);
    }

    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand)
    {
        if (!isInWater(state, worldIn, pos))
        {
            worldIn.setBlockState(pos, this.deadBlock.getDefaultState().with(WATERLOGGED, Boolean.valueOf(false)).with(FACING, state.get(FACING)), 2);
        }
    }

    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        if (facing.getOpposite() == stateIn.get(FACING) && !stateIn.isValidPosition(worldIn, currentPos))
        {
            return Blocks.AIR.getDefaultState();
        }
        else
        {
            if (stateIn.get(WATERLOGGED))
            {
                worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
            }

            this.updateIfDry(stateIn, worldIn, currentPos);
            return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
        }
    }
}
