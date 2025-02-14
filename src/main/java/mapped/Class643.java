package mapped;

public class Class643 implements Runnable {
   private static String[] field3213;
   public final long field3214;
   public final long field3215;
   public final long field3216;
   public final long field3217;
   public final Class2381 field3218;
   public final Class7274 field3219;

   public Class643(Class7274 var1, long var2, long var4, long var6, long var8, Class2381 var10) {
      this.field3219 = var1;
      this.field3214 = var2;
      this.field3215 = var4;
      this.field3216 = var6;
      this.field3217 = var8;
      this.field3218 = var10;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(2L * Class7274.method22903(this.field3219), false);

      for (long var4 = this.field3214; var4 < this.field3215; var4++) {
         long var6 = var4 * this.field3216;

         for (long var8 = 0L; var8 < Class7274.method22905(this.field3219); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < Class7274.method22903(this.field3219); var12++) {
               long var14 = var6 + var12 * this.field3217 + var10;
               long var16 = 2L * var12;
               var3.method9687(var16, this.field3218.method9653(var14));
               var3.method9687(var16 + 1L, this.field3218.method9653(var14 + 1L));
            }

            Class7274.method22899(this.field3219).method27163(var3);

            for (long var18 = 0L; var18 < Class7274.method22903(this.field3219); var18++) {
               long var19 = var6 + var18 * this.field3217 + var10;
               long var20 = 2L * var18;
               this.field3218.method9687(var19, var3.method9653(var20));
               this.field3218.method9687(var19 + 1L, var3.method9653(var20 + 1L));
            }
         }
      }
   }
}
