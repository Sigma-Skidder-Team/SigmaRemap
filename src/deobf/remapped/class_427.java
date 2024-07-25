package remapped;

public enum class_427 {
   field_1797(0, "Survival Mode"),
   field_1794(1, "Creative Mode"),
   field_1796(2, "Adventure Mode"),
   field_1798(3, "Spectator Mode");

   private final int field_1800;
   private final String field_1795;

   private class_427(int var3, String var4) {
      this.field_1800 = var3;
      this.field_1795 = var4;
   }

   public int method_2114() {
      return this.field_1800;
   }

   public String method_2112() {
      return this.field_1795;
   }

   public static class_427 method_2113(int var0) {
      for (class_427 var6 : values()) {
         if (var6.method_2114() == var0) {
            return var6;
         }
      }

      return null;
   }
}
