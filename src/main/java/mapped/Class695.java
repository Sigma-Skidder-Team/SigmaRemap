package mapped;

public class Class695 implements Runnable {
   private static String[] field3546;
   public final long field3547;
   public final long field3548;
   public final Class2378 field3549;
   public final boolean field3550;
   public final Class8026 field3551;

   public Class695(Class8026 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field3551 = var1;
      this.field3547 = var2;
      this.field3548 = var4;
      this.field3549 = var6;
      this.field3550 = var7;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(2L * Class8026.method27521(this.field3551), false);

      for (long var4 = this.field3547; var4 < this.field3548; var4++) {
         long var6 = var4 * Class8026.method27520(this.field3551);

         for (long var8 = 0L; var8 < Class8026.method27523(this.field3551); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < Class8026.method27521(this.field3551); var12++) {
               long var14 = var6 + var10 + var12 * Class8026.method27522(this.field3551);
               long var16 = 2L * var12;
               var3.method9685(var16, this.field3549.method9651(var14));
               var3.method9685(var16 + 1L, this.field3549.method9651(var14 + 1L));
            }

            Class8026.method27517(this.field3551).method30934(var3, this.field3550);

            for (long var18 = 0L; var18 < Class8026.method27521(this.field3551); var18++) {
               long var19 = var6 + var10 + var18 * Class8026.method27522(this.field3551);
               long var20 = 2L * var18;
               this.field3549.method9685(var19, var3.method9651(var20));
               this.field3549.method9685(var19 + 1L, var3.method9651(var20 + 1L));
            }
         }
      }
   }
}
