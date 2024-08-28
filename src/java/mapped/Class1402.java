package mapped;

public class Class1402 implements Runnable {
   private static String[] field7500;
   public final int field7501;
   public final int field7502;
   public final int field7503;
   public final int field7504;
   public final float[] field7505;
   public final float[] field7506;
   public final Class8630 field7507;

   public Class1402(Class8630 var1, int var2, int var3, int var4, int var5, float[] var6, float[] var7) {
      this.field7507 = var1;
      this.field7501 = var2;
      this.field7502 = var3;
      this.field7503 = var4;
      this.field7504 = var5;
      this.field7505 = var6;
      this.field7506 = var7;
   }

   @Override
   public void run() {
      if (this.field7501 <= 0) {
         for (int var3 = this.field7502; var3 < this.field7503; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            int var6 = this.field7504 + var3;
            this.field7505[var4] = this.field7506[var6] * Class8630.method31008(this.field7507)[var4];
            this.field7505[var5] = -this.field7506[var6] * Class8630.method31008(this.field7507)[var5];
         }
      } else {
         for (int var7 = this.field7502; var7 < this.field7503; var7++) {
            int var8 = 2 * var7;
            int var9 = var8 + 1;
            int var10 = this.field7504 + var7;
            this.field7505[var8] = this.field7506[var10] * Class8630.method31008(this.field7507)[var8];
            this.field7505[var9] = this.field7506[var10] * Class8630.method31008(this.field7507)[var9];
         }
      }
   }
}
