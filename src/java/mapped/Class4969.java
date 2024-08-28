package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class Class4969 extends Class4928<Class149> {
   public void method15246(JsonObject var1, Class149 var2, JsonSerializationContext var3) {
      super.method15246(var1, var2, var3);
      var1.addProperty("name", Class149.method452(var2).toString());
      if (Class149.method453(var2) != 0L) {
         var1.addProperty("seed", Class149.method453(var2));
      }
   }

   public Class149 method15244(JsonObject var1, JsonDeserializationContext var2, Class122[] var3) {
      ResourceLocation var6 = new ResourceLocation(Class8963.method32763(var1, "name"));
      long var7 = Class8963.method32775(var1, "seed", 0L);
      return new Class149(var3, var6, var7);
   }
}
