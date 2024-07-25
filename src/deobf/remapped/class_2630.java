package remapped;

public class class_2630 implements Runnable {
   private static String[] field_12961;

   public class_2630(class_3281 var1, int var2, int var3, double[] var4) {
      this.field_12963 = var1;
      this.field_12960 = var2;
      this.field_12959 = var3;
      this.field_12962 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_12960; var3 < this.field_12959; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         double var6 = this.field_12962[var4] * class_3281.method_15054(this.field_12963)[var5]
            + this.field_12962[var5] * class_3281.method_15054(this.field_12963)[var4];
         this.field_12962[var4] = this.field_12962[var4] * class_3281.method_15054(this.field_12963)[var4]
            - this.field_12962[var5] * class_3281.method_15054(this.field_12963)[var5];
         this.field_12962[var5] = var6;
      }
   }
}
