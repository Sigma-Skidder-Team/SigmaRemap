package mapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;

public class SetAttribSerializer extends LootFunctionSerializer<Class148> {
   public void serialize(JsonObject var1, Class148 var2, JsonSerializationContext var3) {
      super.serialize(var1, var2, var3);
      JsonArray var6 = new JsonArray();

      for (Class6884 var8 : Class148.method451(var2)) {
         var6.add(var8.method20960(var3));
      }

      var1.add("modifiers", var6);
   }

   public Class148 deserialize(JsonObject var1, JsonDeserializationContext var2, ILootCondition[] var3) {
      JsonArray var6 = JSONUtils.method32785(var1, "modifiers");
      ArrayList var7 = Lists.newArrayListWithExpectedSize(var6.size());

      for (JsonElement var9 : var6) {
         var7.add(Class6884.method20961(JSONUtils.method32781(var9, "modifier"), var2));
      }

      if (!var7.isEmpty()) {
         return new Class148(var3, var7);
      } else {
         throw new JsonSyntaxException("Invalid attribute modifiers array; cannot be empty");
      }
   }
}
