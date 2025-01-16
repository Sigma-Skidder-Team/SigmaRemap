package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;

public class Class5746 extends Class5651<IronGolemEntity, Class2880<IronGolemEntity>> {
   private static final ResourceLocation field25170 = new ResourceLocation("textures/entity/iron_golem/iron_golem.png");

   public Class5746(EntityRendererManager var1) {
      super(var1, new Class2880<IronGolemEntity>(), 0.7F);
      this.addLayer(new Class251(this));
      this.addLayer(new Class230(this));
   }

   public ResourceLocation method17843(IronGolemEntity var1) {
      return field25170;
   }

   public void method17842(IronGolemEntity var1, MatrixStack var2, float var3, float var4, float var5) {
      super.method17842(var1, var2, var3, var4, var5);
      if (!((double)var1.limbSwingAmount < 0.01)) {
         float var8 = 13.0F;
         float var9 = var1.field4961 - var1.limbSwingAmount * (1.0F - var5) + 6.0F;
         float var10 = (Math.abs(var9 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         var2.rotate(Vector3f.ZP.rotationDegrees(6.5F * var10));
      }
   }
}
