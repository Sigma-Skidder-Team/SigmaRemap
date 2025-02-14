package mapped;

public class Class738 implements Runnable {
   private static String[] field3825;
   public final long field3826;
   public final long field3827;
   public final long field3828;
   public final long field3829;
   public final long field3830;
   public final Class2381 field3831;
   public final Class7274 field3832;

   public Class738(Class7274 var1, long var2, long var4, long var6, long var8, long var10, Class2381 var12) {
      this.field3832 = var1;
      this.field3826 = var2;
      this.field3827 = var4;
      this.field3828 = var6;
      this.field3829 = var8;
      this.field3830 = var10;
      this.field3831 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field3826; var3 < this.field3827; var3++) {
         long var5 = (Class7274.method22906(this.field3832) - var3) % Class7274.method22906(this.field3832) * this.field3828;
         long var7 = var3 * this.field3828;

         for (long var9 = 0L; var9 < Class7274.method22903(this.field3832); var9++) {
            long var11 = (Class7274.method22903(this.field3832) - var9) % Class7274.method22903(this.field3832) * this.field3829;
            long var13 = var9 * this.field3829;

            for (long var15 = 1L; var15 < Class7274.method22905(this.field3832); var15 += 2L) {
               long var17 = var5 + var11 + this.field3830 - var15;
               long var19 = var7 + var13 + var15;
               this.field3831.method9687(var17, -this.field3831.method9653(var19 + 2L));
               this.field3831.method9687(var17 - 1L, this.field3831.method9653(var19 + 1L));
            }
         }
      }
   }
}
