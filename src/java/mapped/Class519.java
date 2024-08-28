package mapped;

public class Class519 implements Runnable {
   private static String[] field2460;
   public final int field2461;
   public final int field2462;
   public final double[] field2463;
   public final Class7990 field2464;

   public Class519(Class7990 var1, int var2, int var3, double[] var4) {
      this.field2464 = var1;
      this.field2461 = var2;
      this.field2462 = var3;
      this.field2463 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field2461; var3 < this.field2462; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         double var6 = this.field2463[var4] * Class7990.method27242(this.field2464)[var5] + this.field2463[var5] * Class7990.method27242(this.field2464)[var4];
         this.field2463[var4] = this.field2463[var4] * Class7990.method27242(this.field2464)[var4]
            - this.field2463[var5] * Class7990.method27242(this.field2464)[var5];
         this.field2463[var5] = var6;
      }
   }
}
