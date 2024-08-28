package mapped;

public class Class508 implements Runnable {
   private static String[] field2414;
   public final long field2415;
   public final long field2416;
   public final Class2378 field2417;
   public final boolean field2418;
   public final Class7941 field2419;

   public Class508(Class7941 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field2419 = var1;
      this.field2415 = var2;
      this.field2416 = var4;
      this.field2417 = var6;
      this.field2418 = var7;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(Class7941.method26775(this.field2419), false);

      for (long var4 = this.field2415; var4 < this.field2416; var4++) {
         long var6 = var4 * Class7941.method26773(this.field2419);

         for (long var8 = 0L; var8 < Class7941.method26774(this.field2419); var8++) {
            for (long var10 = 0L; var10 < Class7941.method26775(this.field2419); var10++) {
               long var12 = var10 * Class7941.method26771(this.field2419) + var6 + var8;
               var3.method9685(var10, this.field2417.method9651(var12));
            }

            Class7941.method26770(this.field2419).method28925(var3, this.field2418);

            for (long var14 = 0L; var14 < Class7941.method26775(this.field2419); var14++) {
               long var15 = var14 * Class7941.method26771(this.field2419) + var6 + var8;
               this.field2417.method9685(var15, var3.method9651(var14));
            }
         }
      }
   }
}
