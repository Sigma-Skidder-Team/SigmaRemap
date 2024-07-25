package remapped;

public class class_4155 implements Runnable {
   private static String[] field_20199;

   public class_4155(class_84 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_20202 = var1;
      this.field_20201 = var2;
      this.field_20204 = var3;
      this.field_20203 = var4;
      this.field_20200 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_84.method_200(this.field_20202)];

      for (int var4 = this.field_20201; var4 < this.field_20204; var4++) {
         int var5 = var4 * class_84.method_180(this.field_20202);

         for (int var6 = 0; var6 < class_84.method_198(this.field_20202); var6++) {
            for (int var7 = 0; var7 < class_84.method_200(this.field_20202); var7++) {
               int var8 = var5 + var7 * class_84.method_188(this.field_20202) + var6;
               var3[var7] = this.field_20203[var8];
            }

            class_84.method_189(this.field_20202).method_31295(var3, this.field_20200);

            for (int var9 = 0; var9 < class_84.method_200(this.field_20202); var9++) {
               int var10 = var5 + var9 * class_84.method_188(this.field_20202) + var6;
               this.field_20203[var10] = var3[var9];
            }
         }
      }
   }
}
