package remapped;

public class class_4421 implements Runnable {
   private static String[] field_21612;

   public class_4421(class_7380 var1, long var2, long var4, class_1702 var6) {
      this.field_21614 = var1;
      this.field_21611 = var2;
      this.field_21613 = var4;
      this.field_21610 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field_21611; var3 < this.field_21613; var3++) {
         class_7380.method_33625(this.field_21614).method_31274(this.field_21610, var3 * class_7380.method_33608(this.field_21614));
      }
   }
}
