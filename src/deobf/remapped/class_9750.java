package remapped;

public class class_9750 implements Runnable {
   private static String[] field_49542;

   public class_9750(class_84 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field_49544 = var1;
      this.field_49539 = var2;
      this.field_49541 = var3;
      this.field_49543 = var4;
      this.field_49540 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_84.method_200(this.field_49544)];

      for (int var4 = this.field_49539; var4 < this.field_49541; var4++) {
         for (int var5 = 0; var5 < class_84.method_198(this.field_49544); var5++) {
            for (int var6 = 0; var6 < class_84.method_200(this.field_49544); var6++) {
               var3[var6] = this.field_49543[var4][var6][var5];
            }

            class_84.method_189(this.field_49544).method_31289(var3, this.field_49540);

            for (int var7 = 0; var7 < class_84.method_200(this.field_49544); var7++) {
               this.field_49543[var4][var7][var5] = var3[var7];
            }
         }
      }
   }
}
