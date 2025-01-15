package net.minecraft.block;

import net.minecraft.block.material.PushReaction;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;

public class GlazedTerracottaBlock extends HorizontalBlock
{
    public GlazedTerracottaBlock(Block.Properties p_i3326_1_)
    {
        super(p_i3326_1_);
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(HORIZONTAL_FACING);
    }

    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        return this.getDefaultState().with(HORIZONTAL_FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    public PushReaction getPushReaction(BlockState state)
    {
        return PushReaction.PUSH_ONLY;
    }
}
