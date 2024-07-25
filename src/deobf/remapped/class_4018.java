package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class class_4018 implements JsonDeserializer<class_2728>, JsonSerializer<class_2728> {
   public class_2728 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      return new class_2728(class_6539.method_29766(var1, "value"));
   }

   public JsonElement serialize(class_2728 var1, Type var2, JsonSerializationContext var3) {
      return new JsonPrimitive(class_2728.method_12259(var1));
   }
}
