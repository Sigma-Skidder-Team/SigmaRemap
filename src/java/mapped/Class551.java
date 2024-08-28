package mapped;

public class Class551 implements Runnable {
   private static String[] field2645;
   public final long field2646;
   public final long field2647;
   public final long field2648;
   public final long field2649;
   public final Class2381 field2650;
   public final boolean field2651;
   public final Class7274 field2652;

   public Class551(Class7274 var1, long var2, long var4, long var6, long var8, Class2381 var10, boolean var11) {
      this.field2652 = var1;
      this.field2646 = var2;
      this.field2647 = var4;
      this.field2648 = var6;
      this.field2649 = var8;
      this.field2650 = var10;
      this.field2651 = var11;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(2L * Class7274.method22906(this.field2652), false);

      for (long var4 = this.field2646; var4 < this.field2647; var4++) {
         long var6 = var4 * this.field2648;

         for (long var8 = 0L; var8 < Class7274.method22905(this.field2652); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < Class7274.method22906(this.field2652); var12++) {
               long var14 = 2L * var12;
               long var16 = var12 * this.field2649 + var6 + var10;
               var3.method9687(var14, this.field2650.method9653(var16));
               var3.method9687(var14 + 1L, this.field2650.method9653(var16 + 1L));
            }

            Class7274.method22901(this.field2652).method27167(var3, this.field2651);

            for (long var18 = 0L; var18 < Class7274.method22906(this.field2652); var18++) {
               long var19 = 2L * var18;
               long var20 = var18 * this.field2649 + var6 + var10;
               this.field2650.method9687(var20, var3.method9653(var19));
               this.field2650.method9687(var20 + 1L, var3.method9653(var19 + 1L));
            }
         }
      }
   }
}
