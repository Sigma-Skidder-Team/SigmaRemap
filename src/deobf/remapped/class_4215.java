package remapped;

public class class_4215 implements Comparable<class_4215> {
   public static final class_4215 field_20472 = new class_4215(0, 0, 0);
   public static final class_4215 field_20467 = new class_4215(1, 0, 0);
   public static final class_4215 field_20475 = new class_4215(0, 1, 0);
   public static final class_4215 field_20471 = new class_4215(0, 0, 1);
   public static final class_4215 field_20469 = new class_4215(1, 1, 1);
   public final double field_20470;
   public final double field_20473;
   public final double field_20468;

   public class_4215(double var1, double var3, double var5) {
      this.field_20470 = var1;
      this.field_20473 = var3;
      this.field_20468 = var5;
   }

   public class_4215(int var1, int var2, int var3) {
      this.field_20470 = (double)var1;
      this.field_20473 = (double)var2;
      this.field_20468 = (double)var3;
   }

   public class_4215(float var1, float var2, float var3) {
      this.field_20470 = (double)var1;
      this.field_20473 = (double)var2;
      this.field_20468 = (double)var3;
   }

   public class_4215(class_4215 var1) {
      this.field_20470 = var1.field_20470;
      this.field_20473 = var1.field_20473;
      this.field_20468 = var1.field_20468;
   }

   public class_4215() {
      this.field_20470 = 0.0;
      this.field_20473 = 0.0;
      this.field_20468 = 0.0;
   }

   public double method_19594() {
      return this.field_20470;
   }

   public int method_19587() {
      return (int)Math.round(this.field_20470);
   }

   public class_4215 method_19619(double var1) {
      return new class_4215(var1, this.field_20473, this.field_20468);
   }

   public class_4215 method_19620(int var1) {
      return new class_4215((double)var1, this.field_20473, this.field_20468);
   }

   public double method_19634() {
      return this.field_20473;
   }

   public int method_19639() {
      return (int)Math.round(this.field_20473);
   }

   public class_4215 method_19609(double var1) {
      return new class_4215(this.field_20470, var1, this.field_20468);
   }

   public class_4215 method_19610(int var1) {
      return new class_4215(this.field_20470, (double)var1, this.field_20468);
   }

   public double method_19612() {
      return this.field_20468;
   }

   public int method_19638() {
      return (int)Math.round(this.field_20468);
   }

   public class_4215 method_19626(double var1) {
      return new class_4215(this.field_20470, this.field_20473, var1);
   }

   public class_4215 method_19627(int var1) {
      return new class_4215(this.field_20470, this.field_20473, (double)var1);
   }

   public class_4215 method_19632(class_4215 var1) {
      return new class_4215(this.field_20470 + var1.field_20470, this.field_20473 + var1.field_20473, this.field_20468 + var1.field_20468);
   }

   public class_4215 method_19630(double var1, double var3, double var5) {
      return new class_4215(this.field_20470 + var1, this.field_20473 + var3, this.field_20468 + var5);
   }

   public class_4215 method_19631(int var1, int var2, int var3) {
      return new class_4215(this.field_20470 + (double)var1, this.field_20473 + (double)var2, this.field_20468 + (double)var3);
   }

   public class_4215 method_19633(class_4215... var1) {
      double var4 = this.field_20470;
      double var6 = this.field_20473;
      double var8 = this.field_20468;

      for (class_4215 var13 : var1) {
         var4 += var13.field_20470;
         var6 += var13.field_20473;
         var8 += var13.field_20468;
      }

      return new class_4215(var4, var6, var8);
   }

   public class_4215 method_19598(class_4215 var1) {
      return new class_4215(this.field_20470 - var1.field_20470, this.field_20473 - var1.field_20473, this.field_20468 - var1.field_20468);
   }

   public class_4215 method_19596(double var1, double var3, double var5) {
      return new class_4215(this.field_20470 - var1, this.field_20473 - var3, this.field_20468 - var5);
   }

