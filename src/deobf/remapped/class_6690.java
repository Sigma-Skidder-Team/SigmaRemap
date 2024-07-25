package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class class_6690 implements JsonDeserializer<Identifier>, JsonSerializer<Identifier> {
   public Identifier deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      return new Identifier(class_6539.method_29795(var1, "location"));
   }

   public JsonElement serialize(Identifier var1, Type var2, JsonSerializationContext var3) {
      return new JsonPrimitive(var1.toString());
   }
}
