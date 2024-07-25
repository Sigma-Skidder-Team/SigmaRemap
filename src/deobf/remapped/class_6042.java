package remapped;

public class class_6042 {
   public static final class_6042 field_30850 = new class_6042(0, 0);
   public static final class_6042 field_30847 = new class_6042(1, 0);
   public static final class_6042 field_30848 = new class_6042(0, 1);
   public static final class_6042 field_30846 = new class_6042(1, 1);
   public final double field_30845;
   public final double field_30849;

   public class_6042(double var1, double var3) {
      this.field_30845 = var1;
      this.field_30849 = var3;
   }

   public class_6042(int var1, int var2) {
      this.field_30845 = (double)var1;
      this.field_30849 = (double)var2;
   }

   public class_6042(float var1, float var2) {
      this.field_30845 = (double)var1;
      this.field_30849 = (double)var2;
   }

   public class_6042(class_6042 var1) {
      this.field_30845 = var1.field_30845;
      this.field_30849 = var1.field_30849;
   }

   public class_6042() {
      this.field_30845 = 0.0;
      this.field_30849 = 0.0;
   }

   public double method_27582() {
      return this.field_30845;
   }

   public int method_27581() {
      return (int)Math.round(this.field_30845);
   }

   public class_6042 method_27579(double var1) {
      return new class_6042(var1, this.field_30849);
   }

   public class_6042 method_27580(int var1) {
      return new class_6042((double)var1, this.field_30849);
   }

   public double method_27558() {
      return this.field_30849;
   }

   public int method_27543() {
      return (int)Math.round(this.field_30849);
   }

   public class_6042 method_27544(double var1) {
      return new class_6042(this.field_30845, var1);
   }

   public class_6042 method_27545(int var1) {
      return new class_6042(this.field_30845, (double)var1);
   }

   public class_6042 method_27563(class_6042 var1) {
      return new class_6042(this.field_30845 + var1.field_30845, this.field_30849 + var1.field_30849);
   }

   public class_6042 method_27561(double var1, double var3) {
      return new class_6042(this.field_30845 + var1, this.field_30849 + var3);
   }

   public class_6042 method_27562(int var1, int var2) {
      return new class_6042(this.field_30845 + (double)var1, this.field_30849 + (double)var2);
   }

   public class_6042 method_27564(class_6042... var1) {
      double var4 = this.field_30845;
      double var6 = this.field_30849;

      for (class_6042 var11 : var1) {
         var4 += var11.field_30845;
         var6 += var11.field_30849;
      }

      return new class_6042(var4, var6);
   }

   public class_6042 method_27585(class_6042 var1) {
      return new class_6042(this.field_30845 - var1.field_30845, this.field_30849 - var1.field_30849);
   }

   public class_6042 method_27583(double var1, double var3) {
      return new class_6042(this.field_30845 - var1, this.field_30849 - var3);
   }

   public class_6042 method_27584(int var1, int var2) {
      return new class_6042(this.field_30845 - (double)var1, this.field_30849 - (double)var2);
   }

   public class_6042 method_27586(class_6042... var1) {
      double var4 = this.field_30845;
      double var6 = this.field_30849;

      for (class_6042 var11 : var1) {
         var4 -= var11.field_30845;
         var6 -= var11.field_30849;
      }

      return new class_6042(var4, var6);
   }

   public class_6042 method_27556(class_6042 var1) {
      return new class_6042(this.field_30845 * var1.field_30845, this.field_30849 * var1.field_30849);
   }

   public class_6042 method_27552(double var1, double var3) {
      return new class_6042(this.field_30845 * var1, this.field_30849 * var3);
   }

   public class_6042 method_27555(int var1, int var2) {
      return new class_6042(this.field_30845 * (double)var1, this.field_30849 * (double)var2);
   }

   public class_6042 method_27557(class_6042... var1) {
      double var4 = this.field_30845;
      double var6 = this.field_30849;

      for (class_6042 var11 : var1) {
         var4 *= var11.field_30845;
         var6 *= var11.field_30849;
      }

      return new class_6042(var4, var6);
   }

   public class_6042 method_27551(double var1) {
      return new class_6042(this.field_30845 * var1, this.field_30849 * var1);
   }

   public class_6042 method_27553(float var1) {
      return new class_6042(this.field_30845 * (double)var1, this.field_30849 * (double)var1);
   }

   public class_6042 method_27554(int var1) {
      return new class_6042(this.field_30845 * (double)var1, this.field_30849 * (double)var1);
   }

   public class_6042 method_27578(class_6042 var1) {
      return new class_6042(this.field_30845 / var1.field_30845, this.field_30849 / var1.field_30849);
   }

   public class_6042 method_27574(double var1, double var3) {
      return new class_6042(this.field_30845 / var1, this.field_30849 / var3);
   }

   public class_6042 method_27577(int var1, int var2) {
      return new class_6042(this.field_30845 / (double)var1, this.field_30849 / (double)var2);
   }