   public class_4215 method_19597(int var1, int var2, int var3) {
      return new class_4215(this.field_20470 - (double)var1, this.field_20473 - (double)var2, this.field_20468 - (double)var3);
   }

   public class_4215 method_19599(class_4215... var1) {
      double var4 = this.field_20470;
      double var6 = this.field_20473;
      double var8 = this.field_20468;

      for (class_4215 var13 : var1) {
         var4 -= var13.field_20470;
         var6 -= var13.field_20473;
         var8 -= var13.field_20468;
      }

      return new class_4215(var4, var6, var8);
   }

   public class_4215 method_19606(class_4215 var1) {
      return new class_4215(this.field_20470 * var1.field_20470, this.field_20473 * var1.field_20473, this.field_20468 * var1.field_20468);
   }

   public class_4215 method_19602(double var1, double var3, double var5) {
      return new class_4215(this.field_20470 * var1, this.field_20473 * var3, this.field_20468 * var5);
   }

   public class_4215 method_19605(int var1, int var2, int var3) {
      return new class_4215(this.field_20470 * (double)var1, this.field_20473 * (double)var2, this.field_20468 * (double)var3);
   }

   public class_4215 method_19607(class_4215... var1) {
      double var4 = this.field_20470;
      double var6 = this.field_20473;
      double var8 = this.field_20468;

      for (class_4215 var13 : var1) {
         var4 *= var13.field_20470;
         var6 *= var13.field_20473;
         var8 *= var13.field_20468;
      }

      return new class_4215(var4, var6, var8);
   }

   public class_4215 method_19601(double var1) {
      return new class_4215(this.field_20470 * var1, this.field_20473 * var1, this.field_20468 * var1);
   }

   public class_4215 method_19603(float var1) {
      return new class_4215(this.field_20470 * (double)var1, this.field_20473 * (double)var1, this.field_20468 * (double)var1);
   }

   public class_4215 method_19604(int var1) {
      return new class_4215(this.field_20470 * (double)var1, this.field_20473 * (double)var1, this.field_20468 * (double)var1);
   }

   public class_4215 method_19593(class_4215 var1) {
      return new class_4215(this.field_20470 / var1.field_20470, this.field_20473 / var1.field_20473, this.field_20468 / var1.field_20468);
   }

   public class_4215 method_19589(double var1, double var3, double var5) {
      return new class_4215(this.field_20470 / var1, this.field_20473 / var3, this.field_20468 / var5);
   }

   public class_4215 method_19592(int var1, int var2, int var3) {
      return new class_4215(this.field_20470 / (double)var1, this.field_20473 / (double)var2, this.field_20468 / (double)var3);
   }

   public class_4215 method_19591(int var1) {
      return new class_4215(this.field_20470 / (double)var1, this.field_20473 / (double)var1, this.field_20468 / (double)var1);
   }

   public class_4215 method_19588(double var1) {
      return new class_4215(this.field_20470 / var1, this.field_20473 / var1, this.field_20468 / var1);
   }

   public class_4215 method_19590(float var1) {
      return new class_4215(this.field_20470 / (double)var1, this.field_20473 / (double)var1, this.field_20468 / (double)var1);
   }

   public double method_19600() {
      return Math.sqrt(this.field_20470 * this.field_20470 + this.field_20473 * this.field_20473 + this.field_20468 * this.field_20468);
   }

   public double method_19614() {
      return this.field_20470 * this.field_20470 + this.field_20473 * this.field_20473 + this.field_20468 * this.field_20468;
   }

   public double method_19629(class_4215 var1) {
      return Math.sqrt(
         Math.pow(var1.field_20470 - this.field_20470, 2.0)
            + Math.pow(var1.field_20473 - this.field_20473, 2.0)
            + Math.pow(var1.field_20468 - this.field_20468, 2.0)
      );
   }

