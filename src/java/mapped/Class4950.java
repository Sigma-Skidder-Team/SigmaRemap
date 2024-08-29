package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class Class4950 implements ILootSerializer<Class155> {
   public void serialize(JsonObject var1, Class155 var2, JsonSerializationContext var3) {
      var1.add("predicate", Class155.method471(var2).method30652());
      if (Class155.method472(var2).getX() != 0) {
         var1.addProperty("offsetX", Class155.method472(var2).getX());
      }

      if (Class155.method472(var2).getY() != 0) {
         var1.addProperty("offsetY", Class155.method472(var2).getY());
      }

      if (Class155.method472(var2).getZ() != 0) {
         var1.addProperty("offsetZ", Class155.method472(var2).getZ());
      }
   }

   public Class155 method15248(JsonObject var1, JsonDeserializationContext var2) {
      Class8576 var5 = Class8576.method30653(var1.get("predicate"));
      int var6 = JSONUtils.getInt(var1, "offsetX", 0);
      int var7 = JSONUtils.getInt(var1, "offsetY", 0);
      int var8 = JSONUtils.getInt(var1, "offsetZ", 0);
      return new Class155(var5, new BlockPos(var6, var7, var8));
   }
}
