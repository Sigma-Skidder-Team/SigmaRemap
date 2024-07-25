package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Arrays;

public class class_7964 extends class_8363 implements JsonSerializer<class_3083>, JsonDeserializer<class_3083> {
   public class_3083 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      class_3083 var6 = new class_3083();
      JsonObject var7 = var1.getAsJsonObject();
      this.deserialize(var7, var6, var3);
      var6.method_14137(var7.get("translate").getAsString());
      if (var7.has("with")) {
         var6.method_14132(Arrays.<class_6349>asList((class_6349[])var3.deserialize(var7.get("with"), class_6349[].class)));
      }

      return var6;
   }

   public JsonElement serialize(class_3083 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      this.serialize(var6, var1, var3);
      var6.addProperty("translate", var1.method_14138());
      if (var1.method_14133() != null) {
         var6.add("with", var3.serialize(var1.method_14133()));
      }

      return var6;
   }
}
