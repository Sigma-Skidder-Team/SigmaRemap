package remapped;

import java.util.List;
import java.util.Random;

public class class_1087 {
   private static String[] field_6006;

   private static class_462 method_4767(List<class_7060> var0, Random var1, int var2, int var3, int var4, class_240 var5, int var6, class_1143 var7) {
      int var10 = var1.nextInt(100);
      if (var10 < 80) {
         if (var10 < 70) {
            class_9616 var11 = class_6262.method_28564(var0, var1, var2, var3, var4, var5);
            if (var11 != null) {
               return new class_6262(var6, var1, var11, var5, var7);
            }
         } else {
            class_9616 var12 = class_729.method_3338(var0, var1, var2, var3, var4, var5);
            if (var12 != null) {
               return new class_729(var6, var12, var5, var7);
            }
         }
      } else {
         class_9616 var13 = class_6138.method_28182(var0, var1, var2, var3, var4, var5);
         if (var13 != null) {
            return new class_6138(var6, var13, var5, var7);
         }
      }

      return null;
   }

   private static class_462 method_4764(class_7060 var0, List<class_7060> var1, Random var2, int var3, int var4, int var5, class_240 var6, int var7) {
      if (var7 <= 8) {
         if (Math.abs(var3 - var0.method_32512().field_48996) <= 80 && Math.abs(var5 - var0.method_32512().field_48992) <= 80) {
            class_1143 var10 = ((class_462)var0).field_1919;
            class_462 var11 = method_4767(var1, var2, var3, var4, var5, var6, var7 + 1, var10);
            if (var11 != null) {
               var1.add(var11);
               var11.method_32527(var0, var1, var2);
            }

            return var11;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }
}
