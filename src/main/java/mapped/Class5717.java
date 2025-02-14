package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class Class5717 extends EntityRenderer<LlamaSpitEntity> {
   private static final ResourceLocation field25104 = new ResourceLocation("textures/entity/llama/spit.png");
   private final Class2884<LlamaSpitEntity> field25105 = new Class2884<LlamaSpitEntity>();

   public Class5717(EntityRendererManager var1) {
      super(var1);
   }

   public void render(LlamaSpitEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
      matrixStackIn.push();
      matrixStackIn.translate(0.0, 0.15F, 0.0);
      matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90.0F));
      matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
      this.field25105.setRotationAngles(entityIn, partialTicks, 0.0F, -0.1F, 0.0F, 0.0F);
      IVertexBuilder var9 = bufferIn.getBuffer(this.field25105.method11028(field25104));
      this.field25105.render(matrixStackIn, var9, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
      matrixStackIn.pop();
      super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
   }

   public ResourceLocation method17843(LlamaSpitEntity var1) {
      return field25104;
   }
}
