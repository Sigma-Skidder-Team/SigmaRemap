package remapped;

public class class_3298 implements Runnable {
   private static String[] field_16318;

   public class_3298(class_3281 var1, int var2, int var3, double[] var4) {
      this.field_16316 = var1;
      this.field_16315 = var2;
      this.field_16319 = var3;
      this.field_16317 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_16315; var3 < this.field_16319; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         double var6 = -this.field_16317[var4] * class_3281.method_15054(this.field_16316)[var5]
            + this.field_16317[var5] * class_3281.method_15054(this.field_16316)[var4];
         this.field_16317[var4] = this.field_16317[var4] * class_3281.method_15054(this.field_16316)[var4]
            + this.field_16317[var5] * class_3281.method_15054(this.field_16316)[var5];
         this.field_16317[var5] = var6;
      }
   }
}
