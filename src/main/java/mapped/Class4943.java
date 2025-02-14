package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.util.JSONUtils;

public class Class4943 implements ILootSerializer<Class124> {
   public void serialize(JsonObject var1, Class124 var2, JsonSerializationContext var3) {
      var1.addProperty("chance", Class124.method365(var2));
      var1.addProperty("looting_multiplier", Class124.method366(var2));
   }

   public Class124 method15248(JsonObject var1, JsonDeserializationContext var2) {
      return new Class124(JSONUtils.method32771(var1, "chance"), JSONUtils.method32771(var1, "looting_multiplier"));
   }
}
