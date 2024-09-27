package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class Class5665 extends Class5662<Class1037, Class2793<Class1037>> {
   private static final ResourceLocation field25029 = new ResourceLocation("textures/entity/zombie/drowned.png");

   public Class5665(EntityRendererManager var1) {
      super(var1, new Class2793<Class1037>(0.0F, 0.0F, 64, 64), new Class2793<Class1037>(0.5F, true), new Class2793<Class1037>(1.0F, true));
      this.addLayer(new Class254<Class1037>(this));
   }

   @Override
   public ResourceLocation method17843(ZombieEntity var1) {
      return field25029;
   }

   public void method17842(Class1037 var1, MatrixStack var2, float var3, float var4, float var5) {
      super.method17842(var1, var2, var3, var4, var5);
      float var8 = var1.getSwimAnimation(var5);
      if (var8 > 0.0F) {
         var2.rotate(Vector3f.XP.rotationDegrees(MathHelper.lerp(var8, var1.rotationPitch, -10.0F - var1.rotationPitch)));
      }
   }
}
