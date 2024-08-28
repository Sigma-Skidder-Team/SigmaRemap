package mapped;

import com.google.gson.*;

import java.lang.reflect.Type;

public class Class2563 extends Class2548 implements JsonSerializer<Class7629>, JsonDeserializer<Class7629> {
   public Class7629 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      Class7629 var7 = new Class7629(var6.get("selector").getAsString());
      this.deserialize(var6, var7, var3);
      return var7;
   }

   public JsonElement serialize(Class7629 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      this.serialize(var6, var1, var3);
      var6.addProperty("selector", var1.method25040());
      return var6;
   }
}
