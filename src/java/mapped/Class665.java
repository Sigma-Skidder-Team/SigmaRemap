package mapped;

public class Class665 implements Runnable {
   private static String[] field3353;
   public final long field3354;
   public final long field3355;
   public final Class2381 field3356;
   public final Class2381 field3357;
   public final long field3358;
   public final Class7274 field3359;

   public Class665(Class7274 var1, long var2, long var4, Class2381 var6, Class2381 var7, long var8) {
      this.field3359 = var1;
      this.field3354 = var2;
      this.field3355 = var4;
      this.field3356 = var6;
      this.field3357 = var7;
      this.field3358 = var8;
   }

   @Override
   public void run() {
      for (long var3 = this.field3354; var3 < this.field3355; var3++) {
         long var5 = var3 * Class7274.method22902(this.field3359);

         for (long var7 = 0L; var7 < Class7274.method22903(this.field3359); var7++) {
            Class8133.method28177(
               this.field3356,
               var5 + var7 * Class7274.method22904(this.field3359),
               this.field3357,
               var3 * Class7274.method22903(this.field3359) * this.field3358 + var7 * this.field3358,
               Class7274.method22905(this.field3359)
            );
            Class7274.method22897(this.field3359)
               .method27177(this.field3357, var3 * Class7274.method22903(this.field3359) * this.field3358 + var7 * this.field3358);
         }
      }
   }
}
