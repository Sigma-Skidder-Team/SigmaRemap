package remapped;

import java.io.Serializable;

public class class_5248 extends class_1752 implements Serializable {
   private static String[] field_26876;
   public static final long field_26875 = 4643134103185764459L;

   public class_5248(float var1, float var2, float var3, float var4) {
      super(var1, var2, var3, var4);
   }

   public class_5248(float[] var1) {
      super(var1);
   }

   public class_5248(class_5248 var1) {
      super(var1);
   }

   public class_5248(class_5549 var1) {
      super(var1);
   }

   public class_5248(class_1752 var1) {
      super(var1);
   }

   public class_5248(class_5230 var1) {
      super(var1);
   }

   public class_5248(class_835 var1) {
      super(var1.field_4390, var1.field_4391, var1.field_4393, 1.0F);
   }

   public class_5248() {
   }

   public final void method_23995(class_835 var1) {
      this.field_9014 = var1.field_4390;
      this.field_9016 = var1.field_4391;
      this.field_9013 = var1.field_4393;
      this.field_9012 = 1.0F;
   }

   public final float method_23993(class_5248 var1) {
      float var4 = this.field_9014 - var1.field_9014;
      float var5 = this.field_9016 - var1.field_9016;
      float var6 = this.field_9013 - var1.field_9013;
      float var7 = this.field_9012 - var1.field_9012;
      return var4 * var4 + var5 * var5 + var6 * var6 + var7 * var7;
   }

   public final float method_23998(class_5248 var1) {
      float var4 = this.field_9014 - var1.field_9014;
      float var5 = this.field_9016 - var1.field_9016;
      float var6 = this.field_9013 - var1.field_9013;
      float var7 = this.field_9012 - var1.field_9012;
      return (float)Math.sqrt((double)(var4 * var4 + var5 * var5 + var6 * var6 + var7 * var7));
   }

   public final float method_23996(class_5248 var1) {
      return Math.abs(this.field_9014 - var1.field_9014)
         + Math.abs(this.field_9016 - var1.field_9016)
         + Math.abs(this.field_9013 - var1.field_9013)
         + Math.abs(this.field_9012 - var1.field_9012);
   }

   public final float method_23997(class_5248 var1) {
      float var4 = Math.max(Math.abs(this.field_9014 - var1.field_9014), Math.abs(this.field_9016 - var1.field_9016));
      float var5 = Math.max(Math.abs(this.field_9013 - var1.field_9013), Math.abs(this.field_9012 - var1.field_9012));
      return Math.max(var4, var5);
   }

   public final void method_23994(class_5248 var1) {
      float var4 = 1.0F / var1.field_9012;
      this.field_9014 = var1.field_9014 * var4;
      this.field_9016 = var1.field_9016 * var4;
      this.field_9013 = var1.field_9013 * var4;
      this.field_9012 = 1.0F;
   }
}
