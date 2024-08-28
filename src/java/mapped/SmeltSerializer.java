package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class SmeltSerializer extends LootFunctionSerializer<Class131> {
   private static String[] field22844;

   public Class131 deserialize(JsonObject var1, JsonDeserializationContext var2, ILootCondition[] var3) {
      return new Class131(var3);
   }
}
