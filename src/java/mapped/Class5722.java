package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;

public class Class5722 extends EntityRenderer<EvokerFangsEntity> {
   private static final ResourceLocation field25120 = new ResourceLocation("textures/entity/illager/evoker_fangs.png");
   private final Class2804<EvokerFangsEntity> field25121 = new Class2804<EvokerFangsEntity>();

   public Class5722(EntityRendererManager var1) {
      super(var1);
   }

   public void render(EvokerFangsEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
      float var9 = entityIn.method3584(partialTicks);
      if (var9 != 0.0F) {
         float var10 = 2.0F;
         if (var9 > 0.9F) {
            var10 = (float)((double)var10 * ((1.0 - (double)var9) / 0.1F));
         }

         matrixStackIn.push();
         matrixStackIn.rotate(Vector3f.YP.rotationDegrees(90.0F - entityIn.rotationYaw));
         matrixStackIn.scale(-var10, -var10, var10);
         float var11 = 0.03125F;
         matrixStackIn.translate(0.0, -0.626F, 0.0);
         matrixStackIn.scale(0.5F, 0.5F, 0.5F);
         this.field25121.setRotationAngles(entityIn, var9, 0.0F, 0.0F, entityIn.rotationYaw, entityIn.rotationPitch);
         IVertexBuilder var12 = bufferIn.getBuffer(this.field25121.method11028(field25120));
         this.field25121.render(matrixStackIn, var12, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
         matrixStackIn.pop();
         super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
      }
   }

   public ResourceLocation method17843(EvokerFangsEntity var1) {
      return field25120;
   }
}
