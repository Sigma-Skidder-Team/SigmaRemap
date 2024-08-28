package mapped;

public class Class493 implements Runnable {
   private static String[] field2333;
   public final long field2334;
   public final long field2335;
   public final Class2378 field2336;
   public final Class8026 field2337;

   public Class493(Class8026 var1, long var2, long var4, Class2378 var6) {
      this.field2337 = var1;
      this.field2334 = var2;
      this.field2335 = var4;
      this.field2336 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field2334; var3 < this.field2335; var3++) {
         long var5 = var3 * Class8026.method27520(this.field2337);

         for (long var7 = 0L; var7 < Class8026.method27521(this.field2337); var7++) {
            Class8026.method27515(this.field2337).method30932(this.field2336, var5 + var7 * Class8026.method27522(this.field2337));
         }
      }
   }
}
