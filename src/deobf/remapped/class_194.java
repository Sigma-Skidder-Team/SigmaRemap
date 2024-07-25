package remapped;

public class class_194 implements Runnable {
   private static String[] field_649;

   public class_194(class_7963 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_651 = var1;
      this.field_652 = var2;
      this.field_650 = var3;
      this.field_653 = var4;
      this.field_648 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_652; var3 < this.field_650; var3++) {
         class_7963.method_36036(this.field_651).method_44815(this.field_653, var3 * class_7963.method_36038(this.field_651), this.field_648);
      }
   }
}
