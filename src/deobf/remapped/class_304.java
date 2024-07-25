package remapped;

public class class_304 implements Runnable {
   private static String[] field_1114;

   public class_304(class_1637 var1, int var2, int var3, int var4, int var5, int var6, int var7, double[] var8) {
      this.field_1121 = var1;
      this.field_1116 = var2;
      this.field_1117 = var3;
      this.field_1115 = var4;
      this.field_1120 = var5;
      this.field_1118 = var6;
      this.field_1122 = var7;
      this.field_1119 = var8;
   }

   @Override
   public void run() {
      for (int var3 = this.field_1116; var3 < this.field_1117; var3++) {
         int var4 = (class_1637.method_7338(this.field_1121) - var3) % class_1637.method_7338(this.field_1121);
         int var5 = var4 * this.field_1115;
         int var6 = var3 * this.field_1115;

         for (int var7 = 1; var7 < this.field_1120; var7++) {
            int var8 = class_1637.method_7321(this.field_1121) - var7;
            int var9 = var8 * this.field_1118;
            int var10 = var7 * this.field_1118;
            int var11 = var5 + var9;

            for (int var12 = 0; var12 < class_1637.method_7344(this.field_1121); var12++) {
               int var13 = 2 * var12;
               int var14 = this.field_1122 - var13;
               int var15 = var6 + var10 + var13;
               this.field_1119[var11 + var14 % this.field_1122] = this.field_1119[var15];
               this.field_1119[var11 + (var14 + 1) % this.field_1122] = -this.field_1119[var15 + 1];
            }
         }
      }
   }
}
