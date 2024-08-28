package mapped;

public class Class421 implements Runnable {
   private static String[] field1856;
   public final int field1857;
   public final int field1858;
   public final double[][][] field1859;
   public final boolean field1860;
   public final Class7274 field1861;

   public Class421(Class7274 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field1861 = var1;
      this.field1857 = var2;
      this.field1858 = var3;
      this.field1859 = var4;
      this.field1860 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * Class7274.method22900(this.field1861)];

      for (int var4 = this.field1857; var4 < this.field1858; var4++) {
         for (int var5 = 0; var5 < Class7274.method22898(this.field1861); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < Class7274.method22900(this.field1861); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field1859[var7][var4][var6];
               var3[var8 + 1] = this.field1859[var7][var4][var6 + 1];
            }

            Class7274.method22901(this.field1861).method27166(var3, this.field1860);

            for (int var9 = 0; var9 < Class7274.method22900(this.field1861); var9++) {
               int var10 = 2 * var9;
               this.field1859[var9][var4][var6] = var3[var10];
               this.field1859[var9][var4][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
