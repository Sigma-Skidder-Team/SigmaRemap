package mapped;

public final class Class524 implements Runnable {
   private static String[] field2491;
   public final long field2492;
   public final long field2493;
   public final long field2494;
   public final Class2381 field2495;
   public final Class2381 field2496;
   public final long field2497;

   public Class524(long var1, long var3, long var5, Class2381 var7, Class2381 var8, long var9) {
      this.field2492 = var1;
      this.field2493 = var3;
      this.field2494 = var5;
      this.field2495 = var7;
      this.field2496 = var8;
      this.field2497 = var9;
   }

   @Override
   public void run() {
      long var3 = this.field2492 + this.field2493;
      long var5 = 1L;
      long var7 = this.field2494;

      while (var7 > 512L) {
         var7 >>= 2;
         var5 <<= 2;
         Class7796.method25951(var7, this.field2495, var3 - var7, this.field2496, this.field2497 - var7);
      }

      Class7796.method25947(var7, 0L, this.field2495, var3 - var7, this.field2497, this.field2496);
      var5 >>= 1;
      long var9 = this.field2492 - var7;

      for (long var11 = this.field2493 - var7; var11 > 0L; var11 -= var7) {
         long var13 = Class7796.method25945(var7, var11, ++var5, this.field2495, this.field2492, this.field2497, this.field2496);
         Class7796.method25947(var7, var13, this.field2495, var9 + var11, this.field2497, this.field2496);
      }
   }
}
