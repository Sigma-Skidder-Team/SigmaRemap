package remapped;

public class class_4419 implements Runnable {
   private static String[] field_21606;

   public class_4419(class_1637 var1, int var2, int var3, double[][][] var4) {
      this.field_21604 = var1;
      this.field_21607 = var2;
      this.field_21608 = var3;
      this.field_21605 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * class_1637.method_7338(this.field_21604)];

      for (int var4 = this.field_21607; var4 < this.field_21608; var4++) {
         for (int var5 = 0; var5 < class_1637.method_7344(this.field_21604); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < class_1637.method_7338(this.field_21604); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field_21605[var7][var4][var6];
               var3[var8 + 1] = this.field_21605[var7][var4][var6 + 1];
            }

            class_1637.method_7322(this.field_21604).method_15028(var3);

            for (int var9 = 0; var9 < class_1637.method_7338(this.field_21604); var9++) {
               int var10 = 2 * var9;
               this.field_21605[var9][var4][var6] = var3[var10];
               this.field_21605[var9][var4][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
