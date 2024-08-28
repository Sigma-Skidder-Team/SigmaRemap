package mapped;

public class Class658 implements Runnable {
   private static String[] field3302;
   public final long field3303;
   public final long field3304;
   public final long field3305;
   public final long field3306;
   public final long field3307;
   public final long field3308;
   public final Class2381 field3309;
   public final Class7274 field3310;

   public Class658(Class7274 var1, long var2, long var4, long var6, long var8, long var10, long var12, Class2381 var14) {
      this.field3310 = var1;
      this.field3303 = var2;
      this.field3304 = var4;
      this.field3305 = var6;
      this.field3306 = var8;
      this.field3307 = var10;
      this.field3308 = var12;
      this.field3309 = var14;
   }

   @Override
   public void run() {
      for (long var3 = this.field3303; var3 < this.field3304; var3++) {
         long var5 = (Class7274.method22906(this.field3310) - var3) % Class7274.method22906(this.field3310);
         long var7 = var5 * this.field3305;
         long var9 = var3 * this.field3305;

         for (long var11 = 1L; var11 < this.field3306; var11++) {
            long var13 = Class7274.method22903(this.field3310) - var11;
            long var15 = var13 * this.field3307;
            long var17 = var11 * this.field3307;
            long var19 = var7 + var15;

            for (long var21 = 0L; var21 < Class7274.method22905(this.field3310); var21++) {
               long var23 = 2L * var21;
               long var25 = this.field3308 - var23;
               long var27 = var9 + var17 + var23;
               this.field3309.method9687(var19 + var25 % this.field3308, this.field3309.method9653(var27));
               this.field3309.method9687(var19 + (var25 + 1L) % this.field3308, -this.field3309.method9653(var27 + 1L));
            }
         }
      }
   }
}
