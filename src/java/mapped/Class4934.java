package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import org.apache.commons.lang3.ArrayUtils;

public abstract class Class4934<T extends Class4688> implements ILootSerializer<T> {
   public final void serialize(JsonObject var1, T var2, JsonSerializationContext var3) {
      if (!ArrayUtils.isEmpty(var2.field22271)) {
         var1.add("conditions", var3.serialize(var2.field22271));
      }

      this.method15249(var1, (T)var2, var3);
   }

   public final T method15248(JsonObject var1, JsonDeserializationContext var2) {
      ILootCondition[] var5 = JSONUtils.<ILootCondition[]>method32789(var1, "conditions", new ILootCondition[0], var2, ILootCondition[].class);
      return this.method15250(var1, var2, var5);
   }

   public abstract void method15249(JsonObject var1, T var2, JsonSerializationContext var3);

   public abstract T method15250(JsonObject var1, JsonDeserializationContext var2, ILootCondition[] var3);
}
