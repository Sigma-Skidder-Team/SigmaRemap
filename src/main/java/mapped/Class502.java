package mapped;

public final class Class502 implements Runnable {
   private static String[] field2374;
   public final long field2375;
   public final long field2376;
   public final Class2376 field2377;
   public final long field2378;
   public final int[] field2379;
   public final int field2380;

   public Class502(long var1, long var3, Class2376 var5, long var6, int[] var8, int var9) {
      this.field2375 = var1;
      this.field2376 = var3;
      this.field2377 = var5;
      this.field2378 = var6;
      this.field2379 = var8;
      this.field2380 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field2375; var3 < this.field2376; var3++) {
         this.field2377.method9681(this.field2378 + var3, this.field2379[this.field2380 + (int)var3]);
      }
   }
}
