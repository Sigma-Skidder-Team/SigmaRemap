package remapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class class_2296 extends class_6045 {
   private static String[] field_11468;
   private float[] field_11467;
   private static final float field_11466 = -Float.MAX_VALUE;

   public class_2296(String var1) {
      super(var1);
      this.method_27606();
   }

   public void method_10563(float var1) {
      int var4 = this.method_27608();
      float var5 = this.field_11467[var4];
      if (var1 != var5) {
         this.field_11467[var4] = var1;
         int var6 = this.method_27604();
         if (var6 >= 0) {
            method_27609();
            ARBShaderObjects.glUniform1fARB(var6, var1);
            this.method_27599();
         }
      }
   }

   public float method_10564() {
      int var3 = this.method_27608();
      return this.field_11467[var3];
   }

   @Override
   public void method_27603(int var1) {
      if (var1 >= this.field_11467.length) {
         float[] var4 = this.field_11467;
         float[] var5 = new float[var1 + 10];
         System.arraycopy(var4, 0, var5, 0, var4.length);

         for (int var6 = var4.length; var6 < var5.length; var6++) {
            var5[var6] = -Float.MAX_VALUE;
         }

         this.field_11467 = var5;
      }
   }

   @Override
   public void method_27606() {
      this.field_11467 = new float[]{-Float.MAX_VALUE};
   }
}
