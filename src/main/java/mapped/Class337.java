package mapped;

public class Class337 implements Runnable {
   private static String[] field1468;
   public final long field1469;
   public final long field1470;
   public final long field1471;
   public final long field1472;
   public final Class2378 field1473;
   public final Class2378 field1474;
   public final long field1475;
   public final Class8543 field1476;

   public Class337(Class8543 var1, long var2, long var4, long var6, long var8, Class2378 var10, Class2378 var11, long var12) {
      this.field1476 = var1;
      this.field1469 = var2;
      this.field1470 = var4;
      this.field1471 = var6;
      this.field1472 = var8;
      this.field1473 = var10;
      this.field1474 = var11;
      this.field1475 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field1469; var3 < this.field1470; var3++) {
         long var5 = 2L * var3;

         for (long var7 = 0L; var7 < this.field1471; var7++) {
            long var9 = 2L * var7;
            long var11 = var3 * this.field1472 + var9;
            this.field1473.method9687(var11, (double)this.field1474.method9651(var7 * this.field1475 + var5));
            this.field1473.method9687(var11 + 1L, (double)this.field1474.method9651(var7 * this.field1475 + var5 + 1L));
         }
      }
   }
}
