package mapped;

public class Class583 implements Runnable {
   private static String[] field2857;
   public final int field2858;
   public final int field2859;
   public final double[][][] field2860;
   public final Class8832 field2861;

   public Class583(Class8832 var1, int var2, int var3, double[][][] var4) {
      this.field2861 = var1;
      this.field2858 = var2;
      this.field2859 = var3;
      this.field2860 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class8832.method31961(this.field2861)];

      for (int var4 = this.field2858; var4 < this.field2859; var4++) {
         for (int var5 = 0; var5 < Class8832.method31959(this.field2861); var5++) {
            for (int var6 = 0; var6 < Class8832.method31961(this.field2861); var6++) {
               var3[var6] = this.field2860[var6][var4][var5];
            }

            Class8832.method31962(this.field2861).method33646(var3);

            for (int var7 = 0; var7 < Class8832.method31961(this.field2861); var7++) {
               this.field2860[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}
