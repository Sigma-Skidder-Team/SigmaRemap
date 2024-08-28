package mapped;

public final class Class740 implements Runnable {
   private static String[] field3838;
   public final long field3839;
   public final long field3840;
   public final Class2381 field3841;
   public final double field3842;

   public Class740(long var1, long var3, Class2381 var5, double var6) {
      this.field3839 = var1;
      this.field3840 = var3;
      this.field3841 = var5;
      this.field3842 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field3839; var3 < this.field3840; var3++) {
         this.field3841.method9687(var3, this.field3841.method9653(var3) * this.field3842);
      }
   }
}
