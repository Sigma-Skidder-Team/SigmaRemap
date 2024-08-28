package mapped;

import com.google.gson.JsonObject;

public class Class4896 extends Class4874<Class4494> {
   private static final ResourceLocation field22730 = new ResourceLocation("player_interacted_with_entity");

   @Override
   public ResourceLocation method15044() {
      return field22730;
   }

   public Class4494 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class8634 var6 = Class8634.method31017(var1.get("item"));
      Class9587 var7 = Class9587.method37223(var1, "entity", var3);
      return new Class4494(var2, var6, var7);
   }

   public void test(Class878 var1, ItemStack var2, Entity var3) {
      Class7812 var6 = Class6671.method20332(var1, var3);
      this.method15053(var1, var2x -> var2x.method14173(var2, var6));
   }

   // $VF: synthetic method
   public static ResourceLocation method15129() {
      return field22730;
   }
}
