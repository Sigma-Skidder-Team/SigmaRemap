package mapped;

public class Class646 implements Runnable {
   private static String[] field3232;
   public final int field3233;
   public final int field3234;
   public final int field3235;
   public final double[] field3236;
   public final Class9615 field3237;

   public Class646(Class9615 var1, int var2, int var3, int var4, double[] var5) {
      this.field3237 = var1;
      this.field3233 = var2;
      this.field3234 = var3;
      this.field3235 = var4;
      this.field3236 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * Class9615.method37424(this.field3237)];

      for (int var4 = this.field3233; var4 < this.field3234; var4++) {
         int var5 = 2 * var4;

         for (int var6 = 0; var6 < Class9615.method37424(this.field3237); var6++) {
            int var7 = 2 * var6;
            int var8 = var6 * this.field3235 + var5;
            var3[var7] = this.field3236[var8];
            var3[var7 + 1] = this.field3236[var8 + 1];
         }

         Class9615.method37425(this.field3237).method27162(var3);

         for (int var9 = 0; var9 < Class9615.method37424(this.field3237); var9++) {
            int var10 = 2 * var9;
            int var11 = var9 * this.field3235 + var5;
            this.field3236[var11] = var3[var10];
            this.field3236[var11 + 1] = var3[var10 + 1];
         }
      }
   }
}
