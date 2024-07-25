package remapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class class_799 extends class_6045 {
   private static String[] field_4287;
   private int[][] field_4288;
   private static final int field_4286 = Integer.MIN_VALUE;

   public class_799(String var1) {
      super(var1);
      this.method_27606();
   }

   public void method_3540(int var1, int var2, int var3, int var4) {
      int var7 = this.method_27608();
      int[] var8 = this.field_4288[var7];
      if (var8[0] != var1 || var8[1] != var2 || var8[2] != var3 || var8[3] != var4) {
         var8[0] = var1;
         var8[1] = var2;
         var8[2] = var3;
         var8[3] = var4;
         int var9 = this.method_27604();
         if (var9 >= 0) {
            method_27609();
            ARBShaderObjects.glUniform4iARB(var9, var1, var2, var3, var4);
            this.method_27599();
         }
      }
   }

   public int[] method_3541() {
      int var3 = this.method_27608();
      return this.field_4288[var3];
   }

   @Override
   public void method_27603(int var1) {
      if (var1 >= this.field_4288.length) {
         int[][] var4 = this.field_4288;
         int[][] var5 = new int[var1 + 10][];
         System.arraycopy(var4, 0, var5, 0, var4.length);
         this.field_4288 = var5;
      }

      if (this.field_4288[var1] == null) {
         this.field_4288[var1] = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
      }
   }

   @Override
   public void method_27606() {
      this.field_4288 = new int[][]{{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE}};
   }
}
