package mapped;

import com.google.gson.JsonObject;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;

public class Class4897 extends Class4874<Class4485> {
   private static final ResourceLocation field22731 = new ResourceLocation("recipe_unlocked");

   @Override
   public ResourceLocation method15044() {
      return field22731;
   }

   public Class4485 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      ResourceLocation var6 = new ResourceLocation(JSONUtils.getString(var1, "recipe"));
      return new Class4485(var2, var6);
   }

   public void method15130(ServerPlayerEntity var1, IRecipe<?> var2) {
      this.method15053(var1, var1x -> var1x.method14151(var2));
   }

   public static Class4485 method15131(ResourceLocation var0) {
      return new Class4485(Class9587.field44822, var0);
   }

   // $VF: synthetic method
   public static ResourceLocation method15133() {
      return field22731;
   }
}
