package mapped;

public class Class325 implements Runnable {
   private static String[] field1400;
   public final int field1401;
   public final int field1402;
   public final float[] field1403;
   public final boolean field1404;
   public final Class7824 field1405;

   public Class325(Class7824 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field1405 = var1;
      this.field1401 = var2;
      this.field1402 = var3;
      this.field1403 = var4;
      this.field1404 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field1401; var3 < this.field1402; var3++) {
         int var4 = var3 * Class7824.method26179(this.field1405);

         for (int var5 = 0; var5 < Class7824.method26180(this.field1405); var5++) {
            Class7824.method26182(this.field1405).method29633(this.field1403, var4 + var5 * Class7824.method26181(this.field1405), this.field1404);
         }
      }
   }
}
