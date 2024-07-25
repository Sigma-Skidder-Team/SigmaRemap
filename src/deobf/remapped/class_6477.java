package remapped;

public class class_6477 implements Runnable {
   private static String[] field_33007;

   public class_6477(class_1637 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field_33009 = var1;
      this.field_33008 = var2;
      this.field_33011 = var3;
      this.field_33006 = var4;
      this.field_33010 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * class_1637.method_7321(this.field_33009)];

      for (int var4 = this.field_33008; var4 < this.field_33011; var4++) {
         for (int var5 = 0; var5 < class_1637.method_7344(this.field_33009); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < class_1637.method_7321(this.field_33009); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field_33006[var4][var7][var6];
               var3[var8 + 1] = this.field_33006[var4][var7][var6 + 1];
            }

            class_1637.method_7323(this.field_33009).method_15036(var3, this.field_33010);

            for (int var9 = 0; var9 < class_1637.method_7321(this.field_33009); var9++) {
               int var10 = 2 * var9;
               this.field_33006[var4][var9][var6] = var3[var10];
               this.field_33006[var4][var9][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
