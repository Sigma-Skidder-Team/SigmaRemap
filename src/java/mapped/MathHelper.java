package mapped;

import java.util.Random;
import java.util.UUID;
import java.util.function.IntPredicate;
import org.apache.commons.lang3.math.NumberUtils;

public class MathHelper {
   public static final float field45205 = method37765(2.0F);
   private static final int field45206 = 12;
   private static final int field45207 = 4095;
   private static final int field45208 = 4096;
   private static final int field45209 = 1024;
   public static final float field45210 = Class7317.method23173(Math.PI);
   public static final float field45211 = Class7317.method23173(Math.PI * 2);
   public static final float field45212 = Class7317.method23173(Math.PI / 2);
   private static final float field45213 = Class7317.method23173(651.8986469044033);
   public static final float field45214 = Class7317.method23173(Math.PI / 180.0);
   private static final float[] field45215 = new float[4096];
   public static boolean field45216 = false;
   private static final float[] field45217 = Util.<float[]>method38508(new float[65536], var0 -> {
      for (int var3 = 0; var3 < var0.length; var3++) {
         var0[var3] = (float)Math.sin((double)var3 * Math.PI * 2.0 / 65536.0);
      }
   });
   private static final Random field45218 = new Random();
   private static final int[] field45219 = new int[]{
      0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9
   };
   private static final double field45220 = Double.longBitsToDouble(4805340802404319232L);
   private static final double[] field45221 = new double[257];
   private static final double[] field45222 = new double[257];

   public static float sin(float var0) {
      return !field45216 ? field45217[(int)(var0 * 10430.378F) & 65535] : field45215[(int)(var0 * field45213) & 4095];
   }

   public static float cos(float var0) {
      return !field45216 ? field45217[(int)(var0 * 10430.378F + 16384.0F) & 65535] : field45215[(int)(var0 * field45213 + 1024.0F) & 4095];
   }

   public static float method37765(float var0) {
      return (float)Math.sqrt((double)var0);
   }

   public static float method37766(double var0) {
      return (float)Math.sqrt(var0);
   }

   public static int method37767(float var0) {
      int var3 = (int)var0;
      return !(var0 < (float)var3) ? var3 : var3 - 1;
   }

   public static int method37768(double var0) {
      return (int)(var0 + 1024.0) - 1024;
   }

   public static int floor(double var0) {
      int var4 = (int)var0;
      return !(var0 < (double)var4) ? var4 : var4 - 1;
   }

   public static long method37770(double var0) {
      long var4 = (long)var0;
      return !(var0 < (double)var4) ? var4 : var4 - 1L;
   }

   public static float method37771(float var0) {
      return Math.abs(var0);
   }

   public static int method37772(int var0) {
      return Math.abs(var0);
   }

   public static int method37773(float var0) {
      int var3 = (int)var0;
      return !(var0 > (float)var3) ? var3 : var3 + 1;
   }

   public static int method37774(double var0) {
      int var4 = (int)var0;
      return !(var0 > (double)var4) ? var4 : var4 + 1;
   }

   public static int method37775(int var0, int var1, int var2) {
      if (var0 >= var1) {
         return Math.min(var0, var2);
      } else {
         return var1;
      }
   }

   public static long method37776(long var0, long var2, long var4) {
      if (var0 >= var2) {
         return Math.min(var0, var4);
      } else {
         return var2;
      }
   }

   public static float method37777(float var0, float var1, float var2) {
      if (!(var0 < var1)) {
         return !(var0 > var2) ? var0 : var2;
      } else {
         return var1;
      }
   }

   public static double method37778(double var0, double var2, double var4) {
      if (!(var0 < var2)) {
         return !(var0 > var4) ? var0 : var4;
      } else {
         return var2;
      }
   }

   public static double method37779(double var0, double var2, double var4) {
      if (!(var4 < 0.0)) {
         return !(var4 > 1.0) ? method37822(var4, var0, var2) : var2;
      } else {
         return var0;
      }
   }

