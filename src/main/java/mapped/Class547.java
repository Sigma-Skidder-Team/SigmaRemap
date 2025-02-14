package mapped;

public class Class547 implements Runnable {
   private static String[] field2622;
   public final long field2623;
   public final long field2624;
   public final Class2378 field2625;
   public final boolean field2626;
   public final Class8682 field2627;

   public Class547(Class8682 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field2627 = var1;
      this.field2623 = var2;
      this.field2624 = var4;
      this.field2625 = var6;
      this.field2626 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field2623; var3 < this.field2624; var3++) {
         Class8682.method31246(this.field2627).method28927(this.field2625, var3 * Class8682.method31249(this.field2627), this.field2626);
      }
   }
}
