package remapped;

public class class_9764 implements Runnable {
   private static String[] field_49595;

   public class_9764(class_3101 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field_49597 = var1;
      this.field_49599 = var2;
      this.field_49594 = var3;
      this.field_49598 = var4;
      this.field_49596 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_3101.method_14192(this.field_49597)];

      for (int var4 = this.field_49599; var4 < this.field_49594; var4++) {
         for (int var5 = 0; var5 < class_3101.method_14191(this.field_49597); var5++) {
            for (int var6 = 0; var6 < class_3101.method_14192(this.field_49597); var6++) {
               var3[var6] = this.field_49598[var6][var4][var5];
            }

            class_3101.method_14200(this.field_49597).method_19197(var3, this.field_49596);

            for (int var7 = 0; var7 < class_3101.method_14192(this.field_49597); var7++) {
               this.field_49598[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}
