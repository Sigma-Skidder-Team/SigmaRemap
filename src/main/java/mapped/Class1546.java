package mapped;

public class Class1546 implements Runnable {
   private static String[] field8384;
   public final long field8385;
   public final long field8386;
   public final Class2378 field8387;
   public final boolean field8388;
   public final Class7824 field8389;

   public Class1546(Class7824 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field8389 = var1;
      this.field8385 = var2;
      this.field8386 = var4;
      this.field8387 = var6;
      this.field8388 = var7;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(Class7824.method26191(this.field8389), false);

      for (long var4 = this.field8385; var4 < this.field8386; var4++) {
         long var6 = var4 * Class7824.method26189(this.field8389);

         for (long var8 = 0L; var8 < Class7824.method26190(this.field8389); var8++) {
            for (long var10 = 0L; var10 < Class7824.method26191(this.field8389); var10++) {
               long var12 = var10 * Class7824.method26187(this.field8389) + var6 + var8;
               var3.method9685(var10, this.field8387.method9651(var12));
            }

            Class7824.method26186(this.field8389).method29628(var3, this.field8388);

            for (long var14 = 0L; var14 < Class7824.method26191(this.field8389); var14++) {
               long var15 = var14 * Class7824.method26187(this.field8389) + var6 + var8;
               this.field8387.method9685(var15, var3.method9651(var14));
            }
         }
      }
   }
}
