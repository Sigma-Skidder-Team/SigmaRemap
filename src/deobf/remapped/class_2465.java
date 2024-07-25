package remapped;

public class class_2465 implements Runnable {
   private static String[] field_12326;

   public class_2465(class_9697 var1, int var2, int var3, double[] var4, int var5, double[] var6) {
      this.field_12327 = var1;
      this.field_12331 = var2;
      this.field_12330 = var3;
      this.field_12328 = var4;
      this.field_12329 = var5;
      this.field_12332 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_12331; var3 < this.field_12330; var3++) {
         int var4 = 2 * var3;
         double var5 = this.field_12328[this.field_12329 + var3];
         this.field_12332[var4] = class_9697.method_44817(this.field_12327)[var4] * var5;
         this.field_12332[var4 + 1] = -class_9697.method_44817(this.field_12327)[var4 + 1] * var5;
      }
   }
}
