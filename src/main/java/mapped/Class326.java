package mapped;

public class Class326 implements Runnable {
   private static String[] field1406;
   public final int field1407;
   public final int field1408;
   public final int field1409;
   public final int field1410;
   public final double[] field1411;
   public final Class9615 field1412;

   public Class326(Class9615 var1, int var2, int var3, int var4, int var5, double[] var6) {
      this.field1412 = var1;
      this.field1407 = var2;
      this.field1408 = var3;
      this.field1409 = var4;
      this.field1410 = var5;
      this.field1411 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field1407; var3 < this.field1408; var3++) {
         int var4 = var3 * this.field1409;
         int var5 = (Class9615.method37424(this.field1412) - var3 + 1) * this.field1409;

         for (int var6 = this.field1410; var6 < Class9615.method37427(this.field1412); var6++) {
            int var7 = 2 * var6;
            int var8 = 2 * (Class9615.method37427(this.field1412) - var6);
            this.field1411[var7] = this.field1411[var8];
            this.field1411[var7 + 1] = -this.field1411[var8 + 1];
            int var9 = var4 + var7;
            int var10 = var5 - var7;
            this.field1411[var9] = this.field1411[var10];
            this.field1411[var9 + 1] = -this.field1411[var10 + 1];
         }
      }
   }
}
