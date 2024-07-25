package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Map;

public class class_5187 {
   public static final class_5187 field_26688 = new class_5187();
   public static final class_5187[] field_26690 = new class_5187[0];
   private final class_4382 field_26687;
   private final class_7781 field_26689;

   public class_5187() {
      this.field_26687 = null;
      this.field_26689 = class_7781.field_39439;
   }

   public class_5187(class_4382 var1, class_7781 var2) {
      this.field_26687 = var1;
      this.field_26689 = var2;
   }

   public boolean method_23823(Map<class_4382, Integer> var1) {
      if (this.field_26687 == null) {
         if (this.field_26689 != null) {
            for (Integer var5 : var1.values()) {
               if (this.field_26689.method_35307(var5)) {
                  return true;
               }
            }

            return false;
         }
      } else {
         if (!var1.containsKey(this.field_26687)) {
            return false;
         }

         int var6 = (Integer)var1.get(this.field_26687);
         if (this.field_26689 != null && !this.field_26689.method_35307(var6)) {
            return false;
         }
      }

      return true;
   }

   public JsonElement method_23821() {
      if (this != field_26688) {
         JsonObject var3 = new JsonObject();
         if (this.field_26687 != null) {
            var3.addProperty("enchantment", class_8669.field_44445.method_39797(this.field_26687).toString());
         }

         var3.add("levels", this.field_26689.method_27853());
         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }

   public static class_5187 method_23822(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = class_6539.method_29782(var0, "enchantment");
         class_4382 var4 = null;
         if (var3.has("enchantment")) {
            class_4639 var5 = new class_4639(class_6539.method_29796(var3, "enchantment"));
            var4 = class_8669.field_44445.method_39794(var5).orElseThrow(() -> new JsonSyntaxException("Unknown enchantment '" + var5 + "'"));
         }

         class_7781 var6 = class_7781.method_35310(var3.get("levels"));
         return new class_5187(var4, var6);
      } else {
         return field_26688;
      }
   }

   public static class_5187[] method_23824(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonArray var3 = class_6539.method_29786(var0, "enchantments");
         class_5187[] var4 = new class_5187[var3.size()];

         for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5] = method_23822(var3.get(var5));
         }

         return var4;
      } else {
         return field_26690;
      }
   }
}
