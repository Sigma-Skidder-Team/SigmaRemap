package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class Class5716 extends EntityRenderer<Class886> {
   public static final ResourceLocation field25102 = new ResourceLocation("textures/entity/trident.png");
   private final Class2842 field25103 = new Class2842();

   public Class5716(EntityRendererManager var1) {
      super(var1);
   }

   public void render(Class886 var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      var4.push();
      var4.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(var3, var1.prevRotationYaw, var1.rotationYaw) - 90.0F));
      var4.rotate(Vector3f.ZP.rotationDegrees(MathHelper.lerp(var3, var1.prevRotationPitch, var1.rotationPitch) + 90.0F));
      IVertexBuilder var9 = ItemRenderer.method786(var5, this.field25103.method11028(this.method17843(var1)), false, var1.method3496());
      this.field25103.method11016(var4, var9, var6, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.pop();
      super.render(var1, var2, var3, var4, var5, var6);
   }

   public ResourceLocation method17843(Class886 var1) {
      return field25102;
   }
}
