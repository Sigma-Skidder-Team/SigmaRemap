package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class class_316 implements class_6478<class_2338> {
   public void method_1468(JsonObject var1, class_2338 var2, JsonSerializationContext var3) {
      var1.add("predicate", class_2338.method_10705(var2).method_3735());
      var1.add("entity", var3.serialize(class_2338.method_10703(var2)));
   }

   public class_2338 method_1470(JsonObject var1, JsonDeserializationContext var2) {
      class_865 var5 = class_865.method_3740(var1.get("predicate"));
      return new class_2338(var5, class_6539.<class_5848>method_29778(var1, "entity", var2, class_5848.class), null);
   }
}
