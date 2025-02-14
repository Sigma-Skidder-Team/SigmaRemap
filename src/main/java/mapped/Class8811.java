package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.JSONToNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.util.JSONUtils;

public class Class8811 {
   public static final Class8811 field39645 = new Class8811((CompoundNBT)null);
   private final CompoundNBT field39646;

   public Class8811(CompoundNBT var1) {
      this.field39646 = var1;
   }

   public boolean method31808(ItemStack var1) {
      return this != field39645 ? this.method31810(var1.getTag()) : true;
   }

   public boolean method31809(Entity var1) {
      return this != field39645 ? this.method31810(method31813(var1)) : true;
   }

   public boolean method31810(INBT var1) {
      return var1 == null ? this == field39645 : this.field39646 == null || NBTUtil.areNBTEquals(this.field39646, var1, true);
   }

   public JsonElement method31811() {
      return (JsonElement)(this != field39645 && this.field39646 != null ? new JsonPrimitive(this.field39646.toString()) : JsonNull.INSTANCE);
   }

   public static Class8811 method31812(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         CompoundNBT var3;
         try {
            var3 = JSONToNBT.getTagFromJson(JSONUtils.method32762(var0, "nbt"));
         } catch (CommandSyntaxException var5) {
            throw new JsonSyntaxException("Invalid nbt tag: " + var5.getMessage());
         }

         return new Class8811(var3);
      } else {
         return field39645;
      }
   }

   public static CompoundNBT method31813(Entity var0) {
      CompoundNBT var3 = var0.writeWithoutTypeId(new CompoundNBT());
      if (var0 instanceof PlayerEntity) {
         ItemStack var4 = ((PlayerEntity)var0).inventory.method4028();
         if (!var4.isEmpty()) {
            var3.put("SelectedItem", var4.method32112(new CompoundNBT()));
         }
      }

      return var3;
   }
}
