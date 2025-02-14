package mapped;

import com.google.common.collect.Lists;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Class2562 implements JsonDeserializer<Class7497> {
   public Class7497 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      ArrayList var6 = Lists.newArrayList();
      if (!var1.isJsonArray()) {
         var6.add(var3.deserialize(var1, Class1903.class));
      } else {
         JsonArray var7 = var1.getAsJsonArray();
         if (var7.size() == 0) {
            throw new JsonParseException("Empty variant array");
         }

         for (JsonElement var9 : var7) {
            var6.add(var3.deserialize(var9, Class1903.class));
         }
      }

      return new Class7497(var6);
   }
}
