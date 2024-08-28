package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;
import java.util.Set;

public class Class284 extends Class281 {
   private static final Logger field1070 = LogManager.getLogger();
   private static final Gson field1081 = Class8746.method31557().create();
   private Map<ResourceLocation, Class7318> field1082 = ImmutableMap.of();
   private final Class283 field1083;

   public Class284(Class283 var1) {
      super(field1081, "loot_tables");
      this.field1083 = var1;
   }

   public Class7318 method1058(ResourceLocation var1) {
      return this.field1082.getOrDefault(var1, Class7318.field31380);
   }

   public void method971(Map<ResourceLocation, JsonElement> var1, Class191 var2, Class7165 var3) {
      Builder<ResourceLocation, Class7318> var6 = ImmutableMap.builder();
      JsonElement var7 = (JsonElement)var1.remove(Class8793.field39533);
      if (var7 != null) {
         field1070.warn("Datapack tried to redefine {} loot table, ignoring", Class8793.field39533);
      }

      var1.forEach((var1x, var2x) -> {
         try {
            Class7318 var5 = field1081.fromJson(var2x, Class7318.class);
            var6.put(var1x, var5);
         } catch (Exception var6x) {
            field1070.error("Couldn't parse loot table {}", var1x, var6x);
         }
      });
      var6.put(Class8793.field39533, Class7318.field31380);
      ImmutableMap<ResourceLocation, Class7318> var8 = var6.build();
      Class8478 var9 = new Class8478(Class8524.field38291, this.field1083::method1052, var8::get);
      var8.forEach((var1x, var2x) -> method1059(var9, var1x, var2x));
      var9.method29961().forEach((var0, var1x) -> field1070.warn("Found validation problem in " + var0 + ": " + var1x));
      this.field1082 = var8;
   }

   public static void method1059(Class8478 var0, ResourceLocation var1, Class7318 var2) {
      var2.method23184(var0.method29965(var2.method23183()).method29957("{" + var1 + "}", var1));
   }

   public static JsonElement method1060(Class7318 var0) {
      return field1081.toJsonTree(var0);
   }

   public Set<ResourceLocation> method1061() {
      return this.field1082.keySet();
   }
}
