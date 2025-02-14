package mapped;

public class Class611 implements Runnable {
   private static String[] field3026;
   public final long field3027;
   public final long field3028;
   public final Class2378 field3029;
   public final boolean field3030;
   public final Class9533 field3031;

   public Class611(Class9533 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field3031 = var1;
      this.field3027 = var2;
      this.field3028 = var4;
      this.field3029 = var6;
      this.field3030 = var7;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(Class9533.method36861(this.field3031), false);

      for (long var4 = this.field3027; var4 < this.field3028; var4++) {
         for (long var6 = 0L; var6 < Class9533.method36861(this.field3031); var6++) {
            var3.method9685(var6, this.field3029.method9651(var6 * Class9533.method36860(this.field3031) + var4));
         }

         Class9533.method36859(this.field3031).method29632(var3, this.field3030);

         for (long var8 = 0L; var8 < Class9533.method36861(this.field3031); var8++) {
            this.field3029.method9685(var8 * Class9533.method36860(this.field3031) + var4, var3.method9651(var8));
         }
      }
   }
}
