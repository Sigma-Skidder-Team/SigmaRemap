package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class class_6000 {
   public static final class_6000 field_30559 = new class_6000((class_5734)null);
   private final class_5734 field_30561;

   public class_6000(class_5734 var1) {
      this.field_30561 = var1;
   }

   public boolean method_27391(class_6098 var1) {
      return this != field_30559 ? this.method_27393(var1.method_27990()) : true;
   }

   public boolean method_27392(class_8145 var1) {
      return this != field_30559 ? this.method_27393(method_27394(var1)) : true;
   }

   public boolean method_27393(class_8406 var1) {
      return var1 == null ? this == field_30559 : this.field_30561 == null || class_4338.method_20182(this.field_30561, var1, true);
   }

   public JsonElement method_27396() {
      return (JsonElement)(this != field_30559 && this.field_30561 != null ? new JsonPrimitive(this.field_30561.toString()) : JsonNull.INSTANCE);
   }

   public static class_6000 method_27395(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         class_5734 var3;
         try {
            var3 = class_2392.method_10916(class_6539.method_29795(var0, "nbt"));
         } catch (CommandSyntaxException var5) {
            throw new JsonSyntaxException("Invalid nbt tag: " + var5.getMessage());
         }

         return new class_6000(var3);
      } else {
         return field_30559;
      }
   }

   public static class_5734 method_27394(class_8145 var0) {
      class_5734 var3 = var0.method_37258(new class_5734());
      if (var0 instanceof class_704) {
         class_6098 var4 = ((class_704)var0).field_3853.method_32403();
         if (!var4.method_28022()) {
            var3.method_25946("SelectedItem", var4.method_27998(new class_5734()));
         }
      }

      return var3;
   }
}
