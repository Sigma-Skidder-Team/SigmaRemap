package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class Class5655 extends Class5651<TropicalFishEntity, Class2827<TropicalFishEntity>> {
   private static String[] field25007;
   private final Class2809<TropicalFishEntity> field25008 = new Class2809<TropicalFishEntity>(0.0F);
   private final Class2810<TropicalFishEntity> field25009 = new Class2810<TropicalFishEntity>(0.0F);

   public Class5655(EntityRendererManager var1) {
      super(var1, new Class2809<TropicalFishEntity>(0.0F), 0.15F);
      this.addLayer(new Class241(this));
   }

   public ResourceLocation method17843(TropicalFishEntity var1) {
      return var1.method4827();
   }

   public void render(TropicalFishEntity entityIn, float var2, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer var5, int var6) {
      Object var9 = entityIn.method4824() != 0 ? this.field25009 : this.field25008;
      this.entityModel = (Class2827<TropicalFishEntity>)var9;
      float[] var10 = entityIn.method4820();
      ((Class2808)var9).method11018(var10[0], var10[1], var10[2]);
      super.render(entityIn, var2, partialTicks, matrixStackIn, var5, var6);
      ((Class2808)var9).method11018(1.0F, 1.0F, 1.0F);
   }

   public void method17842(TropicalFishEntity var1, MatrixStack var2, float var3, float var4, float var5) {
      super.method17842(var1, var2, var3, var4, var5);
      float var8 = 4.3F * MathHelper.sin(0.6F * var3);
      var2.rotate(Vector3f.YP.rotationDegrees(var8));
      if (!var1.isInWater()) {
         var2.translate(0.2F, 0.1F, 0.0);
         var2.rotate(Vector3f.ZP.rotationDegrees(90.0F));
      }
   }
}
