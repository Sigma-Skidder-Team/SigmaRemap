package mapped;

import com.google.gson.*;

import java.lang.reflect.Type;

public class Class2568 extends Class2548 implements JsonSerializer<Class7627>, JsonDeserializer<Class7627> {
   public Class7627 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      Class7627 var6 = new Class7627();
      JsonObject var7 = var1.getAsJsonObject();
      this.deserialize(var7, var6, var3);
      var6.method25031(var7.get("keybind").getAsString());
      return var6;
   }

   public JsonElement serialize(Class7627 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      this.serialize(var6, var1, var3);
      var6.addProperty("keybind", var1.method25030());
      return var6;
   }
}
