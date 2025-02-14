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

   public void render(FallingBlockEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
      BlockState var9 = entityIn.method3556();
      if (var9.getRenderType() == BlockRenderType.MODEL) {
         World var10 = entityIn.method3554();
         if (var9 != var10.getBlockState(entityIn.getPosition()) && var9.getRenderType() != BlockRenderType.field9885) {
            matrixStackIn.push();
            BlockPos var11 = new BlockPos(entityIn.getPosX(), entityIn.getBoundingBox().maxY, entityIn.getPosZ());
            matrixStackIn.translate(-0.5, 0.0, -0.5);
            BlockRendererDispatcher var12 = Minecraft.getInstance().getBlockRendererDispatcher();
            var12.method812()
               .method24679(
                  var10,
                  var12.method813(var9),
                  var9,
                  var11,
                       matrixStackIn,
                  bufferIn.getBuffer(Class8928.method32631(var9)),
                  false,
                  new Random(),
                  var9.method23451(entityIn.method3553()),
                  OverlayTexture.NO_OVERLAY
               );
            matrixStackIn.pop();
            super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
         }
      }
   }

   public ResourceLocation method17843(FallingBlockEntity var1) {
      return AtlasTexture.LOCATION_BLOCKS_TEXTURE;
   }
}