   public double method_19628(class_4215 var1) {
      return Math.pow(var1.field_20470 - this.field_20470, 2.0)
         + Math.pow(var1.field_20473 - this.field_20473, 2.0)
         + Math.pow(var1.field_20468 - this.field_20468, 2.0);
   }

   public class_4215 method_19641() {
      return this.method_19588(this.method_19600());
   }

   public double method_19621(class_4215 var1) {
      return this.field_20470 * var1.field_20470 + this.field_20473 * var1.field_20473 + this.field_20468 * var1.field_20468;
   }

   public class_4215 method_19636(class_4215 var1) {
      return new class_4215(
         this.field_20473 * var1.field_20468 - this.field_20468 * var1.field_20473,
         this.field_20468 * var1.field_20470 - this.field_20470 * var1.field_20468,
         this.field_20470 * var1.field_20473 - this.field_20473 * var1.field_20470
      );
   }

   public boolean method_19608(class_4215 var1, class_4215 var2) {
      return this.field_20470 >= var1.field_20470
         && this.field_20470 <= var2.field_20470
         && this.field_20473 >= var1.field_20473
         && this.field_20473 <= var2.field_20473
         && this.field_20468 >= var1.field_20468
         && this.field_20468 <= var2.field_20468;
   }

   public boolean method_19625(class_4215 var1, class_4215 var2) {
      return this.method_19587() >= var1.method_19587()
         && this.method_19587() <= var2.method_19587()
         && this.method_19639() >= var1.method_19639()
         && this.method_19639() <= var2.method_19639()
         && this.method_19638() >= var1.method_19638()
         && this.method_19638() <= var2.method_19638();
   }

   public class_4215 method_19618(int var1, int var2) {
      return new class_4215(this.field_20470, Math.max((double)var1, Math.min((double)var2, this.field_20473)), this.field_20468);
   }

   public class_4215 method_19617() {
      return new class_4215(Math.floor(this.field_20470), Math.floor(this.field_20473), Math.floor(this.field_20468));
   }

   public class_4215 method_19643() {
      return new class_4215(Math.ceil(this.field_20470), Math.ceil(this.field_20473), Math.ceil(this.field_20468));
   }

   public class_4215 method_19635() {
      return new class_4215(Math.floor(this.field_20470 + 0.5), Math.floor(this.field_20473 + 0.5), Math.floor(this.field_20468 + 0.5));
   }

   public class_4215 method_19595() {
      return new class_4215(Math.abs(this.field_20470), Math.abs(this.field_20473), Math.abs(this.field_20468));
   }

   public class_4215 method_19622(double var1, double var3, double var5, double var7, double var9) {
      var1 = Math.toRadians(var1);
      double var13 = this.field_20470 - var3;
      double var15 = this.field_20468 - var5;
      double var17 = var13 * Math.cos(var1) - var15 * Math.sin(var1);
      double var19 = var13 * Math.sin(var1) + var15 * Math.cos(var1);
      return new class_4215(var17 + var3 + var7, this.field_20473, var19 + var5 + var9);
   }

