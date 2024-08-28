package mapped;

public final class Class537 implements Runnable {
   private static String[] field2568;
   public final long field2569;
   public final long field2570;
   public final Class2383 field2571;
   public final long field2572;
   public final short[] field2573;
   public final int field2574;

   public Class537(long var1, long var3, Class2383 var5, long var6, short[] var8, int var9) {
      this.field2569 = var1;
      this.field2570 = var3;
      this.field2571 = var5;
      this.field2572 = var6;
      this.field2573 = var8;
      this.field2574 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field2569; var3 < this.field2570; var3++) {
         this.field2571.method9679(this.field2572 + var3, this.field2573[this.field2574 + (int)var3]);
      }
   }
}
