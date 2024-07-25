package remapped;

public class class_9636 implements Runnable {
   private static String[] field_49099;

   public class_9636(class_3281 var1, int var2, int var3, int var4, double[] var5, int var6, double[] var7) {
      this.field_49096 = var1;
      this.field_49098 = var2;
      this.field_49095 = var3;
      this.field_49094 = var4;
      this.field_49100 = var5;
      this.field_49093 = var6;
      this.field_49097 = var7;
   }

   @Override
   public void run() {
      if (this.field_49098 <= 0) {
         for (int var3 = this.field_49095; var3 < this.field_49094; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            this.field_49100[this.field_49093 + var4] = class_3281.method_15032(this.field_49096)[var4] * this.field_49097[var4]
               + class_3281.method_15032(this.field_49096)[var5] * this.field_49097[var5];
            this.field_49100[this.field_49093 + var5] = -class_3281.method_15032(this.field_49096)[var5] * this.field_49097[var4]
               + class_3281.method_15032(this.field_49096)[var4] * this.field_49097[var5];
         }
      } else {
         for (int var6 = this.field_49095; var6 < this.field_49094; var6++) {
            int var7 = 2 * var6;
            int var8 = var7 + 1;
            this.field_49100[this.field_49093 + var7] = class_3281.method_15032(this.field_49096)[var7] * this.field_49097[var7]
               - class_3281.method_15032(this.field_49096)[var8] * this.field_49097[var8];
            this.field_49100[this.field_49093 + var8] = class_3281.method_15032(this.field_49096)[var8] * this.field_49097[var7]
               + class_3281.method_15032(this.field_49096)[var7] * this.field_49097[var8];
         }
      }
   }
}
