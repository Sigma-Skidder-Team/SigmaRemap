package mapped;

public class Class536 implements Runnable {
   private static String[] field2562;
   public final long field2563;
   public final long field2564;
   public final Class2378 field2565;
   public final boolean field2566;
   public final Class7941 field2567;

   public Class536(Class7941 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field2567 = var1;
      this.field2563 = var2;
      this.field2564 = var4;
      this.field2565 = var6;
      this.field2566 = var7;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(Class7941.method26772(this.field2567), false);

      for (long var4 = this.field2563; var4 < this.field2564; var4++) {
         long var6 = var4 * Class7941.method26771(this.field2567);

         for (long var8 = 0L; var8 < Class7941.method26774(this.field2567); var8++) {
            for (long var10 = 0L; var10 < Class7941.method26772(this.field2567); var10++) {
               long var12 = var6 + var10 * Class7941.method26773(this.field2567) + var8;
               var3.method9685(var10, this.field2565.method9651(var12));
            }

            Class7941.method26768(this.field2567).method28925(var3, this.field2566);

            for (long var14 = 0L; var14 < Class7941.method26772(this.field2567); var14++) {
               long var15 = var6 + var14 * Class7941.method26773(this.field2567) + var8;
               this.field2565.method9685(var15, var3.method9651(var14));
            }
         }
      }
   }
}
