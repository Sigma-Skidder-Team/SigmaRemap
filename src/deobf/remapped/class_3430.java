package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class class_3430 implements class_6478<class_5310> {
   public void method_15855(JsonObject var1, class_5310 var2, JsonSerializationContext var3) {
      var1.add("predicate", class_5310.method_24241(var2).method_40297());
   }

   public class_5310 method_15857(JsonObject var1, JsonDeserializationContext var2) {
      class_8772 var5 = class_8772.method_40298(var1.get("predicate"));
      return new class_5310(var5, null);
   }
}
