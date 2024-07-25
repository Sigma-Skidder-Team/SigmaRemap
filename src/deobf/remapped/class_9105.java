package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.List;

public class class_9105 extends class_8363 implements JsonSerializer<class_5028>, JsonDeserializer<class_5028> {
   public class_5028 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      class_5028 var6 = new class_5028();
      JsonObject var7 = var1.getAsJsonObject();
      this.deserialize(var7, var6, var3);
      var6.method_23187(var7.get("text").getAsString());
      return var6;
   }

   public JsonElement serialize(class_5028 var1, Type var2, JsonSerializationContext var3) {
      List var6 = var1.method_29048();
      JsonObject var7 = new JsonObject();
      if (var1.method_29054() || var6 != null && !var6.isEmpty()) {
         this.serialize(var7, var1, var3);
      }

      var7.addProperty("text", var1.method_23190());
      return var7;
   }
}
