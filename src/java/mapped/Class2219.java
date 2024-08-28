package mapped;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Class2219 {
   field14494("on_land_surface"),
   field14495("partly_buried"),
   field14496("on_ocean_floor"),
   field14497("in_mountain"),
   field14498("underground"),
   field14499("in_nether");

   private static final Map<String, Class2219> field14500 = Arrays.<Class2219>stream(values())
      .collect(Collectors.toMap(Class2219::method8945, var0 -> (Class2219)var0));
   private final String field14501;
   private static final Class2219[] field14502 = new Class2219[]{field14494, field14495, field14496, field14497, field14498, field14499};

   private Class2219(String var3) {
      this.field14501 = var3;
   }

   public String method8945() {
      return this.field14501;
   }

   public static Class2219 method8946(String var0) {
      return field14500.get(var0);
   }
}
