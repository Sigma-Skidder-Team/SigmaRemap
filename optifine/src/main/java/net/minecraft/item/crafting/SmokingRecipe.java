package net.minecraft.item.crafting;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class SmokingRecipe extends AbstractCookingRecipe
{
    public SmokingRecipe(ResourceLocation p_i4236_1_, String p_i4236_2_, Ingredient p_i4236_3_, ItemStack p_i4236_4_, float p_i4236_5_, int p_i4236_6_)
    {
        super(IRecipeType.SMOKING, p_i4236_1_, p_i4236_2_, p_i4236_3_, p_i4236_4_, p_i4236_5_, p_i4236_6_);
    }

    public ItemStack getIcon()
    {
        return new ItemStack(Blocks.SMOKER);
    }

    public IRecipeSerializer<?> getSerializer()
    {
        return IRecipeSerializer.SMOKING;
    }
}
