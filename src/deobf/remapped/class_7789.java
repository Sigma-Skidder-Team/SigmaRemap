package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import org.apache.commons.lang3.ArrayUtils;

public abstract class class_7789<T extends class_5837> implements class_6478<T> {
   public void method_35344(JsonObject var1, T var2, JsonSerializationContext var3) {
      if (!ArrayUtils.isEmpty(var2.field_29682)) {
         var1.add("conditions", var3.serialize(var2.field_29682));
      }
   }

   public final T method_35346(JsonObject var1, JsonDeserializationContext var2) {
      class_7279[] var5 = class_6539.<class_7279[]>method_29779(var1, "conditions", new class_7279[0], var2, class_7279[].class);
      return this.method_35347(var1, var2, var5);
   }

   public abstract T method_35347(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3);
}
