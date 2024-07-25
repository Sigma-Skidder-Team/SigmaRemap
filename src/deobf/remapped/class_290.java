package remapped;

public class class_290 implements Runnable {
   private static String[] field_1020;

   public class_290(class_3281 var1, int var2, int var3, int var4, int var5, double[] var6, double[] var7) {
      this.field_1018 = var1;
      this.field_1023 = var2;
      this.field_1021 = var3;
      this.field_1016 = var4;
      this.field_1022 = var5;
      this.field_1017 = var6;
      this.field_1019 = var7;
   }

   @Override
   public void run() {
      if (this.field_1023 <= 0) {
         for (int var3 = this.field_1021; var3 < this.field_1016; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            int var6 = this.field_1022 + var4;
            int var7 = this.field_1022 + var5;
            this.field_1017[var4] = this.field_1019[var6] * class_3281.method_15032(this.field_1018)[var4]
               + this.field_1019[var7] * class_3281.method_15032(this.field_1018)[var5];
            this.field_1017[var5] = -this.field_1019[var6] * class_3281.method_15032(this.field_1018)[var5]
               + this.field_1019[var7] * class_3281.method_15032(this.field_1018)[var4];
         }
      } else {
         for (int var8 = this.field_1021; var8 < this.field_1016; var8++) {
            int var9 = 2 * var8;
            int var10 = var9 + 1;
            int var11 = this.field_1022 + var9;
            int var12 = this.field_1022 + var10;
            this.field_1017[var9] = this.field_1019[var11] * class_3281.method_15032(this.field_1018)[var9]
               - this.field_1019[var12] * class_3281.method_15032(this.field_1018)[var10];
            this.field_1017[var10] = this.field_1019[var11] * class_3281.method_15032(this.field_1018)[var10]
               + this.field_1019[var12] * class_3281.method_15032(this.field_1018)[var9];
         }
      }
   }
}
