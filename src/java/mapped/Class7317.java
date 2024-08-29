package mapped;

public class Class7317 {
   private static String[] field31374;
   public static final float field31375 = (float) Math.PI;
   public static final float field31376 = (float) (Math.PI * 2);
   public static final float field31377 = (float) (Math.PI / 2);
   private static final float[] field31378 = new float[65536];

   public static float method23165(float var0) {
      return field31378[(int)((double)(var0 + 1.0F) * 32767.5) & 65535];
   }

   public static float method23166(float var0) {
      return (float) (Math.PI / 2) - field31378[(int)((double)(var0 + 1.0F) * 32767.5) & 65535];
   }

   public static int method23167(int[] var0) {
      if (var0.length > 0) {
         int var3 = method23168(var0);
         return var3 / var0.length;
      } else {
         return 0;
      }
   }

   public static int method23168(int[] var0) {
      if (var0.length <= 0) {
         return 0;
      } else {
         int var3 = 0;

         for (int var4 = 0; var4 < var0.length; var4++) {
            int var5 = var0[var4];
            var3 += var5;
         }

         return var3;
      }
   }

   public static int method23169(int var0) {
      int var3 = MathHelper.method37800(var0);
      return var0 != var3 ? var3 / 2 : var3;
   }

   public static boolean method23170(float var0, float var1, float var2) {
      return Math.abs(var0 - var1) <= var2;
   }

   public static float method23171(float var0) {
      return var0 * 180.0F / MathHelper.field45210;
   }

   public static float method23172(float var0) {
      return var0 / 180.0F * MathHelper.field45210;
   }

   public static float method23173(double var0) {
      return (float)((double)Math.round(var0 * 1.0E8) / 1.0E8);
   }

   public static double method23174(BlockPos var0, double var1, double var3, double var5) {
      return method23176((double)var0.getX(), (double)var0.getY(), (double)var0.getZ(), var1, var3, var5);
   }

   public static float method23175(BlockPos var0, float var1, float var2, float var3) {
      return method23177((float)var0.getX(), (float)var0.getY(), (float)var0.getZ(), var1, var2, var3);
   }

   public static double method23176(double var0, double var2, double var4, double var6, double var8, double var10) {
      double var14 = var0 - var6;
      double var16 = var2 - var8;
      double var18 = var4 - var10;
      return var14 * var14 + var16 * var16 + var18 * var18;
   }

   public static float method23177(float var0, float var1, float var2, float var3, float var4, float var5) {
      float var8 = var0 - var3;
      float var9 = var1 - var4;
      float var10 = var2 - var5;
      return var8 * var8 + var9 * var9 + var10 * var10;
   }

   public static Class9367 method23178() {
      Class9367 var2 = new Class9367();
      var2.method35503();
      return var2;
   }

   static {
      for (int var2 = 0; var2 < 65536; var2++) {
         field31378[var2] = (float)Math.asin((double)var2 / 32767.5 - 1.0);
      }

      for (int var3 = -1; var3 < 2; var3++) {
         field31378[(int)(((double)var3 + 1.0) * 32767.5) & 65535] = (float)Math.asin((double)var3);
      }
   }
}
