package remapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class class_8800 extends class_6045 {
   private static String[] field_45019;
   private int[] field_45021;
   private static final int field_45020 = Integer.MIN_VALUE;

   public class_8800(String var1) {
      super(var1);
      this.method_27606();
   }

   public void method_40456(int var1) {
      int var4 = this.method_27608();
      int var5 = this.field_45021[var4];
      if (var1 != var5) {
         this.field_45021[var4] = var1;
         int var6 = this.method_27604();
         if (var6 >= 0) {
            method_27609();
            ARBShaderObjects.glUniform1iARB(var6, var1);
            this.method_27599();
         }
      }
   }

   public int method_40457() {
      int var3 = this.method_27608();
      return this.field_45021[var3];
   }

   @Override
   public void method_27603(int var1) {
      if (var1 >= this.field_45021.length) {
         int[] var4 = this.field_45021;
         int[] var5 = new int[var1 + 10];
         System.arraycopy(var4, 0, var5, 0, var4.length);

         for (int var6 = var4.length; var6 < var5.length; var6++) {
            var5[var6] = Integer.MIN_VALUE;
         }

         this.field_45021 = var5;
      }
   }

   @Override
   public void method_27606() {
      this.field_45021 = new int[]{Integer.MIN_VALUE};
   }
}
