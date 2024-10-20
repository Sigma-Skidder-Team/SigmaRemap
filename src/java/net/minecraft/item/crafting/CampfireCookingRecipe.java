package net.minecraft.item.crafting;

import mapped.Class120;
import mapped.Class4847;
import mapped.Class6504;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class CampfireCookingRecipe extends Class4847 {
   private static String[] field22639;

   public CampfireCookingRecipe(ResourceLocation var1, String var2, Class120 var3, ItemStack var4, float var5, int var6) {
      super(IRecipeType.CAMPFIRE_COOKING, var1, var2, var3, var4, var5, var6);
   }

   @Override
   public ItemStack method14971() {
      return new ItemStack(Blocks.field37067);
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28488;
   }
}
