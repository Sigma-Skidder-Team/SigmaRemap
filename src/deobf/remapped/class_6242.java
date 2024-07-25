package remapped;

import java.util.List;
import java.util.Random;

public class class_6242 {
   private static String[] field_31945;

   public static int method_28508(List<? extends class_1047> var0) {
      int var3 = 0;
      int var4 = 0;

      for (int var5 = var0.size(); var4 < var5; var4++) {
         class_1047 var6 = (class_1047)var0.get(var4);
         var3 += var6.field_5753;
      }

      return var3;
   }

   public static <T extends class_1047> T method_28511(Random var0, List<T> var1, int var2) {
      if (var2 > 0) {
         int var5 = var0.nextInt(var2);
         return method_28509(var1, var5);
      } else {
         throw (IllegalArgumentException)class_9665.method_44658(new IllegalArgumentException());
      }
   }

   public static <T extends class_1047> T method_28509(List<T> var0, int var1) {
      int var4 = 0;

      for (int var5 = var0.size(); var4 < var5; var4++) {
         class_1047 var6 = (class_1047)var0.get(var4);
         var1 -= var6.field_5753;
         if (var1 < 0) {
            return (T)var6;
         }
      }

      return null;
   }

   public static <T extends class_1047> T method_28510(Random var0, List<T> var1) {
      return method_28511(var0, var1, method_28508(var1));
   }
}
