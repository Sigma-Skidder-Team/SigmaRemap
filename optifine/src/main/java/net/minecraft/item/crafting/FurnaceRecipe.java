package net.minecraft.item.crafting;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class FurnaceRecipe extends AbstractCookingRecipe
{
    public FurnaceRecipe(ResourceLocation p_i1953_1_, String p_i1953_2_, Ingredient p_i1953_3_, ItemStack p_i1953_4_, float p_i1953_5_, int p_i1953_6_)
    {
        super(IRecipeType.SMELTING, p_i1953_1_, p_i1953_2_, p_i1953_3_, p_i1953_4_, p_i1953_5_, p_i1953_6_);
    }

    public ItemStack getIcon()
    {
        return new ItemStack(Blocks.FURNACE);
    }

    public IRecipeSerializer<?> getSerializer()
    {
        return IRecipeSerializer.SMELTING;
    }
}
