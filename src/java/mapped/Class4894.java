package mapped;

import com.google.gson.JsonObject;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ResourceLocation;

public class Class4894 extends Class4874<Class4495> {
   private static final ResourceLocation field22728 = new ResourceLocation("cured_zombie_villager");

   @Override
   public ResourceLocation method15044() {
      return field22728;
   }

   public Class4495 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class9587 var6 = Class9587.method37223(var1, "zombie", var3);
      Class9587 var7 = Class9587.method37223(var1, "villager", var3);
      return new Class4495(var2, var6, var7);
   }

   public void method15121(ServerPlayerEntity var1, ZombieEntity var2, Class1042 var3) {
      LootContext var6 = Class6671.method20332(var1, var2);
      LootContext var7 = Class6671.method20332(var1, var3);
      this.method15053(var1, var2x -> var2x.method14175(var6, var7));
   }

   // $VF: synthetic method
   public static ResourceLocation method15123() {
      return field22728;
   }
}
