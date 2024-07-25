package remapped;

public class class_1884 implements Runnable {
   private static String[] field_9540;

   public class_1884(class_3803 var1, int var2, int var3, float[][][] var4) {
      this.field_9543 = var1;
      this.field_9544 = var2;
      this.field_9541 = var3;
      this.field_9542 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_3803.method_17681(this.field_9543)];

      for (int var4 = this.field_9544; var4 < this.field_9541; var4++) {
         for (int var5 = 0; var5 < class_3803.method_17715(this.field_9543); var5++) {
            for (int var6 = 0; var6 < class_3803.method_17681(this.field_9543); var6++) {
               var3[var6] = this.field_9542[var4][var6][var5];
            }

            class_3803.method_17714(this.field_9543).method_17785(var3);

            for (int var7 = 0; var7 < class_3803.method_17681(this.field_9543); var7++) {
               this.field_9542[var4][var7][var5] = var3[var7];
            }
         }
      }
   }
}
