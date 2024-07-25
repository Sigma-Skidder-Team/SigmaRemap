package remapped;

public class class_8942 implements Runnable {
   private static String[] field_45851;

   public class_8942(class_1637 var1, int var2, int var3, double[] var4) {
      this.field_45850 = var1;
      this.field_45849 = var2;
      this.field_45848 = var3;
      this.field_45852 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * class_1637.method_7321(this.field_45850)];

      for (int var4 = this.field_45849; var4 < this.field_45848; var4++) {
         int var5 = var4 * class_1637.method_7345(this.field_45850);

         for (int var6 = 0; var6 < class_1637.method_7344(this.field_45850); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < class_1637.method_7321(this.field_45850); var8++) {
               int var9 = var5 + var7 + var8 * class_1637.method_7334(this.field_45850);
               int var10 = 2 * var8;
               var3[var10] = this.field_45852[var9];
               var3[var10 + 1] = this.field_45852[var9 + 1];
            }

            class_1637.method_7323(this.field_45850).method_15028(var3);

            for (int var11 = 0; var11 < class_1637.method_7321(this.field_45850); var11++) {
               int var12 = var5 + var7 + var11 * class_1637.method_7334(this.field_45850);
               int var13 = 2 * var11;
               this.field_45852[var12] = var3[var13];
               this.field_45852[var12 + 1] = var3[var13 + 1];
            }
         }
      }
   }
}
