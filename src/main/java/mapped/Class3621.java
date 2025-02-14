package mapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class Class3621 extends Class3614 {
   private static String[] field19621;
   private int[][] field19622;
   private static final int field19623 = Integer.MIN_VALUE;

   public Class3621(String var1) {
      super(var1);
      this.method12236();
   }

   public void method12259(int var1, int var2) {
      int var5 = this.method12240();
      int[] var6 = this.field19622[var5];
      if (var6[0] != var1 || var6[1] != var2) {
         var6[0] = var1;
         var6[1] = var2;
         int var7 = this.method12241();
         if (var7 >= 0) {
            method12246();
            ARBShaderObjects.glUniform2iARB(var7, var1, var2);
            this.method12245();
         }
      }
   }

   public int[] method12260() {
      int var3 = this.method12240();
      return this.field19622[var3];
   }

   @Override
   public void method12235(int var1) {
      if (var1 >= this.field19622.length) {
         int[][] var4 = this.field19622;
         int[][] var5 = new int[var1 + 10][];
         System.arraycopy(var4, 0, var5, 0, var4.length);
         this.field19622 = var5;
      }

      if (this.field19622[var1] == null) {
         this.field19622[var1] = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
      }
   }

   @Override
   public void method12236() {
      this.field19622 = new int[][]{{Integer.MIN_VALUE, Integer.MIN_VALUE}};
   }
}
