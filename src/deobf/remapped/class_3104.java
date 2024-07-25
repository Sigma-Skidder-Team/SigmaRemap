package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class class_3104 implements JsonDeserializer<class_7543>, JsonSerializer<class_7543> {
   public class_7543 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = class_6539.method_29782(var1, "version");
      return new class_7543(class_6539.method_29796(var6, "name"), class_6539.method_29767(var6, "protocol"));
   }

   public JsonElement serialize(class_7543 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      var6.addProperty("name", var1.method_34349());
      var6.addProperty("protocol", var1.method_34351());
      return var6;
   }
}
