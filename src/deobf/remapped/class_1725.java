package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class class_1725 extends class_7789<class_6579> {
   public void method_7723(JsonObject var1, class_6579 var2, JsonSerializationContext var3) {
      super.method_35344(var1, var2, var3);
      var1.addProperty("source", class_6579.method_30076(var2).field_48908);
   }

   public class_6579 method_7724(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3) {
      class_9597 var6 = class_9597.method_44318(class_6539.method_29796(var1, "source"));
      return new class_6579(var3, var6, null);
   }
}
