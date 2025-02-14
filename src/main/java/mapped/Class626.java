package mapped;

public class Class626 implements Runnable {
   private static String[] field3118;
   public final int field3119;
   public final int field3120;
   public final int field3121;
   public final int field3122;
   public final double[] field3123;
   public final double[] field3124;
   public final Class7990 field3125;

   public Class626(Class7990 var1, int var2, int var3, int var4, int var5, double[] var6, double[] var7) {
      this.field3125 = var1;
      this.field3119 = var2;
      this.field3120 = var3;
      this.field3121 = var4;
      this.field3122 = var5;
      this.field3123 = var6;
      this.field3124 = var7;
   }

   @Override
   public void run() {
      if (this.field3119 <= 0) {
         for (int var3 = this.field3120; var3 < this.field3121; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            int var6 = this.field3122 + var4;
            int var7 = this.field3122 + var5;
            this.field3123[var4] = this.field3124[var6] * Class7990.method27241(this.field3125)[var4]
               + this.field3124[var7] * Class7990.method27241(this.field3125)[var5];
            this.field3123[var5] = -this.field3124[var6] * Class7990.method27241(this.field3125)[var5]
               + this.field3124[var7] * Class7990.method27241(this.field3125)[var4];
         }
      } else {
         for (int var8 = this.field3120; var8 < this.field3121; var8++) {
            int var9 = 2 * var8;
            int var10 = var9 + 1;
            int var11 = this.field3122 + var9;
            int var12 = this.field3122 + var10;
            this.field3123[var9] = this.field3124[var11] * Class7990.method27241(this.field3125)[var9]
               - this.field3124[var12] * Class7990.method27241(this.field3125)[var10];
            this.field3123[var10] = this.field3124[var11] * Class7990.method27241(this.field3125)[var10]
               + this.field3124[var12] * Class7990.method27241(this.field3125)[var9];
         }
      }
   }
}
