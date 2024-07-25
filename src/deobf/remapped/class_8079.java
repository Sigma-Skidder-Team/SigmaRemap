package remapped;

import java.io.Serializable;

public class class_8079 extends class_835 implements Serializable {
   private static String[] field_41356;
   public static final long field_41357 = -8689337816398030143L;

   public class_8079(float var1, float var2, float var3) {
      super(var1, var2, var3);
   }

   public class_8079(float[] var1) {
      super(var1);
   }

   public class_8079(class_8079 var1) {
      super(var1);
   }

   public class_8079(class_529 var1) {
      super(var1);
   }

   public class_8079(class_835 var1) {
      super(var1);
   }

   public class_8079(class_3519 var1) {
      super(var1);
   }

   public class_8079() {
   }

   public final float method_36700(class_8079 var1) {
      float var4 = this.field_4390 - var1.field_4390;
      float var5 = this.field_4391 - var1.field_4391;
      float var6 = this.field_4393 - var1.field_4393;
      return var4 * var4 + var5 * var5 + var6 * var6;
   }

   public final float method_36699(class_8079 var1) {
      float var4 = this.field_4390 - var1.field_4390;
      float var5 = this.field_4391 - var1.field_4391;
      float var6 = this.field_4393 - var1.field_4393;
      return (float)Math.sqrt((double)(var4 * var4 + var5 * var5 + var6 * var6));
   }

   public final float method_36698(class_8079 var1) {
      return Math.abs(this.field_4390 - var1.field_4390) + Math.abs(this.field_4391 - var1.field_4391) + Math.abs(this.field_4393 - var1.field_4393);
   }

   public final float method_36697(class_8079 var1) {
      float var4 = Math.max(Math.abs(this.field_4390 - var1.field_4390), Math.abs(this.field_4391 - var1.field_4391));
      return Math.max(var4, Math.abs(this.field_4393 - var1.field_4393));
   }

   public final void method_36701(class_5248 var1) {
      float var4 = 1.0F / var1.field_9012;
      this.field_4390 = var1.field_9014 * var4;
      this.field_4391 = var1.field_9016 * var4;
      this.field_4393 = var1.field_9013 * var4;
   }
}
