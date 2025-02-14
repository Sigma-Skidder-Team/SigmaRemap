package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.item.minecart.AbstractMinecartEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3f;

public class Class5732<T extends AbstractMinecartEntity> extends EntityRenderer<T> {
   private static final ResourceLocation field25143 = new ResourceLocation("textures/entity/minecart.png");
   public final Class2827<T> field25144 = new Class2818<T>();

   public Class5732(EntityRendererManager var1) {
      super(var1);
      this.shadowSize = 0.7F;
   }

   public void render(T entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
      super.render((T) entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
      matrixStackIn.push();
      long var9 = (long) entityIn.getEntityId() * 493286711L;
      var9 = var9 * var9 * 4392167121L + var9 * 98761L;
      float var11 = (((float)(var9 >> 16 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float var12 = (((float)(var9 >> 20 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float var13 = (((float)(var9 >> 24 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      matrixStackIn.translate((double)var11, (double)var12, (double)var13);
      double var14 = MathHelper.lerp((double) partialTicks, entityIn.lastTickPosX, entityIn.getPosX());
      double var16 = MathHelper.lerp((double) partialTicks, entityIn.lastTickPosY, entityIn.getPosY());
      double var18 = MathHelper.lerp((double) partialTicks, entityIn.lastTickPosZ, entityIn.getPosZ());
      double var20 = 0.3F;
      Vector3d var22 = entityIn.method3595(var14, var16, var18);
      float var23 = MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch);
      if (var22 != null) {
         Vector3d var24 = entityIn.method3594(var14, var16, var18, 0.3F);
         Vector3d var25 = entityIn.method3594(var14, var16, var18, -0.3F);
         if (var24 == null) {
            var24 = var22;
         }

         if (var25 == null) {
            var25 = var22;
         }

         matrixStackIn.translate(var22.x - var14, (var24.y + var25.y) / 2.0 - var16, var22.z - var18);
         Vector3d var26 = var25.add(-var24.x, -var24.y, -var24.z);
         if (var26.length() != 0.0) {
            var26 = var26.normalize();
            entityYaw = (float)(Math.atan2(var26.z, var26.x) * 180.0 / Math.PI);
            var23 = (float)(Math.atan(var26.y) * 73.0);
         }
      }

      matrixStackIn.translate(0.0, 0.375, 0.0);
      matrixStackIn.rotate(Vector3f.YP.rotationDegrees(180.0F - entityYaw));
      matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(-var23));
      float var30 = (float) entityIn.method3599() - partialTicks;
      float var31 = entityIn.method3597() - partialTicks;
      if (var31 < 0.0F) {
         var31 = 0.0F;
      }

      if (var30 > 0.0F) {
         matrixStackIn.rotate(Vector3f.XP.rotationDegrees(MathHelper.sin(var30) * var30 * var31 / 10.0F * (float) entityIn.method3601()));
      }

      int var33 = entityIn.method3605();
      BlockState var27 = entityIn.method3603();
      if (var27.getRenderType() != BlockRenderType.field9885) {
         matrixStackIn.push();
         float var28 = 0.75F;
         matrixStackIn.scale(0.75F, 0.75F, 0.75F);
         matrixStackIn.translate(-0.5, (double)((float)(var33 - 8) / 16.0F), 0.5);
         matrixStackIn.rotate(Vector3f.YP.rotationDegrees(90.0F));
         this.method17915((T) entityIn, partialTicks, var27, matrixStackIn, bufferIn, packedLightIn);
         matrixStackIn.pop();
      }

      matrixStackIn.scale(-1.0F, -1.0F, 1.0F);
      this.field25144.setRotationAngles((T) entityIn, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
      IVertexBuilder var34 = bufferIn.getBuffer(this.field25144.method11028(this.method17843((T) entityIn)));
      this.field25144.render(matrixStackIn, var34, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
      matrixStackIn.pop();
   }

   public ResourceLocation method17843(T var1) {
      return field25143;
   }

   public void method17915(T var1, float var2, BlockState var3, MatrixStack var4, IRenderTypeBuffer var5, int var6) {
      Minecraft.getInstance().getBlockRendererDispatcher().method814(var3, var4, var5, var6, OverlayTexture.NO_OVERLAY);
   }
}
