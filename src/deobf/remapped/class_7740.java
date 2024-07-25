package remapped;

public class class_7740 implements Runnable {
   private static String[] field_39248;

   public class_7740(class_7380 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field_39246 = var1;
      this.field_39247 = var2;
      this.field_39251 = var3;
      this.field_39250 = var4;
      this.field_39249 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_7380.method_33612(this.field_39246)];

      for (int var4 = this.field_39247; var4 < this.field_39251; var4++) {
         for (int var5 = 0; var5 < class_7380.method_33612(this.field_39246); var5++) {
            var3[var5] = this.field_39250[var5][var4];
         }

         class_7380.method_33616(this.field_39246).method_31283(var3, this.field_39249);

         for (int var6 = 0; var6 < class_7380.method_33612(this.field_39246); var6++) {
            this.field_39250[var6][var4] = var3[var6];
         }
      }
   }
}
