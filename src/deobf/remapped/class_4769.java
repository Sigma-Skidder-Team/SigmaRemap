package remapped;

public class class_4769 implements Runnable {
   private static String[] field_23113;

   public class_4769(class_84 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_23112 = var1;
      this.field_23109 = var2;
      this.field_23110 = var3;
      this.field_23108 = var4;
      this.field_23111 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_84.method_175(this.field_23112)];

      for (int var4 = this.field_23109; var4 < this.field_23110; var4++) {
         int var5 = var4 * class_84.method_188(this.field_23112);

         for (int var6 = 0; var6 < class_84.method_198(this.field_23112); var6++) {
            for (int var7 = 0; var7 < class_84.method_175(this.field_23112); var7++) {
               int var8 = var7 * class_84.method_180(this.field_23112) + var5 + var6;
               var3[var7] = this.field_23108[var8];
            }

            class_84.method_181(this.field_23112).method_31295(var3, this.field_23111);

            for (int var9 = 0; var9 < class_84.method_175(this.field_23112); var9++) {
               int var10 = var9 * class_84.method_180(this.field_23112) + var5 + var6;
               this.field_23108[var10] = var3[var9];
            }
         }
      }
   }
}
