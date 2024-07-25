package remapped;

public class class_3617 implements Runnable {
   private static String[] field_17655;

   public class_3617(class_3817 var1, int var2, int var3, float[] var4, int var5, float[] var6) {
      this.field_17652 = var1;
      this.field_17650 = var2;
      this.field_17654 = var3;
      this.field_17656 = var4;
      this.field_17653 = var5;
      this.field_17651 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_17650; var3 < this.field_17654; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         this.field_17656[this.field_17653 + var3] = this.field_17651[var4] - this.field_17651[var5];
         this.field_17656[this.field_17653 + class_3817.method_17792(this.field_17652) - var3] = this.field_17651[var4] + this.field_17651[var5];
      }
   }
}
