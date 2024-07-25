package remapped;

import com.google.gson.JsonObject;

public class class_3750 extends class_6150 {
   public class_3750() {
      super("1.14", "1.15", true);
   }

   @Override
   public class_1392 method_28218(JsonObject var1, JsonObject var2, JsonObject var3, String var4) {
      return var4.equals("sounds") ? new class_1392(var1.getAsJsonArray(var4), var2.getAsJsonArray(var4), false) : super.method_28218(var1, var2, var3, var4);
   }
}
