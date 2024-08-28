package mapped;

import com.google.gson.JsonObject;

public class Class4878 extends Class4874<Class4472> {
   private static final ResourceLocation field22712 = new ResourceLocation("used_totem");

   @Override
   public ResourceLocation method15044() {
      return field22712;
   }

   public Class4472 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class8634 var6 = Class8634.method31017(var1.get("item"));
      return new Class4472(var2, var6);
   }

   public void method15068(Class878 var1, ItemStack var2) {
      this.method15053(var1, var1x -> var1x.method14127(var2));
   }

   // $VF: synthetic method
   public static ResourceLocation method15070() {
      return field22712;
   }
}
