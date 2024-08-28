package mapped;

public class Class1633 implements Runnable {
   private static String[] field8855;
   public final int field8856;
   public final int field8857;
   public final double[] field8858;
   public final Class7990 field8859;

   public Class1633(Class7990 var1, int var2, int var3, double[] var4) {
      this.field8859 = var1;
      this.field8856 = var2;
      this.field8857 = var3;
      this.field8858 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field8856; var3 < this.field8857; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         double var6 = -this.field8858[var4] * Class7990.method27242(this.field8859)[var5] + this.field8858[var5] * Class7990.method27242(this.field8859)[var4];
         this.field8858[var4] = this.field8858[var4] * Class7990.method27242(this.field8859)[var4]
            + this.field8858[var5] * Class7990.method27242(this.field8859)[var5];
         this.field8858[var5] = var6;
      }
   }
}
