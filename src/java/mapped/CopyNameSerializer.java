package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class CopyNameSerializer extends LootFunctionSerializer<Class139> {
   public void serialize(JsonObject var1, Class139 var2, JsonSerializationContext var3) {
      super.serialize(var1, var2, var3);
      var1.addProperty("source", Class139.method419(var2).field14000);
   }

   public Class139 deserialize(JsonObject var1, JsonDeserializationContext var2, ILootCondition[] var3) {
      Class2138 var6 = Class2138.method8831(JSONUtils.getString(var1, "source"));
      return new Class139(var3, var6);
   }
}
