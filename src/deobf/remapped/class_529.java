package remapped;

import java.io.Serializable;

public class class_529 extends class_3519 implements Serializable {
   private static String[] field_3224;
   public static final long field_3223 = 5718062286069042927L;

   public class_529(double var1, double var3, double var5) {
      super(var1, var3, var5);
   }

   public class_529(double[] var1) {
      super(var1);
   }

   public class_529(class_529 var1) {
      super(var1);
   }

   public class_529(class_8079 var1) {
      super(var1);
   }

   public class_529(class_835 var1) {
      super(var1);
   }

   public class_529(class_3519 var1) {
      super(var1);
   }

   public class_529() {
   }

   public final double method_2571(class_529 var1) {
      double var4 = this.field_17244 - var1.field_17244;
      double var6 = this.field_17242 - var1.field_17242;
      double var8 = this.field_17241 - var1.field_17241;
      return var4 * var4 + var6 * var6 + var8 * var8;
   }

   public final double method_2568(class_529 var1) {
      double var4 = this.field_17244 - var1.field_17244;
      double var6 = this.field_17242 - var1.field_17242;
      double var8 = this.field_17241 - var1.field_17241;
      return Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
   }

   public final double method_2570(class_529 var1) {
      return Math.abs(this.field_17244 - var1.field_17244) + Math.abs(this.field_17242 - var1.field_17242) + Math.abs(this.field_17241 - var1.field_17241);
   }

   public final double method_2567(class_529 var1) {
      double var4 = Math.max(Math.abs(this.field_17244 - var1.field_17244), Math.abs(this.field_17242 - var1.field_17242));
      return Math.max(var4, Math.abs(this.field_17241 - var1.field_17241));
   }

   public final void method_2569(class_5549 var1) {
      double var4 = 1.0 / var1.field_26827;
      this.field_17244 = var1.field_26829 * var4;
      this.field_17242 = var1.field_26830 * var4;
      this.field_17241 = var1.field_26828 * var4;
   }
}
