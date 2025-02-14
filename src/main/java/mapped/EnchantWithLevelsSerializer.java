package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.util.JSONUtils;

public class EnchantWithLevelsSerializer extends LootFunctionSerializer<Class143> {
   public void serialize(JsonObject var1, Class143 var2, JsonSerializationContext var3) {
      super.serialize(var1, var2, var3);
      var1.add("levels", Class9288.method35014(Class143.method440(var2), var3));
      var1.addProperty("treasure", Class143.method441(var2));
   }

   public Class143 deserialize(JsonObject var1, JsonDeserializationContext var2, ILootCondition[] var3) {
      Class6870 var6 = Class9288.method35013(var1.get("levels"), var2);
      boolean var7 = JSONUtils.getBoolean(var1, "treasure", false);
      return new Class143(var3, var6, var7);
   }
}
