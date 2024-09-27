package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public class ApplyBonusSerializer extends LootFunctionSerializer<Class138> {
   public void serialize(JsonObject var1, Class138 var2, JsonSerializationContext var3) {
      super.serialize(var1, var2, var3);
      var1.addProperty("enchantment", Registry.ENCHANTMENT.getKey(Class138.method414(var2)).toString());
      var1.addProperty("formula", Class138.method415(var2).method10788().toString());
      JsonObject var6 = new JsonObject();
      Class138.method415(var2).method10786(var6, var3);
      if (var6.size() > 0) {
         var1.add("parameters", var6);
      }
   }

   public Class138 deserialize(JsonObject var1, JsonDeserializationContext var2, ILootCondition[] var3) {
      ResourceLocation var6 = new ResourceLocation(JSONUtils.getString(var1, "enchantment"));
      Enchantment var7 = Registry.ENCHANTMENT.method9187(var6).orElseThrow(() -> new JsonParseException("Invalid enchantment id: " + var6));
      ResourceLocation var8 = new ResourceLocation(JSONUtils.getString(var1, "formula"));
      Class8409 var9 = (Class8409)Class138.method416().get(var8);
      if (var9 != null) {
         Class2582 var10;
         if (!var1.has("parameters")) {
            var10 = var9.method29526(new JsonObject(), var2);
         } else {
            var10 = var9.method29526(JSONUtils.method32782(var1, "parameters"), var2);
         }

         return new Class138(var3, var7, var10);
      } else {
         throw new JsonParseException("Invalid formula id: " + var8);
      }
   }
}
