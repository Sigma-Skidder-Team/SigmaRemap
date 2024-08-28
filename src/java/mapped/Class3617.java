package mapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class Class3617 extends Class3614 {
   private static String[] field19609;
   private int[] field19610;
   private static final int field19611 = Integer.MIN_VALUE;

   public Class3617(String var1) {
      super(var1);
      this.method12236();
   }

   public void method12251(int var1) {
      int var4 = this.method12240();
      int var5 = this.field19610[var4];
      if (var1 != var5) {
         this.field19610[var4] = var1;
         int var6 = this.method12241();
         if (var6 >= 0) {
            method12246();
            ARBShaderObjects.glUniform1iARB(var6, var1);
            this.method12245();
         }
      }
   }

   public int method12252() {
      int var3 = this.method12240();
      return this.field19610[var3];
   }

   @Override
   public void method12235(int var1) {
      if (var1 >= this.field19610.length) {
         int[] var4 = this.field19610;
         int[] var5 = new int[var1 + 10];
         System.arraycopy(var4, 0, var5, 0, var4.length);

         for (int var6 = var4.length; var6 < var5.length; var6++) {
            var5[var6] = Integer.MIN_VALUE;
         }

         this.field19610 = var5;
      }
   }

   @Override
   public void method12236() {
      this.field19610 = new int[]{Integer.MIN_VALUE};
   }
}
