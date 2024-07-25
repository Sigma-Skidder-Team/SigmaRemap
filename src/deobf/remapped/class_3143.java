package remapped;

public class class_3143 extends class_4072 {
   private static String[] field_15635;
   private final class_7272 field_15633;
   private boolean field_15636;

   public class_3143(class_7272 var1, class_7272 var2) {
      super(var2);
      this.field_15634 = var1;
      this.field_15633 = var2;
   }

   public boolean method_14532() {
      return this.field_19833;
   }

   public boolean method_14534() {
      return this.field_15636;
   }

   public void method_14533(boolean var1) {
      this.field_15636 = var1;
   }

   @Override
   public void method_18771() {
      if (this.field_19833) {
         this.field_15633.method_33225();
         this.field_19833 = false;
      }
   }
}
