package net.minecraft.block;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.server.ServerWorld;

public class CoralBlock extends Block
{
    private final Block deadBlock;

    public CoralBlock(Block p_i2246_1_, Block.Properties p_i2246_2_)
    {
        super(p_i2246_2_);
        this.deadBlock = p_i2246_1_;
    }

    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand)
    {
        if (!this.canLive(worldIn, pos))
        {
            worldIn.setBlockState(pos, this.deadBlock.getDefaultState(), 2);
        }
    }

    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        if (!this.canLive(worldIn, currentPos))
        {
            worldIn.getPendingBlockTicks().scheduleTick(currentPos, this, 60 + worldIn.getRandom().nextInt(40));
        }

        return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    protected boolean canLive(IBlockReader p_203943_1_, BlockPos p_203943_2_)
    {
        for (Direction direction : Direction.values())
        {
            IFluidState ifluidstate = p_203943_1_.getFluidState(p_203943_2_.offset(direction));

            if (ifluidstate.isTagged(FluidTags.WATER))
            {
                return true;
            }
        }

        return false;
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        if (!this.canLive(context.getWorld(), context.getPos()))
        {
            context.getWorld().getPendingBlockTicks().scheduleTick(context.getPos(), this, 60 + context.getWorld().getRandom().nextInt(40));
        }

        return this.getDefaultState();
    }
}
