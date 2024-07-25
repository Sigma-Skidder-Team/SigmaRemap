package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class class_2863 implements class_6478<class_7273> {
   public void method_13112(JsonObject var1, class_7273 var2, JsonSerializationContext var3) {
      var1.add("term", var3.serialize(class_7273.method_33246(var2)));
   }

   public class_7273 method_13113(JsonObject var1, JsonDeserializationContext var2) {
      class_7279 var5 = class_6539.<class_7279>method_29778(var1, "term", var2, class_7279.class);
      return new class_7273(var5, null);
   }
}
