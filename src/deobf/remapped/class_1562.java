package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class class_1562 {
   public static final class_1562 field_8232 = new class_1562(class_7781.field_39439);
   private final class_7781 field_8234;

   private class_1562(class_7781 var1) {
      this.field_8234 = var1;
   }

   public boolean method_7073(class_6331 var1, class_1331 var2) {
      if (this != field_8232) {
         return var1.method_29585(var2) ? this.field_8234.method_35307(var1.method_22573(var2)) : false;
      } else {
         return true;
      }
   }

   public JsonElement method_7074() {
      if (this != field_8232) {
         JsonObject var3 = new JsonObject();
         var3.add("light", this.field_8234.method_27853());
         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }

   public static class_1562 method_7071(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = class_6539.method_29782(var0, "light");
         class_7781 var4 = class_7781.method_35310(var3.get("light"));
         return new class_1562(var4);
      } else {
         return field_8232;
      }
   }
}
