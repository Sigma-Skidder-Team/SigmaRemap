package mapped;

import com.google.gson.*;
import net.minecraft.util.JSONUtils;

import java.lang.reflect.Type;
import java.util.Map.Entry;

public class Class2576 implements JsonDeserializer<Class2006>, JsonSerializer<Class2006> {
   public JsonElement serialize(Class2006 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      JsonObject var7 = new JsonObject();

      for (Entry var9 : Class2006.method8503(var1).entrySet()) {
         Class9599 var10 = (Class9599)var9.getValue();
         if (var10.method37263()) {
            var7.add((String)var9.getKey(), var10.method37268());
         }
      }

      if (!var7.entrySet().isEmpty()) {
         var6.add("criteria", var7);
      }

      var6.addProperty("done", var1.method8489());
      return var6;
   }

   public Class2006 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = JSONUtils.getJSONObject(var1, "advancement");
      JsonObject var7 = JSONUtils.getJSONObject(var6, "criteria", new JsonObject());
      Class2006 var8 = new Class2006();

      for (Entry var10 : var7.entrySet()) {
         String var11 = (String)var10.getKey();
         Class2006.method8503(var8).put(var11, Class9599.method37270(JSONUtils.method32762((JsonElement)var10.getValue(), var11)));
      }

      return var8;
   }
}
