package mapped;

public class Class412 implements Runnable {
   private static String[] field1803;
   public final int field1804;
   public final int field1805;
   public final double[][][] field1806;
   public final boolean field1807;
   public final Class7274 field1808;

   public Class412(Class7274 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field1808 = var1;
      this.field1804 = var2;
      this.field1805 = var3;
      this.field1806 = var4;
      this.field1807 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * Class7274.method22895(this.field1808)];

      for (int var4 = this.field1804; var4 < this.field1805; var4++) {
         for (int var5 = 0; var5 < Class7274.method22898(this.field1808); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < Class7274.method22895(this.field1808); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field1806[var4][var7][var6];
               var3[var8 + 1] = this.field1806[var4][var7][var6 + 1];
            }

            Class7274.method22899(this.field1808).method27166(var3, this.field1807);

            for (int var9 = 0; var9 < Class7274.method22895(this.field1808); var9++) {
               int var10 = 2 * var9;
               this.field1806[var4][var9][var6] = var3[var10];
               this.field1806[var4][var9][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
