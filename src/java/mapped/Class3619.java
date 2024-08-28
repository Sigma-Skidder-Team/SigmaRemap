package mapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class Class3619 extends Class3614 {
   private static String[] field19615;
   private float[][] field19616;
   private static final float field19617 = -Float.MAX_VALUE;

   public Class3619(String var1) {
      super(var1);
      this.method12236();
   }

   public void method12255(float var1, float var2) {
      int var5 = this.method12240();
      float[] var6 = this.field19616[var5];
      if (var6[0] != var1 || var6[1] != var2) {
         var6[0] = var1;
         var6[1] = var2;
         int var7 = this.method12241();
         if (var7 >= 0) {
            method12246();
            ARBShaderObjects.glUniform2fARB(var7, var1, var2);
            this.method12245();
         }
      }
   }

   public float[] method12256() {
      int var3 = this.method12240();
      return this.field19616[var3];
   }

   @Override
   public void method12235(int var1) {
      if (var1 >= this.field19616.length) {
         float[][] var4 = this.field19616;
         float[][] var5 = new float[var1 + 10][];
         System.arraycopy(var4, 0, var5, 0, var4.length);
         this.field19616 = var5;
      }

      if (this.field19616[var1] == null) {
         this.field19616[var1] = new float[]{-Float.MAX_VALUE, -Float.MAX_VALUE};
      }
   }

   @Override
   public void method12236() {
      this.field19616 = new float[][]{{-Float.MAX_VALUE, -Float.MAX_VALUE}};
   }
}
