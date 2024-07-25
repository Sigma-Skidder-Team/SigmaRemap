package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class class_5640 {
   public static final class_5640 field_28605 = new class_5640(false);
   private boolean field_28603;

   private class_5640(boolean var1) {
      this.field_28603 = var1;
   }

   public static class_5640 method_25536(boolean var0) {
      return new class_5640(var0);
   }

   public static class_5640 method_25537(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = class_6539.method_29782(var0, "fishing_hook");
         JsonElement var4 = var3.get("in_open_water");
         return var4 == null ? field_28605 : new class_5640(class_6539.method_29770(var4, "in_open_water"));
      } else {
         return field_28605;
      }
   }

   public JsonElement method_25538() {
      if (this != field_28605) {
         JsonObject var3 = new JsonObject();
         var3.add("in_open_water", new JsonPrimitive(this.field_28603));
         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }

   public boolean method_25539(class_8145 var1) {
      if (this != field_28605) {
         if (var1 instanceof class_3942) {
            class_3942 var4 = (class_3942)var1;
            return this.field_28603 == var4.method_18215();
         } else {
            return false;
         }
      } else {
         return true;
      }
   }
}
