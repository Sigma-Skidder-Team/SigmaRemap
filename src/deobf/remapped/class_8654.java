package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class class_8654 implements class_6478<class_4279> {
   public void method_39672(JsonObject var1, class_4279 var2, JsonSerializationContext var3) {
      var1.addProperty("period", class_4279.method_19885(var2));
      var1.add("value", var3.serialize(class_4279.method_19884(var2)));
   }

   public class_4279 method_39673(JsonObject var1, JsonDeserializationContext var2) {
      Long var5 = !var1.has("period") ? null : class_6539.method_29790(var1, "period");
      class_7986 var6 = class_6539.<class_7986>method_29778(var1, "value", var2, class_7986.class);
      return new class_4279(var5, var6, null);
   }
}
