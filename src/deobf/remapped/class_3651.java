package remapped;

public class class_3651 implements Runnable {
   private static String[] field_17792;

   public class_3651(class_573 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field_17789 = var1;
      this.field_17791 = var2;
      this.field_17790 = var3;
      this.field_17794 = var4;
      this.field_17793 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_573.method_2716(this.field_17789)];

      for (int var4 = this.field_17791; var4 < this.field_17790; var4++) {
         for (int var5 = 0; var5 < class_573.method_2730(this.field_17789); var5++) {
            for (int var6 = 0; var6 < class_573.method_2716(this.field_17789); var6++) {
               var3[var6] = this.field_17794[var6][var4][var5];
            }

            class_573.method_2710(this.field_17789).method_44821(var3, this.field_17793);

            for (int var7 = 0; var7 < class_573.method_2716(this.field_17789); var7++) {
               this.field_17794[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}
