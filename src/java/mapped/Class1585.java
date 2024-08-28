package mapped;

public class Class1585 implements Runnable {
   private static String[] field8585;
   public final int field8586;
   public final int field8587;
   public final int field8588;
   public final int field8589;
   public final float[] field8590;
   public final float[] field8591;
   public final Class8630 field8592;

   public Class1585(Class8630 var1, int var2, int var3, int var4, int var5, float[] var6, float[] var7) {
      this.field8592 = var1;
      this.field8586 = var2;
      this.field8587 = var3;
      this.field8588 = var4;
      this.field8589 = var5;
      this.field8590 = var6;
      this.field8591 = var7;
   }

   @Override
   public void run() {
      if (this.field8586 <= 0) {
         for (int var3 = this.field8587; var3 < this.field8588; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            int var6 = this.field8589 + var4;
            int var7 = this.field8589 + var5;
            this.field8590[var6] = Class8630.method31008(this.field8592)[var4] * this.field8591[var4]
               + Class8630.method31008(this.field8592)[var5] * this.field8591[var5];
            this.field8590[var7] = -Class8630.method31008(this.field8592)[var5] * this.field8591[var4]
               + Class8630.method31008(this.field8592)[var4] * this.field8591[var5];
         }
      } else {
         for (int var8 = this.field8587; var8 < this.field8588; var8++) {
            int var9 = 2 * var8;
            int var10 = var9 + 1;
            int var11 = this.field8589 + var9;
            int var12 = this.field8589 + var10;
            this.field8590[var11] = Class8630.method31008(this.field8592)[var9] * this.field8591[var9]
               - Class8630.method31008(this.field8592)[var10] * this.field8591[var10];
            this.field8590[var12] = Class8630.method31008(this.field8592)[var10] * this.field8591[var9]
               + Class8630.method31008(this.field8592)[var9] * this.field8591[var10];
         }
      }
   }
}
