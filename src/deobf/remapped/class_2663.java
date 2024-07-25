package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class class_2663 extends class_7789<class_2298> {
   public void method_12019(JsonObject var1, class_2298 var2, JsonSerializationContext var3) {
      super.method_35344(var1, var2, var3);
      var1.add("damage", var3.serialize(class_2298.method_10569(var2)));
   }

   public class_2298 method_12020(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3) {
      return new class_2298(var3, class_6539.<class_7986>method_29778(var1, "damage", var2, class_7986.class), null);
   }
}
