package mapped;

import java.io.Serializable;

public class Class2519 implements Serializable {
   private static String[] field16663;
   public Class2532 field16664;
   public Class2519 field16665;
   public Class2519 field16666;
   public double field16667;
   public double field16668;
   public double field16669;
   public double field16670;

   public Class2519(Class2532 var1) {
      this.field16664 = var1;
   }

   public void method10567() {
      this.field16665.field16666 = this.field16666;
      this.field16666.field16665 = this.field16665;
      this.field16666 = null;
      this.field16665 = null;
   }

   public void method10568(Class2519 var1) {
      this.field16665.field16666 = var1;
      var1.field16665 = this.field16665;
      var1.field16666 = this;
      this.field16665 = var1;
   }

   public void method10569(Class2519 var1) {
      this.field16666.field16665 = var1;
      var1.field16665 = this;
      var1.field16666 = this.field16666;
      this.field16666 = var1;
   }

   private double method10570(double var1, double var3) {
      return Math.sqrt(var1 * var1 + var3 * var3);
   }

   public void method10571() {
      if (this.field16665.field16664.equals(this.field16664)) {
         this.field16664.field16737 += 0.01F;
      }

      double var3 = (double)(this.field16664.field16737 - this.field16665.field16664.field16737);
      double var5 = (double)(this.field16664.field16738 - this.field16665.field16664.field16738);
      double var7 = this.method10570(var3, var5);
      var3 /= var7;
      var5 /= var7;
      if (this.field16666.field16664.equals(this.field16664)) {
         this.field16664.field16738 += 0.01F;
      }

      double var9 = (double)(this.field16666.field16664.field16737 - this.field16664.field16737);
      double var11 = (double)(this.field16666.field16664.field16738 - this.field16664.field16738);
      double var13 = this.method10570(var9, var11);
      var9 /= var13;
      var11 /= var13;
      double var15 = -var5;
      this.field16667 = (var15 - var11) * 0.5;
      this.field16668 = (var3 + var9) * 0.5;
      if (!(this.field16667 * this.field16667 + this.field16668 * this.field16668 < 1.0E-5)) {
         this.field16669 = this.field16667 * var9 + this.field16668 * var11;
      } else {
         this.field16667 = var3;
         this.field16668 = var11;
         this.field16669 = 1.0;
         if (var3 * var9 + var5 * var11 > 0.0) {
            this.field16667 = -var3;
            this.field16668 = -var5;
         }
      }
   }

   public double method10572(Class2519 var1) {
      double var4 = (double)(var1.field16664.field16737 - this.field16664.field16737);
      double var6 = (double)(var1.field16664.field16738 - this.field16664.field16738);
      double var8 = this.method10570(var4, var6);
      return (this.field16667 * var4 + this.field16668 * var6) / var8;
   }

   public boolean method10573() {
      return this.field16669 < 0.0;
   }

   public boolean method10574(double var1, double var3) {
      boolean var7 = (double)(this.field16665.field16664.field16738 - this.field16664.field16738) * var1
            + (double)(this.field16664.field16737 - this.field16665.field16664.field16737) * var3
         >= 0.0;
      boolean var8 = (double)(this.field16664.field16738 - this.field16666.field16664.field16738) * var1
            + (double)(this.field16666.field16664.field16737 - this.field16664.field16737) * var3
         >= 0.0;
      return !(this.field16669 < 0.0) ? var7 & var8 : var7 | var8;
   }

   public boolean method10575(Class2519 var1) {
      return this.method10574(
         (double)(var1.field16664.field16737 - this.field16664.field16737), (double)(var1.field16664.field16738 - this.field16664.field16738)
      );
   }
}
