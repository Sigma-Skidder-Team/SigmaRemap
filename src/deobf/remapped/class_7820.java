package remapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import java.util.Map;

public class class_7820 {
   private static final Map<class_4639, Class<? extends class_3254>> field_39667 = Maps.newHashMap();

   public static class_3254 method_35418(JsonElement var0, JsonDeserializationContext var1) throws JsonParseException {
      if (!var0.isJsonPrimitive()) {
         JsonObject var4 = var0.getAsJsonObject();
         String var5 = class_6539.method_29797(var4, "type", class_3254.field_16151.toString());
         Class var6 = field_39667.get(new class_4639(var5));
         if (var6 != null) {
            return (class_3254)var1.deserialize(var4, var6);
         } else {
            throw new JsonParseException("Unknown generator: " + var5);
         }
      } else {
         return (class_3254)var1.deserialize(var0, class_2728.class);
      }
   }

   public static JsonElement method_35420(class_3254 var0, JsonSerializationContext var1) {
      JsonElement var4 = var1.serialize(var0);
      if (var4.isJsonObject()) {
         var4.getAsJsonObject().addProperty("type", var0.method_14869().toString());
      }

      return var4;
   }

   static {
      field_39667.put(class_3254.field_16151, class_7986.class);
      field_39667.put(class_3254.field_16150, class_1066.class);
      field_39667.put(class_3254.field_16149, class_2728.class);
   }
}
