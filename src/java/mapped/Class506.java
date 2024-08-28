package mapped;

public class Class506 implements Runnable {
   private static String[] field2400;
   public final long field2401;
   public final long field2402;
   public final long field2403;
   public final Class2381 field2404;
   public final Class9615 field2405;

   public Class506(Class9615 var1, long var2, long var4, long var6, Class2381 var8) {
      this.field2405 = var1;
      this.field2401 = var2;
      this.field2402 = var4;
      this.field2403 = var6;
      this.field2404 = var8;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(2L * Class9615.method37426(this.field2405), false);

      for (long var4 = this.field2401; var4 < this.field2402; var4++) {
         long var6 = 2L * var4;

         for (long var8 = 0L; var8 < Class9615.method37426(this.field2405); var8++) {
            long var10 = 2L * var8;
            long var12 = var8 * this.field2403 + var6;
            var3.method9687(var10, this.field2404.method9653(var12));
            var3.method9687(var10 + 1L, this.field2404.method9653(var12 + 1L));
         }

         Class9615.method37425(this.field2405).method27163(var3);

         for (long var14 = 0L; var14 < Class9615.method37426(this.field2405); var14++) {
            long var15 = 2L * var14;
            long var16 = var14 * this.field2403 + var6;
            this.field2404.method9687(var16, var3.method9653(var15));
            this.field2404.method9687(var16 + 1L, var3.method9653(var15 + 1L));
         }
      }
   }
}
