package net.minecraft.item.crafting;

import net.minecraft.block.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class StonecuttingRecipe extends SingleItemRecipe
{
    public StonecuttingRecipe(ResourceLocation p_i2417_1_, String p_i2417_2_, Ingredient p_i2417_3_, ItemStack p_i2417_4_)
    {
        super(IRecipeType.STONECUTTING, IRecipeSerializer.STONECUTTING, p_i2417_1_, p_i2417_2_, p_i2417_3_, p_i2417_4_);
    }

    public boolean matches(IInventory inv, World worldIn)
    {
        return this.ingredient.test(inv.getStackInSlot(0));
    }

    public ItemStack getIcon()
    {
        return new ItemStack(Blocks.STONECUTTER);
    }
}
