package net.minecraft.inventory.container;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.IIntArray;

public class SmokerContainer extends AbstractFurnaceContainer
{
    public SmokerContainer(int p_i2959_1_, PlayerInventory p_i2959_2_)
    {
        super(ContainerType.SMOKER, IRecipeType.SMOKING, p_i2959_1_, p_i2959_2_);
    }

    public SmokerContainer(int p_i2960_1_, PlayerInventory p_i2960_2_, IInventory p_i2960_3_, IIntArray p_i2960_4_)
    {
        super(ContainerType.SMOKER, IRecipeType.SMOKING, p_i2960_1_, p_i2960_2_, p_i2960_3_, p_i2960_4_);
    }
}
