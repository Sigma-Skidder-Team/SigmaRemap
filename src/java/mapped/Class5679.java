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
      this.field25086.method11026().showModel = true;
   }

   public ResourceLocation method17843(Class1033 var1) {
      return field25044;
   }

   public void render(Class1033 var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      if (!var1.isInvisible()) {
         super.render(var1, var2, var3, var4, var5, var6);
      } else {
         Vector3d[] var9 = var1.method4611(var3);
         float var10 = this.method17871(var1, var3);

         for (int var11 = 0; var11 < var9.length; var11++) {
            var4.push();
            var4.translate(
               var9[var11].x + (double) MathHelper.cos((float)var11 + var10 * 0.5F) * 0.025,
               var9[var11].y + (double) MathHelper.cos((float)var11 + var10 * 0.75F) * 0.0125,
               var9[var11].z + (double) MathHelper.cos((float)var11 + var10 * 0.7F) * 0.025
            );
            super.render(var1, var2, var3, var4, var5, var6);
            var4.pop();
         }
      }
   }

   public boolean method17869(Class1033 var1) {
      return true;
   }
}
