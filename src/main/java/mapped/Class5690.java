package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.util.ResourceLocation;

public class Class5690 extends Class5651<WolfEntity, Class2859<WolfEntity>> {
   private static final ResourceLocation field25057 = new ResourceLocation("textures/entity/wolf/wolf.png");
   private static final ResourceLocation field25058 = new ResourceLocation("textures/entity/wolf/wolf_tame.png");
   private static final ResourceLocation field25059 = new ResourceLocation("textures/entity/wolf/wolf_angry.png");

   public Class5690(EntityRendererManager var1) {
      super(var1, new Class2859<WolfEntity>(), 0.5F);
      this.addLayer(new Class221(this));
   }

   public float method17871(WolfEntity var1, float var2) {
      return var1.method4380();
   }

   public void render(WolfEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
      if (entityIn.method4375()) {
         float var9 = entityIn.method4376(partialTicks);
         this.entityModel.method11190(var9, var9, var9);
      }

      super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
      if (entityIn.method4375()) {
         this.entityModel.method11190(1.0F, 1.0F, 1.0F);
      }
   }

   public ResourceLocation method17843(WolfEntity var1) {
      if (!var1.method4393()) {
         return !var1.method4369() ? field25057 : field25059;
      } else {
         return field25058;
      }
   }
}
