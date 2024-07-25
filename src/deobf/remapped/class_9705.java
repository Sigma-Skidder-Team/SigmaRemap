package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class class_9705 implements class_6478<class_5328> {
   public void method_44842(JsonObject var1, class_5328 var2, JsonSerializationContext var3) {
      var1.add("predicate", class_5328.method_24285(var2).method_24265());
   }

   public class_5328 method_44843(JsonObject var1, JsonDeserializationContext var2) {
      class_5319 var5 = class_5319.method_24267(var1.get("predicate"));
      return new class_5328(var5);
   }
}
