package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class FillPlayerheadSerializer extends LootFunctionSerializer<Class147> {
   public void serialize(JsonObject var1, Class147 var2, JsonSerializationContext var3) {
      super.serialize(var1, var2, var3);
      var1.add("entity", var3.serialize(Class147.method450(var2)));
   }

   public Class147 deserialize(JsonObject var1, JsonDeserializationContext var2, ILootCondition[] var3) {
      Class2063 var6 = JSONUtils.<Class2063>method32788(var1, "entity", var2, Class2063.class);
      return new Class147(var3, var6);
   }
}
