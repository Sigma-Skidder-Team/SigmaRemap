package mapped;

public class Class1639 implements Runnable {
   private static String[] field8898;
   public final int field8899;
   public final int field8900;
   public final double[] field8901;
   public final double[][][] field8902;
   public final Class7274 field8903;

   public Class1639(Class7274 var1, int var2, int var3, double[] var4, double[][][] var5) {
      this.field8903 = var1;
      this.field8899 = var2;
      this.field8900 = var3;
      this.field8901 = var4;
      this.field8902 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field8899; var3 < this.field8900; var3++) {
         int var4 = var3 * Class7274.method22894(this.field8903);

         for (int var5 = 0; var5 < Class7274.method22895(this.field8903); var5++) {
            System.arraycopy(
               this.field8901, var4 + var5 * Class7274.method22896(this.field8903), this.field8902[var3][var5], 0, Class7274.method22898(this.field8903)
            );
            Class7274.method22897(this.field8903).method27174(this.field8902[var3][var5]);
         }
      }
   }
}
