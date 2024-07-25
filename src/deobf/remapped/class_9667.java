package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class class_9667 implements class_6478<class_5458> {
   public void method_44706(JsonObject var1, class_5458 var2, JsonSerializationContext var3) {
      var1.addProperty("chance", class_5458.method_24850(var2));
      var1.addProperty("looting_multiplier", class_5458.method_24847(var2));
   }

   public class_5458 method_44707(JsonObject var1, JsonDeserializationContext var2) {
      return new class_5458(class_6539.method_29774(var1, "chance"), class_6539.method_29774(var1, "looting_multiplier"), null);
   }
}
