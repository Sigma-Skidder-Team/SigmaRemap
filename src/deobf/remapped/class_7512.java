package remapped;

public class class_7512 implements Runnable {
   private static String[] field_38362;

   public class_7512(class_5298 var1, int var2, int var3, int var4, int var5, float[] var6, float[] var7) {
      this.field_38366 = var1;
      this.field_38360 = var2;
      this.field_38365 = var3;
      this.field_38361 = var4;
      this.field_38364 = var5;
      this.field_38363 = var6;
      this.field_38359 = var7;
   }

   @Override
   public void run() {
      if (this.field_38360 <= 0) {
         for (int var3 = this.field_38365; var3 < this.field_38361; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            int var6 = this.field_38364 + var4;
            int var7 = this.field_38364 + var5;
            this.field_38363[var6] = class_5298.method_24225(this.field_38366)[var4] * this.field_38359[var4]
               + class_5298.method_24225(this.field_38366)[var5] * this.field_38359[var5];
            this.field_38363[var7] = -class_5298.method_24225(this.field_38366)[var5] * this.field_38359[var4]
               + class_5298.method_24225(this.field_38366)[var4] * this.field_38359[var5];
         }
      } else {
         for (int var8 = this.field_38365; var8 < this.field_38361; var8++) {
            int var9 = 2 * var8;
            int var10 = var9 + 1;
            int var11 = this.field_38364 + var9;
            int var12 = this.field_38364 + var10;
            this.field_38363[var11] = class_5298.method_24225(this.field_38366)[var9] * this.field_38359[var9]
               - class_5298.method_24225(this.field_38366)[var10] * this.field_38359[var10];
            this.field_38363[var12] = class_5298.method_24225(this.field_38366)[var10] * this.field_38359[var9]
               + class_5298.method_24225(this.field_38366)[var9] * this.field_38359[var10];
         }
      }
   }
}
