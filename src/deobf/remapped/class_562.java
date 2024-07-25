package remapped;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum class_562 {
   field_3326("master"),
   field_3324("music"),
   field_3333("record"),
   field_3330("weather"),
   field_3322("block"),
   field_3332("hostile"),
   field_3328("neutral"),
   field_3335("player"),
   field_3325("ambient"),
   field_3334("voice");

   private static final Map<String, class_562> field_3327 = Arrays.<class_562>stream(values())
      .collect(Collectors.toMap(class_562::method_2681, Function.<class_562>identity()));
   private final String field_3329;

   private class_562(String var3) {
      this.field_3329 = var3;
   }

   public String method_2681() {
      return this.field_3329;
   }
}
