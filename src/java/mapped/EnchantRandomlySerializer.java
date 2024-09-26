package mapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;

public class EnchantRandomlySerializer extends LootFunctionSerializer<Class134> {
   public void serialize(JsonObject var1, Class134 var2, JsonSerializationContext var3) {
      super.serialize(var1, var2, var3);
      if (!Class134.method395(var2).isEmpty()) {
         JsonArray var6 = new JsonArray();

         for (Enchantment var8 : Class134.method395(var2)) {
            ResourceLocation var9 = Registry.field16073.getKey(var8);
            if (var9 == null) {
               throw new IllegalArgumentException("Don't know how to serialize enchantment " + var8);
            }

            var6.add(new JsonPrimitive(var9.toString()));
         }

         var1.add("enchantments", var6);
      }
   }

   public Class134 deserialize(JsonObject var1, JsonDeserializationContext var2, ILootCondition[] var3) {
      ArrayList var6 = Lists.newArrayList();
      if (var1.has("enchantments")) {
         for (JsonElement var8 : JSONUtils.method32785(var1, "enchantments")) {
            String var9 = JSONUtils.method32762(var8, "enchantment");
            Enchantment var10 = Registry.field16073
               .method9187(new ResourceLocation(var9))
               .orElseThrow(() -> new JsonSyntaxException("Unknown enchantment '" + var9 + "'"));
            var6.add(var10);
         }
      }

      return new Class134(var3, var6);
   }
}
