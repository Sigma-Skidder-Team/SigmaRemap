package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class class_1228 extends class_7746<class_3399> {
   public void method_5471(JsonObject var1, class_3399 var2, JsonSerializationContext var3) {
      super.method_35073(var1, var2, var3);
      class_4639 var6 = class_8669.field_44382.method_39797(class_3399.method_15700(var2));
      if (var6 != null) {
         var1.addProperty("name", var6.toString());
      } else {
         throw new IllegalArgumentException("Can't serialize unknown item " + class_3399.method_15700(var2));
      }
   }

   public class_3399 method_5470(JsonObject var1, JsonDeserializationContext var2, int var3, int var4, class_7279[] var5, class_2913[] var6) {
      class_2451 var9 = class_6539.method_29781(var1, "name");
      return new class_3399(var9, var3, var4, var5, var6, null);
   }
}
