package mapped;

import com.google.gson.JsonObject;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ResourceLocation;

public class Class4873 extends Class4874<Class4475> {
   public static final ResourceLocation field22707 = new ResourceLocation("tick");

   @Override
   public ResourceLocation method15044() {
      return field22707;
   }

   public Class4475 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      return new Class4475(var2);
   }

   public void method15046(ServerPlayerEntity var1) {
      this.method15053(var1, var0 -> true);
   }
}
