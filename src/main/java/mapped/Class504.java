package mapped;

public final class Class504 implements Runnable {
   private static String[] field2389;
   public final long field2390;
   public final long field2391;
   public final Class2378 field2392;
   public final float field2393;

   public Class504(long var1, long var3, Class2378 var5, float var6) {
      this.field2390 = var1;
      this.field2391 = var3;
      this.field2392 = var5;
      this.field2393 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field2390; var3 < this.field2391; var3++) {
         this.field2392.method9687(var3, this.field2392.method9653(var3) * (double)this.field2393);
      }
   }
}
