package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;

public class Class5689 extends Class5651<TurtleEntity, Class2873<TurtleEntity>> {
   private static final ResourceLocation field25056 = new ResourceLocation("textures/entity/turtle/big_sea_turtle.png");

   public Class5689(EntityRendererManager var1) {
      super(var1, new Class2873<TurtleEntity>(0.0F), 0.7F);
   }

   public void render(TurtleEntity entityIn, float var2, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer var5, int var6) {
      if (entityIn.isChild()) {
         this.shadowSize *= 0.5F;
      }

      super.render(entityIn, var2, partialTicks, matrixStackIn, var5, var6);
   }

   public ResourceLocation method17843(TurtleEntity var1) {
      return field25056;
   }
}
