package remapped;

public final class class_1493 {
   public static String method_6889(class_2250 var0, float var1) {
      if (!var0.method_10337()) {
         int var4 = class_9299.method_42848((float)var0.method_10347() * var1);
         return class_6660.method_30575(var4);
      } else {
         return "**:**";
      }
   }

   public static boolean method_6892(LivingEntity var0) {
      return var0.isPotionActive(Effects.field_19735) || var0.isPotionActive(Effects.field_19744);
   }

   public static int method_6888(LivingEntity var0) {
      int var3 = 0;
      int var4 = 0;
      if (var0.isPotionActive(Effects.field_19735)) {
         var3 = var0.method_26553(Effects.field_19735).method_10333();
      }

      if (var0.isPotionActive(Effects.field_19744)) {
         var4 = var0.method_26553(Effects.field_19744).method_10333();
      }

      return Math.max(var3, var4);
   }

   public static boolean method_6890(LivingEntity var0) {
      return var0.isPotionActive(Effects.field_19720) || var0.isPotionActive(Effects.field_19744);
   }
}
