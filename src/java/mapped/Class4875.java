package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import javax.annotation.Nullable;

public class Class4875 extends Class4874<Class4468> {
   private static final ResourceLocation field22709 = new ResourceLocation("slide_down_block");

   @Override
   public ResourceLocation method15044() {
      return field22709;
   }

   public Class4468 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Block var6 = method15056(var1);
      Class7340 var7 = Class7340.method23261(var1.get("state"));
      if (var6 != null) {
         var7.method23260(var6.getStateContainer(), var1x -> {
            throw new JsonSyntaxException("Block " + var6 + " has no property " + var1x);
         });
      }

      return new Class4468(var2, var6, var7);
   }

   @Nullable
   private static Block method15056(JsonObject var0) {
      if (!var0.has("block")) {
         return null;
      } else {
         ResourceLocation var3 = new ResourceLocation(JSONUtils.getString(var0, "block"));
         return Registry.BLOCK.method9187(var3).orElseThrow(() -> new JsonSyntaxException("Unknown block type '" + var3 + "'"));
      }
   }

   public void method15057(ServerPlayerEntity var1, BlockState var2) {
      this.method15053(var1, var1x -> var1x.method14119(var2));
   }

   // $VF: synthetic method
   public static ResourceLocation method15061() {
      return field22709;
   }
}
