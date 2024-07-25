package remapped;

public class class_2493 implements Runnable {
   private static String[] field_12398;

   public class_2493(class_1637 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_12402 = var1;
      this.field_12403 = var2;
      this.field_12399 = var3;
      this.field_12401 = var4;
      this.field_12400 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * class_1637.method_7321(this.field_12402)];

      for (int var4 = this.field_12403; var4 < this.field_12399; var4++) {
         int var5 = var4 * class_1637.method_7345(this.field_12402);

         for (int var6 = 0; var6 < class_1637.method_7344(this.field_12402); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < class_1637.method_7321(this.field_12402); var8++) {
               int var9 = var5 + var7 + var8 * class_1637.method_7334(this.field_12402);
               int var10 = 2 * var8;
               var3[var10] = this.field_12401[var9];
               var3[var10 + 1] = this.field_12401[var9 + 1];
            }

            class_1637.method_7323(this.field_12402).method_15036(var3, this.field_12400);

            for (int var11 = 0; var11 < class_1637.method_7321(this.field_12402); var11++) {
               int var12 = var5 + var7 + var11 * class_1637.method_7334(this.field_12402);
               int var13 = 2 * var11;
               this.field_12401[var12] = var3[var13];
               this.field_12401[var12 + 1] = var3[var13 + 1];
            }
         }
      }
   }
}
