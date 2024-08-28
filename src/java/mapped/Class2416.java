package mapped;

import java.awt.Color;
import java.io.Serializable;

public class Class2416 extends Class2411 implements Serializable {
   private static String[] field16400;
   public static final long field16388 = 8577680141580006740L;

   public Class2416(float var1, float var2, float var3, float var4) {
      super(var1, var2, var3, var4);
   }

   public Class2416(float[] var1) {
      super(var1);
   }

   public Class2416(Class2416 var1) {
      super(var1);
   }

   public Class2416(Class2411 var1) {
      super(var1);
   }

   public Class2416(Class2387 var1) {
      super(var1);
   }

   public Class2416(Color var1) {
      super((float)var1.getRed() / 255.0F, (float)var1.getGreen() / 255.0F, (float)var1.getBlue() / 255.0F, (float)var1.getAlpha() / 255.0F);
   }

   public Class2416() {
   }

   public final void method10238(Color var1) {
      this.field16389 = (float)var1.getRed() / 255.0F;
      this.field16390 = (float)var1.getGreen() / 255.0F;
      this.field16391 = (float)var1.getBlue() / 255.0F;
      this.field16392 = (float)var1.getAlpha() / 255.0F;
   }

   public final Color method10239() {
      int var3 = Math.round(this.field16389 * 255.0F);
      int var4 = Math.round(this.field16390 * 255.0F);
      int var5 = Math.round(this.field16391 * 255.0F);
      int var6 = Math.round(this.field16392 * 255.0F);
      return new Color(var3, var4, var5, var6);
   }
}
