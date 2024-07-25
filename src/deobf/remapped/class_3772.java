package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class class_3772 extends class_7789<class_3098> {
   public void method_17454(JsonObject var1, class_3098 var2, JsonSerializationContext var3) {
      super.method_35344(var1, var2, var3);
      var1.add("limit", var3.serialize(class_3098.method_14181(var2)));
   }

   public class_3098 method_17455(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3) {
      class_595 var6 = class_6539.<class_595>method_29778(var1, "limit", var2, class_595.class);
      return new class_3098(var3, var6, null);
   }
}
