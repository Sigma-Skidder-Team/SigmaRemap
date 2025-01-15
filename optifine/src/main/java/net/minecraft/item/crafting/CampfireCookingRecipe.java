package net.minecraft.item.crafting;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class CampfireCookingRecipe extends AbstractCookingRecipe
{
    public CampfireCookingRecipe(ResourceLocation p_i518_1_, String p_i518_2_, Ingredient p_i518_3_, ItemStack p_i518_4_, float p_i518_5_, int p_i518_6_)
    {
        super(IRecipeType.CAMPFIRE_COOKING, p_i518_1_, p_i518_2_, p_i518_3_, p_i518_4_, p_i518_5_, p_i518_6_);
    }

    public ItemStack getIcon()
    {
        return new ItemStack(Blocks.CAMPFIRE);
    }

    public IRecipeSerializer<?> getSerializer()
    {
        return IRecipeSerializer.CAMPFIRE_COOKING;
    }
}
