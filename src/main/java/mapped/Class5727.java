package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Matrix3f;
import net.minecraft.util.math.vector.Vector3f;

public abstract class Class5727<T extends AbstractArrowEntity> extends EntityRenderer<T> {
   public Class5727(EntityRendererManager var1) {
      super(var1);
   }

   public void render(T entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
      matrixStackIn.push();
      matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90.0F));
      matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
      boolean var9 = false;
      float var10 = 0.0F;
      float var11 = 0.5F;
      float var12 = 0.0F;
      float var13 = 0.15625F;
      float var14 = 0.0F;
      float var15 = 0.15625F;
      float var16 = 0.15625F;
      float var17 = 0.3125F;
      float var18 = 0.05625F;
      float var19 = (float) entityIn.field5103 - partialTicks;
      if (var19 > 0.0F) {
         float var20 = -MathHelper.sin(var19 * 3.0F) * var19;
         matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(var20));
      }

      matrixStackIn.rotate(Vector3f.XP.rotationDegrees(45.0F));
      matrixStackIn.scale(0.05625F, 0.05625F, 0.05625F);
      matrixStackIn.translate(-4.0, 0.0, 0.0);
      IVertexBuilder var25 = bufferIn.getBuffer(RenderType.getEntityCutout(this.method17843((T) entityIn)));
      Class8892 var21 = matrixStackIn.getLast();
      Matrix4f var22 = var21.getMatrix();
      Matrix3f var23 = var21.method32362();
      this.method17913(var22, var23, var25, -7, -2, -2, 0.0F, 0.15625F, -1, 0, 0, packedLightIn);
      this.method17913(var22, var23, var25, -7, -2, 2, 0.15625F, 0.15625F, -1, 0, 0, packedLightIn);
      this.method17913(var22, var23, var25, -7, 2, 2, 0.15625F, 0.3125F, -1, 0, 0, packedLightIn);
      this.method17913(var22, var23, var25, -7, 2, -2, 0.0F, 0.3125F, -1, 0, 0, packedLightIn);
      this.method17913(var22, var23, var25, -7, 2, -2, 0.0F, 0.15625F, 1, 0, 0, packedLightIn);
      this.method17913(var22, var23, var25, -7, 2, 2, 0.15625F, 0.15625F, 1, 0, 0, packedLightIn);
      this.method17913(var22, var23, var25, -7, -2, 2, 0.15625F, 0.3125F, 1, 0, 0, packedLightIn);
      this.method17913(var22, var23, var25, -7, -2, -2, 0.0F, 0.3125F, 1, 0, 0, packedLightIn);

      for (int var24 = 0; var24 < 4; var24++) {
         matrixStackIn.rotate(Vector3f.XP.rotationDegrees(90.0F));
         this.method17913(var22, var23, var25, -8, -2, 0, 0.0F, 0.0F, 0, 1, 0, packedLightIn);
         this.method17913(var22, var23, var25, 8, -2, 0, 0.5F, 0.0F, 0, 1, 0, packedLightIn);
         this.method17913(var22, var23, var25, 8, 2, 0, 0.5F, 0.15625F, 0, 1, 0, packedLightIn);
         this.method17913(var22, var23, var25, -8, 2, 0, 0.0F, 0.15625F, 0, 1, 0, packedLightIn);
      }

      matrixStackIn.pop();
      super.render((T) entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
   }

   public void method17913(
           Matrix4f var1, Matrix3f var2, IVertexBuilder var3, int var4, int var5, int var6, float var7, float var8, int var9, int var10, int var11, int var12
   ) {
      var3.pos(var1, (float)var4, (float)var5, (float)var6)
         .color(255, 255, 255, 255)
         .tex(var7, var8)
         .method17035(OverlayTexture.NO_OVERLAY)
         .method17034(var12)
         .method17041(var2, (float)var9, (float)var11, (float)var10)
         .endVertex();
   }
}
