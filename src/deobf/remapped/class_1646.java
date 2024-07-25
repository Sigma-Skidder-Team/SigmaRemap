package remapped;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum class_1646 {
   field_8566("none"),
   field_8567("partial"),
   field_8565("full");

   private static final Map<String, class_1646> field_8563 = Arrays.<class_1646>stream(values())
      .collect(Collectors.toMap(class_1646::method_7370, var0 -> (class_1646)var0));
   private final String field_8561;

   private class_1646(String var3) {
      this.field_8561 = var3;
   }

   public String method_7370() {
      return this.field_8561;
   }

   public static class_1646 method_7369(String var0) {
      return field_8563.getOrDefault(var0, field_8566);
   }
}
