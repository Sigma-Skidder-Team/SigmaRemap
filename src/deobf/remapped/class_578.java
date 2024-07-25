package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class class_578 extends class_8363 implements JsonSerializer<class_9117>, JsonDeserializer<class_9117> {
   public class_9117 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      class_9117 var6 = new class_9117();
      JsonObject var7 = var1.getAsJsonObject();
      this.deserialize(var7, var6, var3);
      var6.method_41972(var7.get("keybind").getAsString());
      return var6;
   }

   public JsonElement serialize(class_9117 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      this.serialize(var6, var1, var3);
      var6.addProperty("keybind", var1.method_41971());
      return var6;
   }
}
