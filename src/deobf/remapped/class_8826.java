package remapped;

public class class_8826 implements Runnable {
   private static String[] field_45142;

   public class_8826(class_7380 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_45144 = var1;
      this.field_45146 = var2;
      this.field_45145 = var3;
      this.field_45143 = var4;
      this.field_45141 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_7380.method_33612(this.field_45144)];

      for (int var4 = this.field_45146; var4 < this.field_45145; var4++) {
         for (int var5 = 0; var5 < class_7380.method_33612(this.field_45144); var5++) {
            var3[var5] = this.field_45143[var5 * class_7380.method_33621(this.field_45144) + var4];
         }

         class_7380.method_33616(this.field_45144).method_31283(var3, this.field_45141);

         for (int var6 = 0; var6 < class_7380.method_33612(this.field_45144); var6++) {
            this.field_45143[var6 * class_7380.method_33621(this.field_45144) + var4] = var3[var6];
         }
      }
   }
}
