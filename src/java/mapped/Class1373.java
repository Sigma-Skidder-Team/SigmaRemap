package mapped;

public class Class1373 implements Runnable {
   private static String[] field7335;
   public final int field7336;
   public final int field7337;
   public final double[] field7338;
   public final boolean field7339;
   public final Class7274 field7340;

   public Class1373(Class7274 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field7340 = var1;
      this.field7336 = var2;
      this.field7337 = var3;
      this.field7338 = var4;
      this.field7339 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * Class7274.method22900(this.field7340)];

      for (int var4 = this.field7336; var4 < this.field7337; var4++) {
         int var5 = var4 * Class7274.method22896(this.field7340);

         for (int var6 = 0; var6 < Class7274.method22898(this.field7340); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < Class7274.method22900(this.field7340); var8++) {
               int var9 = var8 * Class7274.method22894(this.field7340) + var5 + var7;
               int var10 = 2 * var8;
               var3[var10] = this.field7338[var9];
               var3[var10 + 1] = this.field7338[var9 + 1];
            }

            Class7274.method22901(this.field7340).method27166(var3, this.field7339);

            for (int var11 = 0; var11 < Class7274.method22900(this.field7340); var11++) {
               int var12 = var11 * Class7274.method22894(this.field7340) + var5 + var7;
               int var13 = 2 * var11;
               this.field7338[var12] = var3[var13];
               this.field7338[var12 + 1] = var3[var13 + 1];
            }
         }
      }
   }
}
