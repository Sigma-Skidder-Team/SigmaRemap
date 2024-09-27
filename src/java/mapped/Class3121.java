package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class Class3121 implements Class2982 {
   public final Class3902 field18327;

   public Class3121(Class3902 var1) {
      this.field18327 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      String var4 = var1.<String>method30555(BruhMotha.field22539, 0);

      try {
         JsonObject var5 = (JsonObject)Class9610.method37357().fromJson(var4, JsonObject.class);
         if (var5.has("favicon")) {
            var5.addProperty("favicon", var5.get("favicon").getAsString().replace("\n", ""));
         }

         var1.method30558(BruhMotha.field22539, 0, Class9610.method37357().toJson(var5));
      } catch (JsonParseException var6) {
         var6.printStackTrace();
      }
   }
}
