package mapped;

public class Class566 implements Runnable {
   private static String[] field2748;
   public final int field2749;
   public final int field2750;
   public final int field2751;
   public final int field2752;
   public final double[] field2753;
   public final double[] field2754;
   public final Class7990 field2755;

   public Class566(Class7990 var1, int var2, int var3, int var4, int var5, double[] var6, double[] var7) {
      this.field2755 = var1;
      this.field2749 = var2;
      this.field2750 = var3;
      this.field2751 = var4;
      this.field2752 = var5;
      this.field2753 = var6;
      this.field2754 = var7;
   }

   @Override
   public void run() {
      if (this.field2749 <= 0) {
         for (int var3 = this.field2750; var3 < this.field2751; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            int var6 = this.field2752 + var4;
            int var7 = this.field2752 + var5;
            this.field2753[var6] = Class7990.method27241(this.field2755)[var4] * this.field2754[var4]
               + Class7990.method27241(this.field2755)[var5] * this.field2754[var5];
            this.field2753[var7] = -Class7990.method27241(this.field2755)[var5] * this.field2754[var4]
               + Class7990.method27241(this.field2755)[var4] * this.field2754[var5];
         }
      } else {
         for (int var8 = this.field2750; var8 < this.field2751; var8++) {
            int var9 = 2 * var8;
            int var10 = var9 + 1;
            int var11 = this.field2752 + var9;
            int var12 = this.field2752 + var10;
            this.field2753[var11] = Class7990.method27241(this.field2755)[var9] * this.field2754[var9]
               - Class7990.method27241(this.field2755)[var10] * this.field2754[var10];
            this.field2753[var12] = Class7990.method27241(this.field2755)[var10] * this.field2754[var9]
               + Class7990.method27241(this.field2755)[var9] * this.field2754[var10];
         }
      }
   }
}
