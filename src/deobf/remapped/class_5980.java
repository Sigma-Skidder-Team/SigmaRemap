package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class class_5980 implements Supplier<JsonElement> {
   private final List<class_265> field_30482;

   private class_5980(List<class_265> var1) {
      this.field_30482 = var1;
   }

   public void method_27286(class_8021<?, ?> var1) {
   }

   public void method_27287(JsonObject var1) {
   }

   public JsonElement get() {
      JsonObject var3 = new JsonObject();
      this.method_27287(var3);
      var3.add("apply", class_265.method_1152(this.field_30482));
      return var3;
   }
}
