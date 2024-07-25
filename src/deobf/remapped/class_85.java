package remapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class class_85 extends class_6045 {
   private static String[] field_157;
   private float[][] field_156;
   private static final float field_158 = -Float.MAX_VALUE;

   public class_85(String var1) {
      super(var1);
      this.method_27606();
   }

   public void method_207(float var1, float var2, float var3, float var4) {
      int var7 = this.method_27608();
      float[] var8 = this.field_156[var7];
      if (var8[0] != var1 || var8[1] != var2 || var8[2] != var3 || var8[3] != var4) {
         var8[0] = var1;
         var8[1] = var2;
         var8[2] = var3;
         var8[3] = var4;
         int var9 = this.method_27604();
         if (var9 >= 0) {
            method_27609();
            ARBShaderObjects.glUniform4fARB(var9, var1, var2, var3, var4);
            this.method_27599();
         }
      }
   }

   public float[] method_208() {
      int var3 = this.method_27608();
      return this.field_156[var3];
   }

   @Override
   public void method_27603(int var1) {
      if (var1 >= this.field_156.length) {
         float[][] var4 = this.field_156;
         float[][] var5 = new float[var1 + 10][];
         System.arraycopy(var4, 0, var5, 0, var4.length);
         this.field_156 = var5;
      }

      if (this.field_156[var1] == null) {
         this.field_156[var1] = new float[]{-Float.MAX_VALUE, -Float.MAX_VALUE, -Float.MAX_VALUE, -Float.MAX_VALUE};
      }
   }

   @Override
   public void method_27606() {
      this.field_156 = new float[][]{{-Float.MAX_VALUE, -Float.MAX_VALUE, -Float.MAX_VALUE, -Float.MAX_VALUE}};
   }
}
