package mapped;

import java.util.List;
import java.util.function.Predicate;

public class Class7920 {
   public static ItemStack method26563(List<ItemStack> var0, int var1, int var2) {
      return var1 >= 0 && var1 < var0.size() && !((ItemStack)var0.get(var1)).method32105() && var2 > 0
         ? ((ItemStack)var0.get(var1)).method32106(var2)
         : ItemStack.EMPTY;
   }

   public static ItemStack method26564(List<ItemStack> var0, int var1) {
      return var1 >= 0 && var1 < var0.size() ? var0.set(var1, ItemStack.EMPTY) : ItemStack.EMPTY;
   }

   public static Class39 method26565(Class39 var0, Class25<ItemStack> var1) {
      return method26566(var0, var1, true);
   }

   public static Class39 method26566(Class39 var0, Class25<ItemStack> var1, boolean var2) {
      Class41 var5 = new Class41();

      for (int var6 = 0; var6 < var1.size(); var6++) {
         ItemStack var7 = (ItemStack)var1.get(var6);
         if (!var7.method32105()) {
            Class39 var8 = new Class39();
            var8.method100("Slot", (byte)var6);
            var7.method32112(var8);
            var5.add(var8);
         }
      }

      if (!var5.isEmpty() || var2) {
         var0.method99("Items", var5);
      }

      return var0;
   }

   public static void method26567(Class39 var0, Class25<ItemStack> var1) {
      Class41 var4 = var0.method131("Items", 10);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         Class39 var6 = var4.method153(var5);
         int var7 = var6.method120("Slot") & 255;
         if (var7 >= 0 && var7 < var1.size()) {
            var1.set(var7, ItemStack.method32104(var6));
         }
      }
   }

   public static int method26568(Class920 var0, Predicate<ItemStack> var1, int var2, boolean var3) {
      int var6 = 0;

      for (int var7 = 0; var7 < var0.method3629(); var7++) {
         ItemStack var8 = var0.method3618(var7);
         int var9 = method26569(var8, var1, var2 - var6, var3);
         if (var9 > 0 && !var3 && var8.method32105()) {
            var0.method3621(var7, ItemStack.EMPTY);
         }

         var6 += var9;
      }

      return var6;
   }

   public static int method26569(ItemStack var0, Predicate<ItemStack> var1, int var2, boolean var3) {
      if (var0.method32105() || !var1.test(var0)) {
         return 0;
      } else if (!var3) {
         int var6 = var2 >= 0 ? Math.min(var2, var0.method32179()) : var0.method32179();
         var0.method32182(var6);
         return var6;
      } else {
         return var0.method32179();
      }
   }
}
