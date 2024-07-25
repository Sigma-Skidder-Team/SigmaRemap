package remapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.HashMap;

public class class_1763 extends class_7789<class_797> {
   public void method_7880(JsonObject var1, class_797 var2, JsonSerializationContext var3) {
      super.method_35344(var1, var2, var3);
      if (!class_797.method_3538(var2).isEmpty()) {
         JsonArray var6 = new JsonArray();

         for (class_1425 var8 : class_797.method_3538(var2).keySet()) {
            JsonObject var9 = new JsonObject();
            Identifier var10 = class_8669.field_44436.method_39797(var8);
            if (var10 == null) {
               throw new IllegalArgumentException("Don't know how to serialize mob effect " + var8);
            }

            var9.add("type", new JsonPrimitive(var10.toString()));
            var9.add("duration", var3.serialize(class_797.method_3538(var2).get(var8)));
            var6.add(var9);
         }

         var1.add("effects", var6);
      }
   }

   public class_797 method_7881(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3) {
      HashMap var6 = Maps.newHashMap();
      if (var1.has("effects")) {
         for (JsonElement var8 : class_6539.method_29787(var1, "effects")) {
            String var9 = class_6539.method_29796(var8.getAsJsonObject(), "type");
            class_1425 var10 = class_8669.field_44436
               .method_39794(new Identifier(var9))
               .orElseThrow(() -> new JsonSyntaxException("Unknown mob effect '" + var9 + "'"));
            class_7986 var11 = class_6539.<class_7986>method_29778(var8.getAsJsonObject(), "duration", var2, class_7986.class);
            var6.put(var10, var11);
         }
      }

      return new class_797(var3, var6, null);
   }
}
