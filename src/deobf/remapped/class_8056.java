package remapped;

import java.math.BigDecimal;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;

public class class_8056 {
   public static final double field_41235 = Double.longBitsToDouble(4368491638549381120L);
   public static final double field_41236 = Double.longBitsToDouble(4503599627370496L);
   private static final long field_41245 = 1023L;
   private static final long field_41239 = Long.MIN_VALUE;
   private static final int field_41243 = Integer.MIN_VALUE;
   private static final double field_41240 = 0.0;
   private static final long field_41242 = Double.doubleToRawLongBits(0.0);
   private static final long field_41244 = Double.doubleToRawLongBits(-0.0);
   private static final int field_41241 = Float.floatToRawIntBits(0.0F);
   private static final int field_41238 = Float.floatToRawIntBits(-0.0F);

   private class_8056() {
   }

   public static int method_36543(double var0, double var2, double var4) {
      if (!equals(var0, var2, var4)) {
         return !(var0 < var2) ? 1 : -1;
      } else {
         return 0;
      }
   }

   public static int method_36544(double var0, double var2, int var4) {
      if (!equals(var0, var2, var4)) {
         return !(var0 < var2) ? 1 : -1;
      } else {
         return 0;
      }
   }

   public static boolean equals(float var0, float var1) {
      return equals(var0, var1, 1);
   }

   public static boolean method_36537(float var0, float var1) {
      return var0 == var0 && var1 == var1 ? equals(var0, var1, 1) : !(var0 != var0 ^ var1 != var1);
   }

   public static boolean equals(float var0, float var1, float var2) {
      return equals(var0, var1, 1) || class_6806.method_31179(var1 - var0) <= var2;
   }

   public static boolean method_36538(float var0, float var1, float var2) {
      return method_36537(var0, var1) || class_6806.method_31179(var1 - var0) <= var2;
   }

   public static boolean equals(float var0, float var1, int var2) {
      int var5 = Float.floatToRawIntBits(var0);
      int var6 = Float.floatToRawIntBits(var1);
      boolean var9;
      if (((var5 ^ var6) & -2147483648) != 0) {
         int var7;
         int var8;
         if (var5 >= var6) {
            var7 = var5 - field_41241;
            var8 = var6 - field_41238;
         } else {
            var7 = var6 - field_41241;
            var8 = var5 - field_41238;
         }

         if (var7 <= var2) {
            var9 = var8 <= var2 - var7;
         } else {
            var9 = false;
         }
      } else {
         var9 = class_6806.method_31180(var5 - var6) <= var2;
      }

      return var9 && !Float.isNaN(var0) && !Float.isNaN(var1);
   }

   public static boolean method_36539(float var0, float var1, int var2) {
      return var0 == var0 && var1 == var1 ? equals(var0, var1, var2) : !(var0 != var0 ^ var1 != var1);
   }

   public static boolean equals(double var0, double var2) {
      return equals(var0, var2, 1);
   }

   public static boolean method_36534(double var0, double var2) {
      return var0 == var0 && var2 == var2 ? equals(var0, var2, 1) : !(var0 != var0 ^ var2 != var2);
   }

   public static boolean equals(double var0, double var2, double var4) {
      return equals(var0, var2, 1) || class_6806.method_31178(var2 - var0) <= var4;
   }

   public static boolean method_36545(double var0, double var2, double var4) {
      if (!equals(var0, var2, 1)) {
         double var8 = class_6806.method_31156(class_6806.method_31178(var0), class_6806.method_31178(var2));
         double var10 = class_6806.method_31178((var0 - var2) / var8);
         return var10 <= var4;
      } else {
         return true;
      }
   }

   public static boolean method_36535(double var0, double var2, double var4) {
      return method_36534(var0, var2) || class_6806.method_31178(var2 - var0) <= var4;
   }

