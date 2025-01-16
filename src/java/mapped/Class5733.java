package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.math.MathHelper;
import net.optifine.Config;
import net.optifine.shaders.Shaders;

public class Class5733 extends Class5732<TntMinecartEntity> {
   private static String[] field25145;

   public Class5733(EntityRendererManager var1) {
      super(var1);
   }

   public void method17915(TntMinecartEntity var1, float var2, BlockState var3, MatrixStack var4, Class7733 var5, int var6) {
      int var9 = var1.method4073();
      if (var9 > -1 && (float)var9 - var2 + 1.0F < 10.0F) {
         float var10 = 1.0F - ((float)var9 - var2 + 1.0F) / 10.0F;
         var10 = MathHelper.clamp(var10, 0.0F, 1.0F);
         var10 *= var10;
         var10 *= var10;
         float var11 = 1.0F + var10 * 0.3F;
         var4.scale(var11, var11, var11);
      }

      method17916(var3, var4, var5, var6, var9 > -1 && var9 / 5 % 2 == 0);
   }

   public static void method17916(BlockState var0, MatrixStack var1, Class7733 var2, int var3, boolean var4) {
      int var7;
      if (!var4) {
         var7 = OverlayTexture.NO_OVERLAY;
      } else {
         var7 = OverlayTexture.method730(OverlayTexture.method728(1.0F), 10);
      }

      if (Config.isShaders() && var4) {
         Shaders.method33086(1.0F, 1.0F, 1.0F, 0.5F);
      }

      Minecraft.getInstance().getBlockRendererDispatcher().method814(var0, var1, var2, var3, var7);
      if (Config.isShaders()) {
         Shaders.method33086(0.0F, 0.0F, 0.0F, 0.0F);
      }
   }
}
