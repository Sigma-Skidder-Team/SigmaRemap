package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.util.JSONUtils;

public class LootingEnchantSerializer extends LootFunctionSerializer<Class130> {
   public void serialize(JsonObject var1, Class130 var2, JsonSerializationContext var3) {
      super.serialize(var1, var2, var3);
      var1.add("count", var3.serialize(Class130.method380(var2)));
      if (Class130.method381(var2)) {
         var1.add("limit", var3.serialize(Class130.method382(var2)));
      }
   }

   public Class130 deserialize(JsonObject var1, JsonDeserializationContext var2, ILootCondition[] var3) {
      int var6 = JSONUtils.getInt(var1, "limit", 0);
      return new Class130(var3, JSONUtils.method32788(var1, "count", var2, Class6872.class), var6);
   }
}
