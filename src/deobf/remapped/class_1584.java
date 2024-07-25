package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class class_1584 implements JsonDeserializer<class_595>, JsonSerializer<class_595> {
   public class_595 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = class_6539.method_29782(var1, "value");
      Integer var7 = !var6.has("min") ? null : class_6539.method_29767(var6, "min");
      Integer var8 = !var6.has("max") ? null : class_6539.method_29767(var6, "max");
      return new class_595(var7, var8, null);
   }

   public JsonElement serialize(class_595 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      if (class_595.method_2797(var1) != null) {
         var6.addProperty("max", class_595.method_2797(var1));
      }

      if (class_595.method_2794(var1) != null) {
         var6.addProperty("min", class_595.method_2794(var1));
      }

      return var6;
   }
}
