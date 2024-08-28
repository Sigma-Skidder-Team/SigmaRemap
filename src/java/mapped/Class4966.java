package mapped;

import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.HashSet;

public class Class4966 extends Class4928<Class129> {
   public void method15246(JsonObject var1, Class129 var2, JsonSerializationContext var3) {
      super.method15246(var1, var2, var3);
      var1.addProperty("block", Class2348.field16072.method9181(Class129.method376(var2)).toString());
      JsonArray var6 = new JsonArray();
      Class129.method377(var2).forEach(var1x -> var6.add(var1x.method30472()));
      var1.add("properties", var6);
   }

   public Class129 method15244(JsonObject var1, JsonDeserializationContext var2, Class122[] var3) {
      ResourceLocation var6 = new ResourceLocation(Class8963.method32763(var1, "block"));
      Class3209 var7 = Class2348.field16072.method9187(var6).orElseThrow(() -> new IllegalArgumentException("Can't find block " + var6));
      Class9348 var8 = var7.method11577();
      HashSet var9 = Sets.newHashSet();
      JsonArray var10 = Class8963.method32786(var1, "properties", (JsonArray)null);
      if (var10 != null) {
         var10.forEach(var2x -> var9.add(var8.method35396(Class8963.method32762(var2x, "property"))));
      }

      return new Class129(var3, var7, var9);
   }
}
