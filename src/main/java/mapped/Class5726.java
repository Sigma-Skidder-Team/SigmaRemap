package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;

public class Class5726 extends EntityRenderer<FireworkRocketEntity> {
   private static String[] field25133;
   private final ItemRenderer field25134;

   public Class5726(EntityRendererManager var1, ItemRenderer var2) {
      super(var1);
      this.field25134 = var2;
   }

   public void render(FireworkRocketEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
      matrixStackIn.push();
      matrixStackIn.rotate(this.field25097.method32230());
      matrixStackIn.rotate(Vector3f.YP.rotationDegrees(180.0F));
      if (entityIn.method3508()) {
         matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(180.0F));
         matrixStackIn.rotate(Vector3f.YP.rotationDegrees(180.0F));
         matrixStackIn.rotate(Vector3f.XP.rotationDegrees(90.0F));
      }

      this.field25134.renderItem(entityIn.method3509(), ItemCameraTransformsTransformType.GROUND, packedLightIn, OverlayTexture.NO_OVERLAY, matrixStackIn, bufferIn);
      matrixStackIn.pop();
      super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
   }

   public ResourceLocation method17843(FireworkRocketEntity var1) {
      return AtlasTexture.LOCATION_BLOCKS_TEXTURE;
   }
}
