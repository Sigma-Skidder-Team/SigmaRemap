package mapped;

public class Class652 implements Runnable {
   private static String[] field3270;
   public final long field3271;
   public final long field3272;
   public final long field3273;
   public final Class2378 field3274;
   public final Class2378 field3275;
   public final Class8630 field3276;

   public Class652(Class8630 var1, long var2, long var4, long var6, Class2378 var8, Class2378 var9) {
      this.field3276 = var1;
      this.field3271 = var2;
      this.field3272 = var4;
      this.field3273 = var6;
      this.field3274 = var8;
      this.field3275 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field3271; var3 < this.field3272; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         long var9 = this.field3273 + var3;
         this.field3274.method9685(var5, this.field3275.method9651(var9) * Class8630.method31010(this.field3276).method9651(var5));
         this.field3274.method9685(var7, -this.field3275.method9651(var9) * Class8630.method31010(this.field3276).method9651(var7));
      }
   }
}
