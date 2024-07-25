package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import org.apache.commons.lang3.ArrayUtils;

public abstract class class_7746<T extends class_8457> extends class_2570<T> {
   public void method_35073(JsonObject var1, T var2, JsonSerializationContext var3) {
      if (var2.field_43233 != 1) {
         var1.addProperty("weight", var2.field_43233);
      }

      if (var2.field_43234 != 0) {
         var1.addProperty("quality", var2.field_43234);
      }

      if (!ArrayUtils.isEmpty(var2.field_43236)) {
         var1.add("functions", var3.serialize(var2.field_43236));
      }
   }

   public final T method_35072(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3) {
      int var6 = class_6539.method_29768(var1, "weight", 1);
      int var7 = class_6539.method_29768(var1, "quality", 0);
      class_2913[] var8 = class_6539.<class_2913[]>method_29779(var1, "functions", new class_2913[0], var2, class_2913[].class);
      return this.method_35071(var1, var2, var6, var7, var3, var8);
   }

   public abstract T method_35071(JsonObject var1, JsonDeserializationContext var2, int var3, int var4, class_7279[] var5, class_2913[] var6);
}
