package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class Class4931 implements Class4929<Class157> {
   public void method15246(JsonObject var1, Class157 var2, JsonSerializationContext var3) {
      var1.addProperty("name", Class157.method475(var2).toString());
   }

   public Class157 method15248(JsonObject var1, JsonDeserializationContext var2) {
      ResourceLocation var5 = new ResourceLocation(Class8963.method32763(var1, "name"));
      return new Class157(var5);
   }
}
