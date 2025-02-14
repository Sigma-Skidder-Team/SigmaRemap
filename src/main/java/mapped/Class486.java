package mapped;

public final class Class486 implements Runnable {
   private static String[] field2284;
   public final long field2285;
   public final long field2286;
   public final Class2383 field2287;
   public final long field2288;
   public final Class2383 field2289;
   public final long field2290;

   public Class486(long var1, long var3, Class2383 var5, long var6, Class2383 var8, long var9) {
      this.field2285 = var1;
      this.field2286 = var3;
      this.field2287 = var5;
      this.field2288 = var6;
      this.field2289 = var8;
      this.field2290 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field2285; var3 < this.field2286; var3++) {
         this.field2287.method9679(this.field2288 + var3, this.field2289.method9645(this.field2290 + var3));
      }
   }
}
