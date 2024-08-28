package mapped;

public class Class1438 implements Runnable {
   private static String[] field7722;
   public final long field7723;
   public final long field7724;
   public final Class2378 field7725;
   public final boolean field7726;
   public final Class9533 field7727;

   public Class1438(Class9533 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field7727 = var1;
      this.field7723 = var2;
      this.field7724 = var4;
      this.field7725 = var6;
      this.field7726 = var7;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(Class9533.method36861(this.field7727), false);

      for (long var4 = this.field7723; var4 < this.field7724; var4++) {
         for (long var6 = 0L; var6 < Class9533.method36861(this.field7727); var6++) {
            var3.method9685(var6, this.field7725.method9651(var6 * Class9533.method36860(this.field7727) + var4));
         }

         Class9533.method36859(this.field7727).method29628(var3, this.field7726);

         for (long var8 = 0L; var8 < Class9533.method36861(this.field7727); var8++) {
            this.field7725.method9685(var8 * Class9533.method36860(this.field7727) + var4, var3.method9651(var8));
         }
      }
   }
}
