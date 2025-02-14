package mapped;

public class Class656 implements Runnable {
   private static String[] field3289;
   public final int field3290;
   public final int field3291;
   public final double[][] field3292;
   public final Class9615 field3293;

   public Class656(Class9615 var1, int var2, int var3, double[][] var4) {
      this.field3293 = var1;
      this.field3290 = var2;
      this.field3291 = var3;
      this.field3292 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field3290; var3 < this.field3291; var3++) {
         Class9615.method37423(this.field3293).method27162(this.field3292[var3]);
      }
   }
}
