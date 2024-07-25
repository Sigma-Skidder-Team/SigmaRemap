package remapped;

public class class_1832 implements Runnable {
   private static String[] field_9287;

   public class_1832(class_1637 var1, int var2, int var3, int var4, int var5, double[] var6) {
      this.field_9288 = var1;
      this.field_9291 = var2;
      this.field_9286 = var3;
      this.field_9290 = var4;
      this.field_9292 = var5;
      this.field_9289 = var6;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * class_1637.method_7321(this.field_9288)];

      for (int var4 = this.field_9291; var4 < this.field_9286; var4++) {
         int var5 = var4 * this.field_9290;

         for (int var6 = 0; var6 < class_1637.method_7344(this.field_9288); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < class_1637.method_7321(this.field_9288); var8++) {
               int var9 = var5 + var8 * this.field_9292 + var7;
               int var10 = 2 * var8;
               var3[var10] = this.field_9289[var9];
               var3[var10 + 1] = this.field_9289[var9 + 1];
            }

            class_1637.method_7323(this.field_9288).method_15028(var3);

            for (int var11 = 0; var11 < class_1637.method_7321(this.field_9288); var11++) {
               int var12 = var5 + var11 * this.field_9292 + var7;
               int var13 = 2 * var11;
               this.field_9289[var12] = var3[var13];
               this.field_9289[var12 + 1] = var3[var13 + 1];
            }
         }
      }
   }
}
