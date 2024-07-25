package remapped;

public class class_9094 implements Runnable {
   private static String[] field_46583;

   public class_9094(class_6056 var1, int var2, int var3, double[][][] var4) {
      this.field_46581 = var1;
      this.field_46582 = var2;
      this.field_46584 = var3;
      this.field_46585 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_6056.method_27671(this.field_46581)];

      for (int var4 = this.field_46582; var4 < this.field_46584; var4++) {
         for (int var5 = 0; var5 < class_6056.method_27666(this.field_46581); var5++) {
            for (int var6 = 0; var6 < class_6056.method_27671(this.field_46581); var6++) {
               var3[var6] = this.field_46585[var6][var4][var5];
            }

            class_6056.method_27659(this.field_46581).method_31275(var3);

            for (int var7 = 0; var7 < class_6056.method_27671(this.field_46581); var7++) {
               this.field_46585[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}
