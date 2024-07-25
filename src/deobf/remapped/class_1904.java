package remapped;

public class class_1904 implements Runnable {
   private static String[] field_9720;

   public class_1904(class_9035 var1, int var2, int var3, int var4, int var5, double[] var6, double[][] var7) {
      this.field_9718 = var1;
      this.field_9719 = var2;
      this.field_9721 = var3;
      this.field_9717 = var4;
      this.field_9724 = var5;
      this.field_9723 = var6;
      this.field_9722 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field_9719; var3 < this.field_9721; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < this.field_9717; var5++) {
            int var6 = 2 * var5;
            int var7 = var3 * this.field_9724 + var6;
            this.field_9723[var7] = this.field_9722[var5][var4];
            this.field_9723[var7 + 1] = this.field_9722[var5][var4 + 1];
         }
      }
   }
}
