package mapped;

public class Class699 implements Runnable {
   private static String[] field3566;
   public final int field3567;
   public final int field3568;
   public final int field3569;
   public final int field3570;
   public final double[] field3571;
   public final double[][] field3572;
   public final Class9615 field3573;

   public Class699(Class9615 var1, int var2, int var3, int var4, int var5, double[] var6, double[][] var7) {
      this.field3573 = var1;
      this.field3567 = var2;
      this.field3568 = var3;
      this.field3569 = var4;
      this.field3570 = var5;
      this.field3571 = var6;
      this.field3572 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field3567; var3 < this.field3568; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < this.field3569; var5++) {
            int var6 = 2 * var5;
            int var7 = var3 * this.field3570 + var6;
            this.field3571[var7] = this.field3572[var5][var4];
            this.field3571[var7 + 1] = this.field3572[var5][var4 + 1];
         }
      }
   }
}