   public static double method37780(double var0, double var2) {
      if (var0 < 0.0) {
         var0 = -var0;
      }

      if (var2 < 0.0) {
         var2 = -var2;
      }

      return !(var0 > var2) ? var2 : var0;
   }

   public static int method37781(int var0, int var1) {
      return Math.floorDiv(var0, var1);
   }

   public static int method37782(Random var0, int var1, int var2) {
      return var1 < var2 ? var0.nextInt(var2 - var1 + 1) + var1 : var1;
   }

   public static float method37783(Random var0, float var1, float var2) {
      return !(var1 >= var2) ? var0.nextFloat() * (var2 - var1) + var1 : var1;
   }

   public static double method37784(Random var0, double var1, double var3) {
      return !(var1 >= var3) ? var0.nextDouble() * (var3 - var1) + var1 : var1;
   }

   public static double method37785(long[] var0) {
      long var3 = 0L;

      for (long var8 : var0) {
         var3 += var8;
      }

      return (double)var3 / (double)var0.length;
   }

   public static boolean method37786(float var0, float var1) {
      return Math.abs(var1 - var0) < 1.0E-5F;
   }

   public static boolean method37787(double var0, double var2) {
      return Math.abs(var2 - var0) < 1.0E-5F;
   }

   public static int normalizeAngle(int var0, int var1) {
      return Math.floorMod(var0, var1);
   }

   public static float method37789(float var0, float var1) {
      return (var0 % var1 + var1) % var1;
   }

   public static double method37790(double var0, double var2) {
      return (var0 % var2 + var2) % var2;
   }

   public static int method37791(int var0) {
      int var3 = var0 % 360;
      if (var3 >= 180) {
         var3 -= 360;
      }

      if (var3 < -180) {
         var3 += 360;
      }

      return var3;
   }

   public static float method37792(float var0) {
      float var3 = var0 % 360.0F;
      if (var3 >= 180.0F) {
         var3 -= 360.0F;
      }

      if (var3 < -180.0F) {
         var3 += 360.0F;
      }

      return var3;
   }

   public static double method37793(double var0) {
      double var4 = var0 % 360.0;
      if (var4 >= 180.0) {
         var4 -= 360.0;
      }

      if (var4 < -180.0) {
         var4 += 360.0;
      }

      return var4;
   }

   public static float method37794(float var0, float var1) {
      return method37792(var1 - var0);
   }

   public static float method37795(float var0, float var1) {
      return method37771(method37794(var0, var1));
   }

   public static float method37796(float var0, float var1, float var2) {
      float var5 = method37794(var0, var1);
      float var6 = method37777(var5, -var2, var2);
      return var1 - var6;
   }

   public static float method37797(float var0, float var1, float var2) {
      var2 = method37771(var2);
      return !(var0 < var1) ? method37777(var0 - var2, var1, var0) : method37777(var0 + var2, var0, var1);
   }

   public static float method37798(float var0, float var1, float var2) {
      float var5 = method37794(var0, var1);
      return method37797(var0, var0 + var5, var2);
   }

   public static int method37799(String var0, int var1) {
      return NumberUtils.toInt(var0, var1);
   }

   public static int method37800(int var0) {
      int var3 = var0 - 1;
      var3 |= var3 >> 1;
      var3 |= var3 >> 2;
      var3 |= var3 >> 4;
      var3 |= var3 >> 8;
      var3 |= var3 >> 16;
      return var3 + 1;
   }

   public static boolean method37801(int var0) {
      return var0 != 0 && (var0 & var0 - 1) == 0;
   }

   public static int method37802(int var0) {
      var0 = !method37801(var0) ? method37800(var0) : var0;
      return field45219[(int)((long)var0 * 125613361L >> 27) & 31];
   }

   public static int method37803(int var0) {
      return method37802(var0) - (!method37801(var0) ? 1 : 0);
   }

   public static int method37804(int var0, int var1) {
      if (var1 != 0) {
         if (var0 != 0) {
            if (var0 < 0) {
               var1 *= -1;
            }

            int var4 = var0 % var1;
            return var4 != 0 ? var0 + var1 - var4 : var0;
         } else {
            return var1;
         }
      } else {
         return 0;
      }
   }

