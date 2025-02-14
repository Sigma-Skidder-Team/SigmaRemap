package mapped;

public class Class753 implements Runnable {
   private static String[] field3907;
   public final int field3908;
   public final int field3909;
   public final double[] field3910;
   public final double[][][] field3911;
   public final boolean field3912;
   public final Class7274 field3913;

   public Class753(Class7274 var1, int var2, int var3, double[] var4, double[][][] var5, boolean var6) {
      this.field3913 = var1;
      this.field3908 = var2;
      this.field3909 = var3;
      this.field3910 = var4;
      this.field3911 = var5;
      this.field3912 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field3908; var3 < this.field3909; var3++) {
         int var4 = var3 * Class7274.method22894(this.field3913);

         for (int var5 = 0; var5 < Class7274.method22895(this.field3913); var5++) {
            System.arraycopy(
               this.field3910, var4 + var5 * Class7274.method22896(this.field3913), this.field3911[var3][var5], 0, Class7274.method22898(this.field3913)
            );
            Class7274.method22897(this.field3913).method27182(this.field3911[var3][var5], this.field3912);
         }
      }
   }
}
