package mapped;

public class Class445 implements Runnable {
   private static String[] field2017;
   public final int field2018;
   public final int field2019;
   public final int field2020;
   public final double[] field2021;
   public final Class7990 field2022;

   public Class445(Class7990 var1, int var2, int var3, int var4, double[] var5) {
      this.field2022 = var1;
      this.field2018 = var2;
      this.field2019 = var3;
      this.field2020 = var4;
      this.field2021 = var5;
   }

   @Override
   public void run() {
      if (this.field2018 <= 0) {
         for (int var3 = this.field2019; var3 < this.field2020; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            double var6 = this.field2021[var4] * Class7990.method27242(this.field2022)[var5]
               + this.field2021[var5] * Class7990.method27242(this.field2022)[var4];
            this.field2021[var4] = this.field2021[var4] * Class7990.method27242(this.field2022)[var4]
               - this.field2021[var5] * Class7990.method27242(this.field2022)[var5];
            this.field2021[var5] = var6;
         }
      } else {
         for (int var8 = this.field2019; var8 < this.field2020; var8++) {
            int var9 = 2 * var8;
            int var10 = var9 + 1;
            double var11 = -this.field2021[var9] * Class7990.method27242(this.field2022)[var10]
               + this.field2021[var10] * Class7990.method27242(this.field2022)[var9];
            this.field2021[var9] = this.field2021[var9] * Class7990.method27242(this.field2022)[var9]
               + this.field2021[var10] * Class7990.method27242(this.field2022)[var10];
            this.field2021[var10] = var11;
         }
      }
   }
}
