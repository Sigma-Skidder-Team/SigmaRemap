package mapped;

import com.google.gson.JsonObject;
import net.minecraft.util.ResourceLocation;

public class Class4886 extends Class4874<Class4471> {
   private static final ResourceLocation field22720 = new ResourceLocation("construct_beacon");

   @Override
   public ResourceLocation method15044() {
      return field22720;
   }

   public Class4471 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class8840 var6 = Class8840.method32016(var1.get("level"));
      return new Class4471(var2, var6);
   }

   public void method15096(ServerPlayerEntity var1, Class950 var2) {
      this.method15053(var1, var1x -> var1x.method14125(var2));
   }

   // $VF: synthetic method
   public static ResourceLocation method15098() {
      return field22720;
   }
}
