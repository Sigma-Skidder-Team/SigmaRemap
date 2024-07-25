package remapped;

public class class_3476 implements Runnable {
   private static String[] field_17044;

   public class_3476(class_1637 var1, int var2, int var3, double[] var4) {
      this.field_17043 = var1;
      this.field_17042 = var2;
      this.field_17045 = var3;
      this.field_17041 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_17042; var3 < this.field_17045; var3++) {
         int var4 = var3 * class_1637.method_7345(this.field_17043);

         for (int var5 = 0; var5 < class_1637.method_7321(this.field_17043); var5++) {
            class_1637.method_7310(this.field_17043).method_15029(this.field_17041, var4 + var5 * class_1637.method_7334(this.field_17043));
         }
      }
   }
}
