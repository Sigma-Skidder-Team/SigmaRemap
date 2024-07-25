package remapped;

public class class_1975 implements Runnable {
   private static String[] field_10010;

   public class_1975(class_5298 var1, int var2, int var3, int var4, int var5, float[] var6, float[] var7) {
      this.field_10011 = var1;
      this.field_10012 = var2;
      this.field_10009 = var3;
      this.field_10014 = var4;
      this.field_10015 = var5;
      this.field_10016 = var6;
      this.field_10013 = var7;
   }

   @Override
   public void run() {
      if (this.field_10012 <= 0) {
         for (int var3 = this.field_10009; var3 < this.field_10014; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            int var6 = this.field_10015 + var4;
            int var7 = this.field_10015 + var5;
            this.field_10016[var4] = this.field_10013[var6] * class_5298.method_24225(this.field_10011)[var4]
               + this.field_10013[var7] * class_5298.method_24225(this.field_10011)[var5];
            this.field_10016[var5] = -this.field_10013[var6] * class_5298.method_24225(this.field_10011)[var5]
               + this.field_10013[var7] * class_5298.method_24225(this.field_10011)[var4];
         }
      } else {
         for (int var8 = this.field_10009; var8 < this.field_10014; var8++) {
            int var9 = 2 * var8;
            int var10 = var9 + 1;
            int var11 = this.field_10015 + var9;
            int var12 = this.field_10015 + var10;
            this.field_10016[var9] = this.field_10013[var11] * class_5298.method_24225(this.field_10011)[var9]
               - this.field_10013[var12] * class_5298.method_24225(this.field_10011)[var10];
            this.field_10016[var10] = this.field_10013[var11] * class_5298.method_24225(this.field_10011)[var10]
               + this.field_10013[var12] * class_5298.method_24225(this.field_10011)[var9];
         }
      }
   }
}
