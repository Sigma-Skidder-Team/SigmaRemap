package remapped;

public class class_3342 implements Runnable {
   private static String[] field_16492;

   public class_3342(class_1637 var1, int var2, int var3, double[] var4) {
      this.field_16491 = var1;
      this.field_16490 = var2;
      this.field_16489 = var3;
      this.field_16493 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * class_1637.method_7338(this.field_16491)];

      for (int var4 = this.field_16490; var4 < this.field_16489; var4++) {
         int var5 = var4 * class_1637.method_7334(this.field_16491);

         for (int var6 = 0; var6 < class_1637.method_7344(this.field_16491); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < class_1637.method_7338(this.field_16491); var8++) {
               int var9 = var8 * class_1637.method_7345(this.field_16491) + var5 + var7;
               int var10 = 2 * var8;
               var3[var10] = this.field_16493[var9];
               var3[var10 + 1] = this.field_16493[var9 + 1];
            }

            class_1637.method_7322(this.field_16491).method_15028(var3);

            for (int var11 = 0; var11 < class_1637.method_7338(this.field_16491); var11++) {
               int var12 = var11 * class_1637.method_7345(this.field_16491) + var5 + var7;
               int var13 = 2 * var11;
               this.field_16493[var12] = var3[var13];
               this.field_16493[var12 + 1] = var3[var13 + 1];
            }
         }
      }
   }
}
