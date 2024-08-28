package mapped;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.List;

public class Class2552 extends Class2548 implements JsonSerializer<Class7630>, JsonDeserializer<Class7630> {
   public Class7630 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      Class7630 var6 = new Class7630();
      JsonObject var7 = var1.getAsJsonObject();
      this.deserialize(var7, var6, var3);
      var6.method25045(var7.get("text").getAsString());
      return var6;
   }

   public JsonElement serialize(Class7630 var1, Type var2, JsonSerializationContext var3) {
      List var6 = var1.method25027();
      JsonObject var7 = new JsonObject();
      if (var1.method25013() || var6 != null && !var6.isEmpty()) {
         this.serialize(var7, var1, var3);
      }

      var7.addProperty("text", var1.method25044());
      return var7;
   }
}
