package remapped;

public class class_4872 implements Runnable {
   private static String[] field_24254;

   public class_4872(class_1637 var1, int var2, int var3, int var4, int var5, int var6, double[] var7) {
      this.field_24259 = var1;
      this.field_24258 = var2;
      this.field_24256 = var3;
      this.field_24253 = var4;
      this.field_24255 = var5;
      this.field_24257 = var6;
      this.field_24252 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field_24258; var3 < this.field_24256; var3++) {
         int var4 = (class_1637.method_7338(this.field_24259) - var3) % class_1637.method_7338(this.field_24259) * this.field_24253;
         int var5 = var3 * this.field_24253;

         for (int var6 = 1; var6 < this.field_24255; var6++) {
            int var7 = var4 + (class_1637.method_7321(this.field_24259) - var6) * this.field_24257;
            int var8 = var5 + var6 * this.field_24257;
            this.field_24252[var7] = this.field_24252[var8];
            this.field_24252[var7 + 1] = -this.field_24252[var8 + 1];
         }
      }
   }
}
