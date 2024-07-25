package remapped;

public class class_8172 implements Runnable {
   private static String[] field_41843;

   public class_8172(class_84 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field_41841 = var1;
      this.field_41838 = var2;
      this.field_41839 = var3;
      this.field_41842 = var4;
      this.field_41840 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_84.method_175(this.field_41841)];

      for (int var4 = this.field_41838; var4 < this.field_41839; var4++) {
         for (int var5 = 0; var5 < class_84.method_198(this.field_41841); var5++) {
            for (int var6 = 0; var6 < class_84.method_175(this.field_41841); var6++) {
               var3[var6] = this.field_41842[var6][var4][var5];
            }

            class_84.method_181(this.field_41841).method_31289(var3, this.field_41840);

            for (int var7 = 0; var7 < class_84.method_175(this.field_41841); var7++) {
               this.field_41842[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}
