package mapped;

import com.google.gson.JsonObject;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;

public class Class4877 extends Class4874<Class4464> {
   private static final ResourceLocation field22711 = new ResourceLocation("used_ender_eye");

   @Override
   public ResourceLocation method15044() {
      return field22711;
   }

   public Class4464 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class8841 var6 = Class8841.method32025(var1.get("distance"));
      return new Class4464(var2, var6);
   }

   public void method15065(ServerPlayerEntity var1, BlockPos var2) {
      double var5 = var1.getPosX() - (double)var2.getX();
      double var7 = var1.getPosZ() - (double)var2.getZ();
      double var9 = var5 * var5 + var7 * var7;
      this.method15053(var1, var2x -> var2x.method14110(var9));
   }

   // $VF: synthetic method
   public static ResourceLocation method15067() {
      return field22711;
   }
}
