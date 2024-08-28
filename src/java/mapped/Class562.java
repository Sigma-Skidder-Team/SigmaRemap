package mapped;

public class Class562 implements Runnable {
   private static String[] field2719;
   public final int field2720;
   public final int field2721;
   public final double[][][] field2722;
   public final Class7274 field2723;

   public Class562(Class7274 var1, int var2, int var3, double[][][] var4) {
      this.field2723 = var1;
      this.field2720 = var2;
      this.field2721 = var3;
      this.field2722 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * Class7274.method22900(this.field2723)];

      for (int var4 = this.field2720; var4 < this.field2721; var4++) {
         for (int var5 = 0; var5 < Class7274.method22898(this.field2723); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < Class7274.method22900(this.field2723); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field2722[var7][var4][var6];
               var3[var8 + 1] = this.field2722[var7][var4][var6 + 1];
            }

            Class7274.method22901(this.field2723).method27162(var3);

            for (int var9 = 0; var9 < Class7274.method22900(this.field2723); var9++) {
               int var10 = 2 * var9;
               this.field2722[var9][var4][var6] = var3[var10];
               this.field2722[var9][var4][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
