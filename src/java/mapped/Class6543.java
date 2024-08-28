package mapped;

public final class Class6543 implements Class6515, Class6513 {
   private static String[] field28903;

   private Class6543() {
   }

   public static void method19890(Class6527 var0, float[] var1, float[] var2) {
      Class6512 var5 = var0.method19792();
      Class6538 var6 = var5.method19720();
      int[] var7 = var6.method19868();
      int var8 = var6.method19871();
      int var9 = var6.method19866();
      int[] var10 = var5.method19722();
      int[] var11 = var0.method19793().method19722();
      int var12 = 0;
      int var13 = 0;

      for (int var14 = 0; var14 < var8; var14++) {
         for (int var15 = 0; var15 < var9; var13++) {
            if (var0.method19795(var13) && var10[var13] < 13 && var11[var13] < 13) {
               for (int var16 = 0; var16 < var6.method19872(var14); var16++) {
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

         var12 += var6.method19872(var14) * 128;
      }
   }
}
