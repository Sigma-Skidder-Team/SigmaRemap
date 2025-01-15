package net.minecraft.inventory.container;

import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class Slot
{
    private final int slotIndex;
    public final IInventory inventory;
    public int slotNumber;
    public final int xPos;
    public final int yPos;

    public Slot(IInventory p_i3655_1_, int p_i3655_2_, int p_i3655_3_, int p_i3655_4_)
    {
        this.inventory = p_i3655_1_;
        this.slotIndex = p_i3655_2_;
        this.xPos = p_i3655_3_;
        this.yPos = p_i3655_4_;
    }

    public void onSlotChange(ItemStack p_75220_1_, ItemStack p_75220_2_)
    {
        int i = p_75220_2_.getCount() - p_75220_1_.getCount();

        if (i > 0)
        {
            this.onCrafting(p_75220_2_, i);
        }
    }

    protected void onCrafting(ItemStack stack, int amount)
    {
    }

    protected void onSwapCraft(int p_190900_1_)
    {
    }

    protected void onCrafting(ItemStack stack)
    {
    }

    public ItemStack onTake(PlayerEntity thePlayer, ItemStack stack)
    {
        this.onSlotChanged();
        return stack;
    }

    public boolean isItemValid(ItemStack stack)
    {
        return true;
    }

    public ItemStack getStack()
    {
        return this.inventory.getStackInSlot(this.slotIndex);
    }

    public boolean getHasStack()
    {
        return !this.getStack().isEmpty();
    }

    public void putStack(ItemStack stack)
    {
        this.inventory.setInventorySlotContents(this.slotIndex, stack);
        this.onSlotChanged();
    }

    public void onSlotChanged()
    {
        this.inventory.markDirty();
    }

    public int getSlotStackLimit()
    {
        return this.inventory.getInventoryStackLimit();
    }

    public int getItemStackLimit(ItemStack stack)
    {
        return this.getSlotStackLimit();
    }

    @Nullable
    public Pair<ResourceLocation, ResourceLocation> func_225517_c_()
    {
        return null;
    }

    public ItemStack decrStackSize(int amount)
    {
        return this.inventory.decrStackSize(this.slotIndex, amount);
    }

    public boolean canTakeStack(PlayerEntity playerIn)
    {
        return true;
    }

    public boolean isEnabled()
    {
        return true;
    }
}
