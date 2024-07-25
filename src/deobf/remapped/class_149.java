package remapped;

public enum class_149 {
   field_434("\r\n"),
   field_433("\r"),
   field_430("\n");

   private String field_432;

   private class_149(String var3) {
      this.field_432 = var3;
   }

   public String method_586() {
      return this.field_432;
   }

   @Override
   public String toString() {
      return "Line break: " + this.name();
   }

   public static class_149 method_585() {
      String var2 = System.getProperty("line.separator");

      for (class_149 var6 : values()) {
         if (var6.field_432.equals(var2)) {
            return var6;
         }
      }

      return field_430;
   }
}
