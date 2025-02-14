package mapped;

public class Class651 implements Runnable {
   private static String[] field3261;
   public final long field3262;
   public final long field3263;
   public final long field3264;
   public final long field3265;
   public final long field3266;
   public final long field3267;
   public final Class2378 field3268;
   public final Class8026 field3269;

   public Class651(Class8026 var1, long var2, long var4, long var6, long var8, long var10, long var12, Class2378 var14) {
      this.field3269 = var1;
      this.field3262 = var2;
      this.field3263 = var4;
      this.field3264 = var6;
      this.field3265 = var8;
      this.field3266 = var10;
      this.field3267 = var12;
      this.field3268 = var14;
   }

   @Override
   public void run() {
      for (long var3 = this.field3262; var3 < this.field3263; var3++) {
         long var5 = (Class8026.method27524(this.field3269) - var3) % Class8026.method27524(this.field3269);
         long var7 = var5 * this.field3264;
         long var9 = var3 * this.field3264;

         for (long var11 = 1L; var11 < this.field3265; var11++) {
            long var13 = Class8026.method27521(this.field3269) - var11;
            long var15 = var13 * this.field3266;
            long var17 = var11 * this.field3266;
            long var19 = var7 + var15;

            for (long var21 = 0L; var21 < Class8026.method27523(this.field3269); var21++) {
               long var23 = 2L * var21;
               long var25 = this.field3267 - var23;
               long var27 = var9 + var17 + var23;
               this.field3268.method9685(var19 + var25 % this.field3267, this.field3268.method9651(var27));
               this.field3268.method9685(var19 + (var25 + 1L) % this.field3267, -this.field3268.method9651(var27 + 1L));
            }
         }
      }
   }
}
