package remapped;

public class class_4754 {
   private static String[] field_23027;

   public static class_954<ItemStack> method_21939(World var0, class_704 var1, class_2584 var2) {
      var1.method_26462(var2);
      return class_954.<ItemStack>method_4206(var1.method_26617(var2));
   }

   public static ItemStack method_21942(ItemStack var0, class_704 var1, ItemStack var2, boolean var3) {
      boolean var6 = var1.playerAbilities.isCreativeMode;
      if (var3 && var6) {
         if (!var1.inventory.method_32405(var2)) {
            var1.inventory.method_32414(var2);
         }

         return var0;
      } else {
         if (!var6) {
            var0.method_27970(1);
         }

         if (!var0.method_28022()) {
            if (!var1.inventory.method_32414(var2)) {
               var1.method_3153(var2, false);
            }

            return var0;
         } else {
            return var2;
         }
      }
   }

   public static ItemStack method_21940(ItemStack var0, class_704 var1, ItemStack var2) {
      return method_21942(var0, var1, var2, true);
   }
}
