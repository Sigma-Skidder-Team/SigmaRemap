package mapped;

public class Class728 implements Runnable {
   private static String[] field3758;
   public final long field3759;
   public final long field3760;
   public final Class2378 field3761;
   public final long field3762;
   public final Class2378 field3763;
   public final boolean field3764;
   public final Class8543 field3765;

   public Class728(Class8543 var1, long var2, long var4, Class2378 var6, long var7, Class2378 var9, boolean var10) {
      this.field3765 = var1;
      this.field3759 = var2;
      this.field3760 = var4;
      this.field3761 = var6;
      this.field3762 = var7;
      this.field3763 = var9;
      this.field3764 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field3759; var3 < this.field3760; var3++) {
         long var5 = 2L * var3;

         for (long var7 = 0L; var7 < Class8543.method30437(this.field3765); var7++) {
            long var9 = 2L * var7;
            long var11 = var7 * Class8543.method30439(this.field3765) + var5;
            this.field3761.method9687(var3 * this.field3762 + var9, (double)this.field3763.method9651(var11));
            this.field3761.method9687(var3 * this.field3762 + var9 + 1L, (double)this.field3763.method9651(var11 + 1L));
         }

         Class8543.method30436(this.field3765).method30936(this.field3761, var3 * this.field3762, this.field3764);
      }
   }
}
