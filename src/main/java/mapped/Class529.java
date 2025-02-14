package mapped;

public class Class529 implements Runnable {
   private static String[] field2524;
   public final int field2525;
   public final int field2526;
   public final double[][][] field2527;
   public final boolean field2528;
   public final Class7274 field2529;

   public Class529(Class7274 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field2529 = var1;
      this.field2525 = var2;
      this.field2526 = var3;
      this.field2527 = var4;
      this.field2528 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field2525; var3 < this.field2526; var3++) {
         for (int var4 = 0; var4 < Class7274.method22895(this.field2529); var4++) {
            Class7274.method22897(this.field2529).method27182(this.field2527[var3][var4], this.field2528);
         }
      }
   }
}
