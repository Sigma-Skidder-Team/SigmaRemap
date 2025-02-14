package mapped;

public class Class680 implements Runnable {
   private static String[] field3453;
   public final int field3454;
   public final int field3455;
   public final double[] field3456;
   public final boolean field3457;
   public final Class7274 field3458;

   public Class680(Class7274 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field3458 = var1;
      this.field3454 = var2;
      this.field3455 = var3;
      this.field3456 = var4;
      this.field3457 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * Class7274.method22895(this.field3458)];

      for (int var4 = this.field3454; var4 < this.field3455; var4++) {
         int var5 = var4 * Class7274.method22894(this.field3458);

         for (int var6 = 0; var6 < Class7274.method22898(this.field3458); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < Class7274.method22895(this.field3458); var8++) {
               int var9 = var5 + var7 + var8 * Class7274.method22896(this.field3458);
               int var10 = 2 * var8;
               var3[var10] = this.field3456[var9];
               var3[var10 + 1] = this.field3456[var9 + 1];
            }

            Class7274.method22899(this.field3458).method27166(var3, this.field3457);

            for (int var11 = 0; var11 < Class7274.method22895(this.field3458); var11++) {
               int var12 = var5 + var7 + var11 * Class7274.method22896(this.field3458);
               int var13 = 2 * var11;
               this.field3456[var12] = var3[var13];
               this.field3456[var12 + 1] = var3[var13 + 1];
            }
         }
      }
   }
}
