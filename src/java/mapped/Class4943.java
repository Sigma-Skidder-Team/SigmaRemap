package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class Class4943 implements Class4929<Class124> {
   public void method15246(JsonObject var1, Class124 var2, JsonSerializationContext var3) {
      var1.addProperty("chance", Class124.method365(var2));
      var1.addProperty("looting_multiplier", Class124.method366(var2));
   }

   public Class124 method15248(JsonObject var1, JsonDeserializationContext var2) {
      return new Class124(Class8963.method32771(var1, "chance"), Class8963.method32771(var1, "looting_multiplier"));
   }
}