package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class class_6690 implements JsonDeserializer<class_4639>, JsonSerializer<class_4639> {
   public class_4639 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      return new class_4639(class_6539.method_29795(var1, "location"));
   }

   public JsonElement serialize(class_4639 var1, Type var2, JsonSerializationContext var3) {
      return new JsonPrimitive(var1.toString());
   }
}
