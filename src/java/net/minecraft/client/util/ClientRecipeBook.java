package net.minecraft.client.util;

import com.google.common.collect.*;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import mapped.*;
import net.minecraft.client.gui.recipebook.RecipeList;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClientRecipeBook extends Class6941 {
   private static final Logger field_241555_k_ = LogManager.getLogger();
   private Map<RecipeBookCategories, List<RecipeList>> recipesByCategory = ImmutableMap.of();
   private List<RecipeList> allRecipes = ImmutableList.of();

   public void method21383(Iterable<IRecipe<?>> var1) {
      Map<RecipeBookCategories, List<List<IRecipe<?>>>> var4 = method21384(var1);
      Map<RecipeBookCategories, ImmutableList<RecipeList>> var5 = com.google.common.collect.Maps.newHashMap();
      Builder<RecipeList> var6 = ImmutableList.builder();
      var4.forEach((var2, var3) -> {
         List<RecipeList> var6x = var5.put(var2, var3.stream().map(RecipeList::new).peek(var6::add).collect(ImmutableList.toImmutableList()));
      });
      RecipeBookCategories.field_243235_w
         .forEach(
            (var1x, var2) -> {
               List<RecipeList> var5x = var5.put(
                  var1x,
                  var2.stream().flatMap(var1xx -> var5.getOrDefault(var1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               );
            }
         );
      this.recipesByCategory = ImmutableMap.copyOf(var5);
      this.allRecipes = var6.build();
   }

   private static Map<RecipeBookCategories, List<List<IRecipe<?>>>> method21384(Iterable<IRecipe<?>> var0) {
      Map<RecipeBookCategories, List<List<IRecipe<?>>>> var3 = com.google.common.collect.Maps.newHashMap();
      Table<RecipeBookCategories, String, List<IRecipe<?>>> var4 = HashBasedTable.create();

      for (IRecipe<?> var6 : var0) {
         if (!var6.method14965()) {
            RecipeBookCategories var7 = getCategory(var6);
            String var8 = var6.method14970();
            if (!var8.isEmpty()) {
               List<IRecipe<?>> var9 = var4.get(var7, var8);
               if (var9 == null) {
                  var9 = Lists.newArrayList();
                  var4.put(var7, var8, var9);
                  var3.computeIfAbsent(var7, var0x -> Lists.newArrayList()).add(var9);
               }

               var9.add(var6);
            } else {
               var3.computeIfAbsent(var7, var0x -> Lists.newArrayList()).add(ImmutableList.of(var6));
            }
         }
      }

      return var3;
   }

   private static RecipeBookCategories getCategory(IRecipe<?> recipe) {
      IRecipeType<?> irecipetype = recipe.getType();

      if (irecipetype == IRecipeType.CRAFTING)
      {
         ItemStack itemstack = recipe.getRecipeOutput();
         ItemGroup itemgroup = itemstack.getItem().getGroup();

         if (itemgroup == ItemGroup.BUILDING_BLOCKS)
         {
            return RecipeBookCategories.CRAFTING_BUILDING_BLOCKS;
         }
         else if (itemgroup != ItemGroup.TOOLS && itemgroup != ItemGroup.COMBAT)
         {
            return itemgroup == ItemGroup.REDSTONE ? RecipeBookCategories.CRAFTING_REDSTONE : RecipeBookCategories.CRAFTING_MISC;
         }
         else
         {
            return RecipeBookCategories.CRAFTING_EQUIPMENT;
         }
      }
      else if (irecipetype == IRecipeType.SMELTING)
      {
         if (recipe.getRecipeOutput().getItem().isFood())
         {
            return RecipeBookCategories.FURNACE_FOOD;
         }
         else
         {
            return recipe.getRecipeOutput().getItem() instanceof BlockItem ? RecipeBookCategories.FURNACE_BLOCKS : RecipeBookCategories.FURNACE_MISC;
         }
      }
      else if (irecipetype == IRecipeType.BLASTING)
      {
         return recipe.getRecipeOutput().getItem() instanceof BlockItem ? RecipeBookCategories.BLAST_FURNACE_BLOCKS : RecipeBookCategories.BLAST_FURNACE_MISC;
      }
      else if (irecipetype == IRecipeType.SMOKING)
      {
         return RecipeBookCategories.SMOKER_FOOD;
      }
      else if (irecipetype == IRecipeType.STONECUTTING)
      {
         return RecipeBookCategories.STONECUTTER;
      }
      else if (irecipetype == IRecipeType.CAMPFIRE_COOKING)
      {
         return RecipeBookCategories.CAMPFIRE;
      }
      else if (irecipetype == IRecipeType.SMITHING)
      {
         return RecipeBookCategories.SMITHING;
      }
      else
      {
         field_241555_k_.warn("Unknown recipe category: {}/{}", () ->
         {
            return Registry.RECIPE_TYPE.getKey(recipe.getType());
         }, recipe::getId);
         return RecipeBookCategories.UNKNOWN;
      }
   }

   public List<RecipeList> getRecipes() {
      return this.allRecipes;
   }

   public List<RecipeList> getRecipes(RecipeBookCategories p_202891_1_)
   {
      return this.recipesByCategory.getOrDefault(p_202891_1_, Collections.emptyList());
   }
}
