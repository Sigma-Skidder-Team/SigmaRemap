package remapped;

public enum class_137 {
   field_405(1, "Towards positive"),
   field_403(-1, "Towards negative");

   private final int field_401;
   private final String field_404;

   private class_137(int var3, String var4) {
      this.field_401 = var3;
      this.field_404 = var4;
   }

   public int method_549() {
      return this.field_401;
   }

   @Override
   public String toString() {
      return this.field_404;
   }

   public class_137 method_550() {
      return this != field_405 ? field_405 : field_403;
   }
}
