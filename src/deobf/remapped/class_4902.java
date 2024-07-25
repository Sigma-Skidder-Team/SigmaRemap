package remapped;

public class class_4902 implements Runnable {
   private static String[] field_25338;

   public class_4902(class_1637 var1, int var2, int var3, int var4, double[][][] var5) {
      this.field_25339 = var1;
      this.field_25336 = var2;
      this.field_25337 = var3;
      this.field_25335 = var4;
      this.field_25340 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_25336; var3 < this.field_25337; var3++) {
         int var4 = (class_1637.method_7338(this.field_25339) - var3) % class_1637.method_7338(this.field_25339);

         for (int var5 = 1; var5 < this.field_25335; var5++) {
            int var6 = class_1637.method_7321(this.field_25339) - var5;
            this.field_25340[var4][var5][class_1637.method_7344(this.field_25339)] = this.field_25340[var3][var6][1];
            this.field_25340[var3][var6][class_1637.method_7344(this.field_25339)] = this.field_25340[var3][var6][1];
            this.field_25340[var4][var5][class_1637.method_7344(this.field_25339) + 1] = -this.field_25340[var3][var6][0];
            this.field_25340[var3][var6][class_1637.method_7344(this.field_25339) + 1] = this.field_25340[var3][var6][0];
         }
      }
   }
}
