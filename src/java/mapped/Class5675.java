package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class Class5675 extends Class5651<SlimeEntity, Class2826<SlimeEntity>> {
   private static final ResourceLocation field25041 = new ResourceLocation("textures/entity/slime/slime.png");

   public Class5675(EntityRendererManager var1) {
      super(var1, new Class2826<SlimeEntity>(16), 0.25F);
      this.addLayer(new Class247<SlimeEntity>(this));
   }

   public void render(SlimeEntity entityIn, float var2, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer var5, int var6) {
      this.shadowSize = 0.25F * (float) entityIn.method5319();
      super.render(entityIn, var2, partialTicks, matrixStackIn, var5, var6);
   }

   public void method17857(SlimeEntity var1, MatrixStack var2, float var3) {
      float var6 = 0.999F;
      var2.scale(0.999F, 0.999F, 0.999F);
      var2.translate(0.0, 0.001F, 0.0);
      float var7 = (float)var1.method5319();
      float var8 = MathHelper.lerp(var3, var1.field6084, var1.field6083) / (var7 * 0.5F + 1.0F);
      float var9 = 1.0F / (var8 + 1.0F);
      var2.scale(var9 * var7, 1.0F / var9 * var7, var9 * var7);
   }

   public ResourceLocation method17843(SlimeEntity var1) {
      return field25041;
   }
}
