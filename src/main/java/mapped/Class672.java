package mapped;

public final class Class672 implements Runnable {
   private static String[] field3400;
   public final long field3401;
   public final long field3402;
   public final Class2375 field3403;
   public final long field3404;
   public final byte[] field3405;
   public final int field3406;

   public Class672(long var1, long var3, Class2375 var5, long var6, byte[] var8, int var9) {
      this.field3401 = var1;
      this.field3402 = var3;
      this.field3403 = var5;
      this.field3404 = var6;
      this.field3405 = var8;
      this.field3406 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field3401; var3 < this.field3402; var3++) {
         this.field3403.method9675(this.field3404 + var3, this.field3405[this.field3406 + (int)var3]);
      }
   }
}
