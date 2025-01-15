package net.minecraft.inventory;

import javax.annotation.Nullable;
import net.minecraft.entity.merchant.IMerchant;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MerchantOffer;
import net.minecraft.item.MerchantOffers;
import net.minecraft.util.NonNullList;

public class MerchantInventory implements IInventory
{
    private final IMerchant merchant;
    private final NonNullList<ItemStack> slots = NonNullList.withSize(3, ItemStack.EMPTY);
    @Nullable
    private MerchantOffer field_214026_c;
    private int currentRecipeIndex;
    private int exp;

    public MerchantInventory(IMerchant p_i3908_1_)
    {
        this.merchant = p_i3908_1_;
    }

    public int getSizeInventory()
    {
        return this.slots.size();
    }

    public boolean isEmpty()
    {
        for (ItemStack itemstack : this.slots)
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
        return this.slots.get(index);
    }

    public ItemStack decrStackSize(int index, int count)
    {
        ItemStack itemstack = this.slots.get(index);

        if (index == 2 && !itemstack.isEmpty())
        {
            return ItemStackHelper.getAndSplit(this.slots, index, itemstack.getCount());
        }
        else
        {
            ItemStack itemstack1 = ItemStackHelper.getAndSplit(this.slots, index, count);

            if (!itemstack1.isEmpty() && this.inventoryResetNeededOnSlotChange(index))
            {
                this.resetRecipeAndSlots();
            }

            return itemstack1;
        }
    }

    private boolean inventoryResetNeededOnSlotChange(int slotIn)
    {
        return slotIn == 0 || slotIn == 1;
    }

    public ItemStack removeStackFromSlot(int index)
    {
        return ItemStackHelper.getAndRemove(this.slots, index);
    }

    public void setInventorySlotContents(int index, ItemStack stack)
    {
        this.slots.set(index, stack);

        if (!stack.isEmpty() && stack.getCount() > this.getInventoryStackLimit())
        {
            stack.setCount(this.getInventoryStackLimit());
        }

        if (this.inventoryResetNeededOnSlotChange(index))
        {
            this.resetRecipeAndSlots();
        }
    }

    public boolean isUsableByPlayer(PlayerEntity player)
    {
        return this.merchant.getCustomer() == player;
    }

    public void markDirty()
    {
        this.resetRecipeAndSlots();
    }

    public void resetRecipeAndSlots()
    {
        this.field_214026_c = null;
        ItemStack itemstack;
        ItemStack itemstack1;

        if (this.slots.get(0).isEmpty())
        {
            itemstack = this.slots.get(1);
            itemstack1 = ItemStack.EMPTY;
        }
        else
        {
            itemstack = this.slots.get(0);
            itemstack1 = this.slots.get(1);
        }

        if (itemstack.isEmpty())
        {
            this.setInventorySlotContents(2, ItemStack.EMPTY);
            this.exp = 0;
        }
        else
        {
            MerchantOffers merchantoffers = this.merchant.getOffers();

            if (!merchantoffers.isEmpty())
            {
                MerchantOffer merchantoffer = merchantoffers.func_222197_a(itemstack, itemstack1, this.currentRecipeIndex);

                if (merchantoffer == null || merchantoffer.hasNoUsesLeft())
                {
                    this.field_214026_c = merchantoffer;
                    merchantoffer = merchantoffers.func_222197_a(itemstack1, itemstack, this.currentRecipeIndex);
                }

                if (merchantoffer != null && !merchantoffer.hasNoUsesLeft())
                {
                    this.field_214026_c = merchantoffer;
                    this.setInventorySlotContents(2, merchantoffer.getCopyOfSellingStack());
                    this.exp = merchantoffer.getGivenExp();
                }
                else
                {
                    this.setInventorySlotContents(2, ItemStack.EMPTY);
                    this.exp = 0;
                }
            }

            this.merchant.verifySellingItem(this.getStackInSlot(2));
        }
    }

    @Nullable
    public MerchantOffer func_214025_g()
    {
        return this.field_214026_c;
    }

    public void setCurrentRecipeIndex(int currentRecipeIndexIn)
    {
        this.currentRecipeIndex = currentRecipeIndexIn;
        this.resetRecipeAndSlots();
    }

    public void clear()
    {
        this.slots.clear();
    }

    public int getClientSideExp()
    {
        return this.exp;
    }
}
