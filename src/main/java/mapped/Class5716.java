package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class Class5716 extends EntityRenderer<TridentEntity> {
   public static final ResourceLocation field25102 = new ResourceLocation("textures/entity/trident.png");
   private final Class2842 field25103 = new Class2842();

   public Class5716(EntityRendererManager var1) {
      super(var1);
   }

   public void render(TridentEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
      matrixStackIn.push();
      matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90.0F));
      matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch) + 90.0F));
      IVertexBuilder var9 = ItemRenderer.getEntityGlintVertexBuilder(bufferIn, this.field25103.method11028(this.method17843(entityIn)), false, entityIn.method3496());
      this.field25103.render(matrixStackIn, var9, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
      matrixStackIn.pop();
      super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
   }

   public ResourceLocation method17843(TridentEntity var1) {
      return field25102;
   }
}
