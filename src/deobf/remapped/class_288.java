package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Arrays;

public class class_288 extends class_7789<class_3148> {
   public void method_1271(JsonObject var1, class_3148 var2, JsonSerializationContext var3) {
      super.method_35344(var1, var2, var3);
      var1.add("entries", var3.serialize(class_3148.method_14542(var2)));
   }

   public class_3148 method_1272(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3) {
      class_3765[] var6 = class_6539.<class_3765[]>method_29778(var1, "entries", var2, class_3765[].class);
      return new class_3148(var3, Arrays.<class_3765>asList(var6), null);
   }
}
