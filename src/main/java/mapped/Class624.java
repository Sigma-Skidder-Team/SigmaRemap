package mapped;

public final class Class624 implements Runnable {
   private static String[] field3109;
   public final long field3110;
   public final long field3111;
   public final Class2374 field3112;
   public final long field3113;
   public final byte[] field3114;
   public final int field3115;

   public Class624(long var1, long var3, Class2374 var5, long var6, byte[] var8, int var9) {
      this.field3110 = var1;
      this.field3111 = var3;
      this.field3112 = var5;
      this.field3113 = var6;
      this.field3114 = var8;
      this.field3115 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field3110; var3 < this.field3111; var3++) {
         this.field3112.method9675(this.field3113 + var3, this.field3114[this.field3115 + (int)var3]);
      }
   }
}
