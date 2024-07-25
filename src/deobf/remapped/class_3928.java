package remapped;

public class class_3928 implements Runnable {
   private static String[] field_19081;

   public class_3928(class_1637 var1, int var2, int var3, int var4, int var5, double[] var6) {
      this.field_19083 = var1;
      this.field_19085 = var2;
      this.field_19087 = var3;
      this.field_19084 = var4;
      this.field_19082 = var5;
      this.field_19086 = var6;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * class_1637.method_7338(this.field_19083)];

      for (int var4 = this.field_19085; var4 < this.field_19087; var4++) {
         int var5 = var4 * this.field_19084;

         for (int var6 = 0; var6 < class_1637.method_7344(this.field_19083); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < class_1637.method_7338(this.field_19083); var8++) {
               int var9 = 2 * var8;
               int var10 = var8 * this.field_19082 + var5 + var7;
               var3[var9] = this.field_19086[var10];
               var3[var9 + 1] = this.field_19086[var10 + 1];
            }

            class_1637.method_7322(this.field_19083).method_15028(var3);

            for (int var11 = 0; var11 < class_1637.method_7338(this.field_19083); var11++) {
               int var12 = 2 * var11;
               int var13 = var11 * this.field_19082 + var5 + var7;
               this.field_19086[var13] = var3[var12];
               this.field_19086[var13 + 1] = var3[var12 + 1];
            }
         }
      }
   }
}
