package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class Class4939 extends Class4936<Class4696> {
   public void method15249(JsonObject var1, Class4696 var2, JsonSerializationContext var3) {
      super.method15249(var1, var2, var3);
      var1.addProperty("name", Class4696.method14729(var2).toString());
   }

   public Class4696 method15251(JsonObject var1, JsonDeserializationContext var2, int var3, int var4, Class122[] var5, Class127[] var6) {
      ResourceLocation var9 = new ResourceLocation(Class8963.method32763(var1, "name"));
      return new Class4696(var9, var3, var4, var5, var6);
   }
}
