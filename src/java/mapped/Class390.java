package mapped;

public class Class390 implements Runnable {
   private static String[] field1655;
   public final int field1656;
   public final int field1657;
   public final double[][][] field1658;
   public final Class8832 field1659;

   public Class390(Class8832 var1, int var2, int var3, double[][][] var4) {
      this.field1659 = var1;
      this.field1656 = var2;
      this.field1657 = var3;
      this.field1658 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class8832.method31956(this.field1659)];

      for (int var4 = this.field1656; var4 < this.field1657; var4++) {
         for (int var5 = 0; var5 < Class8832.method31959(this.field1659); var5++) {
            for (int var6 = 0; var6 < Class8832.method31956(this.field1659); var6++) {
               var3[var6] = this.field1658[var4][var6][var5];
            }

            Class8832.method31960(this.field1659).method33646(var3);

            for (int var7 = 0; var7 < Class8832.method31956(this.field1659); var7++) {
               this.field1658[var4][var7][var5] = var3[var7];
            }
         }
      }
   }
}
