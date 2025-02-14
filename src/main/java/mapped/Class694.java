package mapped;

public final class Class694 implements Runnable {
   private static String[] field3539;
   public final long field3540;
   public final long field3541;
   public final Class2382 field3542;
   public final long field3543;
   public final Class2382 field3544;
   public final long field3545;

   public Class694(long var1, long var3, Class2382 var5, long var6, Class2382 var8, long var9) {
      this.field3540 = var1;
      this.field3541 = var3;
      this.field3542 = var5;
      this.field3543 = var6;
      this.field3544 = var8;
      this.field3545 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field3540; var3 < this.field3541; var3++) {
         this.field3542.method9683(this.field3543 + var3, this.field3544.method9649(this.field3545 + var3));
      }
   }
}
