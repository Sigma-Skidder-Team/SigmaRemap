package mapped;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum Class2147 {
   field14043("legacy"),
   field14044("mojang");

   private static final Map<String, Class2147> field14045 = Arrays.<Class2147>stream(values())
      .collect(Collectors.toMap(var0 -> var0.field14046, Function.<Class2147>identity()));
   private final String field14046;
   private static final Class2147[] field14047 = new Class2147[]{field14043, field14044};

   private Class2147(String var3) {
      this.field14046 = var3;
   }

   @Nullable
   public static Class2147 method8850(String var0) {
      return field14045.get(var0.toLowerCase(Locale.ROOT));
   }
}
