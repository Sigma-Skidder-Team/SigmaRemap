package mapped;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Arrays;

public class Class2547 extends Class2548 implements JsonSerializer<Class7628>, JsonDeserializer<Class7628> {
   public Class7628 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      Class7628 var6 = new Class7628();
      JsonObject var7 = var1.getAsJsonObject();
      this.deserialize(var7, var6, var3);
      var6.method25039(var7.get("translate").getAsString());
      if (var7.has("with")) {
         var6.method25032(Arrays.<Class7626>asList((Class7626[])var3.deserialize(var7.get("with"), Class7626[].class)));
      }

      return var6;
   }

   public JsonElement serialize(Class7628 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      this.serialize(var6, var1, var3);
      var6.addProperty("translate", var1.method25037());
      if (var1.method25038() != null) {
         var6.add("with", var3.serialize(var1.method25038()));
      }

      return var6;
   }
}
