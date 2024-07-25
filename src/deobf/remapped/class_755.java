package remapped;

public class class_755 implements Runnable {
   private static String[] field_4100;

   public class_755(class_7963 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_4097 = var1;
      this.field_4096 = var2;
      this.field_4099 = var3;
      this.field_4101 = var4;
      this.field_4098 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_7963.method_36040(this.field_4097)];

      for (int var4 = this.field_4096; var4 < this.field_4099; var4++) {
         for (int var5 = 0; var5 < class_7963.method_36040(this.field_4097); var5++) {
            var3[var5] = this.field_4101[var5 * class_7963.method_36038(this.field_4097) + var4];
         }

         class_7963.method_36041(this.field_4097).method_44816(var3, this.field_4098);

         for (int var6 = 0; var6 < class_7963.method_36040(this.field_4097); var6++) {
            this.field_4101[var6 * class_7963.method_36038(this.field_4097) + var4] = var3[var6];
         }
      }
   }
}
