package mapped;

public class Class1543 implements Runnable {
   private static String[] field8371;
   public final int field8372;
   public final int field8373;
   public final int field8374;
   public final double[] field8375;
   public final Class7990 field8376;

   public Class1543(Class7990 var1, int var2, int var3, int var4, double[] var5) {
      this.field8376 = var1;
      this.field8372 = var2;
      this.field8373 = var3;
      this.field8374 = var4;
      this.field8375 = var5;
   }

   @Override
   public void run() {
      if (this.field8372 <= 0) {
         for (int var3 = this.field8373; var3 < this.field8374; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            double var6 = this.field8375[var4] * Class7990.method27242(this.field8376)[var5]
               + this.field8375[var5] * Class7990.method27242(this.field8376)[var4];
            this.field8375[var4] = this.field8375[var4] * Class7990.method27242(this.field8376)[var4]
               - this.field8375[var5] * Class7990.method27242(this.field8376)[var5];
            this.field8375[var5] = var6;
         }
      } else {
         for (int var8 = this.field8373; var8 < this.field8374; var8++) {
            int var9 = 2 * var8;
            int var10 = var9 + 1;
            double var11 = -this.field8375[var9] * Class7990.method27242(this.field8376)[var10]
               + this.field8375[var10] * Class7990.method27242(this.field8376)[var9];
            this.field8375[var9] = this.field8375[var9] * Class7990.method27242(this.field8376)[var9]
               + this.field8375[var10] * Class7990.method27242(this.field8376)[var10];
            this.field8375[var10] = var11;
         }
      }
   }
}
