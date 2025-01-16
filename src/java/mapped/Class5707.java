package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;

public class Class5707 extends Class5651<WanderingTraderEntity, Class2802<WanderingTraderEntity>> {
   private static final ResourceLocation field25080 = new ResourceLocation("textures/entity/wandering_trader.png");

   public Class5707(EntityRendererManager var1) {
      super(var1, new Class2802<WanderingTraderEntity>(0.0F), 0.5F);
      this.addLayer(new Class235<WanderingTraderEntity, Class2802<WanderingTraderEntity>>(this));
      this.addLayer(new Class239<WanderingTraderEntity, Class2802<WanderingTraderEntity>>(this));
   }

   public ResourceLocation method17843(WanderingTraderEntity var1) {
      return field25080;
   }

   public void method17857(WanderingTraderEntity var1, MatrixStack var2, float var3) {
      float var6 = 0.9375F;
      var2.scale(0.9375F, 0.9375F, 0.9375F);
   }
}
