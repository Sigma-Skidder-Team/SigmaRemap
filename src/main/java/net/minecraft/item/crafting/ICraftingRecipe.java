package net.minecraft.item.crafting;

import mapped.Class926;

public interface ICraftingRecipe extends IRecipe<Class926> {
   @Override
   default IRecipeType<?> getType() {
      return IRecipeType.CRAFTING;
   }
}
