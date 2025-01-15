package net.minecraft.inventory.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;

public class ChestContainer extends Container
{
    private final IInventory lowerChestInventory;
    private final int numRows;

    private ChestContainer(ContainerType<?> p_i3615_1_, int p_i3615_2_, PlayerInventory p_i3615_3_, int p_i3615_4_)
    {
        this(p_i3615_1_, p_i3615_2_, p_i3615_3_, new Inventory(9 * p_i3615_4_), p_i3615_4_);
    }

    public static ChestContainer createGeneric9X1(int id, PlayerInventory player)
    {
        return new ChestContainer(ContainerType.GENERIC_9X1, id, player, 1);
    }

    public static ChestContainer createGeneric9X2(int id, PlayerInventory player)
    {
        return new ChestContainer(ContainerType.GENERIC_9X2, id, player, 2);
    }

    public static ChestContainer createGeneric9X3(int id, PlayerInventory player)
    {
        return new ChestContainer(ContainerType.GENERIC_9X3, id, player, 3);
    }

    public static ChestContainer createGeneric9X4(int id, PlayerInventory player)
    {
        return new ChestContainer(ContainerType.GENERIC_9X4, id, player, 4);
    }

    public static ChestContainer createGeneric9X5(int id, PlayerInventory player)
    {
        return new ChestContainer(ContainerType.GENERIC_9X5, id, player, 5);
    }

    public static ChestContainer createGeneric9X6(int id, PlayerInventory player)
    {
        return new ChestContainer(ContainerType.GENERIC_9X6, id, player, 6);
    }

    public static ChestContainer createGeneric9X3(int id, PlayerInventory player, IInventory blockEntity)
    {
        return new ChestContainer(ContainerType.GENERIC_9X3, id, player, blockEntity, 3);
    }

    public static ChestContainer createGeneric9X6(int id, PlayerInventory player, IInventory blockEntity)
    {
        return new ChestContainer(ContainerType.GENERIC_9X6, id, player, blockEntity, 6);
    }

    public ChestContainer(ContainerType<?> p_i3616_1_, int p_i3616_2_, PlayerInventory p_i3616_3_, IInventory p_i3616_4_, int p_i3616_5_)
    {
        super(p_i3616_1_, p_i3616_2_);
        assertInventorySize(p_i3616_4_, p_i3616_5_ * 9);
        this.lowerChestInventory = p_i3616_4_;
        this.numRows = p_i3616_5_;
        p_i3616_4_.openInventory(p_i3616_3_.player);
        int i = (this.numRows - 4) * 18;

        for (int j = 0; j < this.numRows; ++j)
        {
            for (int k = 0; k < 9; ++k)
            {
                this.addSlot(new Slot(p_i3616_4_, k + j * 9, 8 + k * 18, 18 + j * 18));
            }
        }

        for (int l = 0; l < 3; ++l)
        {
            for (int j1 = 0; j1 < 9; ++j1)
            {
                this.addSlot(new Slot(p_i3616_3_, j1 + l * 9 + 9, 8 + j1 * 18, 103 + l * 18 + i));
            }
        }

        for (int i1 = 0; i1 < 9; ++i1)
        {
            this.addSlot(new Slot(p_i3616_3_, i1, 8 + i1 * 18, 161 + i));
        }
    }

    public boolean canInteractWith(PlayerEntity playerIn)
    {
        return this.lowerChestInventory.isUsableByPlayer(playerIn);
    }

    public ItemStack transferStackInSlot(PlayerEntity playerIn, int index)
    {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index < this.numRows * 9)
            {
                if (!this.mergeItemStack(itemstack1, this.numRows * 9, this.inventorySlots.size(), true))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 0, this.numRows * 9, false))
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
        this.lowerChestInventory.closeInventory(playerIn);
    }

    public IInventory getLowerChestInventory()
    {
        return this.lowerChestInventory;
    }

    public int getNumRows()
    {
        return this.numRows;
    }
}
