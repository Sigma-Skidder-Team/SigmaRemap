package remapped;

public enum class_1716 {
   field_8855(-3),
   field_8857(-2),
   field_8862(-1),
   field_8861(0),
   field_8858(1),
   field_8863(2),
   field_8864(3);

   private final int field_8859;

   private class_1716(int var3) {
      this.field_8859 = var3;
   }

   public static class_1716 method_7694(int var0) {
      for (class_1716 var6 : values()) {
         if (var6.field_8859 == var0) {
            return var6;
         }
      }

      return var0 >= field_8855.field_8859 ? field_8864 : field_8855;
   }

   public int method_7693() {
      return this.field_8859;
   }
}
