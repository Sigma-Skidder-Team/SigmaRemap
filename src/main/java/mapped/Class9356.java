package mapped;

import java.math.BigDecimal;

public class Class9356 {
   public static final double field43414 = Double.longBitsToDouble(4368491638549381120L);
   public static final double field43415 = Double.longBitsToDouble(4503599627370496L);
   private static final long field43416 = 1023L;
   private static final long field43417 = Long.MIN_VALUE;
   private static final int field43418 = Integer.MIN_VALUE;
   private static final double field43419 = 0.0;
   private static final long field43420 = Double.doubleToRawLongBits(0.0);
   private static final long field43421 = Double.doubleToRawLongBits(-0.0);
   private static final int field43422 = Float.floatToRawIntBits(0.0F);
   private static final int field43423 = Float.floatToRawIntBits(-0.0F);

   private Class9356() {
   }

   public static int method35422(double var0, double var2, double var4) {
      if (!equals(var0, var2, var4)) {
         return !(var0 < var2) ? 1 : -1;
      } else {
         return 0;
      }
   }

   public static int method35423(double var0, double var2, int var4) {
      if (!equals(var0, var2, var4)) {
         return !(var0 < var2) ? 1 : -1;
      } else {
         return 0;
      }
   }

   public static boolean equals(float var0, float var1) {
      return equals(var0, var1, 1);
   }

   public static boolean method35424(float var0, float var1) {
      return var0 == var0 && var1 == var1 ? equals(var0, var1, 1) : !(var0 != var0 ^ var1 != var1);
   }

   public static boolean equals(float var0, float var1, float var2) {
      return equals(var0, var1, 1) || Class9044.method33590(var1 - var0) <= var2;
   }

   public static boolean method35425(float var0, float var1, float var2) {
      return method35424(var0, var1) || Class9044.method33590(var1 - var0) <= var2;
   }

   public static boolean equals(float var0, float var1, int var2) {
      int var5 = Float.floatToRawIntBits(var0);
      int var6 = Float.floatToRawIntBits(var1);
      boolean var9;
      if (((var5 ^ var6) & -2147483648) != 0) {
         int var7;
         int var8;
         if (var5 >= var6) {
            var7 = var5 - field43422;
            var8 = var6 - field43423;
         } else {
            var7 = var6 - field43422;
            var8 = var5 - field43423;
         }

         if (var7 <= var2) {
            var9 = var8 <= var2 - var7;
         } else {
            var9 = false;
         }
      } else {
         var9 = Class9044.method33588(var5 - var6) <= var2;
      }

      return var9 && !Float.isNaN(var0) && !Float.isNaN(var1);
   }

   public static boolean method35426(float var0, float var1, int var2) {
      return var0 == var0 && var1 == var1 ? equals(var0, var1, var2) : !(var0 != var0 ^ var1 != var1);
   }

   public static boolean equals(double var0, double var2) {
      return equals(var0, var2, 1);
   }

   public static boolean method35427(double var0, double var2) {
      return var0 == var0 && var2 == var2 ? equals(var0, var2, 1) : !(var0 != var0 ^ var2 != var2);
   }

   public static boolean equals(double var0, double var2, double var4) {
      return equals(var0, var2, 1) || Class9044.method33591(var2 - var0) <= var4;
   }

   public static boolean method35428(double var0, double var2, double var4) {
      if (!equals(var0, var2, 1)) {
         double var8 = Class9044.method33610(Class9044.method33591(var0), Class9044.method33591(var2));
         double var10 = Class9044.method33591((var0 - var2) / var8);
         return var10 <= var4;
      } else {
         return true;
      }
   }

   public static boolean method35429(double var0, double var2, double var4) {
      return method35427(var0, var2) || Class9044.method33591(var2 - var0) <= var4;
   }

   public static boolean equals(double var0, double var2, int var4) {
      long var7 = Double.doubleToRawLongBits(var0);
      long var9 = Double.doubleToRawLongBits(var2);
      boolean var15;
      if (((var7 ^ var9) & Long.MIN_VALUE) != 0L) {
         long var11;
         long var13;
         if (var7 >= var9) {
            var11 = var7 - field43420;
            var13 = var9 - field43421;
         } else {
            var11 = var9 - field43420;
            var13 = var7 - field43421;
         }

         if (var11 <= (long)var4) {
            var15 = var13 <= (long)var4 - var11;
         } else {
            var15 = false;
         }
      } else {
         var15 = Class9044.method33589(var7 - var9) <= (long)var4;
      }

      return var15 && !Double.isNaN(var0) && !Double.isNaN(var2);
   }

