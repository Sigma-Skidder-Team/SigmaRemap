package remapped;

import java.util.Random;
import java.util.UUID;
import java.util.function.IntPredicate;

import org.apache.commons.lang3.math.NumberUtils;

public class MathHelper {
   public static final float SQRT_2 = sqrt(2.0F);
   private static final int SIN_BITS = 12;
   private static final int SIN_MASK = 4095;
   private static final int SIN_COUNT = 4096;
   private static final int SIN_COUNT_D4 = 1024;
   public static final float PI = MathUtils.roundToFloat(Math.PI);
   public static final float PI2 = MathUtils.roundToFloat(Math.PI * 2);
   public static final float PId2 = MathUtils.roundToFloat(Math.PI / 2);
   private static final float radToIndex = MathUtils.roundToFloat(651.8986469044033);
   public static final float deg2Rad = MathUtils.roundToFloat(Math.PI / 180.0);
   private static final float[] SIN_TABLE_FAST = new float[4096];
   public static boolean fastMath = false;
   private static final float[] SIN_TABLE = Util.<float[]>make(new float[65536], var0 -> {
      for (int var3 = 0; var3 < var0.length; var3++) {
         var0[var3] = (float)Math.sin((double)var3 * Math.PI * 2.0 / 65536.0);
      }
   });
   private static final Random RANDOM = new Random();
   private static final int[] MULTIPLY_DE_BRUIJN_BIT_POSITION = new int[]{
      0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9
   };
   private static final double FRAC_BIAS = Double.longBitsToDouble(4805340802404319232L);
   private static final double[] ASINE_TAB = new double[257];
   private static final double[] COS_TAB = new double[257];

   public static float sin(float var0) {
      return !fastMath ? SIN_TABLE[(int)(var0 * 10430.378F) & 65535] : SIN_TABLE_FAST[(int)(var0 * radToIndex) & 4095];
   }

   public static float cos(float var0) {
      return !fastMath ? SIN_TABLE[(int)(var0 * 10430.378F + 16384.0F) & 65535] : SIN_TABLE_FAST[(int)(var0 * radToIndex + 1024.0F) & 4095];
   }

   public static float sqrt(float var0) {
      return (float)Math.sqrt((double)var0);
   }

   public static float sqrt(double var0) {
      return (float)Math.sqrt(var0);
   }

   public static int floor(float var0) {
      int var3 = (int)var0;
      return !(var0 < (float)var3) ? var3 : var3 - 1;
   }

   public static int fastFloor(double var0) {
      return (int)(var0 + 1024.0) - 1024;
   }

   public static int floor(double var0) {
      int var4 = (int)var0;
      return !(var0 < (double)var4) ? var4 : var4 - 1;
   }

   public static long lfloor(double var0) {
      long var4 = (long)var0;
      return !(var0 < (double)var4) ? var4 : var4 - 1L;
   }

   public static float abs(float var0) {
      return Math.abs(var0);
   }

   public static int abs(int var0) {
      return Math.abs(var0);
   }

   public static int ceil(float var0) {
      int var3 = (int)var0;
      return !(var0 > (float)var3) ? var3 : var3 + 1;
   }

   public static int ceil(double var0) {
      int var4 = (int)var0;
      return !(var0 > (double)var4) ? var4 : var4 + 1;
   }

   public static int clamp(int var0, int var1, int var2) {
      if (var0 >= var1) {
         return var0 <= var2 ? var0 : var2;
      } else {
         return var1;
      }
   }

   public static long clamp(long var0, long var2, long var4) {
      if (var0 >= var2) {
         return var0 <= var4 ? var0 : var4;
      } else {
         return var2;
      }
   }

   public static float clamp(float var0, float var1, float var2) {
      if (!(var0 < var1)) {
         return !(var0 > var2) ? var0 : var2;
      } else {
         return var1;
      }
   }

   public static double clamp(double var0, double var2, double var4) {
      if (!(var0 < var2)) {
         return !(var0 > var4) ? var0 : var4;
      } else {
         return var2;
      }
   }

   public static double clampedLerp(double var0, double var2, double var4) {
      if (!(var4 < 0.0)) {
         return !(var4 > 1.0) ? lerp(var4, var0, var2) : var2;
      } else {
         return var0;
      }
   }

   public static double absMax(double var0, double var2) {
      if (var0 < 0.0) {
         var0 = -var0;
      }

      if (var2 < 0.0) {
         var2 = -var2;
      }

      return !(var0 > var2) ? var2 : var0;
   }

   public static int intFloorDiv(int var0, int var1) {
      return Math.floorDiv(var0, var1);
   }

   public static int nextInt(Random var0, int var1, int var2) {
      return var1 < var2 ? var0.nextInt(var2 - var1 + 1) + var1 : var1;
   }

