package mapped;

public class Class1497 implements Runnable {
   private static String[] field8073;
   public final long field8074;
   public final long field8075;
   public final Class2381 field8076;
   public final boolean field8077;
   public final Class7274 field8078;

   public Class1497(Class7274 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field8078 = var1;
      this.field8074 = var2;
      this.field8075 = var4;
      this.field8076 = var6;
      this.field8077 = var7;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(2L * Class7274.method22906(this.field8078), false);

      for (long var4 = this.field8074; var4 < this.field8075; var4++) {
         long var6 = var4 * Class7274.method22904(this.field8078);

         for (long var8 = 0L; var8 < Class7274.method22905(this.field8078); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < Class7274.method22906(this.field8078); var12++) {
               long var14 = var12 * Class7274.method22902(this.field8078) + var6 + var10;
               long var16 = 2L * var12;
               var3.method9687(var16, this.field8076.method9653(var14));
               var3.method9687(var16 + 1L, this.field8076.method9653(var14 + 1L));
            }

            Class7274.method22901(this.field8078).method27167(var3, this.field8077);

            for (long var18 = 0L; var18 < Class7274.method22906(this.field8078); var18++) {
               long var19 = var18 * Class7274.method22902(this.field8078) + var6 + var10;
               long var20 = 2L * var18;
               this.field8076.method9687(var19, var3.method9653(var20));
               this.field8076.method9687(var19 + 1L, var3.method9653(var20 + 1L));
            }
         }
      }
   }
}
