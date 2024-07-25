package remapped;

public class class_9841 implements Runnable {
   private static String[] field_49831;

   public class_9841(class_1637 var1, int var2, int var3, double[][][] var4) {
      this.field_49829 = var1;
      this.field_49827 = var2;
      this.field_49830 = var3;
      this.field_49828 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * class_1637.method_7338(this.field_49829)];

      for (int var4 = this.field_49827; var4 < this.field_49830; var4++) {
         for (int var5 = 0; var5 < class_1637.method_7344(this.field_49829); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < class_1637.method_7338(this.field_49829); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field_49828[var7][var4][var6];
               var3[var8 + 1] = this.field_49828[var7][var4][var6 + 1];
            }

            class_1637.method_7322(this.field_49829).method_15028(var3);

            for (int var9 = 0; var9 < class_1637.method_7338(this.field_49829); var9++) {
               int var10 = 2 * var9;
               this.field_49828[var9][var4][var6] = var3[var10];
               this.field_49828[var9][var4][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
