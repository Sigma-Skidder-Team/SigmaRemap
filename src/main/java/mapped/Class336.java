package mapped;

public class Class336 implements Runnable {
   private static String[] field1462;
   public final int field1463;
   public final int field1464;
   public final double[][] field1465;
   public final boolean field1466;
   public final Class9615 field1467;

   public Class336(Class9615 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field1467 = var1;
      this.field1463 = var2;
      this.field1464 = var3;
      this.field1465 = var4;
      this.field1466 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * Class9615.method37424(this.field1467)];

      for (int var4 = this.field1463; var4 < this.field1464; var4++) {
         int var5 = 2 * var4;

         for (int var6 = 0; var6 < Class9615.method37424(this.field1467); var6++) {
            int var7 = 2 * var6;
            var3[var7] = this.field1465[var6][var5];
            var3[var7 + 1] = this.field1465[var6][var5 + 1];
         }

         Class9615.method37425(this.field1467).method27166(var3, this.field1466);

         for (int var8 = 0; var8 < Class9615.method37424(this.field1467); var8++) {
            int var9 = 2 * var8;
            this.field1465[var8][var5] = var3[var9];
            this.field1465[var8][var5 + 1] = var3[var9 + 1];
         }
      }
   }
}
