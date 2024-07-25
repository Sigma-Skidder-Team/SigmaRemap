package remapped;

import java.awt.Color;
import java.io.Serializable;

public class class_1839 extends class_835 implements Serializable {
   private static String[] field_9316;
   public static final long field_9317 = -1861792981817493659L;

   public class_1839(float var1, float var2, float var3) {
      super(var1, var2, var3);
   }

   public class_1839(float[] var1) {
      super(var1);
   }

   public class_1839(class_1839 var1) {
      super(var1);
   }

   public class_1839(class_835 var1) {
      super(var1);
   }

   public class_1839(class_3519 var1) {
      super(var1);
   }

   public class_1839(Color var1) {
      super((float)var1.getRed() / 255.0F, (float)var1.getGreen() / 255.0F, (float)var1.getBlue() / 255.0F);
   }

   public class_1839() {
   }

   public final void method_8120(Color var1) {
      this.field_4390 = (float)var1.getRed() / 255.0F;
      this.field_4391 = (float)var1.getGreen() / 255.0F;
      this.field_4393 = (float)var1.getBlue() / 255.0F;
   }

   public final Color method_8121() {
      int var3 = Math.round(this.field_4390 * 255.0F);
      int var4 = Math.round(this.field_4391 * 255.0F);
      int var5 = Math.round(this.field_4393 * 255.0F);
      return new Color(var3, var4, var5);
   }
}
