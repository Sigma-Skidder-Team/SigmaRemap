package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class class_5816 {
   private final T field_29445;

   public class_5816(T var1, Object var2) {
      this.field_29443 = var1;
      this.field_29445 = (T)var2;
   }

   public void method_26329(JsonObject var1) {
      var1.add(class_6194.method_28328(this.field_29443), (JsonElement)class_6194.method_28330(this.field_29443).apply(this.field_29445));
   }

   @Override
   public String toString() {
      return class_6194.method_28328(this.field_29443) + "=" + this.field_29445;
   }
}
