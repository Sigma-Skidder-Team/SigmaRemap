package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class class_6251 extends class_8363 implements JsonSerializer<class_2337>, JsonDeserializer<class_2337> {
   public class_2337 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      if (var6.has("name") && var6.has("objective")) {
         String var7 = var6.get("name").getAsString();
         String var8 = var6.get("objective").getAsString();
         class_2337 var9 = new class_2337(var7, var8);
         if (var6.has("value") && !var6.get("value").getAsString().isEmpty()) {
            var9.method_10692(var6.get("value").getAsString());
         }

         this.deserialize(var6, var9, var3);
         return var9;
      } else {
         throw new JsonParseException("A score component needs at least a name and an objective");
      }
   }

   public JsonElement serialize(class_2337 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      this.serialize(var6, var1, var3);
      JsonObject var7 = new JsonObject();
      var7.addProperty("name", var1.method_10694());
      var7.addProperty("objective", var1.method_10696());
      var7.addProperty("value", var1.method_10691());
      var6.add("score", var7);
      return var6;
   }
}
