package mapped;

public class Class429 implements Runnable {
   private static String[] field1904;
   public final int field1905;
   public final int field1906;
   public final int field1907;
   public final int field1908;
   public final float[] field1909;
   public final float[] field1910;
   public final Class8630 field1911;

   public Class429(Class8630 var1, int var2, int var3, int var4, int var5, float[] var6, float[] var7) {
      this.field1911 = var1;
      this.field1905 = var2;
      this.field1906 = var3;
      this.field1907 = var4;
      this.field1908 = var5;
      this.field1909 = var6;
      this.field1910 = var7;
   }

   @Override
   public void run() {
      if (this.field1905 <= 0) {
         for (int var3 = this.field1906; var3 < this.field1907; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            int var6 = this.field1908 + var4;
            int var7 = this.field1908 + var5;
            this.field1909[var4] = this.field1910[var6] * Class8630.method31008(this.field1911)[var4]
               + this.field1910[var7] * Class8630.method31008(this.field1911)[var5];
            this.field1909[var5] = -this.field1910[var6] * Class8630.method31008(this.field1911)[var5]
               + this.field1910[var7] * Class8630.method31008(this.field1911)[var4];
         }
      } else {
         for (int var8 = this.field1906; var8 < this.field1907; var8++) {
            int var9 = 2 * var8;
            int var10 = var9 + 1;
            int var11 = this.field1908 + var9;
            int var12 = this.field1908 + var10;
            this.field1909[var9] = this.field1910[var11] * Class8630.method31008(this.field1911)[var9]
               - this.field1910[var12] * Class8630.method31008(this.field1911)[var10];
            this.field1909[var10] = this.field1910[var11] * Class8630.method31008(this.field1911)[var10]
               + this.field1910[var12] * Class8630.method31008(this.field1911)[var9];
         }
      }
   }
}