   public static int method37805(float var0, float var1, float var2) {
      return method37806(method37767(var0 * 255.0F), method37767(var1 * 255.0F), method37767(var2 * 255.0F));
   }

   public static int method37806(int var0, int var1, int var2) {
      int var5 = (var0 << 8) + var1;
      return (var5 << 8) + var2;
   }

   public static float method37807(float var0) {
      return var0 - (float)method37767(var0);
   }

   public static double method37808(double var0) {
      return var0 - (double)method37770(var0);
   }

   public static long method37809(Class1998 var0) {
      return method37810(var0.getX(), var0.getY(), var0.getZ());
   }

   public static long method37810(int var0, int var1, int var2) {
      long var5 = (long)(var0 * 3129871) ^ (long)var2 * 116129781L ^ (long)var1;
      var5 = var5 * var5 * 42317861L + var5 * 11L;
      return var5 >> 16;
   }

   public static UUID method37811(Random var0) {
      long var3 = var0.nextLong() & -61441L | 16384L;
      long var5 = var0.nextLong() & 4611686018427387903L | Long.MIN_VALUE;
      return new UUID(var3, var5);
   }

   public static UUID method37812() {
      return method37811(field45218);
   }

   public static double method37813(double var0, double var2, double var4) {
      return (var0 - var2) / (var4 - var2);
   }

   public static double method37814(double var0, double var2) {
      double var6 = var2 * var2 + var0 * var0;
      if (!Double.isNaN(var6)) {
         boolean var8 = var0 < 0.0;
         if (var8) {
            var0 = -var0;
         }

         boolean var9 = var2 < 0.0;
         if (var9) {
            var2 = -var2;
         }

         boolean var10 = var0 > var2;
         if (var10) {
            double var11 = var2;
            var2 = var0;
            var0 = var11;
         }

         double var30 = method37816(var6);
         var2 *= var30;
         var0 *= var30;
         double var13 = field45220 + var0;
         int var15 = (int)Double.doubleToRawLongBits(var13);
         double var16 = field45221[var15];
         double var18 = field45222[var15];
         double var20 = var13 - field45220;
         double var22 = var0 * var18 - var2 * var20;
         double var24 = (6.0 + var22 * var22) * var22 * 0.16666666666666666;
         double var26 = var16 + var24;
         if (var10) {
            var26 = (Math.PI / 2) - var26;
         }

         if (var9) {
            var26 = Math.PI - var26;
         }

         if (var8) {
            var26 = -var26;
         }

         return var26;
      } else {
         return Double.NaN;
      }
   }

   public static float method37815(float var0) {
      float var3 = 0.5F * var0;
      int var4 = Float.floatToIntBits(var0);
      var4 = 1597463007 - (var4 >> 1);
      var0 = Float.intBitsToFloat(var4);
      return var0 * (1.5F - var3 * var0 * var0);
   }

   public static double method37816(double var0) {
      double var4 = 0.5 * var0;
      long var6 = Double.doubleToRawLongBits(var0);
      var6 = 6910469410427058090L - (var6 >> 1);
      var0 = Double.longBitsToDouble(var6);
      return var0 * (1.5 - var4 * var0 * var0);
   }

   public static float method37817(float var0) {
      int var3 = Float.floatToIntBits(var0);
      var3 = 1419967116 - var3 / 3;
      float var4 = Float.intBitsToFloat(var3);
      var4 = 0.6666667F * var4 + 1.0F / (3.0F * var4 * var4 * var0);
      return 0.6666667F * var4 + 1.0F / (3.0F * var4 * var4 * var0);
   }

