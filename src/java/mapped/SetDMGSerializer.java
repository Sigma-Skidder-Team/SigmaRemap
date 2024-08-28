package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class SetDMGSerializer extends LootFunctionSerializer<Class145> {
   public void serialize(JsonObject var1, Class145 var2, JsonSerializationContext var3) {
      super.serialize(var1, var2, var3);
      var1.add("damage", var3.serialize(Class145.method445(var2)));
   }

   public Class145 deserialize(JsonObject var1, JsonDeserializationContext var2, ILootCondition[] var3) {
      return new Class145(var3, JSONUtils.<Class6872>method32788(var1, "damage", var2, Class6872.class));
   }
}
