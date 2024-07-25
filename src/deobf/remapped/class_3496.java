package remapped;

public class class_3496 implements Runnable {
   private static String[] field_17155;

   public class_3496(class_3281 var1, int var2, int var3, int var4, int var5, double[] var6, double[] var7) {
      this.field_17153 = var1;
      this.field_17151 = var2;
      this.field_17156 = var3;
      this.field_17150 = var4;
      this.field_17149 = var5;
      this.field_17154 = var6;
      this.field_17152 = var7;
   }

   @Override
   public void run() {
      if (this.field_17151 <= 0) {
         for (int var3 = this.field_17156; var3 < this.field_17150; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            int var6 = this.field_17149 + var4;
            int var7 = this.field_17149 + var5;
            this.field_17154[var6] = class_3281.method_15032(this.field_17153)[var4] * this.field_17152[var4]
               + class_3281.method_15032(this.field_17153)[var5] * this.field_17152[var5];
            this.field_17154[var7] = -class_3281.method_15032(this.field_17153)[var5] * this.field_17152[var4]
               + class_3281.method_15032(this.field_17153)[var4] * this.field_17152[var5];
         }
      } else {
         for (int var8 = this.field_17156; var8 < this.field_17150; var8++) {
            int var9 = 2 * var8;
            int var10 = var9 + 1;
            int var11 = this.field_17149 + var9;
            int var12 = this.field_17149 + var10;
            this.field_17154[var11] = class_3281.method_15032(this.field_17153)[var9] * this.field_17152[var9]
               - class_3281.method_15032(this.field_17153)[var10] * this.field_17152[var10];
            this.field_17154[var12] = class_3281.method_15032(this.field_17153)[var10] * this.field_17152[var9]
               + class_3281.method_15032(this.field_17153)[var9] * this.field_17152[var10];
         }
      }
   }
}
