package mapped;

public class Class535 implements Runnable {
   private static String[] field2557;
   public final long field2558;
   public final long field2559;
   public final Class2378 field2560;
   public final Class8026 field2561;

   public Class535(Class8026 var1, long var2, long var4, Class2378 var6) {
      this.field2561 = var1;
      this.field2558 = var2;
      this.field2559 = var4;
      this.field2560 = var6;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(2L * Class8026.method27524(this.field2561), false);

      for (long var4 = this.field2558; var4 < this.field2559; var4++) {
         long var6 = var4 * Class8026.method27522(this.field2561);

         for (long var8 = 0L; var8 < Class8026.method27523(this.field2561); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < Class8026.method27524(this.field2561); var12++) {
               long var14 = var12 * Class8026.method27520(this.field2561) + var6 + var10;
               long var16 = 2L * var12;
               var3.method9685(var16, this.field2560.method9651(var14));
               var3.method9685(var16 + 1L, this.field2560.method9651(var14 + 1L));
            }

            Class8026.method27519(this.field2561).method30930(var3);

            for (long var18 = 0L; var18 < Class8026.method27524(this.field2561); var18++) {
               long var19 = var18 * Class8026.method27520(this.field2561) + var6 + var10;
               long var20 = 2L * var18;
               this.field2560.method9685(var19, var3.method9651(var20));
               this.field2560.method9685(var19 + 1L, var3.method9651(var20 + 1L));
            }
         }
      }
   }
}
