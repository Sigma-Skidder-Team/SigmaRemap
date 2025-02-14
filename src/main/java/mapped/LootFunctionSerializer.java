package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.util.JSONUtils;
import org.apache.commons.lang3.ArrayUtils;

public abstract class LootFunctionSerializer<T extends Class128> implements ILootSerializer<T> {
   public void serialize(JsonObject var1, T var2, JsonSerializationContext var3) {
      if (!ArrayUtils.isEmpty(var2.field441)) {
         var1.add("conditions", var3.serialize(var2.field441));
      }
   }

   public final T method15248(JsonObject var1, JsonDeserializationContext var2) {
      ILootCondition[] var5 = JSONUtils.<ILootCondition[]>method32789(var1, "conditions", new ILootCondition[0], var2, ILootCondition[].class);
      return this.deserialize(var1, var2, var5);
   }

   public abstract T deserialize(JsonObject var1, JsonDeserializationContext var2, ILootCondition[] var3);
}
