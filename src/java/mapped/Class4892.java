package mapped;

import com.google.gson.JsonObject;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ResourceLocation;

public class Class4892 extends Class4874<Class4460> {
   private static final ResourceLocation field22726 = new ResourceLocation("tame_animal");

   @Override
   public ResourceLocation method15044() {
      return field22726;
   }

   public Class4460 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class9587 var6 = Class9587.method37223(var1, "entity", var3);
      return new Class4460(var2, var6);
   }

   public void method15115(ServerPlayerEntity var1, Class1018 var2) {
      LootContext var5 = Class6671.method20332(var1, var2);
      this.method15053(var1, var1x -> var1x.method14101(var5));
   }

   // $VF: synthetic method
   public static ResourceLocation method15117() {
      return field22726;
   }
}
