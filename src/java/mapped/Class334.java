package mapped;

public class Class334 implements Runnable {
   private static String[] field1452;
   public final int field1453;
   public final int field1454;
   public final float[] field1455;
   public final boolean field1456;
   public final Class7824 field1457;

   public Class334(Class7824 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field1457 = var1;
      this.field1453 = var2;
      this.field1454 = var3;
      this.field1455 = var4;
      this.field1456 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class7824.method26185(this.field1457)];

      for (int var4 = this.field1453; var4 < this.field1454; var4++) {
         int var5 = var4 * Class7824.method26181(this.field1457);

         for (int var6 = 0; var6 < Class7824.method26183(this.field1457); var6++) {
            for (int var7 = 0; var7 < Class7824.method26185(this.field1457); var7++) {
               int var8 = var7 * Class7824.method26179(this.field1457) + var5 + var6;
               var3[var7] = this.field1455[var8];
            }

            Class7824.method26186(this.field1457).method29631(var3, this.field1456);

            for (int var9 = 0; var9 < Class7824.method26185(this.field1457); var9++) {
               int var10 = var9 * Class7824.method26179(this.field1457) + var5 + var6;
               this.field1455[var10] = var3[var9];
            }
         }
      }
   }
}
