package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class class_7578 implements class_6478<class_3514> {
   public void method_34435(JsonObject var1, class_3514 var2, JsonSerializationContext var3) {
      var1.add("terms", var3.serialize(class_3514.method_16191(var2)));
   }

   public class_3514 method_34436(JsonObject var1, JsonDeserializationContext var2) {
      class_7279[] var5 = class_6539.<class_7279[]>method_29778(var1, "terms", var2, class_7279[].class);
      return new class_3514(var5, null);
   }
}
