package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;

public class Class5703 extends Class5702<CaveSpiderEntity> {
   private static final ResourceLocation field25073 = new ResourceLocation("textures/entity/spider/cave_spider.png");

   public Class5703(EntityRendererManager var1) {
      super(var1);
      this.shadowSize *= 0.7F;
   }

   public void method17857(CaveSpiderEntity var1, MatrixStack var2, float var3) {
      var2.scale(0.7F, 0.7F, 0.7F);
   }

   public ResourceLocation method17843(CaveSpiderEntity var1) {
      return field25073;
   }
}
