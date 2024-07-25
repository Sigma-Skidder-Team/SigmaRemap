package remapped;

public class class_3576 implements Runnable {
   private static String[] field_17502;

   public class_3576(class_2841 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_17505 = var1;
      this.field_17504 = var2;
      this.field_17501 = var3;
      this.field_17503 = var4;
      this.field_17506 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_2841.method_12928(this.field_17505)];

      for (int var4 = this.field_17504; var4 < this.field_17501; var4++) {
         int var5 = var4 * class_2841.method_12913(this.field_17505);

         for (int var6 = 0; var6 < class_2841.method_12908(this.field_17505); var6++) {
            for (int var7 = 0; var7 < class_2841.method_12928(this.field_17505); var7++) {
               int var8 = var5 + var7 * class_2841.method_12922(this.field_17505) + var6;
               var3[var7] = this.field_17503[var8];
            }

            class_2841.method_12921(this.field_17505).method_21132(var3, this.field_17506);

            for (int var9 = 0; var9 < class_2841.method_12928(this.field_17505); var9++) {
               int var10 = var5 + var9 * class_2841.method_12922(this.field_17505) + var6;
               this.field_17503[var10] = var3[var9];
            }
         }
      }
   }
}
