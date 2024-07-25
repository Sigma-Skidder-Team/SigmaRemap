package remapped;

public final class class_5971 implements Runnable {
   private static String[] field_30412;

   public class_5971(long var1, long var3, float[] var5, int var6, class_2384 var7, long var8) {
      this.field_30414 = var1;
      this.field_30410 = var3;
      this.field_30411 = var5;
      this.field_30415 = var6;
      this.field_30416 = var7;
      this.field_30413 = var8;
   }

   @Override
   public void run() {
      float[] var3 = new float[2];

      for (long var4 = this.field_30414; var4 < this.field_30410; var4++) {
         var3[0] = this.field_30411[2 * (this.field_30415 + (int)var4)];
         var3[1] = this.field_30411[2 * (this.field_30415 + (int)var4) + 1];
         this.field_30416.method_10884(this.field_30413 + var4, var3);
      }
   }
}
