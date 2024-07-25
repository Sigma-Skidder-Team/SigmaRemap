package remapped;

public class class_2910 implements Runnable {
   private static String[] field_14223;

   public class_2910(class_573 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field_14220 = var1;
      this.field_14221 = var2;
      this.field_14218 = var3;
      this.field_14219 = var4;
      this.field_14222 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_573.method_2716(this.field_14220)];

      for (int var4 = this.field_14221; var4 < this.field_14218; var4++) {
         for (int var5 = 0; var5 < class_573.method_2730(this.field_14220); var5++) {
            for (int var6 = 0; var6 < class_573.method_2716(this.field_14220); var6++) {
               var3[var6] = this.field_14219[var6][var4][var5];
            }

            class_573.method_2710(this.field_14220).method_44816(var3, this.field_14222);

            for (int var7 = 0; var7 < class_573.method_2716(this.field_14220); var7++) {
               this.field_14219[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}
