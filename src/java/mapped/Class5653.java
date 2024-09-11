package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;

public class Class5653 extends Class5651<Class1114, Class2811> {
   private static final ResourceLocation field25005 = new ResourceLocation("textures/entity/bat.png");

   public Class5653(EntityRendererManager var1) {
      super(var1, new Class2811(), 0.25F);
   }

   public ResourceLocation method17843(Class1114 var1) {
      return field25005;
   }

   public void method17857(Class1114 var1, MatrixStack var2, float var3) {
      var2.method35292(0.35F, 0.35F, 0.35F);
   }

   public void method17842(Class1114 var1, MatrixStack var2, float var3, float var4, float var5) {
      if (!var1.method5364()) {
         var2.translate(0.0, (double)(MathHelper.cos(var3 * 0.3F) * 0.1F), 0.0);
      } else {
         var2.translate(0.0, -0.1F, 0.0);
      }

      super.method17842(var1, var2, var3, var4, var5);
   }
}
