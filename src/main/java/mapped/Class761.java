package mapped;

public class Class761 implements Runnable {
   private static String[] field3953;
   public final int field3954;
   public final int field3955;
   public final int field3956;
   public final float[] field3957;
   public final Class8630 field3958;

   public Class761(Class8630 var1, int var2, int var3, int var4, float[] var5) {
      this.field3958 = var1;
      this.field3954 = var2;
      this.field3955 = var3;
      this.field3956 = var4;
      this.field3957 = var5;
   }

   @Override
   public void run() {
      if (this.field3954 <= 0) {
         for (int var3 = this.field3955; var3 < this.field3956; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            float var6 = this.field3957[var4] * Class8630.method31009(this.field3958)[var5]
               + this.field3957[var5] * Class8630.method31009(this.field3958)[var4];
            this.field3957[var4] = this.field3957[var4] * Class8630.method31009(this.field3958)[var4]
               - this.field3957[var5] * Class8630.method31009(this.field3958)[var5];
            this.field3957[var5] = var6;
         }
      } else {
         for (int var7 = this.field3955; var7 < this.field3956; var7++) {
            int var8 = 2 * var7;
            int var9 = var8 + 1;
            float var10 = -this.field3957[var8] * Class8630.method31009(this.field3958)[var9]
               + this.field3957[var9] * Class8630.method31009(this.field3958)[var8];
            this.field3957[var8] = this.field3957[var8] * Class8630.method31009(this.field3958)[var8]
               + this.field3957[var9] * Class8630.method31009(this.field3958)[var9];
            this.field3957[var9] = var10;
         }
      }
   }
}
