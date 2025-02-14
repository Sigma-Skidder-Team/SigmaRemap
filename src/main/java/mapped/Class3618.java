package mapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class Class3618 extends Class3614 {
   private static String[] field19612;
   private float[][] field19613;
   private static final float field19614 = -Float.MAX_VALUE;

   public Class3618(String var1) {
      super(var1);
      this.method12236();
   }

   public void method12253(float var1, float var2, float var3) {
      int var6 = this.method12240();
      float[] var7 = this.field19613[var6];
      if (var7[0] != var1 || var7[1] != var2 || var7[2] != var3) {
         var7[0] = var1;
         var7[1] = var2;
         var7[2] = var3;
         int var8 = this.method12241();
         if (var8 >= 0) {
            method12246();
            ARBShaderObjects.glUniform3fARB(var8, var1, var2, var3);
            this.method12245();
         }
      }
   }

   public float[] method12254() {
      int var3 = this.method12240();
      return this.field19613[var3];
   }

   @Override
   public void method12235(int var1) {
      if (var1 >= this.field19613.length) {
         float[][] var4 = this.field19613;
         float[][] var5 = new float[var1 + 10][];
         System.arraycopy(var4, 0, var5, 0, var4.length);
         this.field19613 = var5;
      }

      if (this.field19613[var1] == null) {
         this.field19613[var1] = new float[]{-Float.MAX_VALUE, -Float.MAX_VALUE, -Float.MAX_VALUE};
      }
   }

   @Override
   public void method12236() {
      this.field19613 = new float[][]{{-Float.MAX_VALUE, -Float.MAX_VALUE, -Float.MAX_VALUE}};
   }
}
