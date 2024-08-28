package mapped;

public class Class402 implements Runnable {
   private static String[] field1729;
   public final long field1730;
   public final long field1731;
   public final long field1732;
   public final long field1733;
   public final long field1734;
   public final Class2378 field1735;
   public final Class8026 field1736;

   public Class402(Class8026 var1, long var2, long var4, long var6, long var8, long var10, Class2378 var12) {
      this.field1736 = var1;
      this.field1730 = var2;
      this.field1731 = var4;
      this.field1732 = var6;
      this.field1733 = var8;
      this.field1734 = var10;
      this.field1735 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field1730; var3 < this.field1731; var3++) {
         long var5 = (Class8026.method27524(this.field1736) - var3) % Class8026.method27524(this.field1736) * this.field1732;
         long var7 = var3 * this.field1732;

         for (long var9 = 0L; var9 < Class8026.method27521(this.field1736); var9++) {
            long var11 = (Class8026.method27521(this.field1736) - var9) % Class8026.method27521(this.field1736) * this.field1733;
            long var13 = var9 * this.field1733;

            for (long var15 = 1L; var15 < Class8026.method27523(this.field1736); var15 += 2L) {
               long var17 = var5 + var11 + this.field1734 - var15;
               long var19 = var7 + var13 + var15;
               this.field1735.method9685(var17, -this.field1735.method9651(var19 + 2L));
               this.field1735.method9685(var17 - 1L, this.field1735.method9651(var19 + 1L));
            }
         }
      }
   }
}
