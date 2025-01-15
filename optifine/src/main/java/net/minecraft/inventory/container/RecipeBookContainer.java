package net.minecraft.inventory.container;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.RecipeItemHelper;
import net.minecraft.item.crafting.ServerRecipePlacer;

public abstract class RecipeBookContainer<C extends IInventory> extends Container
{
    public RecipeBookContainer(ContainerType<?> json, int p_i1136_2_)
    {
        super(json, p_i1136_2_);
    }

    public void func_217056_a(boolean p_217056_1_, IRecipe<?> p_217056_2_, ServerPlayerEntity p_217056_3_)
    {
        (new ServerRecipePlacer(this)).place(p_217056_3_, p_217056_2_, p_217056_1_);
    }

    public abstract void fillStackedContents(RecipeItemHelper itemHelperIn);

    public abstract void clear();

    public abstract boolean matches(IRecipe <? super C > recipeIn);

    public abstract int getOutputSlot();

    public abstract int getWidth();

    public abstract int getHeight();

    public abstract int getSize();
}
