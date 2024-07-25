package remapped;

public enum class_1692 {
   field_8759(0),
   field_8760(1),
   field_8756(2),
   field_8755(3),
   field_8761(7),
   field_8762(8);

   public final int field_8758;

   private class_1692(int var3) {
      this.field_8758 = var3;
   }

   public static class_1692 method_7618(int var0) {
      for (class_1692 var6 : values()) {
         if (var6.field_8758 == var0) {
            return var6;
         }
      }

      return null;
   }
}
