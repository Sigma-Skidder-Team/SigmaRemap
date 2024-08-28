package mapped;

public final class Class501 implements Runnable {
   private static String[] field2367;
   public final long field2368;
   public final long field2369;
   public final Class2382 field2370;
   public final long field2371;
   public final long[] field2372;
   public final int field2373;

   public Class501(long var1, long var3, Class2382 var5, long var6, long[] var8, int var9) {
      this.field2368 = var1;
      this.field2369 = var3;
      this.field2370 = var5;
      this.field2371 = var6;
      this.field2372 = var8;
      this.field2373 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field2368; var3 < this.field2369; var3++) {
         this.field2370.method9683(this.field2371 + var3, this.field2372[this.field2373 + (int)var3]);
      }
   }
}
