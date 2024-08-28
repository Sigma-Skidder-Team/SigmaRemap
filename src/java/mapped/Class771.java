package mapped;

public class Class771 implements Runnable {
   private static String[] field4018;
   public final int field4019;
   public final int field4020;
   public final float[] field4021;
   public final Class8630 field4022;

   public Class771(Class8630 var1, int var2, int var3, float[] var4) {
      this.field4022 = var1;
      this.field4019 = var2;
      this.field4020 = var3;
      this.field4021 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field4019; var3 < this.field4020; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         float var6 = this.field4021[var4] * Class8630.method31009(this.field4022)[var5] + this.field4021[var5] * Class8630.method31009(this.field4022)[var4];
         this.field4021[var4] = this.field4021[var4] * Class8630.method31009(this.field4022)[var4]
            - this.field4021[var5] * Class8630.method31009(this.field4022)[var5];
         this.field4021[var5] = var6;
      }
   }
}
