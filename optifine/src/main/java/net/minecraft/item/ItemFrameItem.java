package net.minecraft.item;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemFrameItem extends HangingEntityItem
{
    public ItemFrameItem(Item.Properties p_i3681_1_)
    {
        super(EntityType.ITEM_FRAME, p_i3681_1_);
    }

    protected boolean canPlace(PlayerEntity playerIn, Direction directionIn, ItemStack itemStackIn, BlockPos posIn)
    {
        return !World.isOutsideBuildHeight(posIn) && playerIn.canPlayerEdit(posIn, directionIn, itemStackIn);
    }
}
