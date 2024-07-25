package remapped;

public class class_7343 implements Runnable {
   private static String[] field_37554;

   public class_7343(class_6056 var1, int var2, int var3, double[][][] var4) {
      this.field_37556 = var1;
      this.field_37553 = var2;
      this.field_37555 = var3;
      this.field_37557 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_6056.method_27660(this.field_37556)];

      for (int var4 = this.field_37553; var4 < this.field_37555; var4++) {
         for (int var5 = 0; var5 < class_6056.method_27666(this.field_37556); var5++) {
            for (int var6 = 0; var6 < class_6056.method_27660(this.field_37556); var6++) {
               var3[var6] = this.field_37557[var4][var6][var5];
            }

            class_6056.method_27680(this.field_37556).method_31275(var3);

            for (int var7 = 0; var7 < class_6056.method_27660(this.field_37556); var7++) {
               this.field_37557[var4][var7][var5] = var3[var7];
            }
         }
      }
   }
}
