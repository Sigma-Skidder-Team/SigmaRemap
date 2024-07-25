package remapped;

public class class_5138 implements Runnable {
   private static String[] field_26482;

   public class_5138(class_6816 var1, int var2, int var3, double[] var4, int var5, double[] var6) {
      this.field_26487 = var1;
      this.field_26486 = var2;
      this.field_26481 = var3;
      this.field_26484 = var4;
      this.field_26485 = var5;
      this.field_26483 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_26486; var3 < this.field_26481; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         this.field_26484[this.field_26485 + var3] = this.field_26483[var4] - this.field_26483[var5];
         this.field_26484[this.field_26485 + class_6816.method_31279(this.field_26487) - var3] = this.field_26483[var4] + this.field_26483[var5];
      }
   }
}
