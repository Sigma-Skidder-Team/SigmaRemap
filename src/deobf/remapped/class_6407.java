package remapped;

public class class_6407 implements Runnable {
   private static String[] field_32701;

   public class_6407(class_6056 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field_32697 = var1;
      this.field_32698 = var2;
      this.field_32700 = var3;
      this.field_32699 = var4;
      this.field_32702 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_6056.method_27660(this.field_32697)];

      for (int var4 = this.field_32698; var4 < this.field_32700; var4++) {
         for (int var5 = 0; var5 < class_6056.method_27666(this.field_32697); var5++) {
            for (int var6 = 0; var6 < class_6056.method_27660(this.field_32697); var6++) {
               var3[var6] = this.field_32699[var4][var6][var5];
            }

            class_6056.method_27680(this.field_32697).method_31283(var3, this.field_32702);

            for (int var7 = 0; var7 < class_6056.method_27660(this.field_32697); var7++) {
               this.field_32699[var4][var7][var5] = var3[var7];
            }
         }
      }
   }
}
