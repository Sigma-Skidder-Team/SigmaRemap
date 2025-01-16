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

   public void render(FireworkRocketEntity var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      var4.push();
      var4.rotate(this.field25097.method32230());
      var4.rotate(Vector3f.YP.rotationDegrees(180.0F));
      if (var1.method3508()) {
         var4.rotate(Vector3f.ZP.rotationDegrees(180.0F));
         var4.rotate(Vector3f.YP.rotationDegrees(180.0F));
         var4.rotate(Vector3f.XP.rotationDegrees(90.0F));
      }

      this.field25134.renderItem(var1.method3509(), ItemCameraTransformsTransformType.GROUND, var6, OverlayTexture.NO_OVERLAY, var4, var5);
      var4.pop();
      super.render(var1, var2, var3, var4, var5, var6);
   }

   public ResourceLocation method17843(FireworkRocketEntity var1) {
      return AtlasTexture.LOCATION_BLOCKS_TEXTURE;
   }
}
