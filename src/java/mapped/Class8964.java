package mapped;

import net.minecraft.item.crafting.RecipeBookCategory;

// $VF: synthetic class
public class Class8964 {
   private static String[] field40487;
   public static final int[] field40488 = new int[RecipeBookCategory.values().length];

   static {
      try {
         field40488[RecipeBookCategory.CRAFTING.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field40488[RecipeBookCategory.FURNACE.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field40488[RecipeBookCategory.BLAST_FURNACE.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field40488[RecipeBookCategory.SMOKER.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