   public static float nextFloat(Random var0, float var1, float var2) {
      return !(var1 >= var2) ? var0.nextFloat() * (var2 - var1) + var1 : var1;
   }

   public static double nextDouble(Random var0, double var1, double var3) {
      return !(var1 >= var3) ? var0.nextDouble() * (var3 - var1) + var1 : var1;
   }

   public static double average(long[] var0) {
      long var3 = 0L;

      for (long var8 : var0) {
         var3 += var8;
      }

      return (double)var3 / (double)var0.length;
   }

   public static boolean epsilonEquals(float var0, float var1) {
      return Math.abs(var1 - var0) < 1.0E-5F;
   }

   public static boolean epsilonEquals(double var0, double var2) {
      return Math.abs(var2 - var0) < 1.0E-5F;
   }

   public static int normalizeAngle(int var0, int var1) {
      return Math.floorMod(var0, var1);
   }

   public static float positiveModulo(float var0, float var1) {
      return (var0 % var1 + var1) % var1;
   }

   public static double positiveModulo(double var0, double var2) {
      return (var0 % var2 + var2) % var2;
   }

   public static int wrapDegrees(int var0) {
      int var3 = var0 % 360;
      if (var3 >= 180) {
         var3 -= 360;
      }

      if (var3 < -180) {
         var3 += 360;
      }

      return var3;
   }

   public static float wrapDegrees(float var0) {
      float var3 = var0 % 360.0F;
      if (var3 >= 180.0F) {
         var3 -= 360.0F;
      }

      if (var3 < -180.0F) {
         var3 += 360.0F;
      }

      return var3;
   }

   public static double wrapDegrees(double var0) {
      double var4 = var0 % 360.0;
      if (var4 >= 180.0) {
         var4 -= 360.0;
      }

      if (var4 < -180.0) {
         var4 += 360.0;
      }

      return var4;
   }

   public static float wrapSubtractDegrees(float var0, float var1) {
      return wrapDegrees(var1 - var0);
   }

   public static float degreesDifferenceAbs(float var0, float var1) {
      return abs(wrapSubtractDegrees(var0, var1));
   }

   public static float func_219800_b(float var0, float var1, float var2) {
      float var5 = wrapSubtractDegrees(var0, var1);
      float var6 = clamp(var5, -var2, var2);
      return var1 - var6;
   }

   public static float approach(float var0, float var1, float var2) {
      var2 = abs(var2);
      return !(var0 < var1) ? clamp(var0 - var2, var1, var0) : clamp(var0 + var2, var0, var1);
   }

   public static float approachDegrees(float var0, float var1, float var2) {
      float var5 = wrapSubtractDegrees(var0, var1);
      return approach(var0, var0 + var5, var2);
   }

   public static int getInt(String var0, int var1) {
      return NumberUtils.toInt(var0, var1);
   }

   public static int smallestEncompassingPowerOfTwo(int var0) {
      int var3 = var0 - 1;
      var3 |= var3 >> 1;
      var3 |= var3 >> 2;
      var3 |= var3 >> 4;
      var3 |= var3 >> 8;
      var3 |= var3 >> 16;
      return var3 + 1;
   }

   public static boolean isPowerOfTwo(int var0) {
      return var0 != 0 && (var0 & var0 - 1) == 0;
   }

   public static int log2DeBruijn(int var0) {
      var0 = !isPowerOfTwo(var0) ? smallestEncompassingPowerOfTwo(var0) : var0;
      return MULTIPLY_DE_BRUIJN_BIT_POSITION[(int)((long)var0 * 125613361L >> 27) & 31];
   }

   public static int log2(int var0) {
      return log2DeBruijn(var0) - (!isPowerOfTwo(var0) ? 1 : 0);
   }

