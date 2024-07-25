package remapped;

public class class_6540 implements Runnable {
   private static String[] field_33256;

   public class_6540(class_6842 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_33254 = var1;
      this.field_33259 = var2;
      this.field_33255 = var3;
      this.field_33258 = var4;
      this.field_33257 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_33259; var3 < this.field_33255; var3++) {
         class_6842.method_31356(this.field_33254).method_31288(this.field_33258, var3 * class_6842.method_31373(this.field_33254), this.field_33257);
      }
   }
}
