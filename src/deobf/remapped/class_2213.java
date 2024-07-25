package remapped;

public class class_2213 implements Runnable {
   private static String[] field_11080;

   public class_2213(class_3803 var1, int var2, int var3, float[] var4) {
      this.field_11083 = var1;
      this.field_11081 = var2;
      this.field_11082 = var3;
      this.field_11079 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_3803.method_17688(this.field_11083)];

      for (int var4 = this.field_11081; var4 < this.field_11082; var4++) {
         int var5 = var4 * class_3803.method_17685(this.field_11083);

         for (int var6 = 0; var6 < class_3803.method_17715(this.field_11083); var6++) {
            for (int var7 = 0; var7 < class_3803.method_17688(this.field_11083); var7++) {
               int var8 = var7 * class_3803.method_17689(this.field_11083) + var5 + var6;
               var3[var7] = this.field_11079[var8];
            }

            class_3803.method_17699(this.field_11083).method_17785(var3);

            for (int var9 = 0; var9 < class_3803.method_17688(this.field_11083); var9++) {
               int var10 = var9 * class_3803.method_17689(this.field_11083) + var5 + var6;
               this.field_11079[var10] = var3[var9];
            }
         }
      }
   }
}
