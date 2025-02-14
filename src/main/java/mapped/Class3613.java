package mapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class Class3613 extends Class3614 {
   private static String[] field19595;
   private float[][] field19596;
   private static final float field19597 = -Float.MAX_VALUE;

   public Class3613(String var1) {
      super(var1);
      this.method12236();
   }

   public void method12233(float var1, float var2, float var3, float var4) {
      int var7 = this.method12240();
      float[] var8 = this.field19596[var7];
      if (var8[0] != var1 || var8[1] != var2 || var8[2] != var3 || var8[3] != var4) {
         var8[0] = var1;
         var8[1] = var2;
         var8[2] = var3;
         var8[3] = var4;
         int var9 = this.method12241();
         if (var9 >= 0) {
            method12246();
            ARBShaderObjects.glUniform4fARB(var9, var1, var2, var3, var4);
            this.method12245();
         }
      }
   }

   public float[] method12234() {
      int var3 = this.method12240();
      return this.field19596[var3];
   }

   @Override
   public void method12235(int var1) {
      if (var1 >= this.field19596.length) {
         float[][] var4 = this.field19596;
         float[][] var5 = new float[var1 + 10][];
         System.arraycopy(var4, 0, var5, 0, var4.length);
         this.field19596 = var5;
      }

      if (this.field19596[var1] == null) {
         this.field19596[var1] = new float[]{-Float.MAX_VALUE, -Float.MAX_VALUE, -Float.MAX_VALUE, -Float.MAX_VALUE};
      }
   }

   @Override
   public void method12236() {
      this.field19596 = new float[][]{{-Float.MAX_VALUE, -Float.MAX_VALUE, -Float.MAX_VALUE, -Float.MAX_VALUE}};
   }
}
