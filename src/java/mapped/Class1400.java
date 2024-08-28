package mapped;

public class Class1400 implements Runnable {
   private static String[] field7487;
   public final int field7488;
   public final int field7489;
   public final double[] field7490;
   public final Class7274 field7491;

   public Class1400(Class7274 var1, int var2, int var3, double[] var4) {
      this.field7491 = var1;
      this.field7488 = var2;
      this.field7489 = var3;
      this.field7490 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * Class7274.method22900(this.field7491)];

      for (int var4 = this.field7488; var4 < this.field7489; var4++) {
         int var5 = var4 * Class7274.method22896(this.field7491);

         for (int var6 = 0; var6 < Class7274.method22898(this.field7491); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < Class7274.method22900(this.field7491); var8++) {
               int var9 = var8 * Class7274.method22894(this.field7491) + var5 + var7;
               int var10 = 2 * var8;
               var3[var10] = this.field7490[var9];
               var3[var10 + 1] = this.field7490[var9 + 1];
            }

            Class7274.method22901(this.field7491).method27162(var3);

            for (int var11 = 0; var11 < Class7274.method22900(this.field7491); var11++) {
               int var12 = var11 * Class7274.method22894(this.field7491) + var5 + var7;
               int var13 = 2 * var11;
               this.field7490[var12] = var3[var13];
               this.field7490[var12 + 1] = var3[var13 + 1];
            }
         }
      }
   }
}