   public static int roundUp(int var0, int var1) {
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

   public static int rgb(float var0, float var1, float var2) {
      return rgb(floor(var0 * 255.0F), floor(var1 * 255.0F), floor(var2 * 255.0F));
   }

   public static int rgb(int var0, int var1, int var2) {
      int var5 = (var0 << 8) + var1;
      return (var5 << 8) + var2;
   }

   public static float frac(float var0) {
      return var0 - (float) floor(var0);
   }

   public static double frac(double var0) {
      return var0 - (double) lfloor(var0);
   }

   public static long getPositionRandom(Vector3i var0) {
      return getCoordinateRandom(var0.getX(), var0.getY(), var0.getZ());
   }

   public static long getCoordinateRandom(int var0, int var1, int var2) {
      long var5 = (long)(var0 * 3129871) ^ (long)var2 * 116129781L ^ (long)var1;
      var5 = var5 * var5 * 42317861L + var5 * 11L;
      return var5 >> 16;
   }

   public static UUID getRandomUUID(Random var0) {
      long var3 = var0.nextLong() & -61441L | 16384L;
      long var5 = var0.nextLong() & 4611686018427387903L | Long.MIN_VALUE;
      return new UUID(var3, var5);
   }

   public static UUID getRandomUUID() {
      return getRandomUUID(RANDOM);
   }

   public static double func_233020_c_(double var0, double var2, double var4) {
      return (var0 - var2) / (var4 - var2);
   }

   public static double atan2(double var0, double var2) {
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

         double var30 = fastInvSqrt(var6);
         var2 *= var30;
         var0 *= var30;
         double var13 = FRAC_BIAS + var0;
         int var15 = (int)Double.doubleToRawLongBits(var13);
         double var16 = ASINE_TAB[var15];
         double var18 = COS_TAB[var15];
         double var20 = var13 - FRAC_BIAS;
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

   public static float fastInvSqrt(float var0) {
      float var3 = 0.5F * var0;
      int var4 = Float.floatToIntBits(var0);
      var4 = 1597463007 - (var4 >> 1);
      var0 = Float.intBitsToFloat(var4);
      return var0 * (1.5F - var3 * var0 * var0);
   }

   public static double fastInvSqrt(double var0) {
      double var4 = 0.5 * var0;
      long var6 = Double.doubleToRawLongBits(var0);
      var6 = 6910469410427058090L - (var6 >> 1);
      var0 = Double.longBitsToDouble(var6);
      return var0 * (1.5 - var4 * var0 * var0);
   }

   public static float fastInvCubeRoot(float var0) {
      int var3 = Float.floatToIntBits(var0);
      var3 = 1419967116 - var3 / 3;
      float var4 = Float.intBitsToFloat(var3);
      var4 = 0.6666667F * var4 + 1.0F / (3.0F * var4 * var4 * var0);
      return 0.6666667F * var4 + 1.0F / (3.0F * var4 * var4 * var0);
   }

   public static int hsvToRGB(float var0, float var1, float var2) {
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

      int var13 = clamp((int)(var10 * 255.0F), 0, 255);
      int var14 = clamp((int)(var11 * 255.0F), 0, 255);
      int var15 = clamp((int)(var12 * 255.0F), 0, 255);
      return var13 << 16 | var14 << 8 | var15;
   }

   public static int hash(int var0) {
      var0 ^= var0 >>> 16;
      var0 *= -2048144789;
      var0 ^= var0 >>> 13;
      var0 *= -1028477387;
      return var0 ^ var0 >>> 16;
   }

   public static int binarySearch(int var0, int var1, IntPredicate var2) {
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

   public static float lerp(float var0, float var1, float var2) {
      return var1 + var0 * (var2 - var1);
   }

   public static double lerp(double var0, double var2, double var4) {
      return var2 + var0 * (var4 - var2);
   }

   public static double lerp2(double var0, double var2, double var4, double var6, double var8, double var10) {
      return lerp(var2, lerp(var0, var4, var6), lerp(var0, var8, var10));
   }

   public static double lerp3(
      double var0, double var2, double var4, double var6, double var8, double var10, double var12, double var14, double var16, double var18, double var20
   ) {
      return lerp(var4, lerp2(var0, var2, var6, var8, var10, var12), lerp2(var0, var2, var14, var16, var18, var20));
   }

   public static double perlinFade(double var0) {
      return var0 * var0 * var0 * (var0 * (var0 * 6.0 - 15.0) + 10.0);
   }

   public static int signum(double var0) {
      if (var0 != 0.0) {
         return !(var0 > 0.0) ? -1 : 1;
      } else {
         return 0;
      }
   }

   public static float interpolateAngle(float var0, float var1, float var2) {
      return var1 + var0 * wrapDegrees(var2 - var1);
   }

   @Deprecated
   public static float rotLerp(float var0, float var1, float var2) {
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
   public static float rotWrap(double var0) {
      while (var0 >= 180.0) {
         var0 -= 360.0;
      }

      while (var0 < -180.0) {
         var0 += 360.0;
      }

      return (float)var0;
   }

   public static float func_233021_e_(float var0, float var1) {
      return (Math.abs(var0 % var1 - var1 * 0.5F) - var1 * 0.25F) / (var1 * 0.25F);
   }

   public static float squareFloat(float var0) {
      return var0 * var0;
   }

   static {
      for (int var4 = 0; var4 < 257; var4++) {
         double var7 = (double)var4 / 256.0;
         double var9 = Math.asin(var7);
         COS_TAB[var4] = Math.cos(var9);
         ASINE_TAB[var4] = var9;
      }

      for (int var11 = 0; var11 < SIN_TABLE_FAST.length; var11++) {
         SIN_TABLE_FAST[var11] = MathUtils.roundToFloat(Math.sin((double)var11 * Math.PI * 2.0 / 4096.0));
      }
   }
}
