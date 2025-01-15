package net.minecraft.inventory;

import javax.annotation.Nullable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.NonNullList;

public class CraftResultInventory implements IInventory, IRecipeHolder
{
    private final NonNullList<ItemStack> stackResult = NonNullList.withSize(1, ItemStack.EMPTY);
    private IRecipe<?> recipeUsed;

    public int getSizeInventory()
    {
        return 1;
    }

    public boolean isEmpty()
    {
        for (ItemStack itemstack : this.stackResult)
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
        return this.stackResult.get(0);
    }

    public ItemStack decrStackSize(int index, int count)
    {
        return ItemStackHelper.getAndRemove(this.stackResult, 0);
    }

    public ItemStack removeStackFromSlot(int index)
    {
        return ItemStackHelper.getAndRemove(this.stackResult, 0);
    }

    public void setInventorySlotContents(int index, ItemStack stack)
    {
        this.stackResult.set(0, stack);
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
        this.stackResult.clear();
    }

    public void setRecipeUsed(@Nullable IRecipe<?> recipe)
    {
        this.recipeUsed = recipe;
    }

    @Nullable
    public IRecipe<?> getRecipeUsed()
    {
        return this.recipeUsed;
    }
}
