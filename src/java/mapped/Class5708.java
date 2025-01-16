package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;

public class Class5708 extends Class5651<WitchEntity, Class2891<WitchEntity>> {
   private static final ResourceLocation field25081 = new ResourceLocation("textures/entity/witch.png");

   public Class5708(EntityRendererManager var1) {
      super(var1, new Class2891<WitchEntity>(0.0F), 0.5F);
      this.addLayer(new Class240<WitchEntity>(this));
   }

   public void render(WitchEntity entityIn, float var2, float partialTicks, MatrixStack matrixStackIn, Class7733 var5, int var6) {
      this.entityModel.method11207(!entityIn.getHeldItemMainhand().isEmpty());
      super.render(entityIn, var2, partialTicks, matrixStackIn, var5, var6);
   }

   public ResourceLocation method17843(WitchEntity var1) {
      return field25081;
   }

   public void method17857(WitchEntity var1, MatrixStack var2, float var3) {
      float var6 = 0.9375F;
      var2.scale(0.9375F, 0.9375F, 0.9375F);
   }
}
