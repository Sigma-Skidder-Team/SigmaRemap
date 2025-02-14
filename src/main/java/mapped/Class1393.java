package mapped;

public class Class1393 implements Runnable {
   private static String[] field7442;
   public final long field7443;
   public final long field7444;
   public final Class2381 field7445;
   public final boolean field7446;
   public final Class7274 field7447;

   public Class1393(Class7274 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field7447 = var1;
      this.field7443 = var2;
      this.field7444 = var4;
      this.field7445 = var6;
      this.field7446 = var7;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(2L * Class7274.method22903(this.field7447), false);

      for (long var4 = this.field7443; var4 < this.field7444; var4++) {
         long var6 = var4 * Class7274.method22902(this.field7447);

         for (long var8 = 0L; var8 < Class7274.method22905(this.field7447); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < Class7274.method22903(this.field7447); var12++) {
               long var14 = var6 + var10 + var12 * Class7274.method22904(this.field7447);
               long var16 = 2L * var12;
               var3.method9687(var16, this.field7445.method9653(var14));
               var3.method9687(var16 + 1L, this.field7445.method9653(var14 + 1L));
            }

            Class7274.method22899(this.field7447).method27167(var3, this.field7446);

            for (long var18 = 0L; var18 < Class7274.method22903(this.field7447); var18++) {
               long var19 = var6 + var10 + var18 * Class7274.method22904(this.field7447);
               long var20 = 2L * var18;
               this.field7445.method9687(var19, var3.method9653(var20));
               this.field7445.method9687(var19 + 1L, var3.method9653(var20 + 1L));
            }
         }
      }
   }
}
