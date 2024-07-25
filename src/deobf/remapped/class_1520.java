package remapped;

public class class_1520 implements Runnable {
   private static String[] field_8088;

   public class_1520(class_6056 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field_8084 = var1;
      this.field_8087 = var2;
      this.field_8086 = var3;
      this.field_8083 = var4;
      this.field_8085 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_6056.method_27671(this.field_8084)];

      for (int var4 = this.field_8087; var4 < this.field_8086; var4++) {
         for (int var5 = 0; var5 < class_6056.method_27666(this.field_8084); var5++) {
            for (int var6 = 0; var6 < class_6056.method_27671(this.field_8084); var6++) {
               var3[var6] = this.field_8083[var6][var4][var5];
            }

            class_6056.method_27659(this.field_8084).method_31283(var3, this.field_8085);

            for (int var7 = 0; var7 < class_6056.method_27671(this.field_8084); var7++) {
               this.field_8083[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}