   public class_6042 method_27576(int var1) {
      return new class_6042(this.field_30845 / (double)var1, this.field_30849 / (double)var1);
   }

   public class_6042 method_27573(double var1) {
      return new class_6042(this.field_30845 / var1, this.field_30849 / var1);
   }

   public class_6042 method_27575(float var1) {
      return new class_6042(this.field_30845 / (double)var1, this.field_30849 / (double)var1);
   }

   public double method_27567() {
      return Math.sqrt(this.field_30845 * this.field_30845 + this.field_30849 * this.field_30849);
   }

   public double method_27550() {
      return this.field_30845 * this.field_30845 + this.field_30849 * this.field_30849;
   }

   public double method_27570(class_6042 var1) {
      return Math.sqrt(Math.pow(var1.field_30845 - this.field_30845, 2.0) + Math.pow(var1.field_30849 - this.field_30849, 2.0));
   }

   public double method_27546(class_6042 var1) {
      return Math.pow(var1.field_30845 - this.field_30845, 2.0) + Math.pow(var1.field_30849 - this.field_30849, 2.0);
   }

   public class_6042 method_27572() {
      return this.method_27573(this.method_27567());
   }

   public double method_27549(class_6042 var1) {
      return this.field_30845 * var1.field_30845 + this.field_30849 * var1.field_30849;
   }

   public boolean method_27568(class_6042 var1, class_6042 var2) {
      return this.field_30845 >= var1.field_30845
         && this.field_30845 <= var2.field_30845
         && this.field_30849 >= var1.field_30849
         && this.field_30849 <= var2.field_30849;
   }

   public boolean method_27542(class_6042 var1, class_6042 var2) {
      return this.method_27581() >= var1.method_27581()
         && this.method_27581() <= var2.method_27581()
         && this.method_27543() >= var1.method_27543()
         && this.method_27543() <= var2.method_27543();
   }

   public class_6042 method_27541() {
      return new class_6042(Math.floor(this.field_30845), Math.floor(this.field_30849));
   }

   public class_6042 method_27587() {
      return new class_6042(Math.ceil(this.field_30845), Math.ceil(this.field_30849));
   }

   public class_6042 method_27589() {
      return new class_6042(Math.floor(this.field_30845 + 0.5), Math.floor(this.field_30849 + 0.5));
   }

   public class_6042 method_27588() {
      return new class_6042(Math.abs(this.field_30845), Math.abs(this.field_30849));
   }

   public class_6042 method_27547(double var1, double var3, double var5, double var7, double var9) {
      var1 = Math.toRadians(var1);
      double var13 = this.field_30845 - var3;
      double var15 = this.field_30849 - var5;
      double var17 = var13 * Math.cos(var1) - var15 * Math.sin(var1);
      double var19 = var13 * Math.sin(var1) + var15 * Math.cos(var1);
      return new class_6042(var17 + var3 + var7, var19 + var5 + var9);
   }

   public boolean method_27565(class_6042 var1) {
      if (this.field_30845 == 0.0 && this.field_30849 == 0.0) {
         return true;
      } else {
         double var4 = var1.field_30845;
         double var6 = var1.field_30849;
         if (var4 == 0.0 && var6 == 0.0) {
            return true;
         } else if (this.field_30845 == 0.0 == (var4 == 0.0)) {
            if (this.field_30849 == 0.0 == (var6 == 0.0)) {
               double var8 = var4 / this.field_30845;
               if (Double.isNaN(var8)) {
                  double var10 = var6 / this.field_30849;
                  if (Double.isNaN(var10)) {
                     throw new RuntimeException("This should not happen");
                  } else {
                     return var1.equals(this.method_27551(var10));
                  }
               } else {
                  return var1.equals(this.method_27551(var8));
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   public class_7010 method_27569() {
      return new class_7010(this);
   }

   public class_4215 method_27559() {
      return new class_4215(this.field_30845, 0.0, this.field_30849);
   }

   public class_4215 method_27560(double var1) {
      return new class_4215(this.field_30845, var1, this.field_30849);
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof class_6042)) {
         return false;
      } else {
         class_6042 var4 = (class_6042)var1;
         return var4.field_30845 == this.field_30845 && var4.field_30849 == this.field_30849;
      }
   }

   @Override
   public int hashCode() {
      return new Double(this.field_30845).hashCode() >> 13 ^ new Double(this.field_30849).hashCode();
   }

   @Override
   public String toString() {
      return "(" + this.field_30845 + ", " + this.field_30849 + ")";
   }

   public static class_6042 method_27566(class_6042 var0, class_6042 var1) {
      return new class_6042(Math.min(var0.field_30845, var1.field_30845), Math.min(var0.field_30849, var1.field_30849));
   }

   public static class_6042 method_27571(class_6042 var0, class_6042 var1) {
      return new class_6042(Math.max(var0.field_30845, var1.field_30845), Math.max(var0.field_30849, var1.field_30849));
   }
}
