package remapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import java.util.Map;
import java.util.function.Function;

public enum class_2397 {
   field_11967("bitmap", class_6096::method_27934),
   field_11960("ttf", class_2165::method_10068),
   field_11961("legacy_unicode", class_5280::method_24105);

   private static final Map<String, class_2397> field_11964 = class_9665.<Map<String, class_2397>>method_44659(Maps.newHashMap(), var0 -> {
      for (class_2397 var6 : values()) {
         var0.put(var6.field_11965, var6);
      }
   });
   private final String field_11965;
   private final Function<JsonObject, class_3592> field_11962;

   private class_2397(String var3, Function<JsonObject, class_3592> var4) {
      this.field_11965 = var3;
      this.field_11962 = var4;
   }

   public static class_2397 method_10928(String var0) {
      class_2397 var3 = field_11964.get(var0);
      if (var3 != null) {
         return var3;
      } else {
         throw new IllegalArgumentException("Invalid type: " + var0);
      }
   }

   public class_3592 method_10926(JsonObject var1) {
      return this.field_11962.apply(var1);
   }
}
