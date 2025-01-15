package net.minecraft.inventory.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIntArray;
import net.minecraft.util.IntArray;

public class LecternContainer extends Container
{
    private final IInventory field_217018_c;
    private final IIntArray field_217019_d;

    public LecternContainer(int p_i1570_1_)
    {
        this(p_i1570_1_, new Inventory(1), new IntArray(1));
    }

    public LecternContainer(int p_i1571_1_, IInventory p_i1571_2_, IIntArray p_i1571_3_)
    {
        super(ContainerType.LECTERN, p_i1571_1_);
        assertInventorySize(p_i1571_2_, 1);
        assertIntArraySize(p_i1571_3_, 1);
        this.field_217018_c = p_i1571_2_;
        this.field_217019_d = p_i1571_3_;
        this.addSlot(new Slot(p_i1571_2_, 0, 0, 0)
        {
            public void onSlotChanged()
            {
                super.onSlotChanged();
                LecternContainer.this.onCraftMatrixChanged(this.inventory);
            }
        });
        this.trackIntArray(p_i1571_3_);
    }

    public boolean enchantItem(PlayerEntity playerIn, int id)
    {
        if (id >= 100)
        {
            int k = id - 100;
            this.updateProgressBar(0, k);
            return true;
        }
        else
        {
            switch (id)
            {
                case 1:
                    int j = this.field_217019_d.get(0);
                    this.updateProgressBar(0, j - 1);
                    return true;

                case 2:
                    int i = this.field_217019_d.get(0);
                    this.updateProgressBar(0, i + 1);
                    return true;

                case 3:
                    if (!playerIn.isAllowEdit())
                    {
                        return false;
                    }

                    ItemStack itemstack = this.field_217018_c.removeStackFromSlot(0);
                    this.field_217018_c.markDirty();

                    if (!playerIn.inventory.addItemStackToInventory(itemstack))
                    {
                        playerIn.dropItem(itemstack, false);
                    }

                    return true;

                default:
                    return false;
            }
        }
    }

    public void updateProgressBar(int id, int data)
    {
        super.updateProgressBar(id, data);
        this.detectAndSendChanges();
    }

    public boolean canInteractWith(PlayerEntity playerIn)
    {
        return this.field_217018_c.isUsableByPlayer(playerIn);
    }

    public ItemStack getBook()
    {
        return this.field_217018_c.getStackInSlot(0);
    }

    public int getPage()
    {
        return this.field_217019_d.get(0);
    }
}
