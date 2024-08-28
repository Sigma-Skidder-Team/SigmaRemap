package mapped;

public class Class541 implements Runnable {
   private static String[] field2588;
   public final long field2589;
   public final long field2590;
   public final long field2591;
   public final long field2592;
   public final Class2378 field2593;
   public final boolean field2594;
   public final long field2595;
   public final Class8026 field2596;

   public Class541(Class8026 var1, long var2, long var4, long var6, long var8, Class2378 var10, boolean var11, long var12) {
      this.field2596 = var1;
      this.field2589 = var2;
      this.field2590 = var4;
      this.field2591 = var6;
      this.field2592 = var8;
      this.field2593 = var10;
      this.field2594 = var11;
      this.field2595 = var12;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(this.field2589);

      for (long var4 = this.field2590; var4 >= this.field2591; var4--) {
         long var6 = var4 * Class8026.method27520(this.field2596);
         long var8 = var4 * this.field2592;

         for (long var10 = Class8026.method27521(this.field2596) - 1L; var10 >= 0L; var10--) {
            Class8133.method28175(this.field2593, var6 + var10 * Class8026.method27522(this.field2596), var3, 0L, Class8026.method27523(this.field2596));
            Class8026.method27515(this.field2596).method30950(var3, this.field2594);
            Class8133.method28175(var3, 0L, this.field2593, var8 + var10 * this.field2595, this.field2589);
         }
      }
   }
}
