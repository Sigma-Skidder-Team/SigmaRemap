package mapped;

public class Class403 implements Runnable {
   private static String[] field1737;
   public final int field1738;
   public final int field1739;
   public final int field1740;
   public final float[] field1741;
   public final Class8630 field1742;

   public Class403(Class8630 var1, int var2, int var3, int var4, float[] var5) {
      this.field1742 = var1;
      this.field1738 = var2;
      this.field1739 = var3;
      this.field1740 = var4;
      this.field1741 = var5;
   }

   @Override
   public void run() {
      if (this.field1738 <= 0) {
         for (int var3 = this.field1739; var3 < this.field1740; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            float var6 = this.field1741[var4] * Class8630.method31009(this.field1742)[var5]
               + this.field1741[var5] * Class8630.method31009(this.field1742)[var4];
            this.field1741[var4] = this.field1741[var4] * Class8630.method31009(this.field1742)[var4]
               - this.field1741[var5] * Class8630.method31009(this.field1742)[var5];
            this.field1741[var5] = var6;
         }
      } else {
         for (int var7 = this.field1739; var7 < this.field1740; var7++) {
            int var8 = 2 * var7;
            int var9 = var8 + 1;
            float var10 = -this.field1741[var8] * Class8630.method31009(this.field1742)[var9]
               + this.field1741[var9] * Class8630.method31009(this.field1742)[var8];
            this.field1741[var8] = this.field1741[var8] * Class8630.method31009(this.field1742)[var8]
               + this.field1741[var9] * Class8630.method31009(this.field1742)[var9];
            this.field1741[var9] = var10;
         }
      }
   }
}
