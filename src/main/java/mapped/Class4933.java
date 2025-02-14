package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.util.JSONUtils;

public class Class4933 implements ILootSerializer<Class123> {
   public void serialize(JsonObject var1, Class123 var2, JsonSerializationContext var3) {
      var1.add("predicate", Class123.method361(var2).method20331());
      var1.add("entity", var3.serialize(Class123.method362(var2)));
   }

   public Class123 method15248(JsonObject var1, JsonDeserializationContext var2) {
      Class6671 var5 = Class6671.method20330(var1.get("predicate"));
      return new Class123(var5, JSONUtils.<Class2063>method32788(var1, "entity", var2, Class2063.class));
   }
}
