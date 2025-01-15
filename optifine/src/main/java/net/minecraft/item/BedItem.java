package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

public class BedItem extends BlockItem
{
    public BedItem(Block p_i3045_1_, Item.Properties p_i3045_2_)
    {
        super(p_i3045_1_, p_i3045_2_);
    }

    protected boolean placeBlock(BlockItemUseContext context, BlockState state)
    {
        return context.getWorld().setBlockState(context.getPos(), state, 26);
    }
}
