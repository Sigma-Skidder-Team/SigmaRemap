package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;

public class Class5739 extends EntityRenderer<LeashKnotEntity> {
   private static final ResourceLocation field25161 = new ResourceLocation("textures/entity/lead_knot.png");
   private final Class2889<LeashKnotEntity> field25162 = new Class2889<LeashKnotEntity>();

   public Class5739(EntityRendererManager var1) {
      super(var1);
   }

   public void render(LeashKnotEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
      matrixStackIn.push();
      matrixStackIn.scale(-1.0F, -1.0F, 1.0F);
      this.field25162.setRotationAngles(entityIn, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      IVertexBuilder var9 = bufferIn.getBuffer(this.field25162.method11028(field25161));
      this.field25162.render(matrixStackIn, var9, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
      matrixStackIn.pop();
      super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
   }

   public ResourceLocation method17843(LeashKnotEntity var1) {
      return field25161;
   }
}
