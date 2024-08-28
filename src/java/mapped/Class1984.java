package mapped;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Class1984 {
   field12956("none"),
   field12957("partial"),
   field12958("full");

   private static final Map<String, Class1984> field12959 = Arrays.<Class1984>stream(values())
      .collect(Collectors.toMap(Class1984::method8270, var0 -> (Class1984)var0));
   private final String field12960;
   private static final Class1984[] field12961 = new Class1984[]{field12956, field12957, field12958};

   private Class1984(String var3) {
      this.field12960 = var3;
   }

   public String method8270() {
      return this.field12960;
   }

   public static Class1984 method8271(String var0) {
      return field12959.getOrDefault(var0, field12956);
   }
}
