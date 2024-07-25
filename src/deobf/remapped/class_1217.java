package remapped;

public class class_1217 {
   private static String[] field_6759;
   private static final float[] field_6760 = Util.<float[]>make(new float[256], var0 -> {
      for (int var3 = 0; var3 < var0.length; var3++) {
         var0[var3] = (float)Math.pow((double)((float)var3 / 255.0F), 2.2);
      }
   });

   public static class_5797[] method_5396(class_5797 var0, int var1) {
      class_5797[] var4 = new class_5797[var1 + 1];
      var4[0] = var0;
      if (var1 > 0) {
         boolean var5 = false;

         for (int var6 = 1; var6 <= var1; var6++) {
            class_5797 var7 = var4[var6 - 1];
            class_5797 var8 = new class_5797(var7.method_26228() >> 1, var7.method_26253() >> 1, false);
            int var9 = var8.method_26228();
            int var10 = var8.method_26253();

            for (int var11 = 0; var11 < var9; var11++) {
               for (int var12 = 0; var12 < var10; var12++) {
                  var8.method_26242(
                     var11,
                     var12,
                     method_5399(
                        var7.method_26252(var11 * 2 + 0, var12 * 2 + 0),
                        var7.method_26252(var11 * 2 + 1, var12 * 2 + 0),
                        var7.method_26252(var11 * 2 + 0, var12 * 2 + 1),
                        var7.method_26252(var11 * 2 + 1, var12 * 2 + 1),
                        var5
                     )
                  );
               }
            }

            var4[var6] = var8;
         }
      }

      return var4;
   }

   private static int method_5399(int var0, int var1, int var2, int var3, boolean var4) {
      return class_8678.method_39858(var0, var1, var2, var3);
   }

   private static int method_5398(int var0, int var1, int var2, int var3, int var4) {
      float var7 = method_5397(var0 >> var4);
      float var8 = method_5397(var1 >> var4);
      float var9 = method_5397(var2 >> var4);
      float var10 = method_5397(var3 >> var4);
      float var11 = (float)((double)((float)Math.pow((double)(var7 + var8 + var9 + var10) * 0.25, 0.45454545454545453)));
      return (int)((double)var11 * 255.0);
   }

   private static float method_5397(int var0) {
      return field_6760[var0 & 0xFF];
   }
}
