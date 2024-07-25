package remapped;

public class class_313 implements Runnable {
   private static String[] field_1156;

   public class_313(class_3281 var1, int var2, int var3, int var4, int var5, double[] var6, double[] var7) {
      this.field_1153 = var1;
      this.field_1151 = var2;
      this.field_1154 = var3;
      this.field_1152 = var4;
      this.field_1155 = var5;
      this.field_1150 = var6;
      this.field_1157 = var7;
   }

   @Override
   public void run() {
      if (this.field_1151 <= 0) {
         for (int var3 = this.field_1154; var3 < this.field_1152; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            int var6 = this.field_1155 + var3;
            this.field_1150[var4] = this.field_1157[var6] * class_3281.method_15032(this.field_1153)[var4];
            this.field_1150[var5] = -this.field_1157[var6] * class_3281.method_15032(this.field_1153)[var5];
         }
      } else {
         for (int var7 = this.field_1154; var7 < this.field_1152; var7++) {
            int var8 = 2 * var7;
            int var9 = var8 + 1;
            int var10 = this.field_1155 + var7;
            this.field_1150[var8] = this.field_1157[var10] * class_3281.method_15032(this.field_1153)[var8];
            this.field_1150[var9] = this.field_1157[var10] * class_3281.method_15032(this.field_1153)[var9];
         }
      }
   }
}
