package mapped;

public class Class1375 implements Runnable {
   private static String[] field7346;
   public final int field7347;
   public final int field7348;
   public final double[] field7349;
   public final Class7274 field7350;

   public Class1375(Class7274 var1, int var2, int var3, double[] var4) {
      this.field7350 = var1;
      this.field7347 = var2;
      this.field7348 = var3;
      this.field7349 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * Class7274.method22895(this.field7350)];

      for (int var4 = this.field7347; var4 < this.field7348; var4++) {
         int var5 = var4 * Class7274.method22894(this.field7350);

         for (int var6 = 0; var6 < Class7274.method22898(this.field7350); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < Class7274.method22895(this.field7350); var8++) {
               int var9 = var5 + var7 + var8 * Class7274.method22896(this.field7350);
               int var10 = 2 * var8;
               var3[var10] = this.field7349[var9];
               var3[var10 + 1] = this.field7349[var9 + 1];
            }

            Class7274.method22899(this.field7350).method27162(var3);

            for (int var11 = 0; var11 < Class7274.method22895(this.field7350); var11++) {
               int var12 = var5 + var7 + var11 * Class7274.method22896(this.field7350);
               int var13 = 2 * var11;
               this.field7349[var12] = var3[var13];
               this.field7349[var12 + 1] = var3[var13 + 1];
            }
         }
      }
   }
}
