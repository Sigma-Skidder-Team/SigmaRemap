package remapped;

public class class_3473 implements Runnable {
   private static String[] field_17030;

   public class_3473(class_4133 var1, int var2, int var3, int var4, float[] var5) {
      this.field_17031 = var1;
      this.field_17029 = var2;
      this.field_17028 = var3;
      this.field_17033 = var4;
      this.field_17032 = var5;
   }

   @Override
   public void run() {
      int var3 = this.field_17029 + class_4133.method_19199(this.field_17031) - 1;

      for (int var4 = this.field_17028; var4 < this.field_17033; var4++) {
         int var5 = this.field_17029 + var4;
         float var6 = this.field_17032[var5];
         int var7 = var3 - var4;
         this.field_17032[var5] = this.field_17032[var7];
         this.field_17032[var7] = var6;
      }
   }
}
