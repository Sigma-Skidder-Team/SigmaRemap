package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class Class5730 extends EntityRenderer<ShulkerBulletEntity> {
   private static final ResourceLocation field25138 = new ResourceLocation("textures/entity/shulker/spark.png");
   private static final RenderType field25139 = RenderType.getEntityTranslucent(field25138);
   private final Class2821<ShulkerBulletEntity> field25140 = new Class2821<ShulkerBulletEntity>();

   public Class5730(EntityRendererManager var1) {
      super(var1);
   }

   public int method17858(ShulkerBulletEntity var1, BlockPos var2) {
      return 15;
   }

   public void render(ShulkerBulletEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
      matrixStackIn.push();
      float var9 = MathHelper.method37828(entityIn.prevRotationYaw, entityIn.rotationYaw, partialTicks);
      float var10 = MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch);
      float var11 = (float) entityIn.ticksExisted + partialTicks;
      matrixStackIn.translate(0.0, 0.15F, 0.0);
      matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.sin(var11 * 0.1F) * 180.0F));
      matrixStackIn.rotate(Vector3f.XP.rotationDegrees(MathHelper.cos(var11 * 0.1F) * 180.0F));
      matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(MathHelper.sin(var11 * 0.15F) * 360.0F));
      matrixStackIn.scale(-0.5F, -0.5F, 0.5F);
      this.field25140.setRotationAngles(entityIn, 0.0F, 0.0F, 0.0F, var9, var10);
      IVertexBuilder var12 = bufferIn.getBuffer(this.field25140.method11028(field25138));
      this.field25140.render(matrixStackIn, var12, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
      matrixStackIn.scale(1.5F, 1.5F, 1.5F);
      IVertexBuilder var13 = bufferIn.getBuffer(field25139);
      this.field25140.render(matrixStackIn, var13, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 0.15F);
      matrixStackIn.pop();
      super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
   }

   public ResourceLocation method17843(ShulkerBulletEntity var1) {
      return field25138;
   }
}
