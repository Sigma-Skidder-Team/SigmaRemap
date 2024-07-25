package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class class_8530 extends class_8363 implements JsonSerializer<class_5057>, JsonDeserializer<class_5057> {
   public class_5057 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      class_5057 var7 = new class_5057(var6.get("selector").getAsString());
      this.deserialize(var6, var7, var3);
      return var7;
   }

   public JsonElement serialize(class_5057 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      this.serialize(var6, var1, var3);
      var6.addProperty("selector", var1.method_23315());
      return var6;
   }
}
