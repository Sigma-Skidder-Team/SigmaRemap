package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.util.JSONUtils;

public class Class4932 implements ILootSerializer<Class156> {
   public void serialize(JsonObject var1, Class156 var2, JsonSerializationContext var3) {
      var1.addProperty("period", Class156.method473(var2));
      var1.add("value", var3.serialize(Class156.method474(var2)));
   }

   public Class156 method15248(JsonObject var1, JsonDeserializationContext var2) {
      Long var5 = !var1.has("period") ? null : JSONUtils.method32774(var1, "period");
      Class6872 var6 = JSONUtils.<Class6872>method32788(var1, "value", var2, Class6872.class);
      return new Class156(var5, var6);
   }
}
