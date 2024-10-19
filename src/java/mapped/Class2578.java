package mapped;

import com.google.gson.*;
import net.minecraft.util.JSONUtils;

import java.lang.reflect.Type;

public class Class2578 implements JsonDeserializer<Class6869>, JsonSerializer<Class6869> {
   public Class6869 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = JSONUtils.getJSONObject(var1, "value");
      int var7 = JSONUtils.method32777(var6, "n");
      float var8 = JSONUtils.method32771(var6, "p");
      return new Class6869(var7, var8);
   }

   public JsonElement serialize(Class6869 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      var6.addProperty("n", Class6869.method20917(var1));
      var6.addProperty("p", Class6869.method20918(var1));
      return var6;
   }
}
