package remapped;

public class class_6389 implements Runnable {
   private static String[] field_32631;

   public class_6389(class_1637 var1, int var2, int var3, double[] var4, double[][][] var5, boolean var6) {
      this.field_32630 = var1;
      this.field_32633 = var2;
      this.field_32635 = var3;
      this.field_32629 = var4;
      this.field_32634 = var5;
      this.field_32632 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_32633; var3 < this.field_32635; var3++) {
         int var4 = var3 * class_1637.method_7345(this.field_32630);

         for (int var5 = 0; var5 < class_1637.method_7321(this.field_32630); var5++) {
            System.arraycopy(
               this.field_32629,
               var4 + var5 * class_1637.method_7334(this.field_32630),
               this.field_32634[var3][var5],
               0,
               class_1637.method_7344(this.field_32630)
            );
            class_1637.method_7310(this.field_32630).method_14999(this.field_32634[var3][var5], this.field_32632);
         }
      }
   }
}
