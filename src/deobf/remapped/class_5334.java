package remapped;

public class class_5334 {
   private static String[] field_27214;
   public long field_27216 = 0L;
   public long field_27215 = 0L;

   public void method_24314() {
      if (class_5099.field_26310 && this.field_27216 == 0L) {
         this.field_27216 = System.nanoTime();
      }
   }

   public void method_24313() {
      if (class_5099.field_26310 && this.field_27216 != 0L) {
         this.field_27215 = this.field_27215 + (System.nanoTime() - this.field_27216);
         this.field_27216 = 0L;
      }
   }

   private void method_24315() {
      this.field_27215 = 0L;
      this.field_27216 = 0L;
   }
}
