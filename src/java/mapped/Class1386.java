package mapped;

public class Class1386 implements Runnable {
   private static String[] field7405;
   public final int field7406;
   public final int field7407;
   public final double[][][] field7408;
   public final boolean field7409;
   public final Class7274 field7410;

   public Class1386(Class7274 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field7410 = var1;
      this.field7406 = var2;
      this.field7407 = var3;
      this.field7408 = var4;
      this.field7409 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * Class7274.method22900(this.field7410)];

      for (int var4 = this.field7406; var4 < this.field7407; var4++) {
         for (int var5 = 0; var5 < Class7274.method22898(this.field7410); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < Class7274.method22900(this.field7410); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field7408[var7][var4][var6];
               var3[var8 + 1] = this.field7408[var7][var4][var6 + 1];
            }

            Class7274.method22901(this.field7410).method27166(var3, this.field7409);

            for (int var9 = 0; var9 < Class7274.method22900(this.field7410); var9++) {
               int var10 = 2 * var9;
               this.field7408[var9][var4][var6] = var3[var10];
               this.field7408[var9][var4][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
