package mapped;

public class Class1597 implements Runnable {
   private static String[] field8653;
   public final long field8654;
   public final long field8655;
   public final long field8656;
   public final long field8657;
   public final Class2381 field8658;
   public final Class7274 field8659;

   public Class1597(Class7274 var1, long var2, long var4, long var6, long var8, Class2381 var10) {
      this.field8659 = var1;
      this.field8654 = var2;
      this.field8655 = var4;
      this.field8656 = var6;
      this.field8657 = var8;
      this.field8658 = var10;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(2L * Class7274.method22906(this.field8659), false);

      for (long var4 = this.field8654; var4 < this.field8655; var4++) {
         long var6 = var4 * this.field8656;

         for (long var8 = 0L; var8 < Class7274.method22905(this.field8659); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < Class7274.method22906(this.field8659); var12++) {
               long var14 = 2L * var12;
               long var16 = var12 * this.field8657 + var6 + var10;
               var3.method9687(var14, this.field8658.method9653(var16));
               var3.method9687(var14 + 1L, this.field8658.method9653(var16 + 1L));
            }

            Class7274.method22901(this.field8659).method27163(var3);

            for (long var18 = 0L; var18 < Class7274.method22906(this.field8659); var18++) {
               long var19 = 2L * var18;
               long var20 = var18 * this.field8657 + var6 + var10;
               this.field8658.method9687(var20, var3.method9653(var19));
               this.field8658.method9687(var20 + 1L, var3.method9653(var19 + 1L));
            }
         }
      }
   }
}
