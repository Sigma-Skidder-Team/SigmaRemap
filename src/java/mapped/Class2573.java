package mapped;

import com.google.gson.*;

import java.lang.reflect.Type;

public class Class2573 implements JsonDeserializer<Class12>, JsonSerializer<Class12> {
   public Class12 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = Class8963.method32781(var1, "value");
      Integer var7 = !var6.has("min") ? null : Class8963.method32777(var6, "min");
      Integer var8 = !var6.has("max") ? null : Class8963.method32777(var6, "max");
      return new Class12(var7, var8);
   }

   public JsonElement serialize(Class12 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      if (Class12.method65(var1) != null) {
         var6.addProperty("max", Class12.method65(var1));
      }

      if (Class12.method66(var1) != null) {
         var6.addProperty("min", Class12.method66(var1));
      }

      return var6;
   }
}
