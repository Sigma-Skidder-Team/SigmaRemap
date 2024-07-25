package remapped;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public enum class_1360 {
   field_7401(0, "normal", false),
   field_7402(1, "lazy", false),
   field_7409(2, "worried", false),
   field_7400(3, "playful", false),
   field_7410(4, "brown", true),
   field_7406(5, "weak", true),
   field_7403(6, "aggressive", false);

   private static final class_1360[] field_7399 = Arrays.<class_1360>stream(values())
      .sorted(Comparator.comparingInt(class_1360::method_6265))
      .<class_1360>toArray(class_1360[]::new);
   private final int field_7405;
   private final String field_7408;
   private final boolean field_7398;

   private class_1360(int var3, String var4, boolean var5) {
      this.field_7405 = var3;
      this.field_7408 = var4;
      this.field_7398 = var5;
   }

   public int method_6265() {
      return this.field_7405;
   }

   public String method_6269() {
      return this.field_7408;
   }

   public boolean method_6264() {
      return this.field_7398;
   }

   private static class_1360 method_6267(class_1360 var0, class_1360 var1) {
      if (!var0.method_6264()) {
         return var0;
      } else {
         return var0 != var1 ? field_7401 : var0;
      }
   }

   public static class_1360 method_6266(int var0) {
      if (var0 < 0 || var0 >= field_7399.length) {
         var0 = 0;
      }

      return field_7399[var0];
   }

   public static class_1360 method_6262(String var0) {
      for (class_1360 var6 : values()) {
         if (var6.field_7408.equals(var0)) {
            return var6;
         }
      }

      return field_7401;
   }

   public static class_1360 method_6270(Random var0) {
      int var3 = var0.nextInt(16);
      if (var3 != 0) {
         if (var3 != 1) {
            if (var3 != 2) {
               if (var3 != 4) {
                  if (var3 >= 9) {
                     return var3 >= 11 ? field_7401 : field_7410;
                  } else {
                     return field_7406;
                  }
               } else {
                  return field_7403;
               }
            } else {
               return field_7400;
            }
         } else {
            return field_7409;
         }
      } else {
         return field_7402;
      }
   }
}
