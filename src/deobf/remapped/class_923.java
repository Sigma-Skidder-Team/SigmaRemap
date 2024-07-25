package remapped;

public class class_923 implements Runnable {
   private static String[] field_4746;

   public class_923(class_1637 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7, int var8) {
      this.field_4739 = var1;
      this.field_4744 = var2;
      this.field_4742 = var3;
      this.field_4747 = var4;
      this.field_4741 = var5;
      this.field_4743 = var6;
      this.field_4745 = var7;
      this.field_4740 = var8;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field_4744];

      for (int var4 = this.field_4742; var4 >= this.field_4747; var4--) {
         int var5 = var4 * class_1637.method_7345(this.field_4739);
         int var6 = var4 * this.field_4741;

         for (int var7 = class_1637.method_7321(this.field_4739) - 1; var7 >= 0; var7--) {
            System.arraycopy(this.field_4743, var5 + var7 * class_1637.method_7334(this.field_4739), var3, 0, class_1637.method_7344(this.field_4739));
            class_1637.method_7310(this.field_4739).method_14999(var3, this.field_4745);
            System.arraycopy(var3, 0, this.field_4743, var6 + var7 * this.field_4740, this.field_4744);
         }
      }
   }
}
