package mapped;

import com.google.gson.*;

import java.lang.reflect.Type;

public class Class2549 extends Class2548 implements JsonSerializer<Class7625>, JsonDeserializer<Class7625> {
   public Class7625 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      if (var6.has("name") && var6.has("objective")) {
         String var7 = var6.get("name").getAsString();
         String var8 = var6.get("objective").getAsString();
         Class7625 var9 = new Class7625(var7, var8);
         if (var6.has("value") && !var6.get("value").getAsString().isEmpty()) {
            var9.method24989(var6.get("value").getAsString());
         }

         this.deserialize(var6, var9, var3);
         return var9;
      } else {
         throw new JsonParseException("A score component needs at least a name and an objective");
      }
   }

   public JsonElement serialize(Class7625 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      this.serialize(var6, var1, var3);
      JsonObject var7 = new JsonObject();
      var7.addProperty("name", var1.method24984());
      var7.addProperty("objective", var1.method24985());
      var7.addProperty("value", var1.method24986());
      var6.add("score", var7);
      return var6;
   }
}
