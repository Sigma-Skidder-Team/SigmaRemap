package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class class_1444 implements class_6478<class_6332> {
   public void method_6619(JsonObject var1, class_6332 var2, JsonSerializationContext var3) {
      var1.addProperty("chance", class_6332.method_29004(var2));
   }

   public class_6332 method_6620(JsonObject var1, JsonDeserializationContext var2) {
      return new class_6332(class_6539.method_29774(var1, "chance"), null);
   }
}
