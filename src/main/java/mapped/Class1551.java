package mapped;

public class Class1551 implements Runnable {
   private static String[] field8411;
   public final int field8412;
   public final int field8413;
   public final int field8414;
   public final int field8415;
   public final double[] field8416;
   public final Class7274 field8417;

   public Class1551(Class7274 var1, int var2, int var3, int var4, int var5, double[] var6) {
      this.field8417 = var1;
      this.field8412 = var2;
      this.field8413 = var3;
      this.field8414 = var4;
      this.field8415 = var5;
      this.field8416 = var6;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * Class7274.method22900(this.field8417)];

      for (int var4 = this.field8412; var4 < this.field8413; var4++) {
         int var5 = var4 * this.field8414;

         for (int var6 = 0; var6 < Class7274.method22898(this.field8417); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < Class7274.method22900(this.field8417); var8++) {
               int var9 = 2 * var8;
               int var10 = var8 * this.field8415 + var5 + var7;
               var3[var9] = this.field8416[var10];
               var3[var9 + 1] = this.field8416[var10 + 1];
            }

            Class7274.method22901(this.field8417).method27162(var3);

            for (int var11 = 0; var11 < Class7274.method22900(this.field8417); var11++) {
               int var12 = 2 * var11;
               int var13 = var11 * this.field8415 + var5 + var7;
               this.field8416[var13] = var3[var12];
               this.field8416[var13 + 1] = var3[var12 + 1];
            }
         }
      }
   }
}
