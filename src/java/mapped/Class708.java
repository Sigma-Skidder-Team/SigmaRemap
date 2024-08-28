package mapped;

public final class Class708 implements Runnable {
   private static String[] field3628;
   public final long field3629;
   public final long field3630;
   public final Class2381 field3631;
   public final long field3632;
   public final double[] field3633;
   public final int field3634;

   public Class708(long var1, long var3, Class2381 var5, long var6, double[] var8, int var9) {
      this.field3629 = var1;
      this.field3630 = var3;
      this.field3631 = var5;
      this.field3632 = var6;
      this.field3633 = var8;
      this.field3634 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field3629; var3 < this.field3630; var3++) {
         this.field3631.method9687(this.field3632 + var3, this.field3633[this.field3634 + (int)var3]);
      }
   }
}
