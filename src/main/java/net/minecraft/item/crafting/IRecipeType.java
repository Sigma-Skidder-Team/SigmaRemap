package net.minecraft.item.crafting;

import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.Optional;

public interface IRecipeType<T extends IRecipe<?>> {
   IRecipeType<ICraftingRecipe> CRAFTING = register("crafting");
   IRecipeType<FurnaceRecipe> SMELTING = register("smelting");
   IRecipeType<BlastingRecipe> BLASTING = register("blasting");
   IRecipeType<SmokingRecipe> SMOKING = register("smoking");
   IRecipeType<CampfireCookingRecipe> CAMPFIRE_COOKING = register("campfire_cooking");
   IRecipeType<StonecuttingRecipe> STONECUTTING = register("stonecutting");
   IRecipeType<SmithingRecipe> SMITHING = register("smithing");

   static <T extends IRecipe<?>> IRecipeType<T> register(String key) {
      return Registry.register(Registry.RECIPE_TYPE, new ResourceLocation(key), new IRecipeType<T>()
      {
         public String toString()
         {
            return key;
         }
      });
   }

   default <C extends IInventory> Optional<T> matches(IRecipe<C> recipe, World worldIn, C inv)
   {
      return recipe.matches(inv, worldIn) ? Optional.of((T)recipe) : Optional.empty();
   }
}
