package remapped;

public class class_69 implements Runnable {
   private static String[] field_91;

   public class_69(class_1637 var1, int var2, int var3, int var4, int var5, int var6, double[] var7) {
      this.field_89 = var1;
      this.field_88 = var2;
      this.field_86 = var3;
      this.field_92 = var4;
      this.field_93 = var5;
      this.field_90 = var6;
      this.field_87 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field_88; var3 < this.field_86; var3++) {
         int var4 = (class_1637.method_7338(this.field_89) - var3) % class_1637.method_7338(this.field_89) * this.field_92;
         int var5 = var3 * this.field_92;

         for (int var6 = 1; var6 < this.field_93; var6++) {
            int var7 = var5 + (class_1637.method_7321(this.field_89) - var6) * this.field_90;
            int var8 = var4 + var6 * this.field_90 + class_1637.method_7344(this.field_89);
            int var9 = var7 + class_1637.method_7344(this.field_89);
            int var10 = var7 + 1;
            this.field_87[var8] = this.field_87[var10];
            this.field_87[var9] = this.field_87[var10];
            this.field_87[var8 + 1] = -this.field_87[var7];
            this.field_87[var9 + 1] = this.field_87[var7];
         }
      }
   }
}
