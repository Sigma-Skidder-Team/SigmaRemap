package mapped;

import com.google.gson.JsonObject;
import net.minecraft.util.ResourceLocation;

public class Class4889 extends Class4874<Class4484> {
   private static final ResourceLocation field22723 = new ResourceLocation("item_durability_changed");

   @Override
   public ResourceLocation method15044() {
      return field22723;
   }

   public Class4484 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class8634 var6 = Class8634.method31017(var1.get("item"));
      Class8840 var7 = Class8840.method32016(var1.get("durability"));
      Class8840 var8 = Class8840.method32016(var1.get("delta"));
      return new Class4484(var2, var6, var7, var8);
   }

   public void method15106(ServerPlayerEntity var1, ItemStack var2, int var3) {
      this.method15053(var1, var2x -> var2x.method14150(var2, var3));
   }

   // $VF: synthetic method
   public static ResourceLocation method15108() {
      return field22723;
   }
}
