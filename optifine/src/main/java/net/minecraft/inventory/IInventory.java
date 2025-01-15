package net.minecraft.inventory;

import java.util.Set;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public interface IInventory extends IClearable
{
    int getSizeInventory();

    boolean isEmpty();

    ItemStack getStackInSlot(int index);

    ItemStack decrStackSize(int index, int count);

    ItemStack removeStackFromSlot(int index);

    void setInventorySlotContents(int index, ItemStack stack);

default int getInventoryStackLimit()
    {
        return 64;
    }

    void markDirty();

    boolean isUsableByPlayer(PlayerEntity player);

default void openInventory(PlayerEntity player)
    {
    }

default void closeInventory(PlayerEntity player)
    {
    }

default boolean isItemValidForSlot(int index, ItemStack stack)
    {
        return true;
    }

default int count(Item itemIn)
    {
        int i = 0;

        for (int j = 0; j < this.getSizeInventory(); ++j)
        {
            ItemStack itemstack = this.getStackInSlot(j);

            if (itemstack.getItem().equals(itemIn))
            {
                i += itemstack.getCount();
            }
        }

        return i;
    }

default boolean hasAny(Set<Item> set)
    {
        for (int i = 0; i < this.getSizeInventory(); ++i)
        {
            ItemStack itemstack = this.getStackInSlot(i);

            if (set.contains(itemstack.getItem()) && itemstack.getCount() > 0)
            {
                return true;
            }
        }

        return false;
    }
}
