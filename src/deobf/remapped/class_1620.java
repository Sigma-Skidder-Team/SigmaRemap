package remapped;

public class class_1620 implements Runnable {
   private static String[] field_8426;

   public class_1620(class_1637 var1, int var2, int var3, double[][][] var4) {
      this.field_8423 = var1;
      this.field_8424 = var2;
      this.field_8425 = var3;
      this.field_8422 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_8424; var3 < this.field_8425; var3++) {
         for (int var4 = 0; var4 < class_1637.method_7321(this.field_8423); var4++) {
            class_1637.method_7310(this.field_8423).method_15028(this.field_8422[var3][var4]);
         }
      }
   }
}
