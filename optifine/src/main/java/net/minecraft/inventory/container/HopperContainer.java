package net.minecraft.inventory.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;

public class HopperContainer extends Container
{
    private final IInventory hopperInventory;

    public HopperContainer(int p_i3745_1_, PlayerInventory p_i3745_2_)
    {
        this(p_i3745_1_, p_i3745_2_, new Inventory(5));
    }

    public HopperContainer(int p_i3746_1_, PlayerInventory p_i3746_2_, IInventory p_i3746_3_)
    {
        super(ContainerType.HOPPER, p_i3746_1_);
        this.hopperInventory = p_i3746_3_;
        assertInventorySize(p_i3746_3_, 5);
        p_i3746_3_.openInventory(p_i3746_2_.player);
        int i = 51;

        for (int j = 0; j < 5; ++j)
        {
            this.addSlot(new Slot(p_i3746_3_, j, 44 + j * 18, 20));
        }

        for (int l = 0; l < 3; ++l)
        {
            for (int k = 0; k < 9; ++k)
            {
                this.addSlot(new Slot(p_i3746_2_, k + l * 9 + 9, 8 + k * 18, l * 18 + 51));
            }
        }

        for (int i1 = 0; i1 < 9; ++i1)
        {
            this.addSlot(new Slot(p_i3746_2_, i1, 8 + i1 * 18, 109));
        }
    }

    public boolean canInteractWith(PlayerEntity playerIn)
    {
        return this.hopperInventory.isUsableByPlayer(playerIn);
    }

    public ItemStack transferStackInSlot(PlayerEntity playerIn, int index)
    {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index < this.hopperInventory.getSizeInventory())
            {
                if (!this.mergeItemStack(itemstack1, this.hopperInventory.getSizeInventory(), this.inventorySlots.size(), true))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 0, this.hopperInventory.getSizeInventory(), false))
            {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty())
            {
                slot.putStack(ItemStack.EMPTY);
            }
            else
            {
                slot.onSlotChanged();
            }
        }

        return itemstack;
    }

    public void onContainerClosed(PlayerEntity playerIn)
    {
        super.onContainerClosed(playerIn);
        this.hopperInventory.closeInventory(playerIn);
    }
}
