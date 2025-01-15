package net.minecraft.inventory.container;

import javax.annotation.Nullable;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Effect;
import net.minecraft.util.IIntArray;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.IntArray;

public class BeaconContainer extends Container
{
    private final IInventory tileBeacon = new Inventory(1)
    {
        public boolean isItemValidForSlot(int index, ItemStack stack)
        {
            return stack.getItem() == Items.EMERALD || stack.getItem() == Items.DIAMOND || stack.getItem() == Items.GOLD_INGOT || stack.getItem() == Items.IRON_INGOT;
        }
        public int getInventoryStackLimit()
        {
            return 1;
        }
    };
    private final BeaconContainer.BeaconSlot beaconSlot;
    private final IWorldPosCallable field_216971_e;
    private final IIntArray field_216972_f;

    public BeaconContainer(int p_i849_1_, IInventory p_i849_2_)
    {
        this(p_i849_1_, p_i849_2_, new IntArray(3), IWorldPosCallable.DUMMY);
    }

    public BeaconContainer(int p_i850_1_, IInventory p_i850_2_, IIntArray p_i850_3_, IWorldPosCallable p_i850_4_)
    {
        super(ContainerType.BEACON, p_i850_1_);
        assertIntArraySize(p_i850_3_, 3);
        this.field_216972_f = p_i850_3_;
        this.field_216971_e = p_i850_4_;
        this.beaconSlot = new BeaconContainer.BeaconSlot(this.tileBeacon, 0, 136, 110);
        this.addSlot(this.beaconSlot);
        this.trackIntArray(p_i850_3_);
        int i = 36;
        int j = 137;

        for (int k = 0; k < 3; ++k)
        {
            for (int l = 0; l < 9; ++l)
            {
                this.addSlot(new Slot(p_i850_2_, l + k * 9 + 9, 36 + l * 18, 137 + k * 18));
            }
        }

        for (int i1 = 0; i1 < 9; ++i1)
        {
            this.addSlot(new Slot(p_i850_2_, i1, 36 + i1 * 18, 195));
        }
    }

    public void onContainerClosed(PlayerEntity playerIn)
    {
        super.onContainerClosed(playerIn);

        if (!playerIn.world.isRemote)
        {
            ItemStack itemstack = this.beaconSlot.decrStackSize(this.beaconSlot.getSlotStackLimit());

            if (!itemstack.isEmpty())
            {
                playerIn.dropItem(itemstack, false);
            }
        }
    }

    public boolean canInteractWith(PlayerEntity playerIn)
    {
        return isWithinUsableDistance(this.field_216971_e, playerIn, Blocks.BEACON);
    }

    public void updateProgressBar(int id, int data)
    {
        super.updateProgressBar(id, data);
        this.detectAndSendChanges();
    }

    public ItemStack transferStackInSlot(PlayerEntity playerIn, int index)
    {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index == 0)
            {
                if (!this.mergeItemStack(itemstack1, 1, 37, true))
                {
                    return ItemStack.EMPTY;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (!this.beaconSlot.getHasStack() && this.beaconSlot.isItemValid(itemstack1) && itemstack1.getCount() == 1)
            {
                if (!this.mergeItemStack(itemstack1, 0, 1, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (index >= 1 && index < 28)
            {
                if (!this.mergeItemStack(itemstack1, 28, 37, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (index >= 28 && index < 37)
            {
                if (!this.mergeItemStack(itemstack1, 1, 28, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 1, 37, false))
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

            if (itemstack1.getCount() == itemstack.getCount())
            {
                return ItemStack.EMPTY;
            }

            slot.onTake(playerIn, itemstack1);
        }

        return itemstack;
    }

    public int func_216969_e()
    {
        return this.field_216972_f.get(0);
    }

    @Nullable
    public Effect func_216967_f()
    {
        return Effect.get(this.field_216972_f.get(1));
    }

    @Nullable
    public Effect func_216968_g()
    {
        return Effect.get(this.field_216972_f.get(2));
    }

    public void func_216966_c(int p_216966_1_, int p_216966_2_)
    {
        if (this.beaconSlot.getHasStack())
        {
            this.field_216972_f.set(1, p_216966_1_);
            this.field_216972_f.set(2, p_216966_2_);
            this.beaconSlot.decrStackSize(1);
        }
    }

    public boolean func_216970_h()
    {
        return !this.tileBeacon.getStackInSlot(0).isEmpty();
    }

    class BeaconSlot extends Slot
    {
        public BeaconSlot(IInventory p_i3682_2_, int p_i3682_3_, int p_i3682_4_, int p_i3682_5_)
        {
            super(p_i3682_2_, p_i3682_3_, p_i3682_4_, p_i3682_5_);
        }

        public boolean isItemValid(ItemStack stack)
        {
            Item item = stack.getItem();
            return item == Items.EMERALD || item == Items.DIAMOND || item == Items.GOLD_INGOT || item == Items.IRON_INGOT;
        }

        public int getSlotStackLimit()
        {
            return 1;
        }
    }
}
