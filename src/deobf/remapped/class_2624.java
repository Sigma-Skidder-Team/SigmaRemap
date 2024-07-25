package remapped;

public class class_2624 implements Runnable {
   private static String[] field_12934;

   public class_2624(class_4993 var1, int var2, int var3, int var4, float[] var5, boolean var6) {
      this.field_12939 = var1;
      this.field_12933 = var2;
      this.field_12937 = var3;
      this.field_12935 = var4;
      this.field_12936 = var5;
      this.field_12938 = var6;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * class_4993.method_22973(this.field_12939)];

      for (int var4 = this.field_12933; var4 < this.field_12937; var4++) {
         int var5 = 2 * var4;

         for (int var6 = 0; var6 < class_4993.method_22973(this.field_12939); var6++) {
            int var7 = 2 * var6;
            int var8 = var6 * this.field_12935 + var5;
            var3[var7] = this.field_12936[var8];
            var3[var7 + 1] = this.field_12936[var8 + 1];
         }

         class_4993.method_22985(this.field_12939).method_24216(var3, this.field_12938);

         for (int var9 = 0; var9 < class_4993.method_22973(this.field_12939); var9++) {
            int var10 = 2 * var9;
            int var11 = var9 * this.field_12935 + var5;
            this.field_12936[var11] = var3[var10];
            this.field_12936[var11 + 1] = var3[var10 + 1];
         }
      }
   }
}
