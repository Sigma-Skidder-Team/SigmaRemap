package mapped;

import com.google.gson.JsonObject;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;

public class Class4890 extends Class4874<Class4483> {
   private static final ResourceLocation field22724 = new ResourceLocation("player_generates_container_loot");

   @Override
   public ResourceLocation method15044() {
      return field22724;
   }

   public Class4483 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      ResourceLocation var6 = new ResourceLocation(JSONUtils.getString(var1, "loot_table"));
      return new Class4483(var2, var6);
   }

   public void method15109(ServerPlayerEntity var1, ResourceLocation var2) {
      this.method15053(var1, var1x -> var1x.method14148(var2));
   }

   // $VF: synthetic method
   public static ResourceLocation method15111() {
      return field22724;
   }
}
