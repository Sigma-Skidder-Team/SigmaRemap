package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class Class5740 extends EntityRenderer<TntEntity> {
   private static String[] field25163;

   public Class5740(EntityRendererManager var1) {
      super(var1);
      this.shadowSize = 0.5F;
   }

   public void render(TntEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
      matrixStackIn.push();
      matrixStackIn.translate(0.0, 0.5, 0.0);
      if ((float) entityIn.method4184() - partialTicks + 1.0F < 10.0F) {
         float var9 = 1.0F - ((float) entityIn.method4184() - partialTicks + 1.0F) / 10.0F;
         var9 = MathHelper.clamp(var9, 0.0F, 1.0F);
         var9 *= var9;
         var9 *= var9;
         float var10 = 1.0F + var9 * 0.3F;
         matrixStackIn.scale(var10, var10, var10);
      }

      matrixStackIn.rotate(Vector3f.YP.rotationDegrees(-90.0F));
      matrixStackIn.translate(-0.5, -0.5, 0.5);
      matrixStackIn.rotate(Vector3f.YP.rotationDegrees(90.0F));
      Class5733.method17916(Blocks.TNT.getDefaultState(), matrixStackIn, bufferIn, packedLightIn, entityIn.method4184() / 5 % 2 == 0);
      matrixStackIn.pop();
      super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
   }

   public ResourceLocation method17843(TntEntity var1) {
      return AtlasTexture.LOCATION_BLOCKS_TEXTURE;
   }
}
