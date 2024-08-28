package mapped;

public class Class6977 {
   private static String[] field30191;
   private static final float[] field30192 = Util.<float[]>method38508(new float[256], var0 -> {
      for (int var3 = 0; var3 < var0.length; var3++) {
         var0[var3] = (float)Math.pow((double)((float)var3 / 255.0F), 2.2);
      }
   });

   public static Class1806[] method21536(Class1806 var0, int var1) {
      Class1806[] var4 = new Class1806[var1 + 1];
      var4[0] = var0;
      if (var1 > 0) {
         boolean var5 = false;

         for (int var6 = 1; var6 <= var1; var6++) {
            Class1806 var7 = var4[var6 - 1];
            Class1806 var8 = new Class1806(var7.method7886() >> 1, var7.method7887() >> 1, false);
            int var9 = var8.method7886();
            int var10 = var8.method7887();

            for (int var11 = 0; var11 < var9; var11++) {
               for (int var12 = 0; var12 < var10; var12++) {
                  var8.method7890(
                     var11,
                     var12,
                     method21537(
                        var7.method7889(var11 * 2 + 0, var12 * 2 + 0),
                        var7.method7889(var11 * 2 + 1, var12 * 2 + 0),
                        var7.method7889(var11 * 2 + 0, var12 * 2 + 1),
                        var7.method7889(var11 * 2 + 1, var12 * 2 + 1),
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

   private static int method21537(int var0, int var1, int var2, int var3, boolean var4) {
      return Class9513.method36759(var0, var1, var2, var3);
   }

   private static int method21538(int var0, int var1, int var2, int var3, int var4) {
      float var7 = method21539(var0 >> var4);
      float var8 = method21539(var1 >> var4);
      float var9 = method21539(var2 >> var4);
      float var10 = method21539(var3 >> var4);
      float var11 = (float)((double)((float)Math.pow((double)(var7 + var8 + var9 + var10) * 0.25, 0.45454545454545453)));
      return (int)((double)var11 * 255.0);
   }

   private static float method21539(int var0) {
      return field30192[var0 & 0xFF];
   }
}
