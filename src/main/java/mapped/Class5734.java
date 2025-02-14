package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class Class5734 extends EntityRenderer<WitherSkullEntity> {
   private static final ResourceLocation field25146 = new ResourceLocation("textures/entity/wither/wither_invulnerable.png");
   private static final ResourceLocation field25147 = new ResourceLocation("textures/entity/wither/wither.png");
   private final Class2844 field25148 = new Class2844();

   public Class5734(EntityRendererManager var1) {
      super(var1);
   }

   public int method17858(WitherSkullEntity var1, BlockPos var2) {
      return 15;
   }

   public void render(WitherSkullEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
      matrixStackIn.push();
      matrixStackIn.scale(-1.0F, -1.0F, 1.0F);
      float var9 = MathHelper.method37828(entityIn.prevRotationYaw, entityIn.rotationYaw, partialTicks);
      float var10 = MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch);
      IVertexBuilder var11 = bufferIn.getBuffer(this.field25148.method11028(this.method17843(entityIn)));
      this.field25148.method11174(0.0F, var9, var10);
      this.field25148.render(matrixStackIn, var11, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
      matrixStackIn.pop();
      super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
   }

   public ResourceLocation method17843(WitherSkullEntity var1) {
      return !var1.method3532() ? field25147 : field25146;
   }
}
