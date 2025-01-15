package net.minecraft.item.crafting;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public abstract class AbstractCookingRecipe implements IRecipe<IInventory>
{
    protected final IRecipeType<?> type;
    protected final ResourceLocation id;
    protected final String group;
    protected final Ingredient ingredient;
    protected final ItemStack result;
    protected final float experience;
    protected final int cookTime;

    public AbstractCookingRecipe(IRecipeType<?> p_i4197_1_, ResourceLocation p_i4197_2_, String p_i4197_3_, Ingredient p_i4197_4_, ItemStack p_i4197_5_, float p_i4197_6_, int p_i4197_7_)
    {
        this.type = p_i4197_1_;
        this.id = p_i4197_2_;
        this.group = p_i4197_3_;
        this.ingredient = p_i4197_4_;
        this.result = p_i4197_5_;
        this.experience = p_i4197_6_;
        this.cookTime = p_i4197_7_;
    }

    public boolean matches(IInventory inv, World worldIn)
    {
        return this.ingredient.test(inv.getStackInSlot(0));
    }

    public ItemStack getCraftingResult(IInventory inv)
    {
        return this.result.copy();
    }

    public boolean canFit(int width, int height)
    {
        return true;
    }

    public NonNullList<Ingredient> getIngredients()
    {
        NonNullList<Ingredient> nonnulllist = NonNullList.create();
        nonnulllist.add(this.ingredient);
        return nonnulllist;
    }

    public float getExperience()
    {
        return this.experience;
    }

    public ItemStack getRecipeOutput()
    {
        return this.result;
    }

    public String getGroup()
    {
        return this.group;
    }

    public int getCookTime()
    {
        return this.cookTime;
    }

    public ResourceLocation getId()
    {
        return this.id;
    }

    public IRecipeType<?> getType()
    {
        return this.type;
    }
}
