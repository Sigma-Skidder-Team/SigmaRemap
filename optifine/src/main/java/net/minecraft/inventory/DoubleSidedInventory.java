package net.minecraft.inventory;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class DoubleSidedInventory implements IInventory
{
    private final IInventory upperChest;
    private final IInventory lowerChest;

    public DoubleSidedInventory(IInventory p_i2952_1_, IInventory p_i2952_2_)
    {
        if (p_i2952_1_ == null)
        {
            p_i2952_1_ = p_i2952_2_;
        }

        if (p_i2952_2_ == null)
        {
            p_i2952_2_ = p_i2952_1_;
        }

        this.upperChest = p_i2952_1_;
        this.lowerChest = p_i2952_2_;
    }

    public int getSizeInventory()
    {
        return this.upperChest.getSizeInventory() + this.lowerChest.getSizeInventory();
    }

    public boolean isEmpty()
    {
        return this.upperChest.isEmpty() && this.lowerChest.isEmpty();
    }

    public boolean isPartOfLargeChest(IInventory inventoryIn)
    {
        return this.upperChest == inventoryIn || this.lowerChest == inventoryIn;
    }

    public ItemStack getStackInSlot(int index)
    {
        return index >= this.upperChest.getSizeInventory() ? this.lowerChest.getStackInSlot(index - this.upperChest.getSizeInventory()) : this.upperChest.getStackInSlot(index);
    }

    public ItemStack decrStackSize(int index, int count)
    {
        return index >= this.upperChest.getSizeInventory() ? this.lowerChest.decrStackSize(index - this.upperChest.getSizeInventory(), count) : this.upperChest.decrStackSize(index, count);
    }

    public ItemStack removeStackFromSlot(int index)
    {
        return index >= this.upperChest.getSizeInventory() ? this.lowerChest.removeStackFromSlot(index - this.upperChest.getSizeInventory()) : this.upperChest.removeStackFromSlot(index);
    }

    public void setInventorySlotContents(int index, ItemStack stack)
    {
        if (index >= this.upperChest.getSizeInventory())
        {
            this.lowerChest.setInventorySlotContents(index - this.upperChest.getSizeInventory(), stack);
        }
        else
        {
            this.upperChest.setInventorySlotContents(index, stack);
        }
    }

    public int getInventoryStackLimit()
    {
        return this.upperChest.getInventoryStackLimit();
    }

    public void markDirty()
    {
        this.upperChest.markDirty();
        this.lowerChest.markDirty();
    }

    public boolean isUsableByPlayer(PlayerEntity player)
    {
        return this.upperChest.isUsableByPlayer(player) && this.lowerChest.isUsableByPlayer(player);
    }

    public void openInventory(PlayerEntity player)
    {
        this.upperChest.openInventory(player);
        this.lowerChest.openInventory(player);
    }

    public void closeInventory(PlayerEntity player)
    {
        this.upperChest.closeInventory(player);
        this.lowerChest.closeInventory(player);
    }

    public boolean isItemValidForSlot(int index, ItemStack stack)
    {
        return index >= this.upperChest.getSizeInventory() ? this.lowerChest.isItemValidForSlot(index - this.upperChest.getSizeInventory(), stack) : this.upperChest.isItemValidForSlot(index, stack);
    }

    public void clear()
    {
        this.upperChest.clear();
        this.lowerChest.clear();
    }
}
