package remapped;

public enum class_683 {
   field_3766("front"),
   field_3767("side");

   private final String field_3765;

   private class_683(String var3) {
      this.field_3765 = var3;
   }

   public static class_683 method_3098(String var0) {
      for (class_683 var6 : values()) {
         if (var6.field_3765.equals(var0)) {
            return var6;
         }
      }

      throw new IllegalArgumentException("Invalid gui light: " + var0);
   }

   public boolean method_3100() {
      return this == field_3767;
   }
}
