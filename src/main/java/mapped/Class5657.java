package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;

public class Class5657 extends Class5651<StriderEntity, Class2888<StriderEntity>> {
   private static final ResourceLocation field25018 = new ResourceLocation("textures/entity/strider/strider.png");
   private static final ResourceLocation field25019 = new ResourceLocation("textures/entity/strider/strider_cold.png");

   public Class5657(EntityRendererManager var1) {
      super(var1, new Class2888<StriderEntity>(), 0.5F);
      this.addLayer(
         new Class238<StriderEntity, Class2888<StriderEntity>>(this, new Class2888<StriderEntity>(), new ResourceLocation("textures/entity/strider/strider_saddle.png"))
      );
   }

   public ResourceLocation method17843(StriderEntity var1) {
      return !var1.method4978() ? field25018 : field25019;
   }

   public void method17857(StriderEntity var1, MatrixStack var2, float var3) {
      if (!var1.isChild()) {
         this.shadowSize = 0.5F;
      } else {
         var2.scale(0.5F, 0.5F, 0.5F);
         this.shadowSize = 0.25F;
      }
   }

   public boolean method17860(StriderEntity var1) {
      return var1.method4978();
   }
}
