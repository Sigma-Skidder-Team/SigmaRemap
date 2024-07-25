package remapped;

import java.io.Serializable;

public class class_2627 extends class_3519 implements Serializable {
   private static String[] field_12956;
   public static final long field_12957 = 3761969948420550442L;

   public class_2627(double var1, double var3, double var5) {
      super(var1, var3, var5);
   }

   public class_2627(double[] var1) {
      super(var1);
   }

   public class_2627(class_2627 var1) {
      super(var1);
   }

   public class_2627(class_6181 var1) {
      super(var1);
   }

   public class_2627(class_835 var1) {
      super(var1);
   }

   public class_2627(class_3519 var1) {
      super(var1);
   }

   public class_2627() {
   }

   public final void method_11902(class_2627 var1, class_2627 var2) {
      double var5 = var1.field_17242 * var2.field_17241 - var1.field_17241 * var2.field_17242;
      double var7 = var2.field_17244 * var1.field_17241 - var2.field_17241 * var1.field_17244;
      this.field_17241 = var1.field_17244 * var2.field_17242 - var1.field_17242 * var2.field_17244;
      this.field_17244 = var5;
      this.field_17242 = var7;
   }

   public final void method_11901(class_2627 var1) {
      double var4 = 1.0 / Math.sqrt(var1.field_17244 * var1.field_17244 + var1.field_17242 * var1.field_17242 + var1.field_17241 * var1.field_17241);
      this.field_17244 = var1.field_17244 * var4;
      this.field_17242 = var1.field_17242 * var4;
      this.field_17241 = var1.field_17241 * var4;
   }

   public final void method_11900() {
      double var3 = 1.0 / Math.sqrt(this.field_17244 * this.field_17244 + this.field_17242 * this.field_17242 + this.field_17241 * this.field_17241);
      this.field_17244 *= var3;
      this.field_17242 *= var3;
      this.field_17241 *= var3;
   }

   public final double method_11905(class_2627 var1) {
      return this.field_17244 * var1.field_17244 + this.field_17242 * var1.field_17242 + this.field_17241 * var1.field_17241;
   }

   public final double method_11904() {
      return this.field_17244 * this.field_17244 + this.field_17242 * this.field_17242 + this.field_17241 * this.field_17241;
   }

   public final double method_11906() {
      return Math.sqrt(this.field_17244 * this.field_17244 + this.field_17242 * this.field_17242 + this.field_17241 * this.field_17241);
   }

   public final double method_11903(class_2627 var1) {
      double var4 = this.method_11905(var1) / (this.method_11906() * var1.method_11906());
      if (var4 < -1.0) {
         var4 = -1.0;
      }

      if (var4 > 1.0) {
         var4 = 1.0;
      }

      return Math.acos(var4);
   }
}
