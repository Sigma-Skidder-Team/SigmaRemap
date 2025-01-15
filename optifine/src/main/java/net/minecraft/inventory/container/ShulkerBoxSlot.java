package net.minecraft.inventory.container;

import net.minecraft.block.Block;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class ShulkerBoxSlot extends Slot
{
    public ShulkerBoxSlot(IInventory p_i2849_1_, int p_i2849_2_, int p_i2849_3_, int p_i2849_4_)
    {
        super(p_i2849_1_, p_i2849_2_, p_i2849_3_, p_i2849_4_);
    }

    public boolean isItemValid(ItemStack stack)
    {
        return !(Block.getBlockFromItem(stack.getItem()) instanceof ShulkerBoxBlock);
    }
}
