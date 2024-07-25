package remapped;

import java.io.Serializable;

public class class_1784 extends class_5230 implements Serializable {
   private static String[] field_9122;
   public static final long field_9121 = 3938123424117448700L;

   public class_1784(double var1, double var3, double var5, double var7) {
      super(var1, var3, var5, var7);
   }

   public class_1784(double[] var1) {
      super(var1);
   }

   public class_1784(class_1784 var1) {
      super(var1);
   }

   public class_1784(class_4586 var1) {
      super(var1);
   }

   public class_1784(class_1752 var1) {
      super(var1);
   }

   public class_1784(class_5230 var1) {
      super(var1);
   }

   public class_1784(class_3519 var1) {
      super(var1.field_17244, var1.field_17242, var1.field_17241, 0.0);
   }

   public class_1784() {
   }

   public final void method_7941(class_3519 var1) {
      this.field_26829 = var1.field_17244;
      this.field_26830 = var1.field_17242;
      this.field_26828 = var1.field_17241;
      this.field_26827 = 0.0;
   }

   public final double method_7946() {
      return Math.sqrt(
         this.field_26829 * this.field_26829 + this.field_26830 * this.field_26830 + this.field_26828 * this.field_26828 + this.field_26827 * this.field_26827
      );
   }

   public final double method_7940() {
      return this.field_26829 * this.field_26829
         + this.field_26830 * this.field_26830
         + this.field_26828 * this.field_26828
         + this.field_26827 * this.field_26827;
   }

   public final double method_7945(class_1784 var1) {
      return this.field_26829 * var1.field_26829
         + this.field_26830 * var1.field_26830
         + this.field_26828 * var1.field_26828
         + this.field_26827 * var1.field_26827;
   }

   public final void method_7944(class_1784 var1) {
      double var4 = 1.0
         / Math.sqrt(
            var1.field_26829 * var1.field_26829
               + var1.field_26830 * var1.field_26830
               + var1.field_26828 * var1.field_26828
               + var1.field_26827 * var1.field_26827
         );
      this.field_26829 = var1.field_26829 * var4;
      this.field_26830 = var1.field_26830 * var4;
      this.field_26828 = var1.field_26828 * var4;
      this.field_26827 = var1.field_26827 * var4;
   }

   public final void method_7943() {
      double var3 = 1.0
         / Math.sqrt(
            this.field_26829 * this.field_26829
               + this.field_26830 * this.field_26830
               + this.field_26828 * this.field_26828
               + this.field_26827 * this.field_26827
         );
      this.field_26829 *= var3;
      this.field_26830 *= var3;
      this.field_26828 *= var3;
      this.field_26827 *= var3;
   }

   public final double method_7942(class_1784 var1) {
      double var4 = this.method_7945(var1) / (this.method_7946() * var1.method_7946());
      if (var4 < -1.0) {
         var4 = -1.0;
      }

      if (var4 > 1.0) {
         var4 = 1.0;
      }

      return Math.acos(var4);
   }
}
