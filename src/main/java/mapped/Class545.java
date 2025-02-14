package mapped;

public class Class545 implements Runnable {
   private static String[] field2608;
   public final long field2609;
   public final long field2610;
   public final long field2611;
   public final long field2612;
   public final long field2613;
   public final Class2381 field2614;
   public final Class7274 field2615;

   public Class545(Class7274 var1, long var2, long var4, long var6, long var8, long var10, Class2381 var12) {
      this.field2615 = var1;
      this.field2609 = var2;
      this.field2610 = var4;
      this.field2611 = var6;
      this.field2612 = var8;
      this.field2613 = var10;
      this.field2614 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field2609; var3 < this.field2610; var3++) {
         long var5 = (Class7274.method22906(this.field2615) - var3) % Class7274.method22906(this.field2615) * this.field2611;
         long var7 = var3 * this.field2611;

         for (long var9 = 1L; var9 < this.field2612; var9++) {
            long var11 = var5 + (Class7274.method22903(this.field2615) - var9) * this.field2613;
            long var13 = var7 + var9 * this.field2613;
            this.field2614.method9687(var11, this.field2614.method9653(var13));
            this.field2614.method9687(var11 + 1L, -this.field2614.method9653(var13 + 1L));
         }
      }
   }
}
