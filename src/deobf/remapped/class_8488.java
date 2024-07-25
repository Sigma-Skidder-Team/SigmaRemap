package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class class_8488 extends class_7789<class_4360> {
   public void method_39125(JsonObject var1, class_4360 var2, JsonSerializationContext var3) {
      super.method_35344(var1, var2, var3);
      var1.add("levels", class_7820.method_35420(class_4360.method_20229(var2), var3));
      var1.addProperty("treasure", class_4360.method_20230(var2));
   }

   public class_4360 method_39126(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3) {
      class_3254 var6 = class_7820.method_35418(var1.get("levels"), var2);
      boolean var7 = class_6539.method_29772(var1, "treasure", false);
      return new class_4360(var3, var6, var7, null);
   }
}
