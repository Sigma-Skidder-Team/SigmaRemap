package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class ExplosionDecaySerializer extends LootFunctionSerializer<Class144> {
   private static String[] field22843;

   public Class144 deserialize(JsonObject var1, JsonDeserializationContext var2, ILootCondition[] var3) {
      return new Class144(var3);
   }
}
