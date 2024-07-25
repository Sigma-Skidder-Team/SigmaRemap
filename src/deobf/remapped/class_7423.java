package remapped;

public class class_7423 implements Runnable {
   private static String[] field_37880;

   public class_7423(class_3281 var1, int var2, int var3, int var4, double[] var5) {
      this.field_37877 = var1;
      this.field_37881 = var2;
      this.field_37879 = var3;
      this.field_37878 = var4;
      this.field_37882 = var5;
   }

   @Override
   public void run() {
      if (this.field_37881 <= 0) {
         for (int var3 = this.field_37879; var3 < this.field_37878; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            double var6 = this.field_37882[var4] * class_3281.method_15054(this.field_37877)[var5]
               + this.field_37882[var5] * class_3281.method_15054(this.field_37877)[var4];
            this.field_37882[var4] = this.field_37882[var4] * class_3281.method_15054(this.field_37877)[var4]
               - this.field_37882[var5] * class_3281.method_15054(this.field_37877)[var5];
            this.field_37882[var5] = var6;
         }
      } else {
         for (int var8 = this.field_37879; var8 < this.field_37878; var8++) {
            int var9 = 2 * var8;
            int var10 = var9 + 1;
            double var11 = -this.field_37882[var9] * class_3281.method_15054(this.field_37877)[var10]
               + this.field_37882[var10] * class_3281.method_15054(this.field_37877)[var9];
            this.field_37882[var9] = this.field_37882[var9] * class_3281.method_15054(this.field_37877)[var9]
               + this.field_37882[var10] * class_3281.method_15054(this.field_37877)[var10];
            this.field_37882[var10] = var11;
         }
      }
   }
}
