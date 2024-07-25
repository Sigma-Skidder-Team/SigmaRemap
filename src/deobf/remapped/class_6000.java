package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class class_6000 {
   public static final class_6000 field_30559 = new class_6000((CompoundNBT)null);
   private final CompoundNBT field_30561;

   public class_6000(CompoundNBT var1) {
      this.field_30561 = var1;
   }

   public boolean method_27391(ItemStack var1) {
      return this != field_30559 ? this.method_27393(var1.method_27990()) : true;
   }

   public boolean method_27392(Entity var1) {
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
         CompoundNBT var3;
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

   public static CompoundNBT method_27394(Entity var0) {
      CompoundNBT var3 = var0.method_37258(new CompoundNBT());
      if (var0 instanceof PlayerEntity) {
         ItemStack var4 = ((PlayerEntity)var0).inventory.method_32403();
         if (!var4.method_28022()) {
            var3.put("SelectedItem", var4.method_27998(new CompoundNBT()));
         }
      }

      return var3;
   }
}
