package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class class_8118 extends class_6411 {
   private final class_2307<class_6629<?>> field_41610;

   public class_8118(class_2307<class_6629<?>> var1) {
      this.field_41610 = var1;
   }

   @Override
   public boolean method_29249(class_6629<?> var1) {
      return this.field_41610.method_10609(var1);
   }

   @Override
   public JsonElement method_29250() {
      return new JsonPrimitive("#" + class_8410.method_38721().method_29389().method_43147(this.field_41610));
   }
}
