package mapped;

public class Class1420 implements Runnable {
   private static String[] field7611;
   public final int field7612;
   public final int field7613;
   public final double[][][] field7614;
   public final Class7274 field7615;

   public Class1420(Class7274 var1, int var2, int var3, double[][][] var4) {
      this.field7615 = var1;
      this.field7612 = var2;
      this.field7613 = var3;
      this.field7614 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * Class7274.method22895(this.field7615)];

      for (int var4 = this.field7612; var4 < this.field7613; var4++) {
         for (int var5 = 0; var5 < Class7274.method22898(this.field7615); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < Class7274.method22895(this.field7615); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field7614[var4][var7][var6];
               var3[var8 + 1] = this.field7614[var4][var7][var6 + 1];
            }

            Class7274.method22899(this.field7615).method27162(var3);

            for (int var9 = 0; var9 < Class7274.method22895(this.field7615); var9++) {
               int var10 = 2 * var9;
               this.field7614[var4][var9][var6] = var3[var10];
               this.field7614[var4][var9][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
