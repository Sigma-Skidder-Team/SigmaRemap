package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class Class4952 implements ILootSerializer<Class151> {
   public void serialize(JsonObject var1, Class151 var2, JsonSerializationContext var3) {
      var1.addProperty("chance", Class151.method458(var2));
   }

   public Class151 method15248(JsonObject var1, JsonDeserializationContext var2) {
      return new Class151(JSONUtils.method32771(var1, "chance"));
   }
}
