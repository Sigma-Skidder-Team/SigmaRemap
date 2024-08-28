package mapped;

public class Class475 implements Runnable {
   private static String[] field2217;
   public final int field2218;
   public final int field2219;
   public final int field2220;
   public final double[][][] field2221;
   public final Class7274 field2222;

   public Class475(Class7274 var1, int var2, int var3, int var4, double[][][] var5) {
      this.field2222 = var1;
      this.field2218 = var2;
      this.field2219 = var3;
      this.field2220 = var4;
      this.field2221 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field2218; var3 < this.field2219; var3++) {
         int var4 = (Class7274.method22900(this.field2222) - var3) % Class7274.method22900(this.field2222);

         for (int var5 = 1; var5 < this.field2220; var5++) {
            int var6 = Class7274.method22895(this.field2222) - var5;
            this.field2221[var4][var6][0] = this.field2221[var3][var5][0];
            this.field2221[var4][var6][1] = -this.field2221[var3][var5][1];
         }
      }
   }
}
