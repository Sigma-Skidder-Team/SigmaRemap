package mapped;

public class Class742 implements Runnable {
   private static String[] field3851;
   public final long field3852;
   public final long field3853;
   public final Class2378 field3854;
   public final Class8162 field3855;

   public Class742(Class8162 var1, long var2, long var4, Class2378 var6) {
      this.field3855 = var1;
      this.field3852 = var2;
      this.field3853 = var4;
      this.field3854 = var6;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(Class8162.method28400(this.field3855), false);

      for (long var4 = this.field3852; var4 < this.field3853; var4++) {
         long var6 = var4 * (long)Class8162.method28392(this.field3855);

         for (long var8 = 0L; var8 < Class8162.method28401(this.field3855); var8++) {
            for (long var10 = 0L; var10 < Class8162.method28400(this.field3855); var10++) {
               long var12 = var6 + var10 * (long)Class8162.method28394(this.field3855) + var8;
               var3.method9685(var10, this.field3854.method9651(var12));
            }

            Class8162.method28397(this.field3855).method28456(var3);

            for (long var14 = 0L; var14 < Class8162.method28400(this.field3855); var14++) {
               long var15 = var6 + var14 * (long)Class8162.method28394(this.field3855) + var8;
               this.field3854.method9685(var15, var3.method9651(var14));
            }
         }
      }
   }
}
