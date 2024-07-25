package remapped;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public enum class_9075 {
   field_46454("legacy"),
   field_46455("mojang");

   private static final Map<String, class_9075> field_46451 = Arrays.<class_9075>stream(values())
      .collect(Collectors.toMap(var0 -> var0.field_46453, Function.<class_9075>identity()));
   private final String field_46453;

   private class_9075(String var3) {
      this.field_46453 = var3;
   }

   @Nullable
   public static class_9075 method_41657(String var0) {
      return field_46451.get(var0.toLowerCase(Locale.ROOT));
   }
}
