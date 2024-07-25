package remapped;

public class class_3173 implements Runnable {
   private static String[] field_15876;

   public class_3173(class_1637 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field_15874 = var1;
      this.field_15878 = var2;
      this.field_15879 = var3;
      this.field_15875 = var4;
      this.field_15877 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * class_1637.method_7321(this.field_15874)];

      for (int var4 = this.field_15878; var4 < this.field_15879; var4++) {
         for (int var5 = 0; var5 < class_1637.method_7344(this.field_15874); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < class_1637.method_7321(this.field_15874); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field_15875[var4][var7][var6];
               var3[var8 + 1] = this.field_15875[var4][var7][var6 + 1];
            }

            class_1637.method_7323(this.field_15874).method_15036(var3, this.field_15877);

            for (int var9 = 0; var9 < class_1637.method_7321(this.field_15874); var9++) {
               int var10 = 2 * var9;
               this.field_15875[var4][var9][var6] = var3[var10];
               this.field_15875[var4][var9][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
