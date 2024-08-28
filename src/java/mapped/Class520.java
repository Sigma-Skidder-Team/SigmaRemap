package mapped;

public class Class520 implements Runnable {
   private static String[] field2465;
   public final int field2466;
   public final int field2467;
   public final double[] field2468;
   public final int field2469;
   public final double[] field2470;
   public final Class9049 field2471;

   public Class520(Class9049 var1, int var2, int var3, double[] var4, int var5, double[] var6) {
      this.field2471 = var1;
      this.field2466 = var2;
      this.field2467 = var3;
      this.field2468 = var4;
      this.field2469 = var5;
      this.field2470 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field2466; var3 < this.field2467; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         this.field2468[this.field2469 + var3] = this.field2470[var4] - this.field2470[var5];
         this.field2468[this.field2469 + Class9049.method33654(this.field2471) - var3] = this.field2470[var4] + this.field2470[var5];
      }
   }
}
