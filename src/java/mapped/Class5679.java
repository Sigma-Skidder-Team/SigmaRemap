package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;

public class Class5679 extends Class5676<Class1033> {
   private static final ResourceLocation field25044 = new ResourceLocation("textures/entity/illager/illusioner.png");

   public Class5679(EntityRendererManager var1) {
      super(var1, new Class2823<Class1033>(0.0F, 0.0F, 64, 64), 0.5F);
      this.addLayer(new Class243(this, this));
      this.entityModel.method11026().showModel = true;
   }

   public ResourceLocation method17843(Class1033 var1) {
      return field25044;
   }

   public void render(Class1033 entityIn, float var2, float partialTicks, MatrixStack matrixStackIn, Class7733 var5, int var6) {
      if (!entityIn.isInvisible()) {
         super.render(entityIn, var2, partialTicks, matrixStackIn, var5, var6);
      } else {
         Vector3d[] var9 = entityIn.method4611(partialTicks);
         float var10 = this.method17871(entityIn, partialTicks);

         for (int var11 = 0; var11 < var9.length; var11++) {
            matrixStackIn.push();
            matrixStackIn.translate(
               var9[var11].x + (double) MathHelper.cos((float)var11 + var10 * 0.5F) * 0.025,
               var9[var11].y + (double) MathHelper.cos((float)var11 + var10 * 0.75F) * 0.0125,
               var9[var11].z + (double) MathHelper.cos((float)var11 + var10 * 0.7F) * 0.025
            );
            super.render(entityIn, var2, partialTicks, matrixStackIn, var5, var6);
            matrixStackIn.pop();
         }
      }
   }

   public boolean method17869(Class1033 var1) {
      return true;
   }
}
