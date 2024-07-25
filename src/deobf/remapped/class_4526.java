package remapped;

public class class_4526 implements Runnable {
   private static String[] field_22091;

   public class_4526(class_5298 var1, int var2, int var3, int var4, int var5, float[] var6) {
      this.field_22089 = var1;
      this.field_22095 = var2;
      this.field_22090 = var3;
      this.field_22093 = var4;
      this.field_22094 = var5;
      this.field_22092 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_22095; var3 < this.field_22090; var3++) {
         int var4 = 2 * var3;
         int var5 = this.field_22093 + (this.field_22094 - var4) % this.field_22094;
         this.field_22092[var5] = this.field_22092[this.field_22093 + var4];
         this.field_22092[var5 + 1] = -this.field_22092[this.field_22093 + var4 + 1];
      }
   }
}
