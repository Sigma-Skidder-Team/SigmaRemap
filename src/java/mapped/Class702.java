package mapped;

public class Class702 implements Runnable {
   private static String[] field3590;
   public final int field3591;
   public final int field3592;
   public final double[] field3593;
   public final Class7990 field3594;

   public Class702(Class7990 var1, int var2, int var3, double[] var4) {
      this.field3594 = var1;
      this.field3591 = var2;
      this.field3592 = var3;
      this.field3593 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field3591; var3 < this.field3592; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         double var6 = -this.field3593[var4] * Class7990.method27242(this.field3594)[var5] + this.field3593[var5] * Class7990.method27242(this.field3594)[var4];
         this.field3593[var4] = this.field3593[var4] * Class7990.method27242(this.field3594)[var4]
            + this.field3593[var5] * Class7990.method27242(this.field3594)[var5];
         this.field3593[var5] = var6;
      }
   }
}
