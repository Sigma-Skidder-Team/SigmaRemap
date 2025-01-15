package net.minecraft.item;

import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;

public class OperatorOnlyItem extends BlockItem
{
    public OperatorOnlyItem(Block p_i958_1_, Item.Properties p_i958_2_)
    {
        super(p_i958_1_, p_i958_2_);
    }

    @Nullable
    protected BlockState getStateForPlacement(BlockItemUseContext context)
    {
        PlayerEntity playerentity = context.getPlayer();
        return playerentity != null && !playerentity.canUseCommandBlock() ? null : super.getStateForPlacement(context);
    }
}
