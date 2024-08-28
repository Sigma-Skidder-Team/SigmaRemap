package mapped;

import java.awt.Color;
import java.io.Serializable;

public class Class4 extends Class5 implements Serializable {
   private static String[] field6;
   public static final long field7 = -1861792981817493659L;

   public Class4(float var1, float var2, float var3) {
      super(var1, var2, var3);
   }

   public Class4(float[] var1) {
      super(var1);
   }

   public Class4(Class4 var1) {
      super(var1);
   }

   public Class4(Class5 var1) {
      super(var1);
   }

   public Class4(Class2367 var1) {
      super(var1);
   }

   public Class4(Color var1) {
      super((float)var1.getRed() / 255.0F, (float)var1.getGreen() / 255.0F, (float)var1.getBlue() / 255.0F);
   }

   public Class4() {
   }

   public final void method2(Color var1) {
      this.field8 = (float)var1.getRed() / 255.0F;
      this.field9 = (float)var1.getGreen() / 255.0F;
      this.field10 = (float)var1.getBlue() / 255.0F;
   }

   public final Color method3() {
      int var3 = Math.round(this.field8 * 255.0F);
      int var4 = Math.round(this.field9 * 255.0F);
      int var5 = Math.round(this.field10 * 255.0F);
      return new Color(var3, var4, var5);
   }
}
