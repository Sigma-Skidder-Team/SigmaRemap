package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.entity.passive.fish.SalmonEntity;
import net.minecraft.util.ResourceLocation;

public class Class5750 extends Class5651<SalmonEntity, Class2816<SalmonEntity>> {
   private static final ResourceLocation field25178 = new ResourceLocation("textures/entity/fish/salmon.png");

   public Class5750(EntityRendererManager var1) {
      super(var1, new Class2816<SalmonEntity>(), 0.4F);
   }

   public ResourceLocation method17843(SalmonEntity var1) {
      return field25178;
   }

   public void method17842(SalmonEntity var1, MatrixStack var2, float var3, float var4, float var5) {
      super.method17842(var1, var2, var3, var4, var5);
      float var8 = 1.0F;
      float var9 = 1.0F;
      if (!var1.isInWater()) {
         var8 = 1.3F;
         var9 = 1.7F;
      }

      float var10 = var8 * 4.3F * MathHelper.sin(var9 * 0.6F * var3);
      var2.rotate(Vector3f.YP.rotationDegrees(var10));
      var2.translate(0.0, 0.0, -0.4F);
      if (!var1.isInWater()) {
         var2.translate(0.2F, 0.1F, 0.0);
         var2.rotate(Vector3f.field32902.rotationDegrees(90.0F));
      }
   }
}
