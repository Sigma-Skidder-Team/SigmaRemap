package net.minecraft.inventory.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;

public class ShulkerBoxContainer extends Container
{
    private final IInventory inventory;

    public ShulkerBoxContainer(int p_i3797_1_, PlayerInventory p_i3797_2_)
    {
        this(p_i3797_1_, p_i3797_2_, new Inventory(27));
    }

    public ShulkerBoxContainer(int p_i3798_1_, PlayerInventory p_i3798_2_, IInventory p_i3798_3_)
    {
        super(ContainerType.SHULKER_BOX, p_i3798_1_);
        assertInventorySize(p_i3798_3_, 27);
        this.inventory = p_i3798_3_;
        p_i3798_3_.openInventory(p_i3798_2_.player);
        int i = 3;
        int j = 9;

        for (int k = 0; k < 3; ++k)
        {
            for (int l = 0; l < 9; ++l)
            {
                this.addSlot(new ShulkerBoxSlot(p_i3798_3_, l + k * 9, 8 + l * 18, 18 + k * 18));
            }
        }

        for (int i1 = 0; i1 < 3; ++i1)
        {
            for (int k1 = 0; k1 < 9; ++k1)
            {
                this.addSlot(new Slot(p_i3798_2_, k1 + i1 * 9 + 9, 8 + k1 * 18, 84 + i1 * 18));
            }
        }

        for (int j1 = 0; j1 < 9; ++j1)
        {
            this.addSlot(new Slot(p_i3798_2_, j1, 8 + j1 * 18, 142));
        }
    }

    public boolean canInteractWith(PlayerEntity playerIn)
    {
        return this.inventory.isUsableByPlayer(playerIn);
    }

    public ItemStack transferStackInSlot(PlayerEntity playerIn, int index)
    {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index < this.inventory.getSizeInventory())
            {
                if (!this.mergeItemStack(itemstack1, this.inventory.getSizeInventory(), this.inventorySlots.size(), true))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 0, this.inventory.getSizeInventory(), false))
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
        this.inventory.closeInventory(playerIn);
    }
}
