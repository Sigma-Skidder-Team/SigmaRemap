package remapped;

public class class_7482 implements Runnable {
   private static String[] field_38194;

   public class_7482(class_4993 var1, int var2, int var3, int var4, int var5, float[] var6, float[][] var7) {
      this.field_38195 = var1;
      this.field_38196 = var2;
      this.field_38197 = var3;
      this.field_38199 = var4;
      this.field_38192 = var5;
      this.field_38198 = var6;
      this.field_38193 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field_38196; var3 < this.field_38197; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < this.field_38199; var5++) {
            int var6 = 2 * var5;
            int var7 = var3 * this.field_38192 + var6;
            this.field_38198[var7] = this.field_38193[var5][var4];
            this.field_38198[var7 + 1] = this.field_38193[var5][var4 + 1];
         }
      }
   }
}
