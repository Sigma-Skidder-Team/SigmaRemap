package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class class_3344 extends class_7789<class_8456> {
   public void method_15341(JsonObject var1, class_8456 var2, JsonSerializationContext var3) {
      super.method_35344(var1, var2, var3);
      var1.add("entity", var3.serialize(class_8456.method_38894(var2)));
   }

   public class_8456 method_15342(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3) {
      class_5848 var6 = class_6539.<class_5848>method_29778(var1, "entity", var2, class_5848.class);
      return new class_8456(var3, var6);
   }
}
