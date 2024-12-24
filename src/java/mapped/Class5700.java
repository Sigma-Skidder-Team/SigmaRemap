package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;

public class Class5700 extends Class5651<PolarBearEntity, Class2871<PolarBearEntity>> {
   private static final ResourceLocation field25070 = new ResourceLocation("textures/entity/bear/polarbear.png");

   public Class5700(EntityRendererManager var1) {
      super(var1, new Class2871<PolarBearEntity>(), 0.9F);
   }

   public ResourceLocation method17843(PolarBearEntity var1) {
      return field25070;
   }

   public void method17857(PolarBearEntity var1, MatrixStack var2, float var3) {
      var2.scale(1.2F, 1.2F, 1.2F);
      super.method17857(var1, var2, var3);
   }
}
