package remapped;

public class class_7828 implements Runnable {
   private static String[] field_39714;

   public class_7828(class_7380 var1, int var2, int var3, double[][] var4) {
      this.field_39713 = var1;
      this.field_39715 = var2;
      this.field_39712 = var3;
      this.field_39711 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_7380.method_33612(this.field_39713)];

      for (int var4 = this.field_39715; var4 < this.field_39712; var4++) {
         for (int var5 = 0; var5 < class_7380.method_33612(this.field_39713); var5++) {
            var3[var5] = this.field_39711[var5][var4];
         }

         class_7380.method_33616(this.field_39713).method_31275(var3);

         for (int var6 = 0; var6 < class_7380.method_33612(this.field_39713); var6++) {
            this.field_39711[var6][var4] = var3[var6];
         }
      }
   }
}
