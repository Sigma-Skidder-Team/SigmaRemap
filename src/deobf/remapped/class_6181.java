package remapped;

import java.io.Serializable;

public class class_6181 extends class_835 implements Serializable {
   private static String[] field_31596;
   public static final long field_31597 = -7031930069184524614L;

   public class_6181(float var1, float var2, float var3) {
      super(var1, var2, var3);
   }

   public class_6181(float[] var1) {
      super(var1);
   }

   public class_6181(class_6181 var1) {
      super(var1);
   }

   public class_6181(class_2627 var1) {
      super(var1);
   }

   public class_6181(class_835 var1) {
      super(var1);
   }

   public class_6181(class_3519 var1) {
      super(var1);
   }

   public class_6181() {
   }

   public final float method_28304() {
      return this.field_4390 * this.field_4390 + this.field_4391 * this.field_4391 + this.field_4393 * this.field_4393;
   }

   public final float method_28301() {
      return (float)Math.sqrt((double)(this.field_4390 * this.field_4390 + this.field_4391 * this.field_4391 + this.field_4393 * this.field_4393));
   }

   public final void method_28305(class_6181 var1, class_6181 var2) {
      float var5 = var1.field_4391 * var2.field_4393 - var1.field_4393 * var2.field_4391;
      float var6 = var2.field_4390 * var1.field_4393 - var2.field_4393 * var1.field_4390;
      this.field_4393 = var1.field_4390 * var2.field_4391 - var1.field_4391 * var2.field_4390;
      this.field_4390 = var5;
      this.field_4391 = var6;
   }

   public final float method_28302(class_6181 var1) {
      return this.field_4390 * var1.field_4390 + this.field_4391 * var1.field_4391 + this.field_4393 * var1.field_4393;
   }

   public final void method_28307(class_6181 var1) {
      float var4 = (float)(1.0 / Math.sqrt((double)(var1.field_4390 * var1.field_4390 + var1.field_4391 * var1.field_4391 + var1.field_4393 * var1.field_4393)));
      this.field_4390 = var1.field_4390 * var4;
      this.field_4391 = var1.field_4391 * var4;
      this.field_4393 = var1.field_4393 * var4;
   }

   public final void method_28306() {
      float var3 = (float)(1.0 / Math.sqrt((double)(this.field_4390 * this.field_4390 + this.field_4391 * this.field_4391 + this.field_4393 * this.field_4393)));
      this.field_4390 *= var3;
      this.field_4391 *= var3;
      this.field_4393 *= var3;
   }

   public final float method_28303(class_6181 var1) {
      double var4 = (double)(this.method_28302(var1) / (this.method_28301() * var1.method_28301()));
      if (var4 < -1.0) {
         var4 = -1.0;
      }

      if (var4 > 1.0) {
         var4 = 1.0;
      }

      return (float)Math.acos(var4);
   }
}
