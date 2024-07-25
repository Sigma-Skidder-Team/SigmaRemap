package remapped;

public class class_6669 implements Runnable {
   private static String[] field_34476;

   public class_6669(class_1637 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field_34479 = var1;
      this.field_34478 = var2;
      this.field_34481 = var3;
      this.field_34480 = var4;
      this.field_34483 = var5;
      this.field_34482 = var6;
      this.field_34477 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * class_1637.method_7321(this.field_34479)];

      for (int var4 = this.field_34478; var4 < this.field_34481; var4++) {
         int var5 = var4 * this.field_34480;

         for (int var6 = 0; var6 < class_1637.method_7344(this.field_34479); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < class_1637.method_7321(this.field_34479); var8++) {
               int var9 = var5 + var8 * this.field_34483 + var7;
               int var10 = 2 * var8;
               var3[var10] = this.field_34482[var9];
               var3[var10 + 1] = this.field_34482[var9 + 1];
            }

            class_1637.method_7323(this.field_34479).method_15036(var3, this.field_34477);

            for (int var11 = 0; var11 < class_1637.method_7321(this.field_34479); var11++) {
               int var12 = var5 + var11 * this.field_34483 + var7;
               int var13 = 2 * var11;
               this.field_34482[var12] = var3[var13];
               this.field_34482[var12 + 1] = var3[var13 + 1];
            }
         }
      }
   }
}
