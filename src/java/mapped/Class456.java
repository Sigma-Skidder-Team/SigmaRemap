package mapped;

public class Class456 implements Runnable {
   private static String[] field2086;
   public final int field2087;
   public final int field2088;
   public final double[][] field2089;
   public final Class9615 field2090;

   public Class456(Class9615 var1, int var2, int var3, double[][] var4) {
      this.field2090 = var1;
      this.field2087 = var2;
      this.field2088 = var3;
      this.field2089 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * Class9615.method37424(this.field2090)];

      for (int var4 = this.field2087; var4 < this.field2088; var4++) {
         int var5 = 2 * var4;

         for (int var6 = 0; var6 < Class9615.method37424(this.field2090); var6++) {
            int var7 = 2 * var6;
            var3[var7] = this.field2089[var6][var5];
            var3[var7 + 1] = this.field2089[var6][var5 + 1];
         }

         Class9615.method37425(this.field2090).method27162(var3);

         for (int var8 = 0; var8 < Class9615.method37424(this.field2090); var8++) {
            int var9 = 2 * var8;
            this.field2089[var8][var5] = var3[var9];
            this.field2089[var8][var5 + 1] = var3[var9 + 1];
         }
      }
   }
}
