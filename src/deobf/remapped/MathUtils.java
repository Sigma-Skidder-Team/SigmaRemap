package remapped;

public class MathUtils {
   private static String[] field_9007;
   public static final float field_9009 = (float) Math.PI;
   public static final float field_9008 = (float) (Math.PI * 2);
   public static final float field_9010 = (float) (Math.PI / 2);
   private static final float[] field_9011 = new float[65536];

   public static float method_7794(float var0) {
      return field_9011[(int)((double)(var0 + 1.0F) * 32767.5) & 65535];
   }

   public static float method_7796(float var0) {
      return (float) (Math.PI / 2) - field_9011[(int)((double)(var0 + 1.0F) * 32767.5) & 65535];
   }

   public static int method_7797(int[] var0) {
      if (var0.length > 0) {
         int var3 = method_7795(var0);
         return var3 / var0.length;
      } else {
         return 0;
      }
   }

   public static int method_7795(int[] var0) {
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

   public static int method_7802(int var0) {
      int var3 = MathHelper.smallestEncompassingPowerOfTwo(var0);
      return var0 != var3 ? var3 / 2 : var3;
   }

   public static boolean method_7799(float var0, float var1, float var2) {
      return Math.abs(var0 - var1) <= var2;
   }

   public static float method_7801(float var0) {
      return var0 * 180.0F / MathHelper.PI;
   }

   public static float method_7798(float var0) {
      return var0 / 180.0F * MathHelper.PI;
   }

   public static float roundToFloat(double var0) {
      return (float)((double)Math.round(var0 * 1.0E8) / 1.0E8);
   }

   public static double method_7806(BlockPos var0, double var1, double var3, double var5) {
      return method_7804((double)var0.getX(), (double)var0.getY(), (double)var0.getZ(), var1, var3, var5);
   }

   public static float method_7807(BlockPos var0, float var1, float var2, float var3) {
      return method_7805((float)var0.getX(), (float)var0.getY(), (float)var0.getZ(), var1, var2, var3);
   }

   public static double method_7804(double var0, double var2, double var4, double var6, double var8, double var10) {
      double var14 = var0 - var6;
      double var16 = var2 - var8;
      double var18 = var4 - var10;
      return var14 * var14 + var16 * var16 + var18 * var18;
   }

   public static float method_7805(float var0, float var1, float var2, float var3, float var4, float var5) {
      float var8 = var0 - var3;
      float var9 = var1 - var4;
      float var10 = var2 - var5;
      return var8 * var8 + var9 * var9 + var10 * var10;
   }

   public static class_8107 method_7800() {
      class_8107 var2 = new class_8107();
      var2.method_36817();
      return var2;
   }

   static {
      for (int var2 = 0; var2 < 65536; var2++) {
         field_9011[var2] = (float)Math.asin((double)var2 / 32767.5 - 1.0);
      }

      for (int var3 = -1; var3 < 2; var3++) {
         field_9011[(int)(((double)var3 + 1.0) * 32767.5) & 65535] = (float)Math.asin((double)var3);
      }
   }
}
