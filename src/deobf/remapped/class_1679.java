package remapped;

public class class_1679 implements Runnable {
   private static String[] field_8688;

   public class_1679(class_1637 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field_8685 = var1;
      this.field_8686 = var2;
      this.field_8683 = var3;
      this.field_8687 = var4;
      this.field_8684 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * class_1637.method_7338(this.field_8685)];

      for (int var4 = this.field_8686; var4 < this.field_8683; var4++) {
         for (int var5 = 0; var5 < class_1637.method_7344(this.field_8685); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < class_1637.method_7338(this.field_8685); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field_8687[var7][var4][var6];
               var3[var8 + 1] = this.field_8687[var7][var4][var6 + 1];
            }

            class_1637.method_7322(this.field_8685).method_15036(var3, this.field_8684);

            for (int var9 = 0; var9 < class_1637.method_7338(this.field_8685); var9++) {
               int var10 = 2 * var9;
               this.field_8687[var9][var4][var6] = var3[var10];
               this.field_8687[var9][var4][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
