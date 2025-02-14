package mapped;

public final class Class713 implements Runnable {
   private static String[] field3656;
   public final long field3657;
   public final long field3658;
   public final Class2375 field3659;
   public final long field3660;
   public final Class2375 field3661;
   public final long field3662;

   public Class713(long var1, long var3, Class2375 var5, long var6, Class2375 var8, long var9) {
      this.field3657 = var1;
      this.field3658 = var3;
      this.field3659 = var5;
      this.field3660 = var6;
      this.field3661 = var8;
      this.field3662 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field3657; var3 < this.field3658; var3++) {
         this.field3659.method9675(this.field3660 + var3, this.field3661.method9641(this.field3662 + var3));
      }
   }
}
