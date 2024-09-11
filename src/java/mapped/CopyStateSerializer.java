package mapped;

import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.util.HashSet;

public class CopyStateSerializer extends LootFunctionSerializer<Class129> {
   public void serialize(JsonObject var1, Class129 var2, JsonSerializationContext var3) {
      super.serialize(var1, var2, var3);
      var1.addProperty("block", Registry.BLOCK.getKey(Class129.method376(var2)).toString());
      JsonArray var6 = new JsonArray();
      Class129.method377(var2).forEach(var1x -> var6.add(var1x.method30472()));
      var1.add("properties", var6);
   }

   public Class129 deserialize(JsonObject var1, JsonDeserializationContext var2, ILootCondition[] var3) {
      ResourceLocation var6 = new ResourceLocation(JSONUtils.getString(var1, "block"));
      Block var7 = Registry.BLOCK.method9187(var6).orElseThrow(() -> new IllegalArgumentException("Can't find block " + var6));
      Class9348 var8 = var7.getStateContainer();
      HashSet var9 = Sets.newHashSet();
      JsonArray var10 = JSONUtils.method32786(var1, "properties", (JsonArray)null);
      if (var10 != null) {
         var10.forEach(var2x -> var9.add(var8.method35396(JSONUtils.method32762(var2x, "property"))));
      }

      return new Class129(var3, var7, var9);
   }
}
