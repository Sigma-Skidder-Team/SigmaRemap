package mapped;

public class Class454 implements Runnable {
   private static String[] field2075;
   public final long field2076;
   public final long field2077;
   public final Class2381 field2078;
   public final Class9186 field2079;

   public Class454(Class9186 var1, long var2, long var4, Class2381 var6) {
      this.field2079 = var1;
      this.field2076 = var2;
      this.field2077 = var4;
      this.field2078 = var6;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(Class9186.method34386(this.field2079), false);

      for (long var4 = this.field2076; var4 < this.field2077; var4++) {
         for (long var6 = 0L; var6 < Class9186.method34386(this.field2079); var6++) {
            var3.method9687(var6, this.field2078.method9653(var6 * Class9186.method34385(this.field2079) + var4));
         }

         Class9186.method34384(this.field2079).method33647(var3);

         for (long var8 = 0L; var8 < Class9186.method34386(this.field2079); var8++) {
            this.field2078.method9687(var8 * Class9186.method34385(this.field2079) + var4, var3.method9653(var8));
         }
      }
   }
}
