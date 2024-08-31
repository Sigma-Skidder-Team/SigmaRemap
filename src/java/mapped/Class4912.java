package mapped;

import com.google.gson.JsonObject;
import net.minecraft.util.ResourceLocation;

public class Class4912 extends Class4874<Class4465> {
   private static final ResourceLocation field22745 = new ResourceLocation("enchanted_item");

   @Override
   public ResourceLocation method15044() {
      return field22745;
   }

   public Class4465 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class8634 var6 = Class8634.method31017(var1.get("item"));
      Class8840 var7 = Class8840.method32016(var1.get("levels"));
      return new Class4465(var2, var6, var7);
   }

   public void method15177(ServerPlayerEntity var1, ItemStack var2, int var3) {
      this.method15053(var1, var2x -> var2x.method14112(var2, var3));
   }

   // $VF: synthetic method
   public static ResourceLocation method15179() {
      return field22745;
   }
}
