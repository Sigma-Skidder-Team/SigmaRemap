package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.util.JSONUtils;

public class LimitCountSerializer extends LootFunctionSerializer<Class135> {
   public void serialize(JsonObject var1, Class135 var2, JsonSerializationContext var3) {
      super.serialize(var1, var2, var3);
      var1.add("limit", var3.serialize(Class135.method398(var2)));
   }

   public Class135 deserialize(JsonObject var1, JsonDeserializationContext var2, ILootCondition[] var3) {
      Class12 var6 = JSONUtils.<Class12>method32788(var1, "limit", var2, Class12.class);
      return new Class135(var3, var6);
   }
}
