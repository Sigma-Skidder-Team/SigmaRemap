package mapped;

import com.google.gson.*;
import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Type;

public class Class2564 implements JsonDeserializer<Class7318>, JsonSerializer<Class7318> {
   public Class7318 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = JSONUtils.method32781(var1, "loot table");
      Class8894[] var7 = JSONUtils.<Class8894[]>method32789(var6, "pools", new Class8894[0], var3, Class8894[].class);
      Class7538 var8 = null;
      if (var6.has("type")) {
         String var9 = JSONUtils.method32763(var6, "type");
         var8 = Class8524.method30213(new ResourceLocation(var9));
      }

      ILootFunction[] var10 = JSONUtils.<ILootFunction[]>method32789(var6, "functions", new ILootFunction[0], var3, ILootFunction[].class);
      return new Class7318(var8 == null ? Class8524.field38291 : var8, var7, var10);
   }

   public JsonElement serialize(Class7318 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      if (Class7318.method23190(var1) != Class7318.field31381) {
         ResourceLocation var7 = Class8524.method30214(Class7318.method23190(var1));
         if (var7 == null) {
            Class7318.method23191().warn("Failed to find id for param set " + Class7318.method23190(var1));
         } else {
            var6.addProperty("type", var7.toString());
         }
      }

      if (Class7318.method23192(var1).length > 0) {
         var6.add("pools", var3.serialize(Class7318.method23192(var1)));
      }

      if (!ArrayUtils.isEmpty(Class7318.method23193(var1))) {
         var6.add("functions", var3.serialize(Class7318.method23193(var1)));
      }

      return var6;
   }
}
