package remapped;

public enum class_2031 {
   field_10317("file"),
   field_10314("event");

   private final String field_10315;

   private class_2031(String var3) {
      this.field_10315 = var3;
   }

   public static class_2031 method_9516(String var0) {
      for (class_2031 var6 : values()) {
         if (var6.field_10315.equals(var0)) {
            return var6;
         }
      }

      return null;
   }
}
