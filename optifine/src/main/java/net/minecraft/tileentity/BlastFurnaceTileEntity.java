package net.minecraft.tileentity;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.BlastFurnaceContainer;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class BlastFurnaceTileEntity extends AbstractFurnaceTileEntity
{
    public BlastFurnaceTileEntity()
    {
        super(TileEntityType.BLAST_FURNACE, IRecipeType.BLASTING);
    }

    protected ITextComponent getDefaultName()
    {
        return new TranslationTextComponent("container.blast_furnace");
    }

    protected int getBurnTime(ItemStack p_213997_1_)
    {
        return super.getBurnTime(p_213997_1_) / 2;
    }

    protected Container createMenu(int id, PlayerInventory player)
    {
        return new BlastFurnaceContainer(id, player, this, this.furnaceData);
    }
}
