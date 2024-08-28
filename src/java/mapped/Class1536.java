package mapped;

public final class Class1536 implements Runnable {
   private static String[] field8333;
   public final long field8334;
   public final long field8335;
   public final double[] field8336;
   public final int field8337;
   public final Class2377 field8338;
   public final long field8339;

   public Class1536(long var1, long var3, double[] var5, int var6, Class2377 var7, long var8) {
      this.field8334 = var1;
      this.field8335 = var3;
      this.field8336 = var5;
      this.field8337 = var6;
      this.field8338 = var7;
      this.field8339 = var8;
   }

   @Override
   public void run() {
      double[] var3 = new double[2];

      for (long var4 = this.field8334; var4 < this.field8335; var4++) {
         var3[0] = this.field8336[2 * (this.field8337 + (int)var4)];
         var3[1] = this.field8336[2 * (this.field8337 + (int)var4) + 1];
         this.field8338.method9704(this.field8339 + var4, var3);
      }
   }
}
