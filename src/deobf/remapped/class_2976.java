package remapped;

public enum class_2976 {
   field_14631("progress"),
   field_14628("notched_6"),
   field_14629("notched_10"),
   field_14625("notched_12"),
   field_14632("notched_20");

   private final String field_14630;

   private class_2976(String var3) {
      this.field_14630 = var3;
   }

   public String method_13618() {
      return this.field_14630;
   }

   public static class_2976 method_13620(String var0) {
      for (class_2976 var6 : values()) {
         if (var6.field_14630.equals(var0)) {
            return var6;
         }
      }

      return field_14631;
   }
}
