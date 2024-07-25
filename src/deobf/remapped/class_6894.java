package remapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class class_6894 extends class_6045 {
   private static String[] field_35460;
   private float[][] field_35458;
   private static final float field_35459 = -Float.MAX_VALUE;

   public class_6894(String var1) {
      super(var1);
      this.method_27606();
   }

   public void method_31585(float var1, float var2) {
      int var5 = this.method_27608();
      float[] var6 = this.field_35458[var5];
      if (var6[0] != var1 || var6[1] != var2) {
         var6[0] = var1;
         var6[1] = var2;
         int var7 = this.method_27604();
         if (var7 >= 0) {
            method_27609();
            ARBShaderObjects.glUniform2fARB(var7, var1, var2);
            this.method_27599();
         }
      }
   }

   public float[] method_31586() {
      int var3 = this.method_27608();
      return this.field_35458[var3];
   }

   @Override
   public void method_27603(int var1) {
      if (var1 >= this.field_35458.length) {
         float[][] var4 = this.field_35458;
         float[][] var5 = new float[var1 + 10][];
         System.arraycopy(var4, 0, var5, 0, var4.length);
         this.field_35458 = var5;
      }

      if (this.field_35458[var1] == null) {
         this.field_35458[var1] = new float[]{-Float.MAX_VALUE, -Float.MAX_VALUE};
      }
   }

   @Override
   public void method_27606() {
      this.field_35458 = new float[][]{{-Float.MAX_VALUE, -Float.MAX_VALUE}};
   }
}
