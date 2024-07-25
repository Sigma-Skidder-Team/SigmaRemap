package remapped;

public class class_1540 implements Runnable {
   private static String[] field_8143;

   public class_1540(class_7380 var1, int var2, int var3, double[] var4) {
      this.field_8145 = var1;
      this.field_8141 = var2;
      this.field_8144 = var3;
      this.field_8142 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_7380.method_33612(this.field_8145)];

      for (int var4 = this.field_8141; var4 < this.field_8144; var4++) {
         for (int var5 = 0; var5 < class_7380.method_33612(this.field_8145); var5++) {
            var3[var5] = this.field_8142[var5 * class_7380.method_33621(this.field_8145) + var4];
         }

         class_7380.method_33616(this.field_8145).method_31275(var3);

         for (int var6 = 0; var6 < class_7380.method_33612(this.field_8145); var6++) {
            this.field_8142[var6 * class_7380.method_33621(this.field_8145) + var4] = var3[var6];
         }
      }
   }
}
