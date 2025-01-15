package net.minecraft.block;

import net.minecraft.util.Direction;

public class BreakableBlock extends Block
{
    protected BreakableBlock(Block.Properties exceptionMessage)
    {
        super(exceptionMessage);
    }

    public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side)
    {
        return adjacentBlockState.getBlock() == this ? true : super.isSideInvisible(state, adjacentBlockState, side);
    }
}
