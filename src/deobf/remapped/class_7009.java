package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class class_7009 extends class_6411 {
   private static String[] field_35943;
   private final class_6629<?> field_35944;

   public class_7009(class_6629<?> var1) {
      this.field_35944 = var1;
   }

   @Override
   public boolean method_29249(class_6629<?> var1) {
      return this.field_35944 == var1;
   }

   @Override
   public JsonElement method_29250() {
      return new JsonPrimitive(class_8669.field_44400.method_39797(this.field_35944).toString());
   }
}
