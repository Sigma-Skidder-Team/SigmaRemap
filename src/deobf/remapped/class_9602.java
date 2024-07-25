package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class class_9602 extends class_7789<class_6520> {
   public void method_44356(JsonObject var1, class_6520 var2, JsonSerializationContext var3) {
      super.method_35344(var1, var2, var3);
      var1.add("count", class_7820.method_35420(class_6520.method_29698(var2), var3));
   }

   public class_6520 method_44357(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3) {
      class_3254 var6 = class_7820.method_35418(var1.get("count"), var2);
      return new class_6520(var3, var6, null);
   }
}
