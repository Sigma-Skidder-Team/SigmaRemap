package mapped;

import com.google.gson.JsonObject;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3d;

public class Class4893 extends Class4874<Class4463> {
   private static final ResourceLocation field22727 = new ResourceLocation("levitation");

   @Override
   public ResourceLocation method15044() {
      return field22727;
   }

   public Class4463 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class8884 var6 = Class8884.method32329(var1.get("distance"));
      Class8840 var7 = Class8840.method32016(var1.get("duration"));
      return new Class4463(var2, var6, var7);
   }

   public void method15118(ServerPlayerEntity var1, Vector3d var2, int var3) {
      this.method15053(var1, var3x -> var3x.method14109(var1, var2, var3));
   }

   // $VF: synthetic method
   public static ResourceLocation method15120() {
      return field22727;
   }
}
