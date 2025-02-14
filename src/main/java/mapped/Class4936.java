package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.util.JSONUtils;
import org.apache.commons.lang3.ArrayUtils;

public abstract class Class4936<T extends Class4686> extends Class4934<T> {
   public void method15249(JsonObject var1, T var2, JsonSerializationContext var3) {
      if (var2.field22265 != 1) {
         var1.addProperty("weight", var2.field22265);
      }

      if (var2.field22266 != 0) {
         var1.addProperty("quality", var2.field22266);
      }

      if (!ArrayUtils.isEmpty(var2.field22267)) {
         var1.add("functions", var3.serialize(var2.field22267));
      }
   }

   public final T method15250(JsonObject var1, JsonDeserializationContext var2, ILootCondition[] var3) {
      int var6 = JSONUtils.getInt(var1, "weight", 1);
      int var7 = JSONUtils.getInt(var1, "quality", 0);
      ILootFunction[] var8 = JSONUtils.<ILootFunction[]>method32789(var1, "functions", new ILootFunction[0], var2, ILootFunction[].class);
      return this.method15251(var1, var2, var6, var7, var3, var8);
   }

   public abstract T method15251(JsonObject var1, JsonDeserializationContext var2, int var3, int var4, ILootCondition[] var5, ILootFunction[] var6);
}
