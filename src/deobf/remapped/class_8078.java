package remapped;

public class class_8078 implements Runnable {
   private static String[] field_41354;

   public class_8078(class_84 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_41353 = var1;
      this.field_41350 = var2;
      this.field_41352 = var3;
      this.field_41355 = var4;
      this.field_41351 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_84.method_175(this.field_41353)];

      for (int var4 = this.field_41350; var4 < this.field_41352; var4++) {
         int var5 = var4 * class_84.method_188(this.field_41353);

         for (int var6 = 0; var6 < class_84.method_198(this.field_41353); var6++) {
            for (int var7 = 0; var7 < class_84.method_175(this.field_41353); var7++) {
               int var8 = var7 * class_84.method_180(this.field_41353) + var5 + var6;
               var3[var7] = this.field_41355[var8];
            }

            class_84.method_181(this.field_41353).method_31289(var3, this.field_41351);

            for (int var9 = 0; var9 < class_84.method_175(this.field_41353); var9++) {
               int var10 = var9 * class_84.method_180(this.field_41353) + var5 + var6;
               this.field_41355[var10] = var3[var9];
            }
         }
      }
   }
}
