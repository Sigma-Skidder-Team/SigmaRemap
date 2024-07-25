package remapped;

import java.util.List;
import java.util.function.Predicate;

public class class_3037 {
   public static ItemStack method_13881(List<ItemStack> var0, int var1, int var2) {
      return var1 >= 0 && var1 < var0.size() && !((ItemStack)var0.get(var1)).method_28022() && var2 > 0
         ? ((ItemStack)var0.get(var1)).method_27953(var2)
         : ItemStack.EMPTY;
   }

   public static ItemStack method_13880(List<ItemStack> var0, int var1) {
      return var1 >= 0 && var1 < var0.size() ? var0.set(var1, ItemStack.EMPTY) : ItemStack.EMPTY;
   }

   public static class_5734 method_13878(class_5734 var0, class_2831<ItemStack> var1) {
      return method_13879(var0, var1, true);
   }

   public static class_5734 method_13879(class_5734 var0, class_2831<ItemStack> var1, boolean var2) {
      class_3416 var5 = new class_3416();

      for (int var6 = 0; var6 < var1.size(); var6++) {
         ItemStack var7 = (ItemStack)var1.get(var6);
         if (!var7.method_28022()) {
            class_5734 var8 = new class_5734();
            var8.method_25921("Slot", (byte)var6);
            var7.method_27998(var8);
            var5.add(var8);
         }
      }

      if (!var5.isEmpty() || var2) {
         var0.method_25946("Items", var5);
      }

      return var0;
   }

   public static void method_13882(class_5734 var0, class_2831<ItemStack> var1) {
      class_3416 var4 = var0.method_25927("Items", 10);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         class_5734 var6 = var4.method_15764(var5);
         int var7 = var6.method_25950("Slot") & 255;
         if (var7 >= 0 && var7 < var1.size()) {
            var1.set(var7, ItemStack.method_28015(var6));
         }
      }
   }

   public static int method_13877(class_6867 var0, Predicate<ItemStack> var1, int var2, boolean var3) {
      int var6 = 0;

      for (int var7 = 0; var7 < var0.method_31505(); var7++) {
         ItemStack var8 = var0.method_31498(var7);
         int var9 = method_13875(var8, var1, var2 - var6, var3);
         if (var9 > 0 && !var3 && var8.method_28022()) {
            var0.method_31503(var7, ItemStack.EMPTY);
         }

         var6 += var9;
      }

      return var6;
   }

   public static int method_13875(ItemStack var0, Predicate<ItemStack> var1, int var2, boolean var3) {
      if (var0.method_28022() || !var1.test(var0)) {
         return 0;
      } else if (!var3) {
         int var6 = var2 >= 0 ? Math.min(var2, var0.method_27997()) : var0.method_27997();
         var0.method_27970(var6);
         return var6;
      } else {
         return var0.method_27997();
      }
   }
}
