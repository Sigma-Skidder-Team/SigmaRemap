package remapped;

public class class_5426 implements Runnable {
   private static String[] field_27637;

   public class_5426(class_3281 var1, int var2, int var3, int var4, double[] var5, double[] var6) {
      this.field_27633 = var1;
      this.field_27635 = var2;
      this.field_27634 = var3;
      this.field_27632 = var4;
      this.field_27638 = var5;
      this.field_27636 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_27635; var3 < this.field_27634; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         int var6 = this.field_27632 + var3;
         this.field_27638[var4] = this.field_27636[var6] * class_3281.method_15032(this.field_27633)[var4];
         this.field_27638[var5] = this.field_27636[var6] * class_3281.method_15032(this.field_27633)[var5];
      }
   }
}
