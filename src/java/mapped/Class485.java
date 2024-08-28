package mapped;

public class Class485 implements Runnable {
   private static String[] field2276;
   public final int field2277;
   public final int field2278;
   public final int field2279;
   public final float[] field2280;
   public final int field2281;
   public final float[] field2282;
   public final Class8630 field2283;

   public Class485(Class8630 var1, int var2, int var3, int var4, float[] var5, int var6, float[] var7) {
      this.field2283 = var1;
      this.field2277 = var2;
      this.field2278 = var3;
      this.field2279 = var4;
      this.field2280 = var5;
      this.field2281 = var6;
      this.field2282 = var7;
   }

   @Override
   public void run() {
      if (this.field2277 <= 0) {
         for (int var3 = this.field2278; var3 < this.field2279; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            this.field2280[this.field2281 + var4] = Class8630.method31008(this.field2283)[var4] * this.field2282[var4]
               + Class8630.method31008(this.field2283)[var5] * this.field2282[var5];
            this.field2280[this.field2281 + var5] = -Class8630.method31008(this.field2283)[var5] * this.field2282[var4]
               + Class8630.method31008(this.field2283)[var4] * this.field2282[var5];
         }
      } else {
         for (int var6 = this.field2278; var6 < this.field2279; var6++) {
            int var7 = 2 * var6;
            int var8 = var7 + 1;
            this.field2280[this.field2281 + var7] = Class8630.method31008(this.field2283)[var7] * this.field2282[var7]
               - Class8630.method31008(this.field2283)[var8] * this.field2282[var8];
            this.field2280[this.field2281 + var8] = Class8630.method31008(this.field2283)[var8] * this.field2282[var7]
               + Class8630.method31008(this.field2283)[var7] * this.field2282[var8];
         }
      }
   }
}
