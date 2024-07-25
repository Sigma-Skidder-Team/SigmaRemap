package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class class_1486 implements JsonDeserializer<class_7986>, JsonSerializer<class_7986> {
   public class_7986 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      if (!class_6539.method_29769(var1)) {
         JsonObject var6 = class_6539.method_29782(var1, "value");
         float var7 = class_6539.method_29774(var6, "min");
         float var8 = class_6539.method_29774(var6, "max");
         return new class_7986(var7, var8);
      } else {
         return new class_7986(class_6539.method_29773(var1, "value"));
      }
   }

   public JsonElement serialize(class_7986 var1, Type var2, JsonSerializationContext var3) {
      if (class_7986.method_36240(var1) != class_7986.method_36239(var1)) {
         JsonObject var6 = new JsonObject();
         var6.addProperty("min", class_7986.method_36240(var1));
         var6.addProperty("max", class_7986.method_36239(var1));
         return var6;
      } else {
         return new JsonPrimitive(class_7986.method_36240(var1));
      }
   }
}
