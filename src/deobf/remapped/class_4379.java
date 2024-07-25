package remapped;

public enum class_4379 implements class_4530 {
   field_21482("up"),
   field_21487("side"),
   field_21485("none");

   private final String field_21484;

   private class_4379(String var3) {
      this.field_21484 = var3;
   }

   @Override
   public String toString() {
      return this.method_21049();
   }

   @Override
   public String method_21049() {
      return this.field_21484;
   }

   public boolean method_20395() {
      return this != field_21485;
   }
}
