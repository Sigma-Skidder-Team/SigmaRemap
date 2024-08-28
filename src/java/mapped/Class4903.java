package mapped;

import com.google.gson.JsonObject;

public class Class4903 extends Class4874<Class4490> {
   private static final ResourceLocation field22737 = new ResourceLocation("filled_bucket");

   @Override
   public ResourceLocation method15044() {
      return field22737;
   }

   public Class4490 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class8634 var6 = Class8634.method31017(var1.get("item"));
      return new Class4490(var2, var6);
   }

   public void method15152(ServerPlayerEntity var1, ItemStack var2) {
      this.method15053(var1, var1x -> var1x.method14162(var2));
   }

   // $VF: synthetic method
   public static ResourceLocation method15154() {
      return field22737;
   }
}
