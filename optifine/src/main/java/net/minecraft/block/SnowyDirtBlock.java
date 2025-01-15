package net.minecraft.block;

import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;

public class SnowyDirtBlock extends Block
{
    public static final BooleanProperty SNOWY = BlockStateProperties.SNOWY;

    protected SnowyDirtBlock(Block.Properties p_i3738_1_)
    {
        super(p_i3738_1_);
        this.setDefaultState(this.stateContainer.getBaseState().with(SNOWY, Boolean.valueOf(false)));
    }

    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
    {
        if (facing != Direction.UP)
        {
            return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
        }
        else
        {
            Block block = facingState.getBlock();
            return stateIn.with(SNOWY, Boolean.valueOf(block == Blocks.SNOW_BLOCK || block == Blocks.SNOW));
        }
    }

    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        Block block = context.getWorld().getBlockState(context.getPos().up()).getBlock();
        return this.getDefaultState().with(SNOWY, Boolean.valueOf(block == Blocks.SNOW_BLOCK || block == Blocks.SNOW));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(SNOWY);
    }
}
