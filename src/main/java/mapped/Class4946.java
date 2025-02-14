package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class Class4946 implements ILootSerializer<Class153> {
   public void serialize(JsonObject var1, Class153 var2, JsonSerializationContext var3) {
      var1.add("predicate", Class153.method464(var2).method36915());
   }

   public Class153 method15248(JsonObject var1, JsonDeserializationContext var2) {
      Class9539 var5 = Class9539.method36913(var1.get("predicate"));
      return new Class153(var5);
   }
}
