package mapped;

public final class Class6514 implements Class6515, Class6544, Class6513 {
   private static String[] field28528;

   private Class6514() {
   }

   public static void method19732(Class6527 var0, float[] var1, float[] var2) {
      Class6512 var5 = var0.method19793();
      Class6538 var6 = var5.method19720();
      int[] var7 = var6.method19868();
      int var8 = var6.method19871();
      int var9 = var6.method19866();
      int[] var10 = var5.method19722();
      int[] var11 = var5.method19721();
      float[] var12 = var5.method19723();
      int var13 = 0;
      int var14 = 0;

      for (int var15 = 0; var15 < var8; var15++) {
         int var16 = 0;

         while (var16 < var9) {
            if (var10[var13] != 15 && var10[var13] != 14) {
               int var23 = var11[var13];
               var13 += var23 - var16;
               var16 = var23;
            } else {
               for (int var17 = var11[var13]; var16 < var17; var13++) {
                  int var18 = var10[var13] != 15 ? -1 : 1;
                  if (var0.method19796()) {
                     var18 *= !var0.method19795(var13) ? 1 : -1;
                  }

                  float var19 = (float)var18 * var12[var13];

                  for (int var20 = 0; var20 < var6.method19872(var15); var20++) {
                     int var21 = var14 + var20 * 128 + var7[var16];

                     for (int var22 = 0; var22 < var7[var16 + 1] - var7[var16]; var22++) {
                        var2[var21 + var22] = var1[var21 + var22] * var19;
                     }
                  }

                  var16++;
               }
            }
         }

         var14 += var6.method19872(var15) * 128;
      }
   }
}
