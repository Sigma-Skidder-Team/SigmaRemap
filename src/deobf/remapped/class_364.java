package remapped;

public class class_364 implements Runnable {
   private static String[] field_1411;

   public class_364(class_6056 var1, int var2, int var3, double[] var4) {
      this.field_1410 = var1;
      this.field_1412 = var2;
      this.field_1413 = var3;
      this.field_1414 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_6056.method_27671(this.field_1410)];

      for (int var4 = this.field_1412; var4 < this.field_1413; var4++) {
         int var5 = var4 * class_6056.method_27661(this.field_1410);

         for (int var6 = 0; var6 < class_6056.method_27666(this.field_1410); var6++) {
            for (int var7 = 0; var7 < class_6056.method_27671(this.field_1410); var7++) {
               int var8 = var7 * class_6056.method_27649(this.field_1410) + var5 + var6;
               var3[var7] = this.field_1414[var8];
            }

            class_6056.method_27659(this.field_1410).method_31275(var3);

            for (int var9 = 0; var9 < class_6056.method_27671(this.field_1410); var9++) {
               int var10 = var9 * class_6056.method_27649(this.field_1410) + var5 + var6;
               this.field_1414[var10] = var3[var9];
            }
         }
      }
   }
}
