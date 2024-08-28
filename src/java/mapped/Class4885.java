package mapped;

import com.google.gson.JsonObject;

public class Class4885 extends Class4874<Class4469> {
   private static final ResourceLocation field22719 = new ResourceLocation("player_hurt_entity");

   @Override
   public ResourceLocation method15044() {
      return field22719;
   }

   public Class4469 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class9404 var6 = Class9404.method35780(var1.get("damage"));
      Class9587 var7 = Class9587.method37223(var1, "entity", var3);
      return new Class4469(var2, var6, var7);
   }

   public void method15093(ServerPlayerEntity var1, Entity var2, Class8654 var3, float var4, float var5, boolean var6) {
      LootContext var9 = Class6671.method20332(var1, var2);
      this.method15053(var1, var6x -> var6x.method14121(var1, var9, var3, var4, var5, var6));
   }

   // $VF: synthetic method
   public static ResourceLocation method15095() {
      return field22719;
   }
}
