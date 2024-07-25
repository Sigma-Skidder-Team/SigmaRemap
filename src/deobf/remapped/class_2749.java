package remapped;

public class class_2749 {
   private final class_5503 field_13454;
   private final String field_13456;

   private class_2749(class_5503 var1, String var2) {
      this.field_13454 = var1;
      this.field_13456 = var2;
   }

   public class_5503 method_12388() {
      return this.field_13454;
   }

   @Override
   public String toString() {
      return this.field_13454.toString() + " (from " + this.field_13456 + ")";
   }
}
