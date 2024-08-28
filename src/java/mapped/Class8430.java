package mapped;

import javax.annotation.Nonnull;

public class Class8430 {
   private static String[] field36122;
   private static final double[] field36123 = new double[]{0.0, 1.0, 4.0, 6.0, 4.0, 1.0, 0.0};

   @Nonnull
   public static Vector3d method29626(Vector3d var0, Class9132 var1) {
      int var4 = Class9679.method37769(var0.method11320());
      int var5 = Class9679.method37769(var0.method11321());
      int var6 = Class9679.method37769(var0.method11322());
      double var7 = var0.method11320() - (double)var4;
      double var9 = var0.method11321() - (double)var5;
      double var11 = var0.method11322() - (double)var6;
      double var13 = 0.0;
      Vector3d var15 = Vector3d.field18047;

      for (int var16 = 0; var16 < 6; var16++) {
         double var17 = Class9679.method37822(var7, field36123[var16 + 1], field36123[var16]);
         int var19 = var4 - 2 + var16;

         for (int var20 = 0; var20 < 6; var20++) {
            double var21 = Class9679.method37822(var9, field36123[var20 + 1], field36123[var20]);
            int var23 = var5 - 2 + var20;

            for (int var24 = 0; var24 < 6; var24++) {
               double var25 = Class9679.method37822(var11, field36123[var24 + 1], field36123[var24]);
               int var27 = var6 - 2 + var24;
               double var28 = var17 * var21 * var25;
               var13 += var28;
               var15 = var15.method11338(var1.method34078(var19, var23, var27).method11344(var28));
            }
         }
      }

      return var15.method11344(1.0 / var13);
   }
}
