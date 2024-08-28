package mapped;

import com.google.gson.JsonObject;

public class Class4909 extends Class4874<Class4480> {
   private static final ResourceLocation field22742 = new ResourceLocation("entity_hurt_player");

   @Override
   public ResourceLocation method15044() {
      return field22742;
   }

   public Class4480 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class9404 var6 = Class9404.method35780(var1.get("damage"));
      return new Class4480(var2, var6);
   }

   public void method15165(ServerPlayerEntity var1, Class8654 var2, float var3, float var4, boolean var5) {
      this.method15053(var1, var5x -> var5x.method14142(var1, var2, var3, var4, var5));
   }

   // $VF: synthetic method
   public static ResourceLocation method15167() {
      return field22742;
   }
}
