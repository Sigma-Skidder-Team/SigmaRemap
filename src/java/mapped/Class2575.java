package mapped;

import com.google.gson.*;

import java.lang.reflect.Type;

public class Class2575 implements JsonDeserializer<Class6872>, JsonSerializer<Class6872> {
   public Class6872 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      if (!Class8963.method32757(var1)) {
         JsonObject var6 = Class8963.method32781(var1, "value");
         float var7 = Class8963.method32771(var6, "min");
         float var8 = Class8963.method32771(var6, "max");
         return new Class6872(var7, var8);
      } else {
         return new Class6872(Class8963.method32770(var1, "value"));
      }
   }

   public JsonElement serialize(Class6872 var1, Type var2, JsonSerializationContext var3) {
      if (Class6872.method20926(var1) != Class6872.method20927(var1)) {
         JsonObject var6 = new JsonObject();
         var6.addProperty("min", Class6872.method20926(var1));
         var6.addProperty("max", Class6872.method20927(var1));
         return var6;
      } else {
         return new JsonPrimitive(Class6872.method20926(var1));
      }
   }
}
