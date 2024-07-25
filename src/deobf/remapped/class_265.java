package remapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class class_265 implements Supplier<JsonElement> {
   private final Map<class_6194<?>, class_6194<?>.Field> field_938 = Maps.newLinkedHashMap();

   public <T> class_265 method_1151(class_6194<T> var1, T var2) {
      class_5816 var5 = (class_5816)this.field_938.put(var1, var1.method_28327(var2));
      if (var5 == null) {
         return this;
      } else {
         throw new IllegalStateException("Replacing value of " + var5 + " with " + var2);
      }
   }

   public static class_265 method_1150() {
      return new class_265();
   }

   public static class_265 method_1154(class_265 var0, class_265 var1) {
      class_265 var4 = new class_265();
      var4.field_938.putAll(var0.field_938);
      var4.field_938.putAll(var1.field_938);
      return var4;
   }

   public JsonElement get() {
      JsonObject var3 = new JsonObject();
      this.field_938.values().forEach(var1 -> var1.method_26329(var3));
      return var3;
   }

   public static JsonElement method_1152(List<class_265> var0) {
      if (var0.size() != 1) {
         JsonArray var3 = new JsonArray();
         var0.forEach(var1 -> var3.add(var1.get()));
         return var3;
      } else {
         return ((class_265)var0.get(0)).get();
      }
   }
}