   public boolean method_19637(class_4215 var1) {
      if (this.field_20470 == 0.0 && this.field_20473 == 0.0 && this.field_20468 == 0.0) {
         return true;
      } else {
         double var4 = var1.field_20470;
         double var6 = var1.field_20473;
         double var8 = var1.field_20468;
         if (var4 == 0.0 && var6 == 0.0 && var8 == 0.0) {
            return true;
         } else if (this.field_20470 == 0.0 == (var4 == 0.0)) {
            if (this.field_20473 == 0.0 == (var6 == 0.0)) {
               if (this.field_20468 == 0.0 == (var8 == 0.0)) {
                  double var10 = var4 / this.field_20470;
                  if (Double.isNaN(var10)) {
                     double var12 = var6 / this.field_20473;
                     if (Double.isNaN(var12)) {
                        double var14 = var8 / this.field_20468;
                        if (Double.isNaN(var14)) {
                           throw new RuntimeException("This should not happen");
                        } else {
                           return var1.equals(this.method_19601(var14));
                        }
                     } else {
                        return var1.equals(this.method_19601(var12));
                     }
                  } else {
                     return var1.equals(this.method_19601(var10));
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

   public float method_19642() {
      double var3 = this.method_19594();
      double var5 = this.method_19612();
      if (var3 == 0.0 && var5 == 0.0) {
         return !(this.method_19634() > 0.0) ? 90.0F : -90.0F;
      } else {
         double var7 = var3 * var3;
         double var9 = var5 * var5;
         double var11 = Math.sqrt(var7 + var9);
         return (float)Math.toDegrees(Math.atan(-this.method_19634() / var11));
      }
   }

   public float method_19624() {
      double var3 = this.method_19594();
      double var5 = this.method_19612();
      double var7 = Math.atan2(-var3, var5);
      double var9 = Math.PI * 2;
      return (float)Math.toDegrees((var7 + var9) % var9);
   }

   public static class_8003 method_19616(double var0, double var2, double var4) {
      return new class_8003(Math.floor(var0), Math.floor(var2), Math.floor(var4));
   }

   public class_8003 method_19615() {
      return new class_8003(Math.floor(this.field_20470), Math.floor(this.field_20473), Math.floor(this.field_20468));
   }

   public class_8003 method_19640() {
      return new class_8003(this);
   }

   public class_6042 method_19611() {
      return new class_6042(this.field_20470, this.field_20468);
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof class_4215)) {
         return false;
      } else {
         class_4215 var4 = (class_4215)var1;
         return var4.field_20470 == this.field_20470 && var4.field_20473 == this.field_20473 && var4.field_20468 == this.field_20468;
      }
   }

   public int compareTo(class_4215 var1) {
      if (var1 != null) {
         if (this.field_20473 == var1.field_20473) {
            if (this.field_20468 == var1.field_20468) {
               return this.field_20470 == var1.field_20470 ? 0 : Double.compare(this.field_20470, var1.field_20470);
            } else {
               return Double.compare(this.field_20468, var1.field_20468);
            }
         } else {
            return Double.compare(this.field_20473, var1.field_20473);
         }
      } else {
         throw new IllegalArgumentException("null not supported");
      }
   }

   @Override
   public int hashCode() {
      int var3 = 7;
      var3 = 79 * var3 + (int)(Double.doubleToLongBits(this.field_20470) ^ Double.doubleToLongBits(this.field_20470) >>> 32);
      var3 = 79 * var3 + (int)(Double.doubleToLongBits(this.field_20473) ^ Double.doubleToLongBits(this.field_20473) >>> 32);
      return 79 * var3 + (int)(Double.doubleToLongBits(this.field_20468) ^ Double.doubleToLongBits(this.field_20468) >>> 32);
   }

   @Override
   public String toString() {
      return "(" + this.field_20470 + ", " + this.field_20473 + ", " + this.field_20468 + ")";
   }

   public static class_4215 method_19644(class_4215 var0, class_4215 var1) {
      return new class_4215(
         Math.min(var0.field_20470, var1.field_20470), Math.min(var0.field_20473, var1.field_20473), Math.min(var0.field_20468, var1.field_20468)
      );
   }

   public static class_4215 method_19645(class_4215 var0, class_4215 var1) {
      return new class_4215(
         Math.max(var0.field_20470, var1.field_20470), Math.max(var0.field_20473, var1.field_20473), Math.max(var0.field_20468, var1.field_20468)
      );
   }

   public static class_4215 method_19623(class_4215 var0, class_4215 var1) {
      return new class_4215(
         (var0.field_20470 + var1.field_20470) / 2.0, (var0.field_20473 + var1.field_20473) / 2.0, (var0.field_20468 + var1.field_20468) / 2.0
      );
   }
}
