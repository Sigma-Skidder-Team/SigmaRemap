package mapped;

public class Class687 implements Runnable {
   private static String[] field3503;
   public final long field3504;
   public final long field3505;
   public final Class2381 field3506;
   public final Class7274 field3507;

   public Class687(Class7274 var1, long var2, long var4, Class2381 var6) {
      this.field3507 = var1;
      this.field3504 = var2;
      this.field3505 = var4;
      this.field3506 = var6;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(2L * Class7274.method22906(this.field3507), false);

      for (long var4 = this.field3504; var4 < this.field3505; var4++) {
         long var6 = var4 * Class7274.method22904(this.field3507);

         for (long var8 = 0L; var8 < Class7274.method22905(this.field3507); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < Class7274.method22906(this.field3507); var12++) {
               long var14 = var12 * Class7274.method22902(this.field3507) + var6 + var10;
               long var16 = 2L * var12;
               var3.method9687(var16, this.field3506.method9653(var14));
               var3.method9687(var16 + 1L, this.field3506.method9653(var14 + 1L));
            }

            Class7274.method22901(this.field3507).method27163(var3);

            for (long var18 = 0L; var18 < Class7274.method22906(this.field3507); var18++) {
               long var19 = var18 * Class7274.method22902(this.field3507) + var6 + var10;
               long var20 = 2L * var18;
               this.field3506.method9687(var19, var3.method9653(var20));
               this.field3506.method9687(var19 + 1L, var3.method9653(var20 + 1L));
            }
         }
      }
   }
}
