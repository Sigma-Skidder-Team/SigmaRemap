package mapped;

public class Class2020 implements Comparable<Class2020> {
   public static final Class2020 field13110 = new Class2020(0, 0, 0);
   public static final Class2020 field13111 = new Class2020(1, 0, 0);
   public static final Class2020 field13112 = new Class2020(0, 1, 0);
   public static final Class2020 field13113 = new Class2020(0, 0, 1);
   public static final Class2020 field13114 = new Class2020(1, 1, 1);
   public final double field13115;
   public final double field13116;
   public final double field13117;

   public Class2020(double var1, double var3, double var5) {
      this.field13115 = var1;
      this.field13116 = var3;
      this.field13117 = var5;
   }

   public Class2020(int var1, int var2, int var3) {
      this.field13115 = (double)var1;
      this.field13116 = (double)var2;
      this.field13117 = (double)var3;
   }

   public Class2020(float var1, float var2, float var3) {
      this.field13115 = (double)var1;
      this.field13116 = (double)var2;
      this.field13117 = (double)var3;
   }

   public Class2020(Class2020 var1) {
      this.field13115 = var1.field13115;
      this.field13116 = var1.field13116;
      this.field13117 = var1.field13117;
   }

   public Class2020() {
      this.field13115 = 0.0;
      this.field13116 = 0.0;
      this.field13117 = 0.0;
   }

   public double method8552() {
      return this.field13115;
   }

   public int method8553() {
      return (int)Math.round(this.field13115);
   }

   public Class2020 method8554(double var1) {
      return new Class2020(var1, this.field13116, this.field13117);
   }

   public Class2020 method8555(int var1) {
      return new Class2020((double)var1, this.field13116, this.field13117);
   }

   public double method8556() {
      return this.field13116;
   }

   public int method8557() {
      return (int)Math.round(this.field13116);
   }

   public Class2020 method8558(double var1) {
      return new Class2020(this.field13115, var1, this.field13117);
   }

   public Class2020 method8559(int var1) {
      return new Class2020(this.field13115, (double)var1, this.field13117);
   }

   public double method8560() {
      return this.field13117;
   }

   public int method8561() {
      return (int)Math.round(this.field13117);
   }

   public Class2020 method8562(double var1) {
      return new Class2020(this.field13115, this.field13116, var1);
   }

   public Class2020 method8563(int var1) {
      return new Class2020(this.field13115, this.field13116, (double)var1);
   }

   public Class2020 method8564(Class2020 var1) {
      return new Class2020(this.field13115 + var1.field13115, this.field13116 + var1.field13116, this.field13117 + var1.field13117);
   }

   public Class2020 method8565(double var1, double var3, double var5) {
      return new Class2020(this.field13115 + var1, this.field13116 + var3, this.field13117 + var5);
   }

   public Class2020 method8566(int var1, int var2, int var3) {
      return new Class2020(this.field13115 + (double)var1, this.field13116 + (double)var2, this.field13117 + (double)var3);
   }

   public Class2020 method8567(Class2020... var1) {
      double var4 = this.field13115;
      double var6 = this.field13116;
      double var8 = this.field13117;

      for (Class2020 var13 : var1) {
         var4 += var13.field13115;
         var6 += var13.field13116;
         var8 += var13.field13117;
      }

      return new Class2020(var4, var6, var8);
   }

   public Class2020 method8568(Class2020 var1) {
      return new Class2020(this.field13115 - var1.field13115, this.field13116 - var1.field13116, this.field13117 - var1.field13117);
   }

   public Class2020 method8569(double var1, double var3, double var5) {
      return new Class2020(this.field13115 - var1, this.field13116 - var3, this.field13117 - var5);
   }

   public Class2020 method8570(int var1, int var2, int var3) {
      return new Class2020(this.field13115 - (double)var1, this.field13116 - (double)var2, this.field13117 - (double)var3);
   }

   public Class2020 method8571(Class2020... var1) {
      double var4 = this.field13115;
      double var6 = this.field13116;
      double var8 = this.field13117;

      for (Class2020 var13 : var1) {
         var4 -= var13.field13115;
         var6 -= var13.field13116;
         var8 -= var13.field13117;
      }

      return new Class2020(var4, var6, var8);
   }

   public Class2020 method8572(Class2020 var1) {
      return new Class2020(this.field13115 * var1.field13115, this.field13116 * var1.field13116, this.field13117 * var1.field13117);
   }

   public Class2020 method8573(double var1, double var3, double var5) {
      return new Class2020(this.field13115 * var1, this.field13116 * var3, this.field13117 * var5);
   }

   public Class2020 method8574(int var1, int var2, int var3) {
      return new Class2020(this.field13115 * (double)var1, this.field13116 * (double)var2, this.field13117 * (double)var3);
   }

