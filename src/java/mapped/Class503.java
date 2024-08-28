package mapped;

public class Class503 implements Runnable {
   private static String[] field2381;
   public final int field2382;
   public final int field2383;
   public final int field2384;
   public final int field2385;
   public final double[] field2386;
   public final int field2387;
   public final Class7274 field2388;

   public Class503(Class7274 var1, int var2, int var3, int var4, int var5, double[] var6, int var7) {
      this.field2388 = var1;
      this.field2382 = var2;
      this.field2383 = var3;
      this.field2384 = var4;
      this.field2385 = var5;
      this.field2386 = var6;
      this.field2387 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field2382];

      for (int var4 = this.field2383; var4 >= this.field2384; var4--) {
         int var5 = var4 * Class7274.method22894(this.field2388);
         int var6 = var4 * this.field2385;

         for (int var7 = Class7274.method22895(this.field2388) - 1; var7 >= 0; var7--) {
            System.arraycopy(this.field2386, var5 + var7 * Class7274.method22896(this.field2388), var3, 0, Class7274.method22898(this.field2388));
            Class7274.method22897(this.field2388).method27174(var3);
            System.arraycopy(var3, 0, this.field2386, var6 + var7 * this.field2387, this.field2382);
         }
      }
   }
}
