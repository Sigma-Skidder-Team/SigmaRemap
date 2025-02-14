package mapped;

public class Class1362 implements Runnable {
   private static String[] field7269;
   public final int field7270;
   public final int field7271;
   public final int field7272;
   public final double[] field7273;
   public final int field7274;
   public final double[] field7275;
   public final Class7990 field7276;

   public Class1362(Class7990 var1, int var2, int var3, int var4, double[] var5, int var6, double[] var7) {
      this.field7276 = var1;
      this.field7270 = var2;
      this.field7271 = var3;
      this.field7272 = var4;
      this.field7273 = var5;
      this.field7274 = var6;
      this.field7275 = var7;
   }

   @Override
   public void run() {
      if (this.field7270 <= 0) {
         for (int var3 = this.field7271; var3 < this.field7272; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            this.field7273[this.field7274 + var4] = Class7990.method27241(this.field7276)[var4] * this.field7275[var4]
               + Class7990.method27241(this.field7276)[var5] * this.field7275[var5];
            this.field7273[this.field7274 + var5] = -Class7990.method27241(this.field7276)[var5] * this.field7275[var4]
               + Class7990.method27241(this.field7276)[var4] * this.field7275[var5];
         }
      } else {
         for (int var6 = this.field7271; var6 < this.field7272; var6++) {
            int var7 = 2 * var6;
            int var8 = var7 + 1;
            this.field7273[this.field7274 + var7] = Class7990.method27241(this.field7276)[var7] * this.field7275[var7]
               - Class7990.method27241(this.field7276)[var8] * this.field7275[var8];
            this.field7273[this.field7274 + var8] = Class7990.method27241(this.field7276)[var8] * this.field7275[var7]
               + Class7990.method27241(this.field7276)[var7] * this.field7275[var8];
         }
      }
   }
}