   public Class2020 method8575(Class2020... var1) {
      double var4 = this.field13115;
      double var6 = this.field13116;
      double var8 = this.field13117;

      for (Class2020 var13 : var1) {
         var4 *= var13.field13115;
         var6 *= var13.field13116;
         var8 *= var13.field13117;
      }

      return new Class2020(var4, var6, var8);
   }

   public Class2020 method8576(double var1) {
      return new Class2020(this.field13115 * var1, this.field13116 * var1, this.field13117 * var1);
   }

   public Class2020 method8577(float var1) {
      return new Class2020(this.field13115 * (double)var1, this.field13116 * (double)var1, this.field13117 * (double)var1);
   }

   public Class2020 method8578(int var1) {
      return new Class2020(this.field13115 * (double)var1, this.field13116 * (double)var1, this.field13117 * (double)var1);
   }

   public Class2020 method8579(Class2020 var1) {
      return new Class2020(this.field13115 / var1.field13115, this.field13116 / var1.field13116, this.field13117 / var1.field13117);
   }

   public Class2020 method8580(double var1, double var3, double var5) {
      return new Class2020(this.field13115 / var1, this.field13116 / var3, this.field13117 / var5);
   }

   public Class2020 method8581(int var1, int var2, int var3) {
      return new Class2020(this.field13115 / (double)var1, this.field13116 / (double)var2, this.field13117 / (double)var3);
   }

   public Class2020 method8582(int var1) {
      return new Class2020(this.field13115 / (double)var1, this.field13116 / (double)var1, this.field13117 / (double)var1);
   }

   public Class2020 method8583(double var1) {
      return new Class2020(this.field13115 / var1, this.field13116 / var1, this.field13117 / var1);
   }

   public Class2020 method8584(float var1) {
      return new Class2020(this.field13115 / (double)var1, this.field13116 / (double)var1, this.field13117 / (double)var1);
   }

   public double method8585() {
      return Math.sqrt(this.field13115 * this.field13115 + this.field13116 * this.field13116 + this.field13117 * this.field13117);
   }

   public double method8586() {
      return this.field13115 * this.field13115 + this.field13116 * this.field13116 + this.field13117 * this.field13117;
   }

   public double method8587(Class2020 var1) {
      return Math.sqrt(
         Math.pow(var1.field13115 - this.field13115, 2.0) + Math.pow(var1.field13116 - this.field13116, 2.0) + Math.pow(var1.field13117 - this.field13117, 2.0)
      );
   }

   public double method8588(Class2020 var1) {
      return Math.pow(var1.field13115 - this.field13115, 2.0)
         + Math.pow(var1.field13116 - this.field13116, 2.0)
         + Math.pow(var1.field13117 - this.field13117, 2.0);
   }

   public Class2020 method8589() {
      return this.method8583(this.method8585());
   }

   public double method8590(Class2020 var1) {
      return this.field13115 * var1.field13115 + this.field13116 * var1.field13116 + this.field13117 * var1.field13117;
   }

   public Class2020 method8591(Class2020 var1) {
      return new Class2020(
         this.field13116 * var1.field13117 - this.field13117 * var1.field13116,
         this.field13117 * var1.field13115 - this.field13115 * var1.field13117,
         this.field13115 * var1.field13116 - this.field13116 * var1.field13115
      );
   }

   public boolean method8592(Class2020 var1, Class2020 var2) {
      return this.field13115 >= var1.field13115
         && this.field13115 <= var2.field13115
         && this.field13116 >= var1.field13116
         && this.field13116 <= var2.field13116
         && this.field13117 >= var1.field13117
         && this.field13117 <= var2.field13117;
   }

   public boolean method8593(Class2020 var1, Class2020 var2) {
      return this.method8553() >= var1.method8553()
         && this.method8553() <= var2.method8553()
         && this.method8557() >= var1.method8557()
         && this.method8557() <= var2.method8557()
         && this.method8561() >= var1.method8561()
         && this.method8561() <= var2.method8561();
   }

   public Class2020 method8594(int var1, int var2) {
      return new Class2020(this.field13115, Math.max((double)var1, Math.min((double)var2, this.field13116)), this.field13117);
   }

   public Class2020 method8595() {
      return new Class2020(Math.floor(this.field13115), Math.floor(this.field13116), Math.floor(this.field13117));
   }

   public Class2020 method8596() {
      return new Class2020(Math.ceil(this.field13115), Math.ceil(this.field13116), Math.ceil(this.field13117));
   }

   public Class2020 method8597() {
      return new Class2020(Math.floor(this.field13115 + 0.5), Math.floor(this.field13116 + 0.5), Math.floor(this.field13117 + 0.5));
   }

   public Class2020 method8598() {
      return new Class2020(Math.abs(this.field13115), Math.abs(this.field13116), Math.abs(this.field13117));
   }

