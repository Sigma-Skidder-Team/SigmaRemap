package mapped;

public class Class464 implements Runnable {
   private static String[] field2143;
   public final long field2144;
   public final long field2145;
   public final long field2146;
   public final long field2147;
   public final long field2148;
   public final long field2149;
   public final Class2381 field2150;
   public final Class7274 field2151;

   public Class464(Class7274 var1, long var2, long var4, long var6, long var8, long var10, long var12, Class2381 var14) {
      this.field2151 = var1;
      this.field2144 = var2;
      this.field2145 = var4;
      this.field2146 = var6;
      this.field2147 = var8;
      this.field2148 = var10;
      this.field2149 = var12;
      this.field2150 = var14;
   }

   @Override
   public void run() {
      for (long var3 = this.field2144; var3 < this.field2145; var3++) {
         long var5 = (Class7274.method22906(this.field2151) - var3) % Class7274.method22906(this.field2151);
         long var7 = var5 * this.field2146;
         long var9 = var3 * this.field2146;

         for (long var11 = 1L; var11 < this.field2147; var11++) {
            long var13 = Class7274.method22903(this.field2151) - var11;
            long var15 = var13 * this.field2148;
            long var17 = var11 * this.field2148;
            long var19 = var7 + var15;

            for (long var21 = 0L; var21 < Class7274.method22905(this.field2151); var21++) {
               long var23 = 2L * var21;
               long var25 = this.field2149 - var23;
               long var27 = var9 + var17 + var23;
               this.field2150.method9687(var19 + var25 % this.field2149, this.field2150.method9653(var27));
               this.field2150.method9687(var19 + (var25 + 1L) % this.field2149, -this.field2150.method9653(var27 + 1L));
            }
         }
      }
   }
}
