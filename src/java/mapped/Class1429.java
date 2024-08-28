package mapped;

public class Class1429 implements Runnable {
   private static String[] field7665;
   public final long field7666;
   public final long field7667;
   public final Class2381 field7668;
   public final boolean field7669;
   public final Class9186 field7670;

   public Class1429(Class9186 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field7670 = var1;
      this.field7666 = var2;
      this.field7667 = var4;
      this.field7668 = var6;
      this.field7669 = var7;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(Class9186.method34386(this.field7670), false);

      for (long var4 = this.field7666; var4 < this.field7667; var4++) {
         for (long var6 = 0L; var6 < Class9186.method34386(this.field7670); var6++) {
            var3.method9687(var6, this.field7668.method9653(var6 * Class9186.method34385(this.field7670) + var4));
         }

         Class9186.method34384(this.field7670).method33651(var3, this.field7669);

         for (long var8 = 0L; var8 < Class9186.method34386(this.field7670); var8++) {
            this.field7668.method9687(var8 * Class9186.method34385(this.field7670) + var4, var3.method9653(var8));
         }
      }
   }
}
