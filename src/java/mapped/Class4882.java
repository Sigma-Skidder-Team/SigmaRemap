package mapped;

import com.google.gson.JsonObject;

public class Class4882 extends Class4874<Class4459> {
   private static final ResourceLocation field22716 = new ResourceLocation("effects_changed");

   @Override
   public ResourceLocation method15044() {
      return field22716;
   }

   public Class4459 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class9415 var6 = Class9415.method36124(var1.get("effects"));
      return new Class4459(var2, var6);
   }

   public void method15083(ServerPlayerEntity var1) {
      this.method15053(var1, var1x -> var1x.method14098(var1));
   }

   // $VF: synthetic method
   public static ResourceLocation method15085() {
      return field22716;
   }
}
