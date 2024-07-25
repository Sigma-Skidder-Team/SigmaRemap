package remapped;

public class class_1567 implements Runnable {
   private static String[] field_8240;

   public class_1567(class_5298 var1, int var2, int var3, int var4, float[] var5, float[] var6) {
      this.field_8243 = var1;
      this.field_8239 = var2;
      this.field_8241 = var3;
      this.field_8244 = var4;
      this.field_8245 = var5;
      this.field_8242 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_8239; var3 < this.field_8241; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         int var6 = this.field_8244 + var3;
         this.field_8245[var4] = this.field_8242[var6] * class_5298.method_24225(this.field_8243)[var4];
         this.field_8245[var5] = -this.field_8242[var6] * class_5298.method_24225(this.field_8243)[var5];
      }
   }
}
