package mapped;

import com.google.gson.JsonObject;

public class Class4888 extends Class4874<Class4482> {
   private static final ResourceLocation field22722 = new ResourceLocation("shot_crossbow");

   @Override
   public ResourceLocation method15044() {
      return field22722;
   }

   public Class4482 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class8634 var6 = Class8634.method31017(var1.get("item"));
      return new Class4482(var2, var6);
   }

   public void method15103(Class878 var1, ItemStack var2) {
      this.method15053(var1, var1x -> var1x.method14146(var2));
   }

   // $VF: synthetic method
   public static ResourceLocation method15105() {
      return field22722;
   }
}
