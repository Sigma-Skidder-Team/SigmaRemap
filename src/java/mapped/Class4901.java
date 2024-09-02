package mapped;

import com.google.gson.JsonObject;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class Class4901 extends Class4874<Class4488> {
   private static final ResourceLocation field22735 = new ResourceLocation("changed_dimension");

   @Override
   public ResourceLocation method15044() {
      return field22735;
   }

   public Class4488 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      RegistryKey var6 = !var1.has("from") ? null : RegistryKey.<World>getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation(JSONUtils.method32763(var1, "from")));
      RegistryKey var7 = !var1.has("to") ? null : RegistryKey.<World>getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation(JSONUtils.method32763(var1, "to")));
      return new Class4488(var2, var6, var7);
   }

   public void testForAll(ServerPlayerEntity var1, RegistryKey<World> var2, RegistryKey<World> var3) {
      this.method15053(var1, var2x -> var2x.method14157(var2, var3));
   }

   // $VF: synthetic method
   public static ResourceLocation method15148() {
      return field22735;
   }
}
