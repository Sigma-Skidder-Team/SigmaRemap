package mapped;

public class Class1473 implements Runnable {
   private static String[] field7925;
   public final int field7926;
   public final int field7927;
   public final double[][][] field7928;
   public final Class7274 field7929;

   public Class1473(Class7274 var1, int var2, int var3, double[][][] var4) {
      this.field7929 = var1;
      this.field7926 = var2;
      this.field7927 = var3;
      this.field7928 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * Class7274.method22900(this.field7929)];

      for (int var4 = this.field7926; var4 < this.field7927; var4++) {
         for (int var5 = 0; var5 < Class7274.method22898(this.field7929); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < Class7274.method22900(this.field7929); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field7928[var7][var4][var6];
               var3[var8 + 1] = this.field7928[var7][var4][var6 + 1];
            }

            Class7274.method22901(this.field7929).method27162(var3);

            for (int var9 = 0; var9 < Class7274.method22900(this.field7929); var9++) {
               int var10 = 2 * var9;
               this.field7928[var9][var4][var6] = var3[var10];
               this.field7928[var9][var4][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
