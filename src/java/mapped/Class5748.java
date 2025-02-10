package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class Class5748 extends Class5651<PufferfishEntity, Class2827<PufferfishEntity>> {
   private static final ResourceLocation field25172 = new ResourceLocation("textures/entity/fish/pufferfish.png");
   private int field25173;
   private final Class2885<PufferfishEntity> field25174 = new Class2885<PufferfishEntity>();
   private final Class2877<PufferfishEntity> field25175 = new Class2877<PufferfishEntity>();
   private final Class2812<PufferfishEntity> field25176 = new Class2812<PufferfishEntity>();

   public Class5748(EntityRendererManager var1) {
      super(var1, new Class2812<PufferfishEntity>(), 0.2F);
      this.field25173 = 3;
   }

   public ResourceLocation method17843(PufferfishEntity var1) {
      return field25172;
   }

   public void render(PufferfishEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
      int var9 = entityIn.method4828();
      if (var9 != this.field25173) {
         if (var9 != 0) {
            if (var9 != 1) {
               this.entityModel = this.field25176;
            } else {
               this.entityModel = this.field25175;
            }
         } else {
            this.entityModel = this.field25174;
         }
      }

      this.field25173 = var9;
      this.shadowSize = 0.1F + 0.1F * (float)var9;
      super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
   }

   public void method17842(PufferfishEntity var1, MatrixStack var2, float var3, float var4, float var5) {
      var2.translate(0.0, (double)(MathHelper.cos(var3 * 0.05F) * 0.08F), 0.0);
      super.method17842(var1, var2, var3, var4, var5);
   }
}
