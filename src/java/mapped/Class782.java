package mapped;

public class Class782 implements Runnable {
   private static String[] field4088;
   public final int field4089;
   public final int field4090;
   public final int field4091;
   public final float[] field4092;
   public final float[] field4093;
   public final Class8630 field4094;

   public Class782(Class8630 var1, int var2, int var3, int var4, float[] var5, float[] var6) {
      this.field4094 = var1;
      this.field4089 = var2;
      this.field4090 = var3;
      this.field4091 = var4;
      this.field4092 = var5;
      this.field4093 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field4089; var3 < this.field4090; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         int var6 = this.field4091 + var3;
         this.field4092[var4] = this.field4093[var6] * Class8630.method31008(this.field4094)[var4];
         this.field4092[var5] = this.field4093[var6] * Class8630.method31008(this.field4094)[var5];
      }
   }
}
