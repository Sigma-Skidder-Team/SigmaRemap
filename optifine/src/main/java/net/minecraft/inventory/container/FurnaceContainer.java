package net.minecraft.inventory.container;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.IIntArray;

public class FurnaceContainer extends AbstractFurnaceContainer
{
    public FurnaceContainer(int p_i1549_1_, PlayerInventory p_i1549_2_)
    {
        super(ContainerType.FURNACE, IRecipeType.SMELTING, p_i1549_1_, p_i1549_2_);
    }

    public FurnaceContainer(int p_i1550_1_, PlayerInventory p_i1550_2_, IInventory p_i1550_3_, IIntArray p_i1550_4_)
    {
        super(ContainerType.FURNACE, IRecipeType.SMELTING, p_i1550_1_, p_i1550_2_, p_i1550_3_, p_i1550_4_);
    }
}
