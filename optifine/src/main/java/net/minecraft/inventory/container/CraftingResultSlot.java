package net.minecraft.inventory.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.IRecipeHolder;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.NonNullList;

public class CraftingResultSlot extends Slot
{
    private final CraftingInventory craftMatrix;
    private final PlayerEntity player;
    private int amountCrafted;

    public CraftingResultSlot(PlayerEntity resourcePack, CraftingInventory fileName, IInventory p_i1294_3_, int p_i1294_4_, int p_i1294_5_, int p_i1294_6_)
    {
        super(p_i1294_3_, p_i1294_4_, p_i1294_5_, p_i1294_6_);
        this.player = resourcePack;
        this.craftMatrix = fileName;
    }

    public boolean isItemValid(ItemStack stack)
    {
        return false;
    }

    public ItemStack decrStackSize(int amount)
    {
        if (this.getHasStack())
        {
            this.amountCrafted += Math.min(amount, this.getStack().getCount());
        }

        return super.decrStackSize(amount);
    }

    protected void onCrafting(ItemStack stack, int amount)
    {
        this.amountCrafted += amount;
        this.onCrafting(stack);
    }

    protected void onSwapCraft(int p_190900_1_)
    {
        this.amountCrafted += p_190900_1_;
    }

    protected void onCrafting(ItemStack stack)
    {
        if (this.amountCrafted > 0)
        {
            stack.onCrafting(this.player.world, this.player, this.amountCrafted);
        }

        if (this.inventory instanceof IRecipeHolder)
        {
            ((IRecipeHolder)this.inventory).onCrafting(this.player);
        }

        this.amountCrafted = 0;
    }

    public ItemStack onTake(PlayerEntity thePlayer, ItemStack stack)
    {
        this.onCrafting(stack);
        NonNullList<ItemStack> nonnulllist = thePlayer.world.getRecipeManager().getRecipeNonNull(IRecipeType.CRAFTING, this.craftMatrix, thePlayer.world);

        for (int i = 0; i < nonnulllist.size(); ++i)
        {
            ItemStack itemstack = this.craftMatrix.getStackInSlot(i);
            ItemStack itemstack1 = nonnulllist.get(i);

            if (!itemstack.isEmpty())
            {
                this.craftMatrix.decrStackSize(i, 1);
                itemstack = this.craftMatrix.getStackInSlot(i);
            }

            if (!itemstack1.isEmpty())
            {
                if (itemstack.isEmpty())
                {
                    this.craftMatrix.setInventorySlotContents(i, itemstack1);
                }
                else if (ItemStack.areItemsEqual(itemstack, itemstack1) && ItemStack.areItemStackTagsEqual(itemstack, itemstack1))
                {
                    itemstack1.grow(itemstack.getCount());
                    this.craftMatrix.setInventorySlotContents(i, itemstack1);
                }
                else if (!this.player.inventory.addItemStackToInventory(itemstack1))
                {
                    this.player.dropItem(itemstack1, false);
                }
            }
        }

        return stack;
    }
}
