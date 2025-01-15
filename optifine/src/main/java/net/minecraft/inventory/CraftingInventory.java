package net.minecraft.inventory;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.RecipeItemHelper;
import net.minecraft.util.NonNullList;

public class CraftingInventory implements IInventory, IRecipeHelperPopulator
{
    private final NonNullList<ItemStack> stackList;
    private final int width;
    private final int height;
    private final Container eventHandler;

    public CraftingInventory(Container p_i3300_1_, int p_i3300_2_, int p_i3300_3_)
    {
        this.stackList = NonNullList.withSize(p_i3300_2_ * p_i3300_3_, ItemStack.EMPTY);
        this.eventHandler = p_i3300_1_;
        this.width = p_i3300_2_;
        this.height = p_i3300_3_;
    }

    public int getSizeInventory()
    {
        return this.stackList.size();
    }

    public boolean isEmpty()
    {
        for (ItemStack itemstack : this.stackList)
        {
            if (!itemstack.isEmpty())
            {
                return false;
            }
        }

        return true;
    }

    public ItemStack getStackInSlot(int index)
    {
        return index >= this.getSizeInventory() ? ItemStack.EMPTY : this.stackList.get(index);
    }

    public ItemStack removeStackFromSlot(int index)
    {
        return ItemStackHelper.getAndRemove(this.stackList, index);
    }

    public ItemStack decrStackSize(int index, int count)
    {
        ItemStack itemstack = ItemStackHelper.getAndSplit(this.stackList, index, count);

        if (!itemstack.isEmpty())
        {
            this.eventHandler.onCraftMatrixChanged(this);
        }

        return itemstack;
    }

    public void setInventorySlotContents(int index, ItemStack stack)
    {
        this.stackList.set(index, stack);
        this.eventHandler.onCraftMatrixChanged(this);
    }

    public void markDirty()
    {
    }

    public boolean isUsableByPlayer(PlayerEntity player)
    {
        return true;
    }

    public void clear()
    {
        this.stackList.clear();
    }

    public int getHeight()
    {
        return this.height;
    }

    public int getWidth()
    {
        return this.width;
    }

    public void fillStackedContents(RecipeItemHelper helper)
    {
        for (ItemStack itemstack : this.stackList)
        {
            helper.accountPlainStack(itemstack);
        }
    }
}
