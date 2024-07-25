package remapped;

import java.io.Serializable;

public class class_3686 extends class_6064 implements Serializable {
   private static String[] field_18067;
   public static final long field_18066 = -2168194326883512320L;

   public class_3686(float var1, float var2) {
      super(var1, var2);
   }

   public class_3686(float[] var1) {
      super(var1);
   }

   public class_3686(class_3686 var1) {
      super(var1);
   }

   public class_3686(class_2892 var1) {
      super(var1);
   }

   public class_3686(class_6064 var1) {
      super(var1);
   }

   public class_3686(class_2693 var1) {
      super(var1);
   }

   public class_3686() {
   }

   public final float method_17144(class_3686 var1) {
      return this.field_31017 * var1.field_31017 + this.field_31019 * var1.field_31019;
   }

   public final float method_17143() {
      return (float)Math.sqrt((double)(this.field_31017 * this.field_31017 + this.field_31019 * this.field_31019));
   }

   public final float method_17147() {
      return this.field_31017 * this.field_31017 + this.field_31019 * this.field_31019;
   }

   public final void method_17146(class_3686 var1) {
      float var4 = (float)(1.0 / Math.sqrt((double)(var1.field_31017 * var1.field_31017 + var1.field_31019 * var1.field_31019)));
      this.field_31017 = var1.field_31017 * var4;
      this.field_31019 = var1.field_31019 * var4;
   }

   public final void method_17145() {
      float var3 = (float)(1.0 / Math.sqrt((double)(this.field_31017 * this.field_31017 + this.field_31019 * this.field_31019)));
      this.field_31017 *= var3;
      this.field_31019 *= var3;
   }

   public final float method_17148(class_3686 var1) {
      double var4 = (double)(this.method_17144(var1) / (this.method_17143() * var1.method_17143()));
      if (var4 < -1.0) {
         var4 = -1.0;
      }

      if (var4 > 1.0) {
         var4 = 1.0;
      }

      return (float)Math.acos(var4);
   }
}
