package mapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;

public class Class4970 extends Class4928<Class134> {
   public void method15246(JsonObject var1, Class134 var2, JsonSerializationContext var3) {
      super.method15246(var1, var2, var3);
      if (!Class134.method395(var2).isEmpty()) {
         JsonArray var6 = new JsonArray();

         for (Class6069 var8 : Class134.method395(var2)) {
            ResourceLocation var9 = Registry.field16073.method9181(var8);
            if (var9 == null) {
               throw new IllegalArgumentException("Don't know how to serialize enchantment " + var8);
            }

            var6.add(new JsonPrimitive(var9.toString()));
         }

         var1.add("enchantments", var6);
      }
   }

   public Class134 method15244(JsonObject var1, JsonDeserializationContext var2, Class122[] var3) {
      ArrayList var6 = Lists.newArrayList();
      if (var1.has("enchantments")) {
         for (JsonElement var8 : Class8963.method32785(var1, "enchantments")) {
            String var9 = Class8963.method32762(var8, "enchantment");
            Class6069 var10 = Registry.field16073
               .method9187(new ResourceLocation(var9))
               .orElseThrow(() -> new JsonSyntaxException("Unknown enchantment '" + var9 + "'"));
            var6.add(var10);
         }
      }

      return new Class134(var3, var6);
   }
}
