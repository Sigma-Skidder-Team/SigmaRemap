package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.BlockState;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3d;

import java.util.Random;

public class Class5674 extends Class5651<EndermanEntity, Class2799<EndermanEntity>> {
   private static final ResourceLocation field25039 = new ResourceLocation("textures/entity/enderman/enderman.png");
   private final Random field25040 = new Random();

   public Class5674(EntityRendererManager var1) {
      super(var1, new Class2799<EndermanEntity>(0.0F), 0.5F);
      this.addLayer(new Class228<EndermanEntity>(this));
      this.addLayer(new Class253(this));
   }

   public void render(EndermanEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
      BlockState var9 = entityIn.method4357();
      Class2799 var10 = this.getEntityModel();
      var10.field17443 = var9 != null;
      var10.field17444 = entityIn.method4358();
      super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
   }

   public Vector3d getRenderOffset(EndermanEntity var1, float var2) {
      if (!var1.method4358()) {
         return super.getRenderOffset(var1, var2);
      } else {
         double var5 = 0.02;
         return new Vector3d(this.field25040.nextGaussian() * 0.02, 0.0, this.field25040.nextGaussian() * 0.02);
      }
   }

   public ResourceLocation method17843(EndermanEntity var1) {
      return field25039;
   }
}
