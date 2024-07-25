package remapped;

import java.io.Serializable;

public class class_5549 extends class_5230 implements Serializable {
   private static String[] field_28261;
   public static final long field_28260 = 1733471895962736949L;

   public class_5549(double var1, double var3, double var5, double var7) {
      super(var1, var3, var5, var7);
   }

   public class_5549(double[] var1) {
      super(var1);
   }

   public class_5549(class_5549 var1) {
      super(var1);
   }

   public class_5549(class_5248 var1) {
      super(var1);
   }

   public class_5549(class_1752 var1) {
      super(var1);
   }

   public class_5549(class_5230 var1) {
      super(var1);
   }

   public class_5549(class_3519 var1) {
      super(var1.field_17244, var1.field_17242, var1.field_17241, 1.0);
   }

   public class_5549() {
   }

   public final void method_25228(class_3519 var1) {
      this.field_26829 = var1.field_17244;
      this.field_26830 = var1.field_17242;
      this.field_26828 = var1.field_17241;
      this.field_26827 = 1.0;
   }

   public final double method_25233(class_5549 var1) {
      double var4 = this.field_26829 - var1.field_26829;
      double var6 = this.field_26830 - var1.field_26830;
      double var8 = this.field_26828 - var1.field_26828;
      double var10 = this.field_26827 - var1.field_26827;
      return var4 * var4 + var6 * var6 + var8 * var8 + var10 * var10;
   }

   public final double method_25231(class_5549 var1) {
      double var4 = this.field_26829 - var1.field_26829;
      double var6 = this.field_26830 - var1.field_26830;
      double var8 = this.field_26828 - var1.field_26828;
      double var10 = this.field_26827 - var1.field_26827;
      return Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8 + var10 * var10);
   }

   public final double method_25229(class_5549 var1) {
      return Math.abs(this.field_26829 - var1.field_26829)
         + Math.abs(this.field_26830 - var1.field_26830)
         + Math.abs(this.field_26828 - var1.field_26828)
         + Math.abs(this.field_26827 - var1.field_26827);
   }

   public final double method_25232(class_5549 var1) {
      double var4 = Math.max(Math.abs(this.field_26829 - var1.field_26829), Math.abs(this.field_26830 - var1.field_26830));
      double var6 = Math.max(Math.abs(this.field_26828 - var1.field_26828), Math.abs(this.field_26827 - var1.field_26827));
      return Math.max(var4, var6);
   }

   public final void method_25230(class_5549 var1) {
      double var4 = 1.0 / var1.field_26827;
      this.field_26829 = var1.field_26829 * var4;
      this.field_26830 = var1.field_26830 * var4;
      this.field_26828 = var1.field_26828 * var4;
      this.field_26827 = 1.0;
   }
}
