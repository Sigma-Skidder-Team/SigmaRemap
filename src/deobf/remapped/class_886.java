package remapped;

public class class_886 implements Runnable {
   private static String[] field_4560;

   public class_886(class_1637 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_4556 = var1;
      this.field_4559 = var2;
      this.field_4558 = var3;
      this.field_4557 = var4;
      this.field_4561 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_4559; var3 < this.field_4558; var3++) {
         int var4 = var3 * class_1637.method_7345(this.field_4556);

         for (int var5 = 0; var5 < class_1637.method_7321(this.field_4556); var5++) {
            class_1637.method_7310(this.field_4556).method_15035(this.field_4557, var4 + var5 * class_1637.method_7334(this.field_4556), this.field_4561);
         }
      }
   }
}
