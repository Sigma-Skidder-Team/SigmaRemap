package mapped;

public class Class1534 implements Runnable {
   private static String[] field8320;
   public final int field8321;
   public final int field8322;
   public final int field8323;
   public final int field8324;
   public final double[] field8325;
   public final Class7274 field8326;

   public Class1534(Class7274 var1, int var2, int var3, int var4, int var5, double[] var6) {
      this.field8326 = var1;
      this.field8321 = var2;
      this.field8322 = var3;
      this.field8323 = var4;
      this.field8324 = var5;
      this.field8325 = var6;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * Class7274.method22895(this.field8326)];

      for (int var4 = this.field8321; var4 < this.field8322; var4++) {
         int var5 = var4 * this.field8323;

         for (int var6 = 0; var6 < Class7274.method22898(this.field8326); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < Class7274.method22895(this.field8326); var8++) {
               int var9 = var5 + var8 * this.field8324 + var7;
               int var10 = 2 * var8;
               var3[var10] = this.field8325[var9];
               var3[var10 + 1] = this.field8325[var9 + 1];
            }

            Class7274.method22899(this.field8326).method27162(var3);

            for (int var11 = 0; var11 < Class7274.method22895(this.field8326); var11++) {
               int var12 = var5 + var11 * this.field8324 + var7;
               int var13 = 2 * var11;
               this.field8325[var12] = var3[var13];
               this.field8325[var12 + 1] = var3[var13 + 1];
            }
         }
      }
   }
}
