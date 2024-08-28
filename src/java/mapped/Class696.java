package mapped;

public class Class696 implements Runnable {
   private static String[] field3552;
   public final long field3553;
   public final long field3554;
   public final Class2378 field3555;
   public final boolean field3556;
   public final Class7824 field3557;

   public Class696(Class7824 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field3557 = var1;
      this.field3553 = var2;
      this.field3554 = var4;
      this.field3555 = var6;
      this.field3556 = var7;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(Class7824.method26188(this.field3557), false);

      for (long var4 = this.field3553; var4 < this.field3554; var4++) {
         long var6 = var4 * Class7824.method26187(this.field3557);

         for (long var8 = 0L; var8 < Class7824.method26190(this.field3557); var8++) {
            for (long var10 = 0L; var10 < Class7824.method26188(this.field3557); var10++) {
               long var12 = var6 + var10 * Class7824.method26189(this.field3557) + var8;
               var3.method9685(var10, this.field3555.method9651(var12));
            }

            Class7824.method26184(this.field3557).method29628(var3, this.field3556);

            for (long var14 = 0L; var14 < Class7824.method26188(this.field3557); var14++) {
               long var15 = var6 + var14 * Class7824.method26189(this.field3557) + var8;
               this.field3555.method9685(var15, var3.method9651(var14));
            }
         }
      }
   }
}
