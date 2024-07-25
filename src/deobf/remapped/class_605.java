package remapped;

public class class_605 implements Runnable {
   private static String[] field_3473;

   public class_605(class_1637 var1, int var2, int var3, double[] var4, double[][][] var5) {
      this.field_3470 = var1;
      this.field_3471 = var2;
      this.field_3469 = var3;
      this.field_3468 = var4;
      this.field_3472 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_3471; var3 < this.field_3469; var3++) {
         int var4 = var3 * class_1637.method_7345(this.field_3470);

         for (int var5 = 0; var5 < class_1637.method_7321(this.field_3470); var5++) {
            System.arraycopy(
               this.field_3468, var4 + var5 * class_1637.method_7334(this.field_3470), this.field_3472[var3][var5], 0, class_1637.method_7344(this.field_3470)
            );
            class_1637.method_7310(this.field_3470).method_14981(this.field_3472[var3][var5]);
         }
      }
   }
}
