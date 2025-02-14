package mapped;

public class Class500 implements Runnable {
   private static String[] field2360;
   public final long field2361;
   public final long field2362;
   public final long field2363;
   public final Class2381 field2364;
   public final boolean field2365;
   public final Class9615 field2366;

   public Class500(Class9615 var1, long var2, long var4, long var6, Class2381 var8, boolean var9) {
      this.field2366 = var1;
      this.field2361 = var2;
      this.field2362 = var4;
      this.field2363 = var6;
      this.field2364 = var8;
      this.field2365 = var9;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(2L * Class9615.method37426(this.field2366), false);

      for (long var4 = this.field2361; var4 < this.field2362; var4++) {
         long var6 = 2L * var4;

         for (long var8 = 0L; var8 < Class9615.method37426(this.field2366); var8++) {
            long var10 = 2L * var8;
            long var12 = var8 * this.field2363 + var6;
            var3.method9687(var10, this.field2364.method9653(var12));
            var3.method9687(var10 + 1L, this.field2364.method9653(var12 + 1L));
         }

         Class9615.method37425(this.field2366).method27167(var3, this.field2365);

         for (long var14 = 0L; var14 < Class9615.method37426(this.field2366); var14++) {
            long var15 = 2L * var14;
            long var16 = var14 * this.field2363 + var6;
            this.field2364.method9687(var16, var3.method9653(var15));
            this.field2364.method9687(var16 + 1L, var3.method9653(var15 + 1L));
         }
      }
   }
}
