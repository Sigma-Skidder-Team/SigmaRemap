package mapped;

import com.google.gson.JsonObject;
import net.minecraft.entity.Entity;

public class Class4906 extends Class4874<Class4473> {
   private static final ResourceLocation field22740 = new ResourceLocation("target_hit");

   @Override
   public ResourceLocation method15044() {
      return field22740;
   }

   public Class4473 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class8840 var6 = Class8840.method32016(var1.get("signal_strength"));
      Class9587 var7 = Class9587.method37223(var1, "projectile", var3);
      return new Class4473(var2, var6, var7);
   }

   public void method15161(ServerPlayerEntity var1, Entity var2, Vector3d var3, int var4) {
      LootContext var7 = Class6671.method20332(var1, var2);
      this.method15053(var1, var3x -> var3x.method14129(var7, var3, var4));
   }

   // $VF: synthetic method
   public static ResourceLocation method15163() {
      return field22740;
   }
}
