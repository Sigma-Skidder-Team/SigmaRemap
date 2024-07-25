package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class class_3273 implements JsonDeserializer<class_1066>, JsonSerializer<class_1066> {
   public class_1066 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = class_6539.method_29782(var1, "value");
      int var7 = class_6539.method_29767(var6, "n");
      float var8 = class_6539.method_29774(var6, "p");
      return new class_1066(var7, var8);
   }

   public JsonElement serialize(class_1066 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      var6.addProperty("n", class_1066.method_4680(var1));
      var6.addProperty("p", class_1066.method_4681(var1));
      return var6;
   }
}
