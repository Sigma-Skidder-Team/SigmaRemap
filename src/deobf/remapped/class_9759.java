package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public final class class_9759 extends class_2570<T> {
   public class_9759(class_5696 var1) {
      this.field_49566 = var1;
   }

   public void method_45039(JsonObject var1, T var2, JsonSerializationContext var3) {
      var1.add("children", var3.serialize(var2.field_19559));
   }

   public final T method_45038(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3) {
      class_3765[] var6 = class_6539.<class_3765[]>method_29778(var1, "children", var2, class_3765[].class);
      return (T)this.field_49566.method_25771(var6, var3);
   }
}