   public Class2020 method8599(double var1, double var3, double var5, double var7, double var9) {
      var1 = Math.toRadians(var1);
      double var13 = this.field13115 - var3;
      double var15 = this.field13117 - var5;
      double var17 = var13 * Math.cos(var1) - var15 * Math.sin(var1);
      double var19 = var13 * Math.sin(var1) + var15 * Math.cos(var1);
      return new Class2020(var17 + var3 + var7, this.field13116, var19 + var5 + var9);
   }

   public boolean method8600(Class2020 var1) {
      if (this.field13115 == 0.0 && this.field13116 == 0.0 && this.field13117 == 0.0) {
         return true;
      } else {
         double var4 = var1.field13115;
         double var6 = var1.field13116;
         double var8 = var1.field13117;
         if (var4 == 0.0 && var6 == 0.0 && var8 == 0.0) {
            return true;
         } else if (this.field13115 == 0.0 == (var4 == 0.0)) {
            if (this.field13116 == 0.0 == (var6 == 0.0)) {
               if (this.field13117 == 0.0 == (var8 == 0.0)) {
                  double var10 = var4 / this.field13115;
                  if (Double.isNaN(var10)) {
                     double var12 = var6 / this.field13116;
                     if (Double.isNaN(var12)) {
                        double var14 = var8 / this.field13117;
                        if (Double.isNaN(var14)) {
                           throw new RuntimeException("This should not happen");
                        } else {
                           return var1.equals(this.method8576(var14));
                        }
                     } else {
                        return var1.equals(this.method8576(var12));
                     }
                  } else {
                     return var1.equals(this.method8576(var10));
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   public float method8601() {
      double var3 = this.method8552();
      double var5 = this.method8560();
      if (var3 == 0.0 && var5 == 0.0) {
         return !(this.method8556() > 0.0) ? 90.0F : -90.0F;
      } else {
         double var7 = var3 * var3;
         double var9 = var5 * var5;
         double var11 = Math.sqrt(var7 + var9);
         return (float)Math.toDegrees(Math.atan(-this.method8556() / var11));
      }
   }

   public float method8602() {
      double var3 = this.method8552();
      double var5 = this.method8560();
      double var7 = Math.atan2(-var3, var5);
      double var9 = Math.PI * 2;
      return (float)Math.toDegrees((var7 + var9) % var9);
   }

   public static Class2021 method8603(double var0, double var2, double var4) {
      return new Class2021(Math.floor(var0), Math.floor(var2), Math.floor(var4));
   }

   public Class2021 method8604() {
      return new Class2021(Math.floor(this.field13115), Math.floor(this.field13116), Math.floor(this.field13117));
   }

   public Class2021 method8605() {
      return new Class2021(this);
   }

   public Class8828 method8606() {
      return new Class8828(this.field13115, this.field13117);
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Class2020)) {
         return false;
      } else {
         Class2020 var4 = (Class2020)var1;
         return var4.field13115 == this.field13115 && var4.field13116 == this.field13116 && var4.field13117 == this.field13117;
      }
   }

   public int compareTo(Class2020 var1) {
      if (var1 != null) {
         if (this.field13116 == var1.field13116) {
            if (this.field13117 == var1.field13117) {
               return this.field13115 == var1.field13115 ? 0 : Double.compare(this.field13115, var1.field13115);
            } else {
               return Double.compare(this.field13117, var1.field13117);
            }
         } else {
            return Double.compare(this.field13116, var1.field13116);
         }
      } else {
         throw new IllegalArgumentException("null not supported");
      }
   }

   @Override
   public int hashCode() {
      int var3 = 7;
      var3 = 79 * var3 + (int)(Double.doubleToLongBits(this.field13115) ^ Double.doubleToLongBits(this.field13115) >>> 32);
      var3 = 79 * var3 + (int)(Double.doubleToLongBits(this.field13116) ^ Double.doubleToLongBits(this.field13116) >>> 32);
      return 79 * var3 + (int)(Double.doubleToLongBits(this.field13117) ^ Double.doubleToLongBits(this.field13117) >>> 32);
   }

   @Override
   public String toString() {
      return "(" + this.field13115 + ", " + this.field13116 + ", " + this.field13117 + ")";
   }

   public static Class2020 method8607(Class2020 var0, Class2020 var1) {
      return new Class2020(Math.min(var0.field13115, var1.field13115), Math.min(var0.field13116, var1.field13116), Math.min(var0.field13117, var1.field13117));
   }

   public static Class2020 method8608(Class2020 var0, Class2020 var1) {
      return new Class2020(Math.max(var0.field13115, var1.field13115), Math.max(var0.field13116, var1.field13116), Math.max(var0.field13117, var1.field13117));
   }

   public static Class2020 method8609(Class2020 var0, Class2020 var1) {
      return new Class2020((var0.field13115 + var1.field13115) / 2.0, (var0.field13116 + var1.field13116) / 2.0, (var0.field13117 + var1.field13117) / 2.0);
   }
}
