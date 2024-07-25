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

public class class_5769 implements JsonDeserializer<class_6282>, JsonSerializer<class_6282> {
   public class_6282 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = class_6539.method_29782(var1, "loot pool");
      class_3765[] var7 = class_6539.<class_3765[]>method_29778(var6, "entries", var3, class_3765[].class);
      class_7279[] var8 = class_6539.<class_7279[]>method_29779(var6, "conditions", new class_7279[0], var3, class_7279[].class);
      class_2913[] var9 = class_6539.<class_2913[]>method_29779(var6, "functions", new class_2913[0], var3, class_2913[].class);
      class_3254 var10 = class_7820.method_35418(var6.get("rolls"), var3);
      class_7986 var11 = class_6539.<class_7986>method_29779(var6, "bonus_rolls", new class_7986(0.0F, 0.0F), var3, class_7986.class);
      return new class_6282(var7, var8, var9, var10, var11, null);
   }

   public JsonElement serialize(class_6282 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      var6.add("rolls", class_7820.method_35420(class_6282.method_28633(var1), var3));
      var6.add("entries", var3.serialize(class_6282.method_28630(var1)));
      if (class_6282.method_28638(var1).method_36243() != 0.0F && class_6282.method_28638(var1).method_36242() != 0.0F) {
         var6.add("bonus_rolls", var3.serialize(class_6282.method_28638(var1)));
      }

      if (!ArrayUtils.isEmpty(class_6282.method_28636(var1))) {
         var6.add("conditions", var3.serialize(class_6282.method_28636(var1)));
      }

      if (!ArrayUtils.isEmpty(class_6282.method_28634(var1))) {
         var6.add("functions", var3.serialize(class_6282.method_28634(var1)));
      }

      return var6;
   }
}
