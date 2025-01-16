package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class Class5721 extends EntityRenderer<FallingBlockEntity> {
   private static String[] field25119;

   public Class5721(EntityRendererManager var1) {
      super(var1);
      this.shadowSize = 0.5F;
   }

   public void render(FallingBlockEntity var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      BlockState var9 = var1.method3556();
      if (var9.getRenderType() == BlockRenderType.MODEL) {
         World var10 = var1.method3554();
         if (var9 != var10.getBlockState(var1.getPosition()) && var9.getRenderType() != BlockRenderType.field9885) {
            var4.push();
            BlockPos var11 = new BlockPos(var1.getPosX(), var1.getBoundingBox().maxY, var1.getPosZ());
            var4.translate(-0.5, 0.0, -0.5);
            BlockRendererDispatcher var12 = Minecraft.getInstance().getBlockRendererDispatcher();
            var12.method812()
               .method24679(
                  var10,
                  var12.method813(var9),
                  var9,
                  var11,
                  var4,
                  var5.method25597(Class8928.method32631(var9)),
                  false,
                  new Random(),
                  var9.method23451(var1.method3553()),
                  OverlayTexture.NO_OVERLAY
               );
            var4.pop();
            super.render(var1, var2, var3, var4, var5, var6);
         }
      }
   }

   public ResourceLocation method17843(FallingBlockEntity var1) {
      return AtlasTexture.LOCATION_BLOCKS_TEXTURE;
   }
}
