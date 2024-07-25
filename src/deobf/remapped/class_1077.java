package remapped;

import javax.annotation.Nullable;

public class class_1077 {
   private static String[] field_5875;

   @Nullable
   public static BlockPos method_4714(class_6331 var0, int var1, int var2, boolean var3) {
      class_2921 var6 = new class_2921(var1, 0, var2);
      class_6325 var7 = var0.method_22561(var6);
      boolean var8 = var0.method_22572().method_40244();
      class_2522 var9 = var7.method_28875().method_9460().method_19215();
      if (var3 && !var9.method_8360().method_29299(class_2351.field_11788)) {
         return null;
      } else {
         class_2654 var10 = var0.method_29554(var1 >> 4, var2 >> 4);
         int var11 = !var8 ? var10.method_27367(class_3801.field_18595, var1 & 15, var2 & 15) : var0.method_28945().method_10189().method_29823();
         if (var11 < 0) {
            return null;
         } else {
            int var12 = var10.method_27367(class_3801.field_18592, var1 & 15, var2 & 15);
            if (var12 <= var11 && var12 > var10.method_27367(class_3801.field_18599, var1 & 15, var2 & 15)) {
               return null;
            } else {
               for (int var13 = var11 + 1; var13 >= 0; var13--) {
                  var6.method_13362(var1, var13, var2);
                  class_2522 var14 = var0.method_28262(var6);
                  if (!var14.method_8364().method_22001()) {
                     break;
                  }

                  if (var14.equals(var9)) {
                     return var6.method_6081().method_6072();
                  }
               }

               return null;
            }
         }
      }
   }

   @Nullable
   public static BlockPos method_4715(class_6331 var0, class_2034 var1, boolean var2) {
      for (int var5 = var1.method_9535(); var5 <= var1.method_9536(); var5++) {
         for (int var6 = var1.method_9545(); var6 <= var1.method_9538(); var6++) {
            BlockPos var7 = method_4714(var0, var5, var6, var2);
            if (var7 != null) {
               return var7;
            }
         }
      }

      return null;
   }
}
