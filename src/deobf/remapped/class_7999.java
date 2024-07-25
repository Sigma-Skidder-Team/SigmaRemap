package remapped;

public class class_7999 implements Runnable {
   private static String[] field_40982;

   public class_7999(class_84 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field_40984 = var1;
      this.field_40980 = var2;
      this.field_40985 = var3;
      this.field_40981 = var4;
      this.field_40983 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_84.method_175(this.field_40984)];

      for (int var4 = this.field_40980; var4 < this.field_40985; var4++) {
         for (int var5 = 0; var5 < class_84.method_198(this.field_40984); var5++) {
            for (int var6 = 0; var6 < class_84.method_175(this.field_40984); var6++) {
               var3[var6] = this.field_40981[var6][var4][var5];
            }

            class_84.method_181(this.field_40984).method_31295(var3, this.field_40983);

            for (int var7 = 0; var7 < class_84.method_175(this.field_40984); var7++) {
               this.field_40981[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}
