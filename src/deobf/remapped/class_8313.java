package remapped;

public class class_8313 implements Runnable {
   private static String[] field_42573;

   public class_8313(class_1637 var1, int var2, int var3, double[][][] var4) {
      this.field_42574 = var1;
      this.field_42575 = var2;
      this.field_42572 = var3;
      this.field_42571 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * class_1637.method_7321(this.field_42574)];

      for (int var4 = this.field_42575; var4 < this.field_42572; var4++) {
         for (int var5 = 0; var5 < class_1637.method_7344(this.field_42574); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < class_1637.method_7321(this.field_42574); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field_42571[var4][var7][var6];
               var3[var8 + 1] = this.field_42571[var4][var7][var6 + 1];
            }

            class_1637.method_7323(this.field_42574).method_15028(var3);

            for (int var9 = 0; var9 < class_1637.method_7321(this.field_42574); var9++) {
               int var10 = 2 * var9;
               this.field_42571[var4][var9][var6] = var3[var10];
               this.field_42571[var4][var9][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
