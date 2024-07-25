package remapped;

public class class_7967 {
   private static String[] field_40814;

   public static int method_36067(class_3511 var0) {
      class_1315[] var3 = var0.method_16174().method_27349();
      if (var3 != null) {
         int var4 = var0.method_16189().getY() >> 4;
         class_1315 var5 = var3[var4];
         return var5 != null ? var5.method_5991() : 0;
      } else {
         return 0;
      }
   }

   public static double method_36069(class_3511 var0) {
      int var3 = method_36067(var0);
      return method_36068(var3);
   }

   public static double method_36068(int var0) {
      double var3 = (double)var0 / 4096.0;
      var3 *= 0.995;
      double var5 = var3 * 2.0 - 1.0;
      var5 = MathHelper.clamp(var5, -1.0, 1.0);
      return (double) MathHelper.sqrt(1.0 - var5 * var5);
   }
}
