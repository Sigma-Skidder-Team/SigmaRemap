package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class class_164 implements class_4334 {
   private static String[] field_496;
   private final boolean field_495;

   public class_164(boolean var1) {
      this.field_495 = var1;
   }

   @Override
   public JsonElement method_20160() {
      return new JsonPrimitive(this.field_495);
   }

   public boolean test(class_3604 var1) {
      return var1.method_16811() == this.field_495;
   }
}
