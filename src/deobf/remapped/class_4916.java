package remapped;

public class class_4916 implements Runnable {
   private static String[] field_25442;

   public class_4916(class_8751 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_25440 = var1;
      this.field_25439 = var2;
      this.field_25438 = var3;
      this.field_25441 = var4;
      this.field_25437 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_25439; var3 < this.field_25438; var3++) {
         class_8751.method_40165(this.field_25440).method_21139(this.field_25441, var3 * class_8751.method_40179(this.field_25440), this.field_25437);
      }
   }
}
