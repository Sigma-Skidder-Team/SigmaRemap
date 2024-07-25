package remapped;

public enum class_8506 implements class_4530 {
   field_43546("none"),
   field_43547("low"),
   field_43543("tall");

   private final String field_43545;

   private class_8506(String var3) {
      this.field_43545 = var3;
   }

   @Override
   public String toString() {
      return this.method_21049();
   }

   @Override
   public String method_21049() {
      return this.field_43545;
   }
}
