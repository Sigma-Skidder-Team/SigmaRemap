package remapped;

public class class_4884 implements Runnable {
   private static String[] field_24287;

   public class_4884(class_3281 var1, int var2, int var3, int var4, double[] var5) {
      this.field_24288 = var1;
      this.field_24289 = var2;
      this.field_24292 = var3;
      this.field_24291 = var4;
      this.field_24290 = var5;
   }

   @Override
   public void run() {
      if (this.field_24289 <= 0) {
         for (int var3 = this.field_24292; var3 < this.field_24291; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            double var6 = this.field_24290[var4] * class_3281.method_15054(this.field_24288)[var5]
               + this.field_24290[var5] * class_3281.method_15054(this.field_24288)[var4];
            this.field_24290[var4] = this.field_24290[var4] * class_3281.method_15054(this.field_24288)[var4]
               - this.field_24290[var5] * class_3281.method_15054(this.field_24288)[var5];
            this.field_24290[var5] = var6;
         }
      } else {
         for (int var8 = this.field_24292; var8 < this.field_24291; var8++) {
            int var9 = 2 * var8;
            int var10 = var9 + 1;
            double var11 = -this.field_24290[var9] * class_3281.method_15054(this.field_24288)[var10]
               + this.field_24290[var10] * class_3281.method_15054(this.field_24288)[var9];
            this.field_24290[var9] = this.field_24290[var9] * class_3281.method_15054(this.field_24288)[var9]
               + this.field_24290[var10] * class_3281.method_15054(this.field_24288)[var10];
            this.field_24290[var10] = var11;
         }
      }
   }
}
