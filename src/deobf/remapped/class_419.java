package remapped;

import java.util.UUID;

public class class_419 {
   private static String[] field_1775;

   public static class_6331 method_2086() {
      MinecraftClient var2 = class_3111.method_14327();
      class_174 var3 = var2.field_9601;
      if (var3 == null) {
         return null;
      } else if (!var2.method_8566()) {
         return null;
      } else {
         class_7762 var4 = var2.method_8515();
         if (var4 == null) {
            return null;
         } else {
            class_5621 var5 = var3.method_29545();
            if (var5 == null) {
               return null;
            } else {
               try {
                  return var4.method_1697(var5);
               } catch (NullPointerException var7) {
                  return null;
               }
            }
         }
      }
   }

   public static class_8145 method_2085(UUID var0) {
      class_6331 var3 = method_2086();
      return var3 != null ? var3.method_28925(var0) : null;
   }

   public static class_3757 method_2088(class_1331 var0) {
      class_6331 var3 = method_2086();
      if (var3 != null) {
         class_5990 var4 = var3.method_28945().method_14819(var0.method_12173() >> 4, var0.method_12185() >> 4, class_7335.field_37514, false);
         return var4 != null ? var4.method_28260(var0) : null;
      } else {
         return null;
      }
   }
}
