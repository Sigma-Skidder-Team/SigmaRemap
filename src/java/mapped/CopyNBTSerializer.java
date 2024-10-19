package mapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.util.JSONUtils;

import java.util.ArrayList;

public class CopyNBTSerializer extends LootFunctionSerializer<Class142> {
   public void serialize(JsonObject var1, Class142 var2, JsonSerializationContext var3) {
      super.serialize(var1, var2, var3);
      var1.addProperty("source", Class142.method435(var2).field16022);
      JsonArray var6 = new JsonArray();
      Class142.method436(var2).stream().map(Class9603::method37314).forEach(var6::add);
      var1.add("ops", var6);
   }

   public Class142 deserialize(JsonObject var1, JsonDeserializationContext var2, ILootCondition[] var3) {
      Class2343 var6 = Class2343.method9119(JSONUtils.getString(var1, "source"));
      ArrayList var7 = Lists.newArrayList();

      for (JsonElement var9 : JSONUtils.method32785(var1, "ops")) {
         JsonObject var10 = JSONUtils.getJSONObject(var9, "op");
         var7.add(Class9603.method37315(var10));
      }

      return new Class142(var3, var6, var7);
   }
}
