package remapped;

public class class_2166 implements Runnable {
   private static String[] field_10805;

   public class_2166(class_5298 var1, int var2, int var3, int var4, float[] var5) {
      this.field_10806 = var1;
      this.field_10808 = var2;
      this.field_10809 = var3;
      this.field_10804 = var4;
      this.field_10807 = var5;
   }

   @Override
   public void run() {
      if (this.field_10808 <= 0) {
         for (int var3 = this.field_10809; var3 < this.field_10804; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            float var6 = this.field_10807[var4] * class_5298.method_24208(this.field_10806)[var5]
               + this.field_10807[var5] * class_5298.method_24208(this.field_10806)[var4];
            this.field_10807[var4] = this.field_10807[var4] * class_5298.method_24208(this.field_10806)[var4]
               - this.field_10807[var5] * class_5298.method_24208(this.field_10806)[var5];
            this.field_10807[var5] = var6;
         }
      } else {
         for (int var7 = this.field_10809; var7 < this.field_10804; var7++) {
            int var8 = 2 * var7;
            int var9 = var8 + 1;
            float var10 = -this.field_10807[var8] * class_5298.method_24208(this.field_10806)[var9]
               + this.field_10807[var9] * class_5298.method_24208(this.field_10806)[var8];
            this.field_10807[var8] = this.field_10807[var8] * class_5298.method_24208(this.field_10806)[var8]
               + this.field_10807[var9] * class_5298.method_24208(this.field_10806)[var9];
            this.field_10807[var9] = var10;
         }
      }
   }
}
