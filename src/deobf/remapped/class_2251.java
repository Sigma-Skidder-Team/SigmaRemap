package remapped;

import java.io.Serializable;

public class class_2251 implements Serializable {
   private static String[] field_11200;
   public class_1440 field_11203;
   public class_2251 field_11202;
   public class_2251 field_11197;
   public double field_11199;
   public double field_11201;
   public double field_11204;
   public double field_11198;

   public class_2251(class_1440 var1) {
      this.field_11203 = var1;
   }

   public void method_10357() {
      this.field_11202.field_11197 = this.field_11197;
      this.field_11197.field_11202 = this.field_11202;
      this.field_11197 = null;
      this.field_11202 = null;
   }

   public void method_10351(class_2251 var1) {
      this.field_11202.field_11197 = var1;
      var1.field_11202 = this.field_11202;
      var1.field_11197 = this;
      this.field_11202 = var1;
   }

   public void method_10350(class_2251 var1) {
      this.field_11197.field_11202 = var1;
      var1.field_11202 = this;
      var1.field_11197 = this.field_11197;
      this.field_11197 = var1;
   }

   private double method_10356(double var1, double var3) {
      return Math.sqrt(var1 * var1 + var3 * var3);
   }

   public void method_10353() {
      if (this.field_11202.field_11203.equals(this.field_11203)) {
         this.field_11203.field_7766 += 0.01F;
      }

      double var3 = (double)(this.field_11203.field_7766 - this.field_11202.field_11203.field_7766);
      double var5 = (double)(this.field_11203.field_7765 - this.field_11202.field_11203.field_7765);
      double var7 = this.method_10356(var3, var5);
      var3 /= var7;
      var5 /= var7;
      if (this.field_11197.field_11203.equals(this.field_11203)) {
         this.field_11203.field_7765 += 0.01F;
      }

      double var9 = (double)(this.field_11197.field_11203.field_7766 - this.field_11203.field_7766);
      double var11 = (double)(this.field_11197.field_11203.field_7765 - this.field_11203.field_7765);
      double var13 = this.method_10356(var9, var11);
      var9 /= var13;
      var11 /= var13;
      double var15 = -var5;
      this.field_11199 = (var15 - var11) * 0.5;
      this.field_11201 = (var3 + var9) * 0.5;
      if (!(this.field_11199 * this.field_11199 + this.field_11201 * this.field_11201 < 1.0E-5)) {
         this.field_11204 = this.field_11199 * var9 + this.field_11201 * var11;
      } else {
         this.field_11199 = var3;
         this.field_11201 = var11;
         this.field_11204 = 1.0;
         if (var3 * var9 + var5 * var11 > 0.0) {
            this.field_11199 = -var3;
            this.field_11201 = -var5;
         }
      }
   }

   public double method_10355(class_2251 var1) {
      double var4 = (double)(var1.field_11203.field_7766 - this.field_11203.field_7766);
      double var6 = (double)(var1.field_11203.field_7765 - this.field_11203.field_7765);
      double var8 = this.method_10356(var4, var6);
      return (this.field_11199 * var4 + this.field_11201 * var6) / var8;
   }

   public boolean method_10352() {
      return this.field_11204 < 0.0;
   }

   public boolean method_10358(double var1, double var3) {
      boolean var7 = (double)(this.field_11202.field_11203.field_7765 - this.field_11203.field_7765) * var1
            + (double)(this.field_11203.field_7766 - this.field_11202.field_11203.field_7766) * var3
         >= 0.0;
      boolean var8 = (double)(this.field_11203.field_7765 - this.field_11197.field_11203.field_7765) * var1
            + (double)(this.field_11197.field_11203.field_7766 - this.field_11203.field_7766) * var3
         >= 0.0;
      return !(this.field_11204 < 0.0) ? var7 & var8 : var7 | var8;
   }

   public boolean method_10359(class_2251 var1) {
      return this.method_10358(
         (double)(var1.field_11203.field_7766 - this.field_11203.field_7766), (double)(var1.field_11203.field_7765 - this.field_11203.field_7765)
      );
   }
}
