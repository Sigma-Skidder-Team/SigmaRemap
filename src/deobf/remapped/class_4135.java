package remapped;

public class class_4135 implements Runnable {
   private static String[] field_20125;

   public class_4135(class_9035 var1, int var2, int var3, int var4, int var5, double[] var6, double[][] var7) {
      this.field_20127 = var1;
      this.field_20130 = var2;
      this.field_20128 = var3;
      this.field_20124 = var4;
      this.field_20129 = var5;
      this.field_20126 = var6;
      this.field_20131 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field_20130; var3 < this.field_20128; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < this.field_20124; var5++) {
            int var6 = 2 * var5;
            int var7 = var3 * this.field_20129 + var6;
            this.field_20126[var7] = this.field_20131[var5][var4];
            this.field_20126[var7 + 1] = this.field_20131[var5][var4 + 1];
         }
      }
   }
}
