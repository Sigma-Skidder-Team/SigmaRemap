package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3f;

public class Class5735<T extends Entity & Class889> extends EntityRenderer<T> {
   private static String[] field25149;
   private final ItemRenderer field25150;
   private final float field25151;
   private final boolean field25152;

   public Class5735(EntityRendererManager var1, ItemRenderer var2, float var3, boolean var4) {
      super(var1);
      this.field25150 = var2;
      this.field25151 = var3;
      this.field25152 = var4;
   }

   public Class5735(EntityRendererManager var1, ItemRenderer var2) {
      this(var1, var2, 1.0F, false);
   }

   @Override
   public int method17858(T var1, BlockPos var2) {
      return !this.field25152 ? super.method17858((T)var1, var2) : 15;
   }

   @Override
   public void render(T entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
      if (entityIn.ticksExisted >= 2 || !(this.field25097.info.getRenderViewEntity().getDistanceSq(entityIn) < 12.25)) {
         matrixStackIn.push();
         matrixStackIn.scale(this.field25151, this.field25151, this.field25151);
         matrixStackIn.rotate(this.field25097.method32230());
         matrixStackIn.rotate(Vector3f.YP.rotationDegrees(180.0F));
         this.field25150.renderItem(((Class889) entityIn).method3509(), ItemCameraTransformsTransformType.GROUND, packedLightIn, OverlayTexture.NO_OVERLAY, matrixStackIn, bufferIn);
         matrixStackIn.pop();
         super.render((T) entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
      }
   }

   @Override
   public ResourceLocation method17843(Entity var1) {
      return AtlasTexture.LOCATION_BLOCKS_TEXTURE;
   }
}
