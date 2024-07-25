package remapped;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum class_3487 {
   field_17125("on_land_surface"),
   field_17123("partly_buried"),
   field_17119("on_ocean_floor"),
   field_17124("in_mountain"),
   field_17126("underground"),
   field_17121("in_nether");

   private static final Map<String, class_3487> field_17127 = Arrays.<class_3487>stream(values())
      .collect(Collectors.toMap(class_3487::method_16035, var0 -> (class_3487)var0));
   private final String field_17122;

   private class_3487(String var3) {
      this.field_17122 = var3;
   }

   public String method_16035() {
      return this.field_17122;
   }

   public static class_3487 method_16036(String var0) {
      return field_17127.get(var0);
   }
}
