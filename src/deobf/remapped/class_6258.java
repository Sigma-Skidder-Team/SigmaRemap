package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class class_6258 extends class_7746<class_2422> {
   public void method_28559(JsonObject var1, class_2422 var2, JsonSerializationContext var3) {
      super.method_35073(var1, var2, var3);
      var1.addProperty("name", class_2422.method_11045(var2).toString());
   }

   public class_2422 method_28558(JsonObject var1, JsonDeserializationContext var2, int var3, int var4, class_7279[] var5, class_2913[] var6) {
      class_4639 var9 = new class_4639(class_6539.method_29796(var1, "name"));
      return new class_2422(var9, var3, var4, var5, var6, null);
   }
}
