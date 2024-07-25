package remapped;

public class class_4465 implements Runnable {
   private static String[] field_21762;

   public class_4465(class_6842 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field_21758 = var1;
      this.field_21761 = var2;
      this.field_21759 = var3;
      this.field_21760 = var4;
      this.field_21757 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_21761; var3 < this.field_21759; var3++) {
         class_6842.method_31356(this.field_21758).method_31295(this.field_21760[var3], this.field_21757);
      }
   }
}
