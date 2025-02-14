package mapped;

public class Class709 implements Runnable {
   private static String[] field3635;
   public final long field3636;
   public final long field3637;
   public final long field3638;
   public final long field3639;
   public final long field3640;
   public final Class2378 field3641;
   public final Class8026 field3642;

   public Class709(Class8026 var1, long var2, long var4, long var6, long var8, long var10, Class2378 var12) {
      this.field3642 = var1;
      this.field3636 = var2;
      this.field3637 = var4;
      this.field3638 = var6;
      this.field3639 = var8;
      this.field3640 = var10;
      this.field3641 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field3636; var3 < this.field3637; var3++) {
         long var5 = (Class8026.method27524(this.field3642) - var3) % Class8026.method27524(this.field3642) * this.field3638;
         long var7 = var3 * this.field3638;

         for (long var9 = 1L; var9 < this.field3639; var9++) {
            long var11 = var5 + (Class8026.method27521(this.field3642) - var9) * this.field3640;
            long var13 = var7 + var9 * this.field3640;
            this.field3641.method9685(var11, this.field3641.method9651(var13));
            this.field3641.method9685(var11 + 1L, -this.field3641.method9651(var13 + 1L));
         }
      }
   }
}
