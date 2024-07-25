package remapped;

import java.io.Serializable;

public class class_4586 extends class_1752 implements Serializable {
   private static String[] field_22303;
   public static final long field_22302 = 8749319902347760659L;

   public class_4586(float var1, float var2, float var3, float var4) {
      super(var1, var2, var3, var4);
   }

   public class_4586(float[] var1) {
      super(var1);
   }

   public class_4586(class_4586 var1) {
      super(var1);
   }

   public class_4586(class_1784 var1) {
      super(var1);
   }

   public class_4586(class_1752 var1) {
      super(var1);
   }

   public class_4586(class_5230 var1) {
      super(var1);
   }

   public class_4586(class_835 var1) {
      super(var1.field_4390, var1.field_4391, var1.field_4393, 0.0F);
   }

   public class_4586() {
   }

   public final void method_21245(class_835 var1) {
      this.field_9014 = var1.field_4390;
      this.field_9016 = var1.field_4391;
      this.field_9013 = var1.field_4393;
      this.field_9012 = 0.0F;
   }

   public final float method_21244() {
      return (float)Math.sqrt(
         (double)(this.field_9014 * this.field_9014 + this.field_9016 * this.field_9016 + this.field_9013 * this.field_9013 + this.field_9012 * this.field_9012)
      );
   }

   public final float method_21243() {
      return this.field_9014 * this.field_9014 + this.field_9016 * this.field_9016 + this.field_9013 * this.field_9013 + this.field_9012 * this.field_9012;
   }

   public final float method_21249(class_4586 var1) {
      return this.field_9014 * var1.field_9014 + this.field_9016 * var1.field_9016 + this.field_9013 * var1.field_9013 + this.field_9012 * var1.field_9012;
   }

   public final void method_21248(class_4586 var1) {
      float var4 = (float)(
         1.0
            / Math.sqrt(
               (double)(
                  var1.field_9014 * var1.field_9014 + var1.field_9016 * var1.field_9016 + var1.field_9013 * var1.field_9013 + var1.field_9012 * var1.field_9012
               )
            )
      );
      this.field_9014 = var1.field_9014 * var4;
      this.field_9016 = var1.field_9016 * var4;
      this.field_9013 = var1.field_9013 * var4;
      this.field_9012 = var1.field_9012 * var4;
   }

   public final void method_21247() {
      float var3 = (float)(
         1.0
            / Math.sqrt(
               (double)(
                  this.field_9014 * this.field_9014 + this.field_9016 * this.field_9016 + this.field_9013 * this.field_9013 + this.field_9012 * this.field_9012
               )
            )
      );
      this.field_9014 *= var3;
      this.field_9016 *= var3;
      this.field_9013 *= var3;
      this.field_9012 *= var3;
   }

   public final float method_21246(class_4586 var1) {
      double var4 = (double)(this.method_21249(var1) / (this.method_21244() * var1.method_21244()));
      if (var4 < -1.0) {
         var4 = -1.0;
      }

      if (var4 > 1.0) {
         var4 = 1.0;
      }

      return (float)Math.acos(var4);
   }
}
