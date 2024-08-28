package mapped;

public class Class581 implements Runnable {
   private static String[] field2845;
   public final long field2846;
   public final long field2847;
   public final long field2848;
   public final Class2378 field2849;
   public final Class8543 field2850;

   public Class581(Class8543 var1, long var2, long var4, long var6, Class2378 var8) {
      this.field2850 = var1;
      this.field2846 = var2;
      this.field2847 = var4;
      this.field2848 = var6;
      this.field2849 = var8;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(2L * Class8543.method30437(this.field2850), false);

      for (long var4 = this.field2846; var4 < this.field2847; var4++) {
         long var6 = 2L * var4;

         for (long var8 = 0L; var8 < Class8543.method30437(this.field2850); var8++) {
            long var10 = 2L * var8;
            long var12 = var8 * this.field2848 + var6;
            var3.method9687(var10, (double)this.field2849.method9651(var12));
            var3.method9687(var10 + 1L, (double)this.field2849.method9651(var12 + 1L));
         }

         Class8543.method30436(this.field2850).method30930(var3);

         for (long var14 = 0L; var14 < Class8543.method30437(this.field2850); var14++) {
            long var15 = 2L * var14;
            long var16 = var14 * this.field2848 + var6;
            this.field2849.method9687(var16, (double)var3.method9651(var15));
            this.field2849.method9687(var16 + 1L, (double)var3.method9651(var15 + 1L));
         }
      }
   }
}
