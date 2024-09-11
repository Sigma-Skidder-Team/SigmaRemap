package mapped;

import com.google.gson.JsonObject;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ResourceLocation;

public class Class4876 extends Class4874<Class4474> {
   private final ResourceLocation field22710;

   public Class4876(ResourceLocation var1) {
      this.field22710 = var1;
   }

   @Override
   public ResourceLocation method15044() {
      return this.field22710;
   }

   public Class4474 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      JsonObject var6 = JSONUtils.getJsonObject(var1, "location", var1);
      Class8576 var7 = Class8576.method30653(var6);
      return new Class4474(this.field22710, var2, var7);
   }

   public void method15062(ServerPlayerEntity var1) {
      this.method15053(var1, var1x -> var1x.method14133(var1.getServerWorld(), var1.getPosX(), var1.getPosY(), var1.getPosZ()));
   }

   // $VF: synthetic method
   public static ResourceLocation method15064(Class4876 var0) {
      return var0.field22710;
   }
}
