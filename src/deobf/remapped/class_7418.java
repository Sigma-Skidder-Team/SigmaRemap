package remapped;

public class class_7418 implements Runnable {
   private static String[] field_37869;

   public class_7418(class_3281 var1, int var2, int var3, double[] var4) {
      this.field_37867 = var1;
      this.field_37868 = var2;
      this.field_37866 = var3;
      this.field_37870 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_37868; var3 < this.field_37866; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         double var6 = -this.field_37870[var4] * class_3281.method_15054(this.field_37867)[var5]
            + this.field_37870[var5] * class_3281.method_15054(this.field_37867)[var4];
         this.field_37870[var4] = this.field_37870[var4] * class_3281.method_15054(this.field_37867)[var4]
            + this.field_37870[var5] * class_3281.method_15054(this.field_37867)[var5];
         this.field_37870[var5] = var6;
      }
   }
}
