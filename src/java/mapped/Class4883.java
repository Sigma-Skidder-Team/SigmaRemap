package mapped;

import com.google.gson.JsonObject;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class Class4883 extends Class4874<Class4491> {
   private static final ResourceLocation field22717 = new ResourceLocation("inventory_changed");

   @Override
   public ResourceLocation method15044() {
      return field22717;
   }

   public Class4491 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      JsonObject var6 = JSONUtils.getJsonObject(var1, "slots", new JsonObject());
      Class8840 var7 = Class8840.method32016(var6.get("occupied"));
      Class8840 var8 = Class8840.method32016(var6.get("full"));
      Class8840 var9 = Class8840.method32016(var6.get("empty"));
      Class8634[] var10 = Class8634.method31019(var1.get("items"));
      return new Class4491(var2, var7, var8, var9, var10);
   }

   public void method15086(ServerPlayerEntity var1, PlayerInventory var2, ItemStack var3) {
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      for (int var9 = 0; var9 < var2.getSizeInventory(); var9++) {
         ItemStack var10 = var2.getStackInSlot(var9);
         if (!var10.isEmpty()) {
            var8++;
            if (var10.getCount() >= var10.method32113()) {
               var6++;
            }
         } else {
            var7++;
         }
      }

      this.method15087(var1, var2, var3, var6, var7, var8);
   }

   private void method15087(ServerPlayerEntity var1, PlayerInventory var2, ItemStack var3, int var4, int var5, int var6) {
      this.method15053(var1, var5x -> var5x.method14165(var2, var3, var4, var5, var6));
   }

   // $VF: synthetic method
   public static ResourceLocation method15089() {
      return field22717;
   }
}
