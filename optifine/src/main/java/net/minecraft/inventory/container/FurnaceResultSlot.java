package net.minecraft.inventory.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.AbstractFurnaceTileEntity;

public class FurnaceResultSlot extends Slot
{
    private final PlayerEntity player;
    private int removeCount;

    public FurnaceResultSlot(PlayerEntity p_i277_1_, IInventory p_i277_2_, int p_i277_3_, int p_i277_4_, int p_i277_5_)
    {
        super(p_i277_2_, p_i277_3_, p_i277_4_, p_i277_5_);
        this.player = p_i277_1_;
    }

    public boolean isItemValid(ItemStack stack)
    {
        return false;
    }

    public ItemStack decrStackSize(int amount)
    {
        if (this.getHasStack())
        {
            this.removeCount += Math.min(amount, this.getStack().getCount());
        }

        return super.decrStackSize(amount);
    }

    public ItemStack onTake(PlayerEntity thePlayer, ItemStack stack)
    {
        this.onCrafting(stack);
        super.onTake(thePlayer, stack);
        return stack;
    }

    protected void onCrafting(ItemStack stack, int amount)
    {
        this.removeCount += amount;
        this.onCrafting(stack);
    }

    protected void onCrafting(ItemStack stack)
    {
        stack.onCrafting(this.player.world, this.player, this.removeCount);

        if (!this.player.world.isRemote && this.inventory instanceof AbstractFurnaceTileEntity)
        {
            ((AbstractFurnaceTileEntity)this.inventory).func_213995_d(this.player);
        }

        this.removeCount = 0;
    }
}
