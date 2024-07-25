package remapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class class_7836 extends class_6045 {
   private static String[] field_39732;
   private int[][] field_39730;
   private static final int field_39731 = Integer.MIN_VALUE;

   public class_7836(String var1) {
      super(var1);
      this.method_27606();
   }

   public void method_35465(int var1, int var2) {
      int var5 = this.method_27608();
      int[] var6 = this.field_39730[var5];
      if (var6[0] != var1 || var6[1] != var2) {
         var6[0] = var1;
         var6[1] = var2;
         int var7 = this.method_27604();
         if (var7 >= 0) {
            method_27609();
            ARBShaderObjects.glUniform2iARB(var7, var1, var2);
            this.method_27599();
         }
      }
   }

   public int[] method_35466() {
      int var3 = this.method_27608();
      return this.field_39730[var3];
   }

   @Override
   public void method_27603(int var1) {
      if (var1 >= this.field_39730.length) {
         int[][] var4 = this.field_39730;
         int[][] var5 = new int[var1 + 10][];
         System.arraycopy(var4, 0, var5, 0, var4.length);
         this.field_39730 = var5;
      }

      if (this.field_39730[var1] == null) {
         this.field_39730[var1] = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
      }
   }

   @Override
   public void method_27606() {
      this.field_39730 = new int[][]{{Integer.MIN_VALUE, Integer.MIN_VALUE}};
   }
}
