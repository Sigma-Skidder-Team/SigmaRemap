package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;

public class SetLootTableSerializer extends LootFunctionSerializer<Class149> {
   public void serialize(JsonObject var1, Class149 var2, JsonSerializationContext var3) {
      super.serialize(var1, var2, var3);
      var1.addProperty("name", Class149.method452(var2).toString());
      if (Class149.method453(var2) != 0L) {
         var1.addProperty("seed", Class149.method453(var2));
      }
   }

   public Class149 deserialize(JsonObject var1, JsonDeserializationContext var2, ILootCondition[] var3) {
      ResourceLocation var6 = new ResourceLocation(JSONUtils.getString(var1, "name"));
      long var7 = JSONUtils.method32775(var1, "seed", 0L);
      return new Class149(var3, var6, var7);
   }
}
