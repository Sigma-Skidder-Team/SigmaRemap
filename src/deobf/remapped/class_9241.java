package remapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class class_9241 implements JsonDeserializer<class_9798> {
   public class_9798 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      ArrayList var6 = Lists.newArrayList();
      if (!var1.isJsonArray()) {
         var6.add(var3.deserialize(var1, class_8338.class));
      } else {
         JsonArray var7 = var1.getAsJsonArray();
         if (var7.size() == 0) {
            throw new JsonParseException("Empty variant array");
         }

         for (JsonElement var9 : var7) {
            var6.add(var3.deserialize(var9, class_8338.class));
         }
      }

      return new class_9798(var6);
   }
}
