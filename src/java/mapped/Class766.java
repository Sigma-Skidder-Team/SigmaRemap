package mapped;

public class Class766 implements Runnable {
   private static String[] field3982;
   public final long field3983;
   public final long field3984;
   public final long field3985;
   public final long field3986;
   public final Class2381 field3987;
   public final boolean field3988;
   public final Class7274 field3989;

   public Class766(Class7274 var1, long var2, long var4, long var6, long var8, Class2381 var10, boolean var11) {
      this.field3989 = var1;
      this.field3983 = var2;
      this.field3984 = var4;
      this.field3985 = var6;
      this.field3986 = var8;
      this.field3987 = var10;
      this.field3988 = var11;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(2L * Class7274.method22903(this.field3989), false);

      for (long var4 = this.field3983; var4 < this.field3984; var4++) {
         long var6 = var4 * this.field3985;

         for (long var8 = 0L; var8 < Class7274.method22905(this.field3989); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < Class7274.method22903(this.field3989); var12++) {
               long var14 = var6 + var12 * this.field3986 + var10;
               long var16 = 2L * var12;
               var3.method9687(var16, this.field3987.method9653(var14));
               var3.method9687(var16 + 1L, this.field3987.method9653(var14 + 1L));
            }

            Class7274.method22899(this.field3989).method27167(var3, this.field3988);

            for (long var18 = 0L; var18 < Class7274.method22903(this.field3989); var18++) {
               long var19 = var6 + var18 * this.field3986 + var10;
               long var20 = 2L * var18;
               this.field3987.method9687(var19, var3.method9653(var20));
               this.field3987.method9687(var19 + 1L, var3.method9653(var20 + 1L));
            }
         }
      }
   }
}
