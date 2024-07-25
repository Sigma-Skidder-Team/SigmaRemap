package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import org.apache.commons.lang3.ArrayUtils;

public class class_3007 implements JsonDeserializer<class_1758>, JsonSerializer<class_1758> {
   public class_1758 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = class_6539.method_29782(var1, "loot table");
      class_6282[] var7 = class_6539.<class_6282[]>method_29779(var6, "pools", new class_6282[0], var3, class_6282[].class);
      class_2144 var8 = null;
      if (var6.has("type")) {
         String var9 = class_6539.method_29796(var6, "type");
         var8 = class_4933.method_22626(new class_4639(var9));
      }

      class_2913[] var10 = class_6539.<class_2913[]>method_29779(var6, "functions", new class_2913[0], var3, class_2913[].class);
      return new class_1758(var8 == null ? class_4933.field_25571 : var8, var7, var10, null);
   }

   public JsonElement serialize(class_1758 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      if (class_1758.method_7871(var1) != class_1758.field_9026) {
         class_4639 var7 = class_4933.method_22627(class_1758.method_7871(var1));
         if (var7 == null) {
            class_1758.method_7873().warn("Failed to find id for param set " + class_1758.method_7871(var1));
         } else {
            var6.addProperty("type", var7.toString());
         }
      }

      if (class_1758.method_7869(var1).length > 0) {
         var6.add("pools", var3.serialize(class_1758.method_7869(var1)));
      }

      if (!ArrayUtils.isEmpty(class_1758.method_7866(var1))) {
         var6.add("functions", var3.serialize(class_1758.method_7866(var1)));
      }

      return var6;
   }
}
