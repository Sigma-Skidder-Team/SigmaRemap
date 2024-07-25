package remapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;

public class class_1914 extends class_7789<class_2104> {
   public void method_8680(JsonObject var1, class_2104 var2, JsonSerializationContext var3) {
      super.method_35344(var1, var2, var3);
      if (!class_2104.method_9862(var2).isEmpty()) {
         JsonArray var6 = new JsonArray();

         for (class_4382 var8 : class_2104.method_9862(var2)) {
            class_4639 var9 = class_8669.field_44445.method_39797(var8);
            if (var9 == null) {
               throw new IllegalArgumentException("Don't know how to serialize enchantment " + var8);
            }

            var6.add(new JsonPrimitive(var9.toString()));
         }

         var1.add("enchantments", var6);
      }
   }

   public class_2104 method_8681(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3) {
      ArrayList var6 = Lists.newArrayList();
      if (var1.has("enchantments")) {
         for (JsonElement var8 : class_6539.method_29787(var1, "enchantments")) {
            String var9 = class_6539.method_29795(var8, "enchantment");
            class_4382 var10 = class_8669.field_44445
               .method_39794(new class_4639(var9))
               .orElseThrow(() -> new JsonSyntaxException("Unknown enchantment '" + var9 + "'"));
            var6.add(var10);
         }
      }

      return new class_2104(var3, var6, null);
   }
}
