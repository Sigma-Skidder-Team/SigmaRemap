package remapped;

public class class_3269 implements Runnable {
   private static String[] field_16185;

   public class_3269(class_3281 var1, int var2, int var3, int var4, double[] var5, double[] var6) {
      this.field_16187 = var1;
      this.field_16190 = var2;
      this.field_16186 = var3;
      this.field_16189 = var4;
      this.field_16184 = var5;
      this.field_16188 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_16190; var3 < this.field_16186; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         int var6 = this.field_16189 + var3;
         this.field_16184[var4] = this.field_16188[var6] * class_3281.method_15032(this.field_16187)[var4];
         this.field_16184[var5] = -this.field_16188[var6] * class_3281.method_15032(this.field_16187)[var5];
      }
   }
}
