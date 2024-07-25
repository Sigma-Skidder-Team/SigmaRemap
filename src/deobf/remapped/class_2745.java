package remapped;

public class class_2745 implements Runnable {
   private static String[] field_13391;

   public class_2745(class_5298 var1, int var2, int var3, int var4, float[] var5) {
      this.field_13388 = var1;
      this.field_13389 = var2;
      this.field_13387 = var3;
      this.field_13386 = var4;
      this.field_13390 = var5;
   }

   @Override
   public void run() {
      if (this.field_13389 <= 0) {
         for (int var3 = this.field_13387; var3 < this.field_13386; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            float var6 = this.field_13390[var4] * class_5298.method_24208(this.field_13388)[var5]
               + this.field_13390[var5] * class_5298.method_24208(this.field_13388)[var4];
            this.field_13390[var4] = this.field_13390[var4] * class_5298.method_24208(this.field_13388)[var4]
               - this.field_13390[var5] * class_5298.method_24208(this.field_13388)[var5];
            this.field_13390[var5] = var6;
         }
      } else {
         for (int var7 = this.field_13387; var7 < this.field_13386; var7++) {
            int var8 = 2 * var7;
            int var9 = var8 + 1;
            float var10 = -this.field_13390[var8] * class_5298.method_24208(this.field_13388)[var9]
               + this.field_13390[var9] * class_5298.method_24208(this.field_13388)[var8];
            this.field_13390[var8] = this.field_13390[var8] * class_5298.method_24208(this.field_13388)[var8]
               + this.field_13390[var9] * class_5298.method_24208(this.field_13388)[var9];
            this.field_13390[var9] = var10;
         }
      }
   }
}
