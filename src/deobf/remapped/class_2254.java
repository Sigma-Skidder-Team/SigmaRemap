package remapped;

import java.awt.Color;
import java.io.Serializable;

public class class_2254 extends class_1752 implements Serializable {
   private static String[] field_11220;
   public static final long field_11221 = 8577680141580006740L;

   public class_2254(float var1, float var2, float var3, float var4) {
      super(var1, var2, var3, var4);
   }

   public class_2254(float[] var1) {
      super(var1);
   }

   public class_2254(class_2254 var1) {
      super(var1);
   }

   public class_2254(class_1752 var1) {
      super(var1);
   }

   public class_2254(class_5230 var1) {
      super(var1);
   }

   public class_2254(Color var1) {
      super((float)var1.getRed() / 255.0F, (float)var1.getGreen() / 255.0F, (float)var1.getBlue() / 255.0F, (float)var1.getAlpha() / 255.0F);
   }

   public class_2254() {
   }

   public final void method_10362(Color var1) {
      this.field_9014 = (float)var1.getRed() / 255.0F;
      this.field_9016 = (float)var1.getGreen() / 255.0F;
      this.field_9013 = (float)var1.getBlue() / 255.0F;
      this.field_9012 = (float)var1.getAlpha() / 255.0F;
   }

   public final Color method_10363() {
      int var3 = Math.round(this.field_9014 * 255.0F);
      int var4 = Math.round(this.field_9016 * 255.0F);
      int var5 = Math.round(this.field_9013 * 255.0F);
      int var6 = Math.round(this.field_9012 * 255.0F);
      return new Color(var3, var4, var5, var6);
   }
}