   public static boolean method35430(double var0, double var2, int var4) {
      return var0 == var0 && var2 == var2 ? equals(var0, var2, var4) : !(var0 != var0 ^ var2 != var2);
   }

   public static double method35431(double var0, int var2) {
      return method35432(var0, var2, 4);
   }

   public static double method35432(double var0, int var2, int var3) {
      try {
         double var6 = new BigDecimal(Double.toString(var0)).setScale(var2, var3).doubleValue();
         return var6 == 0.0 ? 0.0 * var0 : var6;
      } catch (NumberFormatException var9) {
         return Double.isInfinite(var0) ? var0 : Double.NaN;
      }
   }

   public static float method35433(float var0, int var1) {
      return method35434(var0, var1, 4);
   }

   public static float method35434(float var0, int var1, int var2) throws Class2492  {
      float var5 = Class9044.method33629(1.0F, var0);
      float var6 = (float)Class9044.method33570(10.0, var1) * var5;
      return (float)method35435((double)(var0 * var6), (double)var5, var2) / var6;
   }

   private static double method35435(double var0, double var2, int var4) throws Class2492  {
      switch (var4) {
         case 0:
            if (var0 != Class9044.method33598(var0)) {
               var0 = Class9044.method33599(Class9044.method33596(var0, Double.POSITIVE_INFINITY));
            }
            break;
         case 1:
            var0 = Class9044.method33598(Class9044.method33596(var0, Double.NEGATIVE_INFINITY));
            break;
         case 2:
            if (var2 == -1.0) {
               var0 = Class9044.method33598(Class9044.method33596(var0, Double.NEGATIVE_INFINITY));
            } else {
               var0 = Class9044.method33599(Class9044.method33596(var0, Double.POSITIVE_INFINITY));
            }
            break;
         case 3:
            if (var2 == -1.0) {
               var0 = Class9044.method33599(Class9044.method33596(var0, Double.POSITIVE_INFINITY));
            } else {
               var0 = Class9044.method33598(Class9044.method33596(var0, Double.NEGATIVE_INFINITY));
            }
            break;
         case 4:
            var0 = Class9044.method33596(var0, Double.POSITIVE_INFINITY);
            double var12 = var0 - Class9044.method33598(var0);
            if (var12 >= 0.5) {
               var0 = Class9044.method33599(var0);
            } else {
               var0 = Class9044.method33598(var0);
            }
            break;
         case 5:
            var0 = Class9044.method33596(var0, Double.NEGATIVE_INFINITY);
            double var11 = var0 - Class9044.method33598(var0);
            if (var11 > 0.5) {
               var0 = Class9044.method33599(var0);
            } else {
               var0 = Class9044.method33598(var0);
            }
            break;
         case 6:
            double var7 = var0 - Class9044.method33598(var0);
            if (var7 > 0.5) {
               var0 = Class9044.method33599(var0);
            } else if (var7 < 0.5) {
               var0 = Class9044.method33598(var0);
            } else if (Class9044.method33598(var0) / 2.0 == Class9044.method33598(Class9044.method33598(var0) / 2.0)) {
               var0 = Class9044.method33598(var0);
            } else {
               var0 = Class9044.method33599(var0);
            }
            break;
         case 7:
            if (var0 != Class9044.method33598(var0)) {
               throw new Class2492();
            }
            break;
         default:
            throw new Class2488(
               Class2297.field15475,
               var4,
               "ROUND_CEILING",
               2,
               "ROUND_DOWN",
               1,
               "ROUND_FLOOR",
               3,
               "ROUND_HALF_DOWN",
               5,
               "ROUND_HALF_EVEN",
               6,
               "ROUND_HALF_UP",
               4,
               "ROUND_UNNECESSARY",
               7,
               "ROUND_UP",
               0
            );
      }

      return var0;
   }

   public static double method35436(double var0, double var2) {
      return var0 + var2 - var0;
   }
}
