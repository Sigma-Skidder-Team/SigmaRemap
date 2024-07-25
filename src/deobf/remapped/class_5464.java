package remapped;

public class class_5464 implements Runnable {
   private static String[] field_27831;

   public class_5464(class_1637 var1, int var2, int var3, int var4, int var5, int var6, int var7, double[] var8) {
      this.field_27827 = var1;
      this.field_27830 = var2;
      this.field_27826 = var3;
      this.field_27829 = var4;
      this.field_27832 = var5;
      this.field_27833 = var6;
      this.field_27828 = var7;
      this.field_27834 = var8;
   }

   @Override
   public void run() {
      for (int var3 = this.field_27830; var3 < this.field_27826; var3++) {
         int var4 = (class_1637.method_7338(this.field_27827) - var3) % class_1637.method_7338(this.field_27827);
         int var5 = var4 * this.field_27829;
         int var6 = var3 * this.field_27829;

         for (int var7 = 1; var7 < this.field_27832; var7++) {
            int var8 = class_1637.method_7321(this.field_27827) - var7;
            int var9 = var8 * this.field_27833;
            int var10 = var7 * this.field_27833;
            int var11 = var5 + var9;

            for (int var12 = 0; var12 < class_1637.method_7344(this.field_27827); var12++) {
               int var13 = 2 * var12;
               int var14 = this.field_27828 - var13;
               int var15 = var6 + var10 + var13;
               this.field_27834[var11 + var14 % this.field_27828] = this.field_27834[var15];
               this.field_27834[var11 + (var14 + 1) % this.field_27828] = -this.field_27834[var15 + 1];
            }
         }
      }
   }
}
