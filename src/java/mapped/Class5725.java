package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3f;

public class Class5725 extends EntityRenderer<BoatEntity> {
   private static final ResourceLocation[] field25131 = new ResourceLocation[]{
      new ResourceLocation("textures/entity/boat/oak.png"),
      new ResourceLocation("textures/entity/boat/spruce.png"),
      new ResourceLocation("textures/entity/boat/birch.png"),
      new ResourceLocation("textures/entity/boat/jungle.png"),
      new ResourceLocation("textures/entity/boat/acacia.png"),
      new ResourceLocation("textures/entity/boat/dark_oak.png")
   };
   public final Class2883 field25132 = new Class2883();

   public Class5725(EntityRendererManager var1) {
      super(var1);
      this.shadowSize = 0.8F;
   }

   public void render(BoatEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
      matrixStackIn.push();
      matrixStackIn.translate(0.0, 0.375, 0.0);
      matrixStackIn.rotate(Vector3f.YP.rotationDegrees(180.0F - entityYaw));
      float var9 = (float) entityIn.method4165() - partialTicks;
      float var10 = entityIn.method4163() - partialTicks;
      if (var10 < 0.0F) {
         var10 = 0.0F;
      }

      if (var9 > 0.0F) {
         matrixStackIn.rotate(Vector3f.XP.rotationDegrees(MathHelper.sin(var9) * var9 * var10 / 10.0F * (float) entityIn.method4170()));
      }

      float var11 = entityIn.method4168(partialTicks);
      if (!MathHelper.method37786(var11, 0.0F)) {
         matrixStackIn.rotate(new Quaternion(new Vector3f(1.0F, 0.0F, 1.0F), entityIn.method4168(partialTicks), true));
      }

      matrixStackIn.scale(-1.0F, -1.0F, 1.0F);
      matrixStackIn.rotate(Vector3f.YP.rotationDegrees(90.0F));
      this.field25132.setRotationAngles(entityIn, partialTicks, 0.0F, -0.1F, 0.0F, 0.0F);
      IVertexBuilder var12 = bufferIn.getBuffer(this.field25132.method11028(this.method17843(entityIn)));
      this.field25132.render(matrixStackIn, var12, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!entityIn.canSwim()) {
         IVertexBuilder var13 = bufferIn.getBuffer(RenderType.method14328());
         this.field25132.method11199().render(matrixStackIn, var13, packedLightIn, OverlayTexture.NO_OVERLAY);
      }

      matrixStackIn.pop();
      super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
   }

   public ResourceLocation method17843(BoatEntity var1) {
      return field25131[var1.method4172().ordinal()];
   }
}
