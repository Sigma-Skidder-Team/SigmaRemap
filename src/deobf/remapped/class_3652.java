package remapped;

public final class class_3652 implements class_3471, class_2019 {
   private static String[] field_17795;

   private class_3652() {
   }

   public static void method_16980(class_4444 var0, float[] var1, float[] var2) {
      class_9143 var5 = var0.method_20608();
      class_2568 var6 = var5.method_42072();
      int[] var7 = var6.method_11674();
      int var8 = var6.method_11670();
      int var9 = var6.method_11671();
      int[] var10 = var5.method_42067();
      int[] var11 = var0.method_20607().method_42067();
      int var12 = 0;
      int var13 = 0;

      for (int var14 = 0; var14 < var8; var14++) {
         for (int var15 = 0; var15 < var9; var13++) {
            if (var0.method_20606(var13) && var10[var13] < 13 && var11[var13] < 13) {
               for (int var16 = 0; var16 < var6.method_11665(var14); var16++) {
                  int var17 = var12 + var16 * 128 + var7[var15];

                  for (int var18 = 0; var18 < var7[var15 + 1] - var7[var15]; var18++) {
                     float var19 = var1[var17 + var18] - var2[var17 + var18];
                     var1[var17 + var18] = var1[var17 + var18] + var2[var17 + var18];
                     var2[var17 + var18] = var19;
                  }
               }
            }

            var15++;
         }

         var12 += var6.method_11665(var14) * 128;
      }
   }
}
