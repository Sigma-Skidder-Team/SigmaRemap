package remapped;

import java.util.Optional;

public enum class_1375 {
   field_7467("master", 0),
   field_7464("music", 1),
   field_7462("record", 2),
   field_7465("weather", 3),
   field_7459("block", 4),
   field_7466("hostile", 5),
   field_7460("neutral", 6),
   field_7468("player", 7),
   field_7470("ambient", 8),
   field_7469("voice", 9);

   private final String field_7471;
   private final int field_7463;

   private class_1375(String var3, int var4) {
      this.field_7471 = var3;
      this.field_7463 = var4;
   }

   public static Optional<class_1375> method_6358(String var0) {
      for (class_1375 var6 : values()) {
         if (var6.field_7471.equalsIgnoreCase(var0)) {
            return Optional.<class_1375>of(var6);
         }
      }

      return Optional.<class_1375>empty();
   }

   public String method_6357() {
      return this.field_7471;
   }

   public int method_6359() {
      return this.field_7463;
   }
}
