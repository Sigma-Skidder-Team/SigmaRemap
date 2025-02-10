package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Matrix3f;
import net.minecraft.util.math.vector.Vector3f;

public class Class5720 extends EntityRenderer<DragonFireball> {
   private static final ResourceLocation field25117 = new ResourceLocation("textures/entity/enderdragon/dragon_fireball.png");
   private static final RenderType field25118 = RenderType.getEntityCutoutNoCull(field25117);

   public Class5720(EntityRendererManager var1) {
      super(var1);
   }

   public int method17858(DragonFireball var1, BlockPos var2) {
      return 15;
   }

   public void render(DragonFireball entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
      matrixStackIn.push();
      matrixStackIn.scale(2.0F, 2.0F, 2.0F);
      matrixStackIn.rotate(this.field25097.method32230());
      matrixStackIn.rotate(Vector3f.YP.rotationDegrees(180.0F));
      Class8892 var9 = matrixStackIn.getLast();
      Matrix4f var10 = var9.getMatrix();
      Matrix3f var11 = var9.method32362();
      IVertexBuilder var12 = bufferIn.getBuffer(field25118);
      method17908(var12, var10, var11, packedLightIn, 0.0F, 0, 0, 1);
      method17908(var12, var10, var11, packedLightIn, 1.0F, 0, 1, 1);
      method17908(var12, var10, var11, packedLightIn, 1.0F, 1, 1, 0);
      method17908(var12, var10, var11, packedLightIn, 0.0F, 1, 0, 0);
      matrixStackIn.pop();
      super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
   }

   private static void method17908(IVertexBuilder var0, Matrix4f var1, Matrix3f var2, int var3, float var4, int var5, int var6, int var7) {
      var0.pos(var1, var4 - 0.5F, (float)var5 - 0.25F, 0.0F)
         .color(255, 255, 255, 255)
         .tex((float)var6, (float)var7)
         .method17035(OverlayTexture.NO_OVERLAY)
         .method17034(var3)
         .method17041(var2, 0.0F, 1.0F, 0.0F)
         .endVertex();
   }

   public ResourceLocation method17843(DragonFireball var1) {
      return field25117;
   }
}
