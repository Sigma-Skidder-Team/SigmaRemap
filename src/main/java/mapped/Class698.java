package mapped;

public final class Class698 implements Runnable {
   private static String[] field3559;
   public final long field3560;
   public final long field3561;
   public final Class2374 field3562;
   public final long field3563;
   public final short[] field3564;
   public final int field3565;

   public Class698(long var1, long var3, Class2374 var5, long var6, short[] var8, int var9) {
      this.field3560 = var1;
      this.field3561 = var3;
      this.field3562 = var5;
      this.field3563 = var6;
      this.field3564 = var8;
      this.field3565 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field3560; var3 < this.field3561; var3++) {
         this.field3562.method9677(this.field3563 + var3, this.field3564[this.field3565 + (int)var3]);
      }
   }
}
