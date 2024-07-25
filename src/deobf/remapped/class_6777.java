package remapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class class_6777 extends class_6045 {
   private static String[] field_34968;
   private float[][] field_34970;
   private static final float field_34969 = -Float.MAX_VALUE;

   public class_6777(String var1) {
      super(var1);
      this.method_27606();
   }

   public void method_31090(float var1, float var2, float var3) {
      int var6 = this.method_27608();
      float[] var7 = this.field_34970[var6];
      if (var7[0] != var1 || var7[1] != var2 || var7[2] != var3) {
         var7[0] = var1;
         var7[1] = var2;
         var7[2] = var3;
         int var8 = this.method_27604();
         if (var8 >= 0) {
            method_27609();
            ARBShaderObjects.glUniform3fARB(var8, var1, var2, var3);
            this.method_27599();
         }
      }
   }

   public float[] method_31091() {
      int var3 = this.method_27608();
      return this.field_34970[var3];
   }

   @Override
   public void method_27603(int var1) {
      if (var1 >= this.field_34970.length) {
         float[][] var4 = this.field_34970;
         float[][] var5 = new float[var1 + 10][];
         System.arraycopy(var4, 0, var5, 0, var4.length);
         this.field_34970 = var5;
      }

      if (this.field_34970[var1] == null) {
         this.field_34970[var1] = new float[]{-Float.MAX_VALUE, -Float.MAX_VALUE, -Float.MAX_VALUE};
      }
   }

   @Override
   public void method_27606() {
      this.field_34970 = new float[][]{{-Float.MAX_VALUE, -Float.MAX_VALUE, -Float.MAX_VALUE}};
   }
}
