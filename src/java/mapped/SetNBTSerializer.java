package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class SetNBTSerializer extends LootFunctionSerializer<Class136> {
   public void serialize(JsonObject var1, Class136 var2, JsonSerializationContext var3) {
      super.serialize(var1, var2, var3);
      var1.addProperty("tag", Class136.method401(var2).toString());
   }

   public Class136 deserialize(JsonObject var1, JsonDeserializationContext var2, ILootCondition[] var3) {
      try {
         CompoundNBT var6 = Class7671.method25188(JSONUtils.method32763(var1, "tag"));
         return new Class136(var3, var6);
      } catch (CommandSyntaxException var7) {
         throw new JsonSyntaxException(var7.getMessage());
      }
   }
}
