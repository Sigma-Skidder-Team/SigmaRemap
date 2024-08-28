package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class Class4953 implements ILootSerializer<Class152> {
   public void serialize(JsonObject var1, Class152 var2, JsonSerializationContext var3) {
      var1.add("term", var3.serialize(Class152.method461(var2)));
   }

   public Class152 method15248(JsonObject var1, JsonDeserializationContext var2) {
      ILootCondition var5 = JSONUtils.<ILootCondition>method32788(var1, "term", var2, ILootCondition.class);
      return new Class152(var5);
   }
}
