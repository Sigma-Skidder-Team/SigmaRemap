package mapped;

public class Class1404 implements Runnable {
   private static String[] field7514;
   public final int field7515;
   public final int field7516;
   public final double[][] field7517;
   public final double[] field7518;
   public final Class9615 field7519;

   public Class1404(Class9615 var1, int var2, int var3, double[][] var4, double[] var5) {
      this.field7519 = var1;
      this.field7515 = var2;
      this.field7516 = var3;
      this.field7517 = var4;
      this.field7518 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field7515; var3 < this.field7516; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < Class9615.method37424(this.field7519); var5++) {
            int var6 = 2 * var5;
            int var7 = var5 * Class9615.method37427(this.field7519) + var4;
            this.field7517[var3][var6] = this.field7518[var7];
            this.field7517[var3][var6 + 1] = this.field7518[var7 + 1];
         }

         Class9615.method37425(this.field7519).method27162(this.field7517[var3]);
      }
   }
}
