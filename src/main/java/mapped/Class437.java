package mapped;

public class Class437 implements Runnable {
   private static String[] field1960;
   public final int field1961;
   public final int field1962;
   public final int field1963;
   public final float[] field1964;
   public final float[] field1965;
   public final Class8630 field1966;

   public Class437(Class8630 var1, int var2, int var3, int var4, float[] var5, float[] var6) {
      this.field1966 = var1;
      this.field1961 = var2;
      this.field1962 = var3;
      this.field1963 = var4;
      this.field1964 = var5;
      this.field1965 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field1961; var3 < this.field1962; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         int var6 = this.field1963 + var3;
         this.field1964[var4] = this.field1965[var6] * Class8630.method31008(this.field1966)[var4];
         this.field1964[var5] = -this.field1965[var6] * Class8630.method31008(this.field1966)[var5];
      }
   }
}
