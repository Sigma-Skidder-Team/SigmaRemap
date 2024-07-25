package remapped;

public class class_9730 implements Runnable {
   private static String[] field_49454;

   public class_9730(class_3803 var1, int var2, int var3, float[] var4) {
      this.field_49453 = var1;
      this.field_49450 = var2;
      this.field_49451 = var3;
      this.field_49452 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_3803.method_17681(this.field_49453)];

      for (int var4 = this.field_49450; var4 < this.field_49451; var4++) {
         int var5 = var4 * class_3803.method_17689(this.field_49453);

         for (int var6 = 0; var6 < class_3803.method_17715(this.field_49453); var6++) {
            for (int var7 = 0; var7 < class_3803.method_17681(this.field_49453); var7++) {
               int var8 = var5 + var7 * class_3803.method_17685(this.field_49453) + var6;
               var3[var7] = this.field_49452[var8];
            }

            class_3803.method_17714(this.field_49453).method_17785(var3);

            for (int var9 = 0; var9 < class_3803.method_17681(this.field_49453); var9++) {
               int var10 = var5 + var9 * class_3803.method_17685(this.field_49453) + var6;
               this.field_49452[var10] = var3[var9];
            }
         }
      }
   }
}
