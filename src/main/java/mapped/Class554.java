package mapped;

public class Class554 implements Runnable {
   private static String[] field2663;
   public final int field2664;
   public final int field2665;
   public final float[] field2666;
   public final Class8630 field2667;

   public Class554(Class8630 var1, int var2, int var3, float[] var4) {
      this.field2667 = var1;
      this.field2664 = var2;
      this.field2665 = var3;
      this.field2666 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field2664; var3 < this.field2665; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         float var6 = -this.field2666[var4] * Class8630.method31009(this.field2667)[var5] + this.field2666[var5] * Class8630.method31009(this.field2667)[var4];
         this.field2666[var4] = this.field2666[var4] * Class8630.method31009(this.field2667)[var4]
            + this.field2666[var5] * Class8630.method31009(this.field2667)[var5];
         this.field2666[var5] = var6;
      }
   }
}
