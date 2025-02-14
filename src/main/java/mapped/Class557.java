package mapped;

public class Class557 implements Runnable {
   private static String[] field2682;
   public final long field2683;
   public final long field2684;
   public final Class2381 field2685;
   public final long field2686;
   public final Class9615 field2687;

   public Class557(Class9615 var1, long var2, long var4, Class2381 var6, long var7) {
      this.field2687 = var1;
      this.field2683 = var2;
      this.field2684 = var4;
      this.field2685 = var6;
      this.field2686 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field2683; var3 < this.field2684; var3++) {
         Class9615.method37423(this.field2687).method27165(this.field2685, var3 * this.field2686);
      }
   }
}
