package remapped;

public class class_4009 implements Runnable {
   private static String[] field_19470;

   public class_4009(class_1637 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field_19475 = var1;
      this.field_19468 = var2;
      this.field_19469 = var3;
      this.field_19472 = var4;
      this.field_19471 = var5;
      this.field_19473 = var6;
      this.field_19474 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * class_1637.method_7338(this.field_19475)];

      for (int var4 = this.field_19468; var4 < this.field_19469; var4++) {
         int var5 = var4 * this.field_19472;

         for (int var6 = 0; var6 < class_1637.method_7344(this.field_19475); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < class_1637.method_7338(this.field_19475); var8++) {
               int var9 = 2 * var8;
               int var10 = var8 * this.field_19471 + var5 + var7;
               var3[var9] = this.field_19473[var10];
               var3[var9 + 1] = this.field_19473[var10 + 1];
            }

            class_1637.method_7322(this.field_19475).method_15036(var3, this.field_19474);

            for (int var11 = 0; var11 < class_1637.method_7338(this.field_19475); var11++) {
               int var12 = 2 * var11;
               int var13 = var11 * this.field_19471 + var5 + var7;
               this.field_19473[var13] = var3[var12];
               this.field_19473[var13 + 1] = var3[var12 + 1];
            }
         }
      }
   }
}