   public static int method37818(float var0, float var1, float var2) {
      int var5 = (int)(var0 * 6.0F) % 6;
      float var6 = var0 * 6.0F - (float)var5;
      float var7 = var2 * (1.0F - var1);
      float var8 = var2 * (1.0F - var6 * var1);
      float var9 = var2 * (1.0F - (1.0F - var6) * var1);
      float var10;
      float var11;
      float var12;
      switch (var5) {
         case 0:
            var10 = var2;
            var11 = var9;
            var12 = var7;
            break;
         case 1:
            var10 = var8;
            var11 = var2;
            var12 = var7;
            break;
         case 2:
            var10 = var7;
            var11 = var2;
            var12 = var9;
            break;
         case 3:
            var10 = var7;
            var11 = var8;
            var12 = var2;
            break;
         case 4:
            var10 = var9;
            var11 = var7;
            var12 = var2;
            break;
         case 5:
            var10 = var2;
            var11 = var7;
            var12 = var8;
            break;
         default:
            throw new RuntimeException("Something went wrong when converting from HSV to RGB. Input was " + var0 + ", " + var1 + ", " + var2);
      }

      int var13 = method37775((int)(var10 * 255.0F), 0, 255);
      int var14 = method37775((int)(var11 * 255.0F), 0, 255);
      int var15 = method37775((int)(var12 * 255.0F), 0, 255);
      return var13 << 16 | var14 << 8 | var15;
   }

   public static int method37819(int var0) {
      var0 ^= var0 >>> 16;
      var0 *= -2048144789;
      var0 ^= var0 >>> 13;
      var0 *= -1028477387;
      return var0 ^ var0 >>> 16;
   }

   public static int method37820(int var0, int var1, IntPredicate var2) {
      int var5 = var1 - var0;

      while (var5 > 0) {
         int var6 = var5 / 2;
         int var7 = var0 + var6;
         if (!var2.test(var7)) {
            var0 = var7 + 1;
            var5 -= var6 + 1;
         } else {
            var5 = var6;
         }
      }

      return var0;
   }

   public static float method37821(float var0, float var1, float var2) {
      return var1 + var0 * (var2 - var1);
   }

   public static double method37822(double var0, double var2, double var4) {
      return var2 + var0 * (var4 - var2);
   }

   public static double method37823(double var0, double var2, double var4, double var6, double var8, double var10) {
      return method37822(var2, method37822(var0, var4, var6), method37822(var0, var8, var10));
   }

   public static double method37824(
      double var0, double var2, double var4, double var6, double var8, double var10, double var12, double var14, double var16, double var18, double var20
   ) {
      return method37822(var4, method37823(var0, var2, var6, var8, var10, var12), method37823(var0, var2, var14, var16, var18, var20));
   }

   public static double method37825(double var0) {
      return var0 * var0 * var0 * (var0 * (var0 * 6.0 - 15.0) + 10.0);
   }

   public static int method37826(double var0) {
      if (var0 != 0.0) {
         return !(var0 > 0.0) ? -1 : 1;
      } else {
         return 0;
      }
   }

   public static float method37827(float var0, float var1, float var2) {
      return var1 + var0 * method37792(var2 - var1);
   }

   @Deprecated
   public static float method37828(float var0, float var1, float var2) {
      float var5 = var1 - var0;

      while (var5 < -180.0F) {
         var5 += 360.0F;
      }

      while (var5 >= 180.0F) {
         var5 -= 360.0F;
      }

      return var0 + var2 * var5;
   }

   @Deprecated
   public static float method37829(double var0) {
      while (var0 >= 180.0) {
         var0 -= 360.0;
      }

      while (var0 < -180.0) {
         var0 += 360.0;
      }

      return (float)var0;
   }

   public static float method37830(float var0, float var1) {
      return (Math.abs(var0 % var1 - var1 * 0.5F) - var1 * 0.25F) / (var1 * 0.25F);
   }

   public static float method37831(float var0) {
      return var0 * var0;
   }

   static {
      for (int var4 = 0; var4 < 257; var4++) {
         double var7 = (double)var4 / 256.0;
         double var9 = Math.asin(var7);
         field45222[var4] = Math.cos(var9);
         field45221[var4] = var9;
      }

      for (int var11 = 0; var11 < field45215.length; var11++) {
         field45215[var11] = Class7317.method23173(Math.sin((double)var11 * Math.PI * 2.0 / 4096.0));
      }
   }
}
