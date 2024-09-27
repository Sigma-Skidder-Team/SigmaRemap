package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.util.Map;

public class Class8605 {
   public static final Class8605 field38715 = new Class8605();
   public static final Class8605[] field38716 = new Class8605[0];
   private final Enchantment field38717;
   private final Class8840 field38718;

   public Class8605() {
      this.field38717 = null;
      this.field38718 = Class8840.field39936;
   }

   public Class8605(Enchantment var1, Class8840 var2) {
      this.field38717 = var1;
      this.field38718 = var2;
   }

   public boolean method30835(Map<Enchantment, Integer> var1) {
      if (this.field38717 == null) {
         if (this.field38718 != null) {
            for (Integer var5 : var1.values()) {
               if (this.field38718.method32015(var5)) {
                  return true;
               }
            }

            return false;
         }
      } else {
         if (!var1.containsKey(this.field38717)) {
            return false;
         }

         int var6 = (Integer)var1.get(this.field38717);
         if (this.field38718 != null && !this.field38718.method32015(var6)) {
            return false;
         }
      }

      return true;
   }

   public JsonElement method30836() {
      if (this != field38715) {
         JsonObject var3 = new JsonObject();
         if (this.field38717 != null) {
            var3.addProperty("enchantment", Registry.ENCHANTMENT.getKey(this.field38717).toString());
         }

         var3.add("levels", this.field38718.method32005());
         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }

   public static Class8605 method30837(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = JSONUtils.method32781(var0, "enchantment");
         Enchantment var4 = null;
         if (var3.has("enchantment")) {
            ResourceLocation var5 = new ResourceLocation(JSONUtils.getString(var3, "enchantment"));
            var4 = Registry.ENCHANTMENT.method9187(var5).orElseThrow(() -> new JsonSyntaxException("Unknown enchantment '" + var5 + "'"));
         }

         Class8840 var6 = Class8840.method32016(var3.get("levels"));
         return new Class8605(var4, var6);
      } else {
         return field38715;
      }
   }

   public static Class8605[] method30838(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonArray var3 = JSONUtils.method32784(var0, "enchantments");
         Class8605[] var4 = new Class8605[var3.size()];

         for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5] = method30837(var3.get(var5));
         }

         return var4;
      } else {
         return field38716;
      }
   }
}
