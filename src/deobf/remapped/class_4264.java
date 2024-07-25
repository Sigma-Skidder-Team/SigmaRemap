package remapped;

import java.util.Locale;

public enum class_4264 {
   field_20669,
   field_20666,
   field_20668,
   field_20667;

   private static final class_4264[] field_20665 = values();

   private static class_4264 method_19858(String var0) {
      for (class_4264 var6 : field_20665) {
         if (var0.equalsIgnoreCase(var6.name())) {
            return var6;
         }
      }

      return field_20669;
   }

   public String method_19860() {
      return this.name().toLowerCase(Locale.ROOT);
   }
}
