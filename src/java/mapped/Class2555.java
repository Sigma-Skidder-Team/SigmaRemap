package mapped;

import com.google.gson.*;

import java.lang.reflect.Type;

public class Class2555 implements JsonDeserializer<Class6871>, JsonSerializer<Class6871> {
   public Class6871 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      return new Class6871(JSONUtils.method32776(var1, "value"));
   }

   public JsonElement serialize(Class6871 var1, Type var2, JsonSerializationContext var3) {
      return new JsonPrimitive(Class6871.method20920(var1));
   }
}
