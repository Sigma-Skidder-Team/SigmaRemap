package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class Class4951 implements ILootSerializer<Class159> {
   public void serialize(JsonObject var1, Class159 var2, JsonSerializationContext var3) {
      var1.add("predicate", Class159.method482(var2).method31018());
   }

   public Class159 method15248(JsonObject var1, JsonDeserializationContext var2) {
      Class8634 var5 = Class8634.method31017(var1.get("predicate"));
      return new Class159(var5);
   }
}
