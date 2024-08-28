package mapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.ArrayList;

public class Class4927 extends Class4928<Class142> {
   public void method15246(JsonObject var1, Class142 var2, JsonSerializationContext var3) {
      super.method15246(var1, var2, var3);
      var1.addProperty("source", Class142.method435(var2).field16022);
      JsonArray var6 = new JsonArray();
      Class142.method436(var2).stream().map(Class9603::method37314).forEach(var6::add);
      var1.add("ops", var6);
   }

   public Class142 method15244(JsonObject var1, JsonDeserializationContext var2, Class122[] var3) {
      Class2343 var6 = Class2343.method9119(Class8963.method32763(var1, "source"));
      ArrayList var7 = Lists.newArrayList();

      for (JsonElement var9 : Class8963.method32785(var1, "ops")) {
         JsonObject var10 = Class8963.method32781(var9, "op");
         var7.add(Class9603.method37315(var10));
      }

      return new Class142(var3, var6, var7);
   }
}
