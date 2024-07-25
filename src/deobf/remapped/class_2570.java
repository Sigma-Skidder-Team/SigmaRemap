package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import org.apache.commons.lang3.ArrayUtils;

public abstract class class_2570<T extends class_3765> implements class_6478<T> {
   public final void method_11684(JsonObject var1, T var2, JsonSerializationContext var3) {
      if (!ArrayUtils.isEmpty(var2.field_18417)) {
         var1.add("conditions", var3.serialize(var2.field_18417));
      }

      this.method_11688(var1, (T)var2, var3);
   }

   public final T method_11686(JsonObject var1, JsonDeserializationContext var2) {
      class_7279[] var5 = class_6539.<class_7279[]>method_29779(var1, "conditions", new class_7279[0], var2, class_7279[].class);
      return this.method_11687(var1, var2, var5);
   }

   public abstract void method_11688(JsonObject var1, T var2, JsonSerializationContext var3);

   public abstract T method_11687(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3);
}
