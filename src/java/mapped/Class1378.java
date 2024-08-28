package mapped;

public class Class1378 implements Runnable {
   private static String[] field7361;
   public final long field7362;
   public final long field7363;
   public final Class2378 field7364;
   public final boolean field7365;
   public final Class7824 field7366;

   public Class1378(Class7824 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field7366 = var1;
      this.field7362 = var2;
      this.field7363 = var4;
      this.field7364 = var6;
      this.field7365 = var7;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(Class7824.method26191(this.field7366), false);

      for (long var4 = this.field7362; var4 < this.field7363; var4++) {
         long var6 = var4 * Class7824.method26189(this.field7366);

         for (long var8 = 0L; var8 < Class7824.method26190(this.field7366); var8++) {
            for (long var10 = 0L; var10 < Class7824.method26191(this.field7366); var10++) {
               long var12 = var10 * Class7824.method26187(this.field7366) + var6 + var8;
               var3.method9685(var10, this.field7364.method9651(var12));
            }

            Class7824.method26186(this.field7366).method29632(var3, this.field7365);

            for (long var14 = 0L; var14 < Class7824.method26191(this.field7366); var14++) {
               long var15 = var14 * Class7824.method26187(this.field7366) + var6 + var8;
               this.field7364.method9685(var15, var3.method9651(var14));
            }
         }
      }
   }
}
