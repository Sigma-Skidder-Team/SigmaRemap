package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class class_3392 extends class_7789<class_660> {
   public void method_15681(JsonObject var1, class_660 var2, JsonSerializationContext var3) {
      super.method_35344(var1, var2, var3);
      var1.add("count", var3.serialize(class_660.method_3015(var2)));
      if (class_660.method_3016(var2)) {
         var1.add("limit", var3.serialize(class_660.method_3017(var2)));
      }
   }

   public class_660 method_15682(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3) {
      int var6 = class_6539.method_29768(var1, "limit", 0);
      return new class_660(var3, class_6539.<class_7986>method_29778(var1, "count", var2, class_7986.class), var6, null);
   }
}