   public static boolean equals(double var0, double var2, int var4) {
      long var7 = Double.doubleToRawLongBits(var0);
      long var9 = Double.doubleToRawLongBits(var2);
      boolean var15;
      if (((var7 ^ var9) & Long.MIN_VALUE) != 0L) {
         long var11;
         long var13;
         if (var7 >= var9) {
            var11 = var7 - field_41242;
            var13 = var9 - field_41244;
         } else {
            var11 = var9 - field_41242;
            var13 = var7 - field_41244;
         }

         if (var11 <= (long)var4) {
            var15 = var13 <= (long)var4 - var11;
         } else {
            var15 = false;
         }
      } else {
         var15 = class_6806.method_31181(var7 - var9) <= (long)var4;
      }

      return var15 && !Double.isNaN(var0) && !Double.isNaN(var2);
   }

   public static boolean method_36536(double var0, double var2, int var4) {
      return var0 == var0 && var2 == var2 ? equals(var0, var2, var4) : !(var0 != var0 ^ var2 != var2);
   }

   public static double method_36530(double var0, int var2) {
      return method_36531(var0, var2, 4);
   }

   public static double method_36531(double var0, int var2, int var3) {
      try {
         double var6 = new BigDecimal(Double.toString(var0)).setScale(var2, var3).doubleValue();
         return var6 == 0.0 ? 0.0 * var0 : var6;
      } catch (NumberFormatException var9) {
         return Double.isInfinite(var0) ? var0 : Double.NaN;
      }
   }

   public static float method_36532(float var0, int var1) {
      return method_36533(var0, var1, 4);
   }

   public static float method_36533(float var0, int var1, int var2) throws MathArithmeticException, MathIllegalArgumentException {
      float var5 = class_6806.method_31188(1.0F, var0);
      float var6 = (float)class_6806.method_31238(10.0, var1) * var5;
      return (float)method_36540((double)(var0 * var6), (double)var5, var2) / var6;
   }

   private static double method_36540(double var0, double var2, int var4) throws MathArithmeticException, MathIllegalArgumentException {
      switch (var4) {
         case 0:
            if (var0 != class_6806.method_31166(var0)) {
               var0 = class_6806.method_31211(class_6806.method_31221(var0, Double.POSITIVE_INFINITY));
            }
            break;
         case 1:
            var0 = class_6806.method_31166(class_6806.method_31221(var0, Double.NEGATIVE_INFINITY));
            break;
         case 2:
            if (var2 == -1.0) {
               var0 = class_6806.method_31166(class_6806.method_31221(var0, Double.NEGATIVE_INFINITY));
            } else {
               var0 = class_6806.method_31211(class_6806.method_31221(var0, Double.POSITIVE_INFINITY));
            }
            break;
         case 3:
            if (var2 == -1.0) {
               var0 = class_6806.method_31211(class_6806.method_31221(var0, Double.POSITIVE_INFINITY));
            } else {
               var0 = class_6806.method_31166(class_6806.method_31221(var0, Double.NEGATIVE_INFINITY));
            }
            break;
         case 4:
            var0 = class_6806.method_31221(var0, Double.POSITIVE_INFINITY);
            double var12 = var0 - class_6806.method_31166(var0);
            if (var12 >= 0.5) {
               var0 = class_6806.method_31211(var0);
            } else {
               var0 = class_6806.method_31166(var0);
            }
            break;
         case 5:
            var0 = class_6806.method_31221(var0, Double.NEGATIVE_INFINITY);
            double var11 = var0 - class_6806.method_31166(var0);
            if (var11 > 0.5) {
               var0 = class_6806.method_31211(var0);
            } else {
               var0 = class_6806.method_31166(var0);
            }
            break;
         case 6:
            double var7 = var0 - class_6806.method_31166(var0);
            if (var7 > 0.5) {
               var0 = class_6806.method_31211(var0);
            } else if (var7 < 0.5) {
               var0 = class_6806.method_31166(var0);
            } else if (class_6806.method_31166(var0) / 2.0 == class_6806.method_31166(class_6806.method_31166(var0) / 2.0)) {
               var0 = class_6806.method_31166(var0);
            } else {
               var0 = class_6806.method_31211(var0);
            }
            break;
         case 7:
            if (var0 != class_6806.method_31166(var0)) {
               throw new class_8040();
            }
            break;
         default:
            throw new class_4432(
               class_1023.field_5550,
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

   public static double method_36541(double var0, double var2) {
      return var0 + var2 - var0;
   }
}
