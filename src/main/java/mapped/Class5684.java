package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;

public class Class5684 extends Class5651<GhastEntity, Class2817<GhastEntity>> {
   private static final ResourceLocation field25050 = new ResourceLocation("textures/entity/ghast/ghast.png");
   private static final ResourceLocation field25051 = new ResourceLocation("textures/entity/ghast/ghast_shooting.png");

   public Class5684(EntityRendererManager var1) {
      super(var1, new Class2817<GhastEntity>(), 1.5F);
   }

   public ResourceLocation method17843(GhastEntity var1) {
      return !var1.method5357() ? field25050 : field25051;
   }

   public void method17857(GhastEntity var1, MatrixStack var2, float var3) {
      float var6 = 1.0F;
      float var7 = 4.5F;
      float var8 = 4.5F;
      var2.scale(4.5F, 4.5F, 4.5F);
   }
}
