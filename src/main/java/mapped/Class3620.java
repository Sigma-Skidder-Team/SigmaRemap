package mapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class Class3620 extends Class3614 {
   private static String[] field19618;
   private float[] field19619;
   private static final float field19620 = -Float.MAX_VALUE;

   public Class3620(String var1) {
      super(var1);
      this.method12236();
   }

   public void method12257(float var1) {
      int var4 = this.method12240();
      float var5 = this.field19619[var4];
      if (var1 != var5) {
         this.field19619[var4] = var1;
         int var6 = this.method12241();
         if (var6 >= 0) {
            method12246();
            ARBShaderObjects.glUniform1fARB(var6, var1);
            this.method12245();
         }
      }
   }

   public float method12258() {
      int var3 = this.method12240();
      return this.field19619[var3];
   }

   @Override
   public void method12235(int var1) {
      if (var1 >= this.field19619.length) {
         float[] var4 = this.field19619;
         float[] var5 = new float[var1 + 10];
         System.arraycopy(var4, 0, var5, 0, var4.length);

         for (int var6 = var4.length; var6 < var5.length; var6++) {
            var5[var6] = -Float.MAX_VALUE;
         }

         this.field19619 = var5;
      }
   }

   @Override
   public void method12236() {
      this.field19619 = new float[]{-Float.MAX_VALUE};
   }
}
