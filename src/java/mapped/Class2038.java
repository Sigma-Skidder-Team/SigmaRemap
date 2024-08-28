package mapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonObject;

import java.util.Map;
import java.util.function.Function;

public enum Class2038 {
   field13327("bitmap", Class7546::method24666),
   field13328("ttf", Class7543::method24663),
   field13329("legacy_unicode", Class7545::method24665);

   private static final Map<String, Class2038> field13330 = Util.<Map<String, Class2038>>method38508(Maps.newHashMap(), var0 -> {
      for (Class2038 var6 : values()) {
         var0.put(var6.field13331, var6);
      }
   });
   private final String field13331;
   private final Function<JsonObject, Class7544> field13332;
   private static final Class2038[] field13333 = new Class2038[]{field13327, field13328, field13329};

   private Class2038(String var3, Function<JsonObject, Class7544> var4) {
      this.field13331 = var3;
      this.field13332 = var4;
   }

   public static Class2038 method8682(String var0) {
      Class2038 var3 = field13330.get(var0);
      if (var3 != null) {
         return var3;
      } else {
         throw new IllegalArgumentException("Invalid type: " + var0);
      }
   }

   public Class7544 method8683(JsonObject var1) {
      return this.field13332.apply(var1);
   }
}
