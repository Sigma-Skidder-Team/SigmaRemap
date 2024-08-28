package mapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class Class3616 extends Class3614 {
   private static String[] field19606;
   private int[][] field19607;
   private static final int field19608 = Integer.MIN_VALUE;

   public Class3616(String var1) {
      super(var1);
      this.method12236();
   }

   public void method12249(int var1, int var2, int var3, int var4) {
      int var7 = this.method12240();
      int[] var8 = this.field19607[var7];
      if (var8[0] != var1 || var8[1] != var2 || var8[2] != var3 || var8[3] != var4) {
         var8[0] = var1;
         var8[1] = var2;
         var8[2] = var3;
         var8[3] = var4;
         int var9 = this.method12241();
         if (var9 >= 0) {
            method12246();
            ARBShaderObjects.glUniform4iARB(var9, var1, var2, var3, var4);
            this.method12245();
         }
      }
   }

   public int[] method12250() {
      int var3 = this.method12240();
      return this.field19607[var3];
   }

   @Override
   public void method12235(int var1) {
      if (var1 >= this.field19607.length) {
         int[][] var4 = this.field19607;
         int[][] var5 = new int[var1 + 10][];
         System.arraycopy(var4, 0, var5, 0, var4.length);
         this.field19607 = var5;
      }

      if (this.field19607[var1] == null) {
         this.field19607[var1] = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
      }
   }

   @Override
   public void method12236() {
      this.field19607 = new int[][]{{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE}};
   }
}
