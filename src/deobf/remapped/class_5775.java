package remapped;

public class class_5775 implements Runnable {
   private static String[] field_29169;

   public class_5775(class_1637 var1, int var2, int var3, int var4, int var5, double[] var6, int var7) {
      this.field_29163 = var1;
      this.field_29168 = var2;
      this.field_29162 = var3;
      this.field_29166 = var4;
      this.field_29167 = var5;
      this.field_29165 = var6;
      this.field_29164 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field_29168];

      for (int var4 = this.field_29162; var4 >= this.field_29166; var4--) {
         int var5 = var4 * class_1637.method_7345(this.field_29163);
         int var6 = var4 * this.field_29167;

         for (int var7 = class_1637.method_7321(this.field_29163) - 1; var7 >= 0; var7--) {
            System.arraycopy(this.field_29165, var5 + var7 * class_1637.method_7334(this.field_29163), var3, 0, class_1637.method_7344(this.field_29163));
            class_1637.method_7310(this.field_29163).method_14981(var3);
            System.arraycopy(var3, 0, this.field_29165, var6 + var7 * this.field_29164, this.field_29168);
         }
      }
   }
}
