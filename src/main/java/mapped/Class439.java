package mapped;

public class Class439 implements Runnable {
   private static String[] field1974;
   public final int field1975;
   public final int field1976;
   public final double[][][] field1977;
   public final boolean field1978;
   public final Class6352 field1979;

   public Class439(Class6352 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field1979 = var1;
      this.field1975 = var2;
      this.field1976 = var3;
      this.field1977 = var4;
      this.field1978 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class6352.method19333(this.field1979)];

      for (int var4 = this.field1975; var4 < this.field1976; var4++) {
         for (int var5 = 0; var5 < Class6352.method19331(this.field1979); var5++) {
            for (int var6 = 0; var6 < Class6352.method19333(this.field1979); var6++) {
               var3[var6] = this.field1977[var6][var4][var5];
            }

            Class6352.method19334(this.field1979).method38576(var3, this.field1978);

            for (int var7 = 0; var7 < Class6352.method19333(this.field1979); var7++) {
               this.field1977[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}
