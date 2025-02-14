package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;

public class Class5692 extends Class5651<VillagerEntity, Class2802<VillagerEntity>> {
   private static final ResourceLocation field25061 = new ResourceLocation("textures/entity/villager/villager.png");

   public Class5692(EntityRendererManager var1, IReloadableResourceManager var2) {
      super(var1, new Class2802<VillagerEntity>(0.0F), 0.5F);
      this.addLayer(new Class235<VillagerEntity, Class2802<VillagerEntity>>(this));
      this.addLayer(new Class218<VillagerEntity, Class2802<VillagerEntity>>(this, var2, "villager"));
      this.addLayer(new Class239<VillagerEntity, Class2802<VillagerEntity>>(this));
   }

   public ResourceLocation method17843(VillagerEntity var1) {
      return field25061;
   }

   public void method17857(VillagerEntity var1, MatrixStack var2, float var3) {
      float var6 = 0.9375F;
      if (!var1.isChild()) {
         this.shadowSize = 0.5F;
      } else {
         var6 = (float)((double)var6 * 0.5);
         this.shadowSize = 0.25F;
      }

      var2.scale(var6, var6, var6);
   }
}
