package remapped;

public class class_5410 implements Runnable {
   private static String[] field_27592;

   public class_5410(class_9035 var1, long var2, long var4, class_1702 var6, long var7, boolean var9) {
      this.field_27588 = var1;
      this.field_27590 = var2;
      this.field_27594 = var4;
      this.field_27591 = var6;
      this.field_27593 = var7;
      this.field_27589 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_27590; var3 < this.field_27594; var3++) {
         class_9035.method_41463(this.field_27588).method_15033(this.field_27591, var3 * this.field_27593, this.field_27589);
      }
   }
}
